package com.fstg.Agence.Urbaine.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.Agence.Urbaine.bean.Client;

@Repository
public interface ClientDao extends JpaRepository<Client, Long> {
	public Client findByRef(String ref);
}
