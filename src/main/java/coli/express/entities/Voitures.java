package coli.express.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Voitures implements Serializable{
@Id @GeneratedValue
private Long id;
private String marque;
private String modele;
private int nombre_place;
private int nombre_porte;
private int annee;
private boolean climatiseur;
private boolean chauffage ;
@Column(length=16777215)
private byte[] images;
@OneToMany(mappedBy="voiture")
private Set<Covoiturages> Covoiturage;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public String getModele() {
	return modele;
}
public void setModele(String modele) {
	this.modele = modele;
}
public int getNombre_place() {
	return nombre_place;
}
public void setNombre_place(int nombre_place) {
	this.nombre_place = nombre_place;
}
public int getNombre_porte() {
	return nombre_porte;
}
public void setNombre_porte(int nombre_porte) {
	this.nombre_porte = nombre_porte;
}
public int getAnnee() {
	return annee;
}
public void setAnnee(int annee) {
	this.annee = annee;
}
public boolean isClimatiseur() {
	return climatiseur;
}
public void setClimatiseur(boolean climatiseur) {
	this.climatiseur = climatiseur;
}
public boolean isChauffage() {
	return chauffage;
}
public void setChauffage(boolean chauffage) {
	this.chauffage = chauffage;
}
public byte[] getImages() {
	return images;
}
public void setImages(byte[] images) {
	this.images = images;
}
public Set<Covoiturages> getCovoiturage() {
	return Covoiturage;
}
public void setCovoiturage(Set<Covoiturages> covoiturage) {
	Covoiturage = covoiturage;
}
public Voitures(String marque, String modele, int nombre_place, int nombre_porte, int annee, boolean climatiseur,
		boolean chauffage, byte[] images, Set<Covoiturages> covoiturage) {
	super();
	this.marque = marque;
	this.modele = modele;
	this.nombre_place = nombre_place;
	this.nombre_porte = nombre_porte;
	this.annee = annee;
	this.climatiseur = climatiseur;
	this.chauffage = chauffage;
	this.images = images;
	Covoiturage = covoiturage;
}
public Voitures() {
	super();
}

}
