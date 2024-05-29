package com.nnemou.gestiondestock.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="entreprise")
public class Entreprise extends AbstractEntity{
	@Column(name="nom")
	private String nom;
	
	@Embedded
	private Adresse adresse;
	
	@Column(name="codefiscal")
	private String codeFiscal;
	
	@Column(name="photo")
	private String photo;
	
	@Column(name="email")
	private String email;
	
	@Column(name="numtel")
	private String numTel;
	
	@Column(name="siteweb")
	private String steWeb;
	
	@Column(name="description")
	private String description;
	
	@OneToMany(mappedBy = "entreprise")
	private List<Utilisateur> lstUtilisateur;
}
