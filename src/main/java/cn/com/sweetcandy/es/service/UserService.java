package cn.com.sweetcandy.es.service;

import java.util.List;

import cn.com.sweetcandy.es.entity.User;

public interface UserService {
	User create(User user);

	User findById(Long id);

	void deleteById(Long id);

	void delete(User user);

	List<User> findAll();
}
