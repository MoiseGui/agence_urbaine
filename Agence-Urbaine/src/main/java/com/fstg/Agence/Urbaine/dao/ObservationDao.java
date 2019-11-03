package com.fstg.Agence.Urbaine.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.Agence.Urbaine.bean.Observation;
import com.fstg.Agence.Urbaine.bean.User;

@Repository
public interface ObservationDao extends JpaRepository<Observation, Long> {
	public List<Observation> findByUser(User user);
}
