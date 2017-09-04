package cn.com.sweetcandy.es;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import cn.com.sweetcandy.es.entity.User;
import cn.com.sweetcandy.es.service.UserService;

@SpringBootApplication
@ComponentScan("cn.com.sweetcandy.es")
public class EsApplication implements CommandLineRunner {
	@Autowired
	private UserService userService;
	private final static Logger LOGGER = LoggerFactory.getLogger(EsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		final User user = new User();
		user.setId(System.currentTimeMillis());
		user.setName("tom");
		user.setRemark("his name is tom!");
		user.setAge(25);
		LOGGER.info("ready to save user:{}", user);
		userService.create(user);
		LOGGER.info("user has bean saved:{}", user);
		LOGGER.info("find all users:{}", userService.findAll());
	}
}
