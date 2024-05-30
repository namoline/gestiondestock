package com.nnemou.gestiondestock.model;

import java.time.Instant;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="utilisateur")
public class Utilisateur extends AbstractEntity{

	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Embedded
	private Adresse adresse;
	
	@Column(name="motdepasse")
	private String motDepasse;
	
	@Column(name="datenaissance")
	private Instant dateNaissance;
	
	@Column(name="photo")
	private String photo;
	
	@Column(name="email")
	private String email;
	
	
	@ManyToOne
	@JoinColumn(name="identreprise")
	private Entreprise entreprise;
	
	@OneToMany(mappedBy = "utilisateur")
	private List<Roles> lstRoles;
}
