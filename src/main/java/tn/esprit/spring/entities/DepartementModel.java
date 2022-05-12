package tn.esprit.spring.entities;
import java.util.List;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class DepartementModel {
 
	private int id;
	
	private String name;
	
	@ManyToOne
	private Entreprise entreprise;
	

	@JsonIgnore
	@ManyToMany
	private List<Employe> employes;
	
	@OneToMany(mappedBy="departement")
	private List<Mission> missions;
	

}
