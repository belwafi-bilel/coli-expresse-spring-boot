package coli.express.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Annonces implements Serializable {
@Id @GeneratedValue
private Long id;
private String description;
@ManyToOne(cascade = CascadeType.PERSIST)
private Address address_depart;
@ManyToOne(cascade = CascadeType.PERSIST)
private Address address_arrivee;
@Temporal(TemporalType.TIMESTAMP) 
private Date heurs_depart;
@Temporal(TemporalType.TIMESTAMP) 
private Date heurs_arrivee;
private Long typeAnnoncer_id;
private Long natures_id;
@OneToMany(mappedBy="annonce")	
private Set<Covoiturages> couvoiturage;
@OneToMany(mappedBy="annonce")	
private Set<Colis> coli;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Address getAddress_depart() {
	return address_depart;
}
public void setAddress_depart(Address address_depart) {
	this.address_depart = address_depart;
}
public Address getAddress_arrivee() {
	return address_arrivee;
}
public void setAddress_arrivee(Address address_arrivee) {
	this.address_arrivee = address_arrivee;
}
public Date getHeurs_depart() {
	return heurs_depart;
}
public void setHeurs_depart(Date heurs_depart) {
	this.heurs_depart = heurs_depart;
}
public Date getHeurs_arrivee() {
	return heurs_arrivee;
}
public void setHeurs_arrivee(Date heurs_arrivee) {
	this.heurs_arrivee = heurs_arrivee;
}


public Annonces() {
	super();
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Long getTypeAnnoncer_id() {
	return typeAnnoncer_id;
}
public void setTypeAnnoncer_id(Long typeAnnoncer_id) {
	this.typeAnnoncer_id = typeAnnoncer_id;
}
public Long getNatures_id() {
	return natures_id;
}
public void setNatures_id(Long natures_id) {
	this.natures_id = natures_id;
}
public Annonces(String description, Address address_depart, Address address_arrivee, Date heurs_depart,
		Date heurs_arrivee, Long typeAnnoncer_id, Long natures_id) {
	super();
	this.description = description;
	this.address_depart = address_depart;
	this.address_arrivee = address_arrivee;
	this.heurs_depart = heurs_depart;
	this.heurs_arrivee = heurs_arrivee;
	this.typeAnnoncer_id = typeAnnoncer_id;
	this.natures_id = natures_id;
}


}
