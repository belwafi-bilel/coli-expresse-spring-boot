package coli.express.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class HistoriquesAnnonces implements Serializable{
@Id @GeneratedValue 
private Long id;

}
