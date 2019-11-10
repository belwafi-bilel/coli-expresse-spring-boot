package coli.express.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Bagages implements Serializable {
@Id @GeneratedValue
private Long id;
private String type;
@OneToMany(mappedBy="bagage")
private Set<Covoiturages> Covoiturage;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Set<Covoiturages> getCovoiturage() {
	return Covoiturage;
}
public void setCovoiturage(Set<Covoiturages> covoiturage) {
	Covoiturage = covoiturage;
}

}
