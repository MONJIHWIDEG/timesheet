package tn.esprit.spring.entities;

import java.util.List;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class MissionModel {

	private int id;
	
	private String name;
	
	private String description;
	
	@ManyToOne
	private Departement departement;
	
	@OneToMany(mappedBy="mission")
	private  List<Timesheet> timesheets;
	
}
