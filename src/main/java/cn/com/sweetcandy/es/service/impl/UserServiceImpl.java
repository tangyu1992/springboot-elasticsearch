package cn.com.sweetcandy.es.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.sweetcandy.es.entity.User;
import cn.com.sweetcandy.es.repository.UserEsRepository;
import cn.com.sweetcandy.es.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserEsRepository userEsRepository;

	public User create(User user) {
		if (null == user) {
			return null;
		}
		System.out.println(userEsRepository);
		return userEsRepository.save(user);
	}

	public User findById(Long id) {
		if (null == id) {
			return null;
		}
		return userEsRepository.findOne(id);
	}

	public List<User> findAll() {
		final List<User> users = new ArrayList<User>();
		userEsRepository.findAll().forEach(item -> {
			users.add(item);
		});
		return users;
	}

	@Override
	public void deleteById(Long id) {
		userEsRepository.delete(id);
	}

	@Override
	public void delete(User user) {
		userEsRepository.delete(user);
	}
}
