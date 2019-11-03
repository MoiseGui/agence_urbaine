package com.fstg.Agence.Urbaine.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.Agence.Urbaine.bean.Role;

@Repository
public interface RoleDao extends JpaRepository<Role, Long> {
	public Role findByLibelle(String libelle);
}
