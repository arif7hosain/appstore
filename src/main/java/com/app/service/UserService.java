package com.app.service;


import com.app.domain.User;

/**
 * @author arifhosain
 *
 */
public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}