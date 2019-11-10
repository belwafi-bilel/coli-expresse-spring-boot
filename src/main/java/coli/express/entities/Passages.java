package coli.express.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Passages implements Serializable {
@Id @GeneratedValue
private Long id;
private String nom;
private String prenom;
private String telephone;
private String code_verefication;
@OneToMany(mappedBy="passage")	
private Set<Reservations> reservation;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
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
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}
public String getCode_verefication() {
	return code_verefication;
}
public void setCode_verefication(String code_verefication) {
	this.code_verefication = code_verefication;
}
public Set<Reservations> getReservation() {
	return reservation;
}
public void setReservation(Set<Reservations> reservation) {
	this.reservation = reservation;
}
public Passages(String nom, String prenom, String telephone, String code_verefication, Set<Reservations> reservation) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.telephone = telephone;
	this.code_verefication = code_verefication;
	this.reservation = reservation;
}
public Passages() {
	super();
}

}
