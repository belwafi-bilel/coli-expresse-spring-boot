package coli.express.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Colis implements Serializable {
@Id @GeneratedValue
private Long id;
private String description;
private double pois;
private double diametre;
private double valeur;
private boolean traking;
@ManyToOne
private Annonces annonce;
@Column(length=429796729)
private byte[] images;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPois() {
	return pois;
}
public void setPois(double pois) {
	this.pois = pois;
}
public double getDiametre() {
	return diametre;
}
public void setDiametre(double diametre) {
	this.diametre = diametre;
}
public double getValeur() {
	return valeur;
}
public void setValeur(double valeur) {
	this.valeur = valeur;
}
public boolean isTraking() {
	return traking;
}
public void setTraking(boolean traking) {
	this.traking = traking;
}
public Annonces getAnnonce() {
	return annonce;
}
public void setAnnonce(Annonces annonce) {
	this.annonce = annonce;
}
public byte[] getImages() {
	return images;
}
public void setImages(byte[] images) {
	this.images = images;
}
public Colis(String description, double pois, double diametre, double valeur, boolean traking, Annonces annonce,
		byte[] images) {
	super();
	this.description = description;
	this.pois = pois;
	this.diametre = diametre;
	this.valeur = valeur;
	this.traking = traking;
	this.annonce = annonce;
	this.images = images;
}
public Colis() {
	super();
}

}
