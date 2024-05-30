package com.nnemou.gestiondestock.model;

import java.time.Instant;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name="ventes")
public class Ventes extends AbstractEntity {
	@Column(name="code")
	private String code;
	
	@Column(name="datevente")
	private Instant dateVente;
	
	@Column(name="commentaire")
	private String commentaire;
	
	 @Column(name = "identreprise")
	 private Integer idEntreprise;
}
