package com.fstg.Agence.Urbaine.bean;

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
public class Commission {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date dateDepartCommission;
	@Temporal(TemporalType.DATE)
	private Date dateFinCommission;
	@ManyToOne
	private MembreCommision chefCommision;
	@OneToMany(mappedBy = "commission")
	private List<CommisionItem> commisionItems;
	
	
	public Commission() {
	}


	public Commission(Long id, Date dateDepartCommission, Date dateFinCommission, MembreCommision chefCommision) {
		this.id = id;
		this.dateDepartCommission = dateDepartCommission;
		this.dateFinCommission = dateFinCommission;
		this.chefCommision = chefCommision;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getDateDepartCommission() {
		return dateDepartCommission;
	}


	public void setDateDepartCommission(Date dateDepartCommission) {
		this.dateDepartCommission = dateDepartCommission;
	}


	public Date getDateFinCommission() {
		return dateFinCommission;
	}


	public void setDateFinCommission(Date dateFinCommission) {
		this.dateFinCommission = dateFinCommission;
	}


	public MembreCommision getChefCommision() {
		return chefCommision;
	}


	public void setChefCommision(MembreCommision chefCommision) {
		this.chefCommision = chefCommision;
	}


	public List<CommisionItem> getCommisionItems() {
		return commisionItems;
	}


	public void setCommisionItems(List<CommisionItem> commisionItems) {
		this.commisionItems = commisionItems;
	}


	@Override
	public String toString() {
		return "Commission [id=" + id + ", dateDepartCommission=" + dateDepartCommission + ", dateFinCommission="
				+ dateFinCommission + ", chefCommision=" + chefCommision + ", commisionItems=" + commisionItems + "]";
	}
	
	
	
	
}
