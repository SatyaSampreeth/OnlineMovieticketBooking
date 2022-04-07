package com.online.jwt.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.online.jwt.model.DAOUser;

public interface UserDAO extends CrudRepository<DAOUser, Integer>{

	DAOUser findByUsername(String username);
//	DAOUser findByUsernamePassword(String username,String password);
//	public List<DAOUser> findByEMAIL(String email);
}
