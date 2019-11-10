package coli.express.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Natures implements Serializable{
@Id @GeneratedValue
private Long id;
private String designation;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}

public Natures(String designation) {
	super();
	this.designation = designation;
	
}
public Natures() {
	super();
}
@Override
public String toString() {
	return "Natures [id=" + id + ", designation=" + designation + "]";
}

}
