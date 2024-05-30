package com.nnemou.gestiondestock.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="roles")
public class Roles extends AbstractEntity {
	
	
	@Column(name="rolename")
	private String roleName;
	
	
	@ManyToOne
	@JoinColumn(name="idutilisateur")
	private Utilisateur utilisateur;
}
