package coli.express.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Covoiturages implements Serializable{
@Id @GeneratedValue
private Long id;
private boolean espace_fumeur;
private boolean acces_numero_tel;
private boolean acces_email;
@ManyToOne
private Bagages bagage;
private boolean animaux;
private boolean support;
private int nombre_place;
private boolean chauffeur;
@ManyToOne
private Voitures voiture;
@ManyToOne
private Annonces annonce;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public boolean isEspace_fumeur() {
	return espace_fumeur;
}
public void setEspace_fumeur(boolean espace_fumeur) {
	this.espace_fumeur = espace_fumeur;
}
public boolean isAcces_numero_tel() {
	return acces_numero_tel;
}
public void setAcces_numero_tel(boolean acces_numero_tel) {
	this.acces_numero_tel = acces_numero_tel;
}
public boolean isAcces_email() {
	return acces_email;
}
public void setAcces_email(boolean acces_email) {
	this.acces_email = acces_email;
}
public Bagages getBagage() {
	return bagage;
}
public void setBagage(Bagages bagage) {
	this.bagage = bagage;
}
public boolean isAnimaux() {
	return animaux;
}
public void setAnimaux(boolean animaux) {
	this.animaux = animaux;
}
public boolean isSupport() {
	return support;
}
public void setSupport(boolean support) {
	this.support = support;
}
public int getNombre_place() {
	return nombre_place;
}
public void setNombre_place(int nombre_place) {
	this.nombre_place = nombre_place;
}
public boolean isChauffeur() {
	return chauffeur;
}
public void setChauffeur(boolean chauffeur) {
	this.chauffeur = chauffeur;
}
public Voitures getVoiture() {
	return voiture;
}
public void setVoiture(Voitures voiture) {
	this.voiture = voiture;
}
public Annonces getAnnonce() {
	return annonce;
}
public void setAnnonce(Annonces annonce) {
	this.annonce = annonce;
}
public Covoiturages(boolean espace_fumeur, boolean acces_numero_tel, boolean acces_email, Bagages bagage,
		boolean animaux, boolean support, int nombre_place, boolean chauffeur, Voitures voiture, Annonces annonce) {
	super();
	this.espace_fumeur = espace_fumeur;
	this.acces_numero_tel = acces_numero_tel;
	this.acces_email = acces_email;
	this.bagage = bagage;
	this.animaux = animaux;
	this.support = support;
	this.nombre_place = nombre_place;
	this.chauffeur = chauffeur;
	this.voiture = voiture;
	this.annonce = annonce;
}
public Covoiturages() {
	super();
}

}
