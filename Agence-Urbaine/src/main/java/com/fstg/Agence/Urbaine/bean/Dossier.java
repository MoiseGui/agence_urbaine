package com.fstg.Agence.Urbaine.bean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Dossier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String ref;
    private int avis;
    @Temporal(TemporalType.DATE)
    private Date dateArrive;
    @Temporal(TemporalType.DATE)
    private Date datePaiement;
    private BigDecimal montantPaye;
    private String lieuProjet;
    private String descriptionProjet;
    private BigDecimal superficie;
    @ManyToOne
    private User architect;
    @ManyToOne
    private Client client;
    @ManyToOne
    private User technicien;
    @ManyToOne
    private TypeDossier typeDossier;
    @ManyToOne
    private TypeProjet typeProjet;
    @ManyToOne
    private Commission commission;
    @OneToMany(mappedBy = "dossier")
    private List<Observation> observations;
	
    public Dossier() {
	}

	public Dossier(Long id, String reference, int avis, Date dateArrive, Date datePaiement, BigDecimal montantPaye,
			String lieuProjet, String descriptionProjet, BigDecimal superficie, User architect, Client client,
			User technicien, TypeDossier typeDossier, TypeProjet typeProjet, Commission commission,
			List<Observation> observations) {
		this.id = id;
		this.ref = reference;
		this.avis = avis;
		this.dateArrive = dateArrive;
		this.datePaiement = datePaiement;
		this.montantPaye = montantPaye;
		this.lieuProjet = lieuProjet;
		this.descriptionProjet = descriptionProjet;
		this.superficie = superficie;
		this.architect = architect;
		this.client = client;
		this.technicien = technicien;
		this.typeDossier = typeDossier;
		this.typeProjet = typeProjet;
		this.commission = commission;
		this.observations = observations;
	}

	public Dossier(Long id, String reference, int avis, Date dateArrive, BigDecimal montantPaye, String lieuProjet,
			String descriptionProjet, BigDecimal superficie, User architect, Client client, User technicien,
			TypeDossier typeDossier, TypeProjet typeProjet, Commission commission) {
		this.id = id;
		this.ref = reference;
		this.avis = avis;
		this.dateArrive = dateArrive;
		this.montantPaye = montantPaye;
		this.lieuProjet = lieuProjet;
		this.descriptionProjet = descriptionProjet;
		this.superficie = superficie;
		this.architect = architect;
		this.client = client;
		this.technicien = technicien;
		this.typeDossier = typeDossier;
		this.typeProjet = typeProjet;
		this.commission = commission;
	}

	public Dossier(Long id, String reference, Date dateArrive, String lieuProjet, String descriptionProjet,
			BigDecimal superficie, Client client, TypeDossier typeDossier, TypeProjet typeProjet) {
		this.id = id;
		this.ref = reference;
		this.dateArrive = dateArrive;
		this.lieuProjet = lieuProjet;
		this.descriptionProjet = descriptionProjet;
		this.superficie = superficie;
		this.client = client;
		this.typeDossier = typeDossier;
		this.typeProjet = typeProjet;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String reference) {
		this.ref = reference;
	}

	public int getAvis() {
		return avis;
	}

	public void setAvis(int avis) {
		this.avis = avis;
	}

	public Date getDateArrive() {
		return dateArrive;
	}

	public void setDateArrive(Date dateArrive) {
		this.dateArrive = dateArrive;
	}

	public Date getDatePaiement() {
		return datePaiement;
	}

	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}

	public BigDecimal getMontantPaye() {
		return montantPaye;
	}

	public void setMontantPaye(BigDecimal montantPaye) {
		this.montantPaye = montantPaye;
	}

	public String getLieuProjet() {
		return lieuProjet;
	}

	public void setLieuProjet(String lieuProjet) {
		this.lieuProjet = lieuProjet;
	}

	public String getDescriptionProjet() {
		return descriptionProjet;
	}

	public void setDescriptionProjet(String descriptionProjet) {
		this.descriptionProjet = descriptionProjet;
	}

	public BigDecimal getSuperficie() {
		return superficie;
	}

	public void setSuperficie(BigDecimal superficie) {
		this.superficie = superficie;
	}

	public User getArchitect() {
		return architect;
	}

	public void setArchitect(User architect) {
		this.architect = architect;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public User getTechnicien() {
		return technicien;
	}

	public void setTechnicien(User technicien) {
		this.technicien = technicien;
	}

	public TypeDossier getTypeDossier() {
		return typeDossier;
	}

	public void setTypeDossier(TypeDossier typeDossier) {
		this.typeDossier = typeDossier;
	}

	public TypeProjet getTypeProjet() {
		return typeProjet;
	}

	public void setTypeProjet(TypeProjet typeProjet) {
		this.typeProjet = typeProjet;
	}

	public Commission getCommission() {
		return commission;
	}

	public void setCommission(Commission commission) {
		this.commission = commission;
	}

	public List<Observation> getObservations() {
		return observations;
	}

	public void setObservations(List<Observation> observations) {
		this.observations = observations;
	}

	@Override
	public String toString() {
		return "Dossier [id=" + id + ", reference=" + ref + ", avis=" + avis + ", dateArrive=" + dateArrive
				+ ", datePaiement=" + datePaiement + ", montantPaye=" + montantPaye + ", lieuProjet=" + lieuProjet
				+ ", descriptionProjet=" + descriptionProjet + ", superficie=" + superficie + ", architect=" + architect
				+ ", client=" + client + ", technicien=" + technicien + ", typeDossier=" + typeDossier + ", typeProjet="
				+ typeProjet + ", commission=" + commission + "]";
	}
    
    
    
}
