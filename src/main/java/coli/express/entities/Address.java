package coli.express.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Address implements Serializable  {
	@Id @GeneratedValue
private Long id;
	@Column(length=6)	
private String street_number;
	@Column(length=50)	
private String route;
	@Column(length=50)	
private String locality;
	@Column(length=50)	
private String administrative_area_level;
	@Column(length=12)	
private String postal_code;
	@Column(length=25)	
private String country;
@OneToMany(mappedBy="address_depart")	
private Set<Annonces> annonce1;
@OneToMany(mappedBy="address_arrivee")	
private Set<Annonces> annonce;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getStreet_number() {
	return street_number;
}
public void setStreet_number(String street_number) {
	this.street_number = street_number;
}
public String getRoute() {
	return route;
}
public void setRoute(String route) {
	this.route = route;
}
public String getLocality() {
	return locality;
}
public void setLocality(String locality) {
	this.locality = locality;
}
public String getAdministrative_area_level() {
	return administrative_area_level;
}
public void setAdministrative_area_level(String administrative_area_level) {
	this.administrative_area_level = administrative_area_level;
}
public String getPostal_code() {
	return postal_code;
}
public void setPostal_code(String postal_code) {
	this.postal_code = postal_code;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

public Address() {
	super();
}
public Address( String street_number, String route, String locality, String administrative_area_level,
		String postal_code, String country) {
	super();
	this.street_number = street_number;
	this.route = route;
	this.locality = locality;
	this.administrative_area_level = administrative_area_level;
	this.postal_code = postal_code;
	this.country = country;
}
@Override
public String toString() {
	return "Address [id=" + id + ", street_number=" + street_number + ", route=" + route + ", locality=" + locality
			+ ", administrative_area_level=" + administrative_area_level + ", postal_code=" + postal_code + ", country="
			+ country + "]";
}


}
