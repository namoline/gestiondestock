package com.nnemou.gestiondestock.model;

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
@Table(name="client")
public class Client extends AbstractEntity {

	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Embedded
	private Adresse adresse;
	
	@Column(name="photo")
	private String photo;
	
	@Column(name="mail")
	private String mail;
	
	@Column(name="numtel")
	private String numTel;
	
	
	// un client peut passer plusieurs commandes
	//une commande client appartient a un seul client
	@OneToMany(mappedBy="client")
	List<CommandeClient> lstCommandeClient;
	
	@Column(name = "identreprise")
	  private Integer idEntreprise;
}
