package com.nnemou.gestiondestock.model;

import java.time.Instant;
import java.util.List;

import jakarta.persistence.Column;
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

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="commandeclient")
public class CommandeClient extends AbstractEntity {
	@Column(name="code")
	private String code;
	
	@Column(name="datecommande")
	private Instant dateCommande;
	
	@OneToMany(mappedBy="commandeClient")
	private List<LigneCommandeClient> LstLigneCommandeClients;
	
	
	@ManyToOne
	@JoinColumn(name="idclient")
	private Client client;
	
	@Column(name = "identreprise")
	  private Integer idEntreprise;
}
