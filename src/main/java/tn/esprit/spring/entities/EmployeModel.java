package tn.esprit.spring.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class EmployeModel {

	private int id;
	
	private String prenom;
	
	private String nom;
	
	@Column(unique=true)
	private String email;

	private boolean isActif;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	
	@JsonIgnore
	@ManyToMany(mappedBy="employes",fetch=FetchType.EAGER)
	private List<Departement> departements;
	
	@JsonIgnore
	@OneToOne(mappedBy="employe")
	private Contrat contrat;
	
	@JsonIgnore
	@OneToMany(mappedBy="employe")
	private List<Timesheet> timesheets;
	
}
