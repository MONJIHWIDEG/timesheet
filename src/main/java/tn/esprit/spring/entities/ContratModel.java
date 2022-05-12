package tn.esprit.spring.entities;

import java.util.Date;

import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class ContratModel {

	private int reference;
	
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	
	private String typeContrat;
	
	private float salaire;
	
	@OneToOne
	private Employe employe;
}
