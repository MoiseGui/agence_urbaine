package com.fstg.Agence.Urbaine.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Observation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date dateObservation;
	private String objet;
	private String message;
	@ManyToOne
	private User user;
	@ManyToOne
	private Dossier dossier;
	
	
	public Observation() {
	}


	public Observation(Long id, Date dateObservation, String objet, String message, User user, Dossier dossier) {
		super();
		this.id = id;
		this.dateObservation = dateObservation;
		this.objet = objet;
		this.message = message;
		this.user = user;
		this.dossier = dossier;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getDateObservation() {
		return dateObservation;
	}


	public void setDateObservation(Date dateObservation) {
		this.dateObservation = dateObservation;
	}


	public String getObjet() {
		return objet;
	}


	public void setObjet(String objet) {
		this.objet = objet;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Dossier getDossier() {
		return dossier;
	}


	public void setDossier(Dossier dossier) {
		this.dossier = dossier;
	}


	@Override
	public String toString() {
		return "Observation [id=" + id + ", dateObservation=" + dateObservation + ", objet=" + objet + ", message="
				+ message + ", user=" + user + ", dossier=" + dossier + "]";
	}
	
	
	
	
}
