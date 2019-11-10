package coli.express.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reservations implements Serializable {
@Id @GeneratedValue
private Long id;
@ManyToOne
private Annonces annonce;
@Temporal(TemporalType.TIMESTAMP) 
private Date date_reservation;
@ManyToOne
private Passages passage;
public Reservations( Annonces annonce, Date date_reservation, Passages passage) {
	super();
	
	this.annonce = annonce;
	this.date_reservation = date_reservation;
	this.passage = passage;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Annonces getAnnonce() {
	return annonce;
}
public void setAnnonce(Annonces annonce) {
	this.annonce = annonce;
}
public Date getDate_reservation() {
	return date_reservation;
}
public void setDate_reservation(Date date_reservation) {
	this.date_reservation = date_reservation;
}
public Passages getPassage() {
	return passage;
}
public void setPassage(Passages passage) {
	this.passage = passage;
}

}
