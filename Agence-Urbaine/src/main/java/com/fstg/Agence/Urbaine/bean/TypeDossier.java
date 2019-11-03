package com.fstg.Agence.Urbaine.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypeDossier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String libelle;
	
	
	public TypeDossier() {
	}


	public TypeDossier(Long id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	@Override
	public String toString() {
		return "TypeDossier [id=" + id + ", libelle=" + libelle + "]";
	}
	
	
	
	
}