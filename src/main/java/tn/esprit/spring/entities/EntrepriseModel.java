package tn.esprit.spring.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

public class EntrepriseModel {
 
	private int id;
	
	private String name;
	
	private String raisonSocial;
	
	@OneToMany(mappedBy="entreprise", 
			
			cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, 
			fetch=FetchType.EAGER)
	
	private List<Departement> departements;

}
