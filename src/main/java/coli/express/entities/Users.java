package coli.express.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;

@Entity
public class Users implements Serializable{
@Id @GeneratedValue
private Long id;
private String user_name;
@Column(length=50)	
private String email;
@Column(length=50)	
private String login;
@Column(length=50)	
private String password;
@Temporal(TemporalType.TIMESTAMP) 
private Date registered_dt;
@Temporal(TemporalType.TIMESTAMP) 
private Date login_dt;
@Temporal(TemporalType.TIMESTAMP) 
private Date update_dt;
@OneToMany(mappedBy="user")
private Set<Profiles> profiles;
@ManyToOne
private Address address;
public Users(String user_name, String email, String login, String password, Date registered_dt, Date login_dt,
		Date update_dt, Set<Profiles> profiles, Address address) {
	super();
	this.user_name = user_name;
	this.email = email;
	this.login = login;
	this.password = password;
	this.registered_dt = registered_dt;
	this.login_dt = login_dt;
	this.update_dt = update_dt;
	this.profiles = profiles;
	this.address = address;
}
public Users() {
	super();
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Date getRegistered_dt() {
	return registered_dt;
}
public void setRegistered_dt(Date registered_dt) {
	this.registered_dt = registered_dt;
}
public Date getLogin_dt() {
	return login_dt;
}
public void setLogin_dt(Date login_dt) {
	this.login_dt = login_dt;
}
public Date getUpdate_dt() {
	return update_dt;
}
public void setUpdate_dt(Date update_dt) {
	this.update_dt = update_dt;
}
public Set<Profiles> getProfiles() {
	return profiles;
}
public void setProfiles(Set<Profiles> profiles) {
	this.profiles = profiles;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

}
