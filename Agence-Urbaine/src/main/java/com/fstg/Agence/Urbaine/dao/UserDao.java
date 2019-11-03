package com.fstg.Agence.Urbaine.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.Agence.Urbaine.bean.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
	public User findByLogin(String login);
}
