package com.devpoint.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.devpoint.model.User;

@Service
@Repository
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	EntityManager em;
	public User createUser(User user) {
		em.persist(user);
		return user;
	}

}
