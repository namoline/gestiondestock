package com.nnemou.gestiondestock.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
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
@Embeddable
 class Adresse implements Serializable {
 
 @Column(name="adresse1")
 private String adresse1;
 
 @Column(name="adresse2")
 private String adresse2;
 
 @Column(name="ville")
 private String ville;
 
 @Column(name="codepostal")
 private String codePostal;

 @Column(name="pays")
 private String pays;
}
