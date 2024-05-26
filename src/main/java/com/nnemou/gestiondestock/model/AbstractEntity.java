package com.nnemou.gestiondestock.model;

import java.io.Serializable;
import java.time.Instant;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class AbstractEntity implements Serializable {

	@Id
	private Integer id;
	
	@CreatedDate
	@Column(name="creationDate",nullable=false)
	@JsonIgnore
	private Instant creationDate;
	
	@LastModifiedDate
	@Column(name="lastModifiedDate")
	@JsonIgnore
	private Instant lastModifiedDate;
}
