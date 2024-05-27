package com.nnemou.gestiondestock.model;

import java.math.BigDecimal;
import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="mvtstk")
public class MvtStk extends AbstractEntity{

	@Column(name="datemvt")
    private Instant dateMvt;
	
	@Column(name="quantite")
	private BigDecimal quantite;
	
	@ManyToOne
	@JoinColumn(name="idarticle")
	private Article article;
	
	@Column(name="typemvt")
	private TypeMvtStock typemvt;
	
	@Column(name = "identreprise")
	  private Integer idEntreprise;
}
