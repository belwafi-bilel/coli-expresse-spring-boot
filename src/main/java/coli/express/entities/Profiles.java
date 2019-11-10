package coli.express.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Profiles implements Serializable {
@Id @GeneratedValue
private Long id;
@ManyToOne
Users user;
@Column(length=50)	
private String nom;
@Column(length=50)	
private String prenom;
@Column(length=50)	
private String photo;
@Column(length=12)	
private String telephone;
@Temporal(TemporalType.DATE) 
private Date date_naissance;
@Temporal(TemporalType.TIMESTAMP) 
private Date date_update;
private Long code_activation;
private Long numero_membre;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Users getUser() {
	return user;
}
public void setUser(Users user) {
	this.user = user;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}
public Date getDate_naissance() {
	return date_naissance;
}
public void setDate_naissance(Date date_naissance) {
	this.date_naissance = date_naissance;
}
public Date getDate_update() {
	return date_update;
}
public void setDate_update(Date date_update) {
	this.date_update = date_update;
}
public Long getCode_activation() {
	return code_activation;
}
public void setCode_activation(Long code_activation) {
	this.code_activation = code_activation;
}
public Long getNumero_membre() {
	return numero_membre;
}
public void setNumero_membre(Long numero_membre) {
	this.numero_membre = numero_membre;
}
public Profiles() {
	super();
}
public Profiles(Users user, String nom, String prenom, String photo, String telephone, Date date_naissance,
		Date date_update, Long code_activation, Long numero_membre) {
	super();
	this.user = user;
	this.nom = nom;
	this.prenom = prenom;
	this.photo = photo;
	this.telephone = telephone;
	this.date_naissance = date_naissance;
	this.date_update = date_update;
	this.code_activation = code_activation;
	this.numero_membre = numero_membre;
}

}
