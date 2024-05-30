package com.nnemou.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nnemou.gestiondestock.model.Roles;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RolesDto {
	private Integer id;
	private String roleName;
	@JsonIgnore
	private UtilisateurDto utilisateur;
	
	 public static RolesDto fromEntity(Roles roles) {
		    if (roles == null) {
		      return null;
		    }
		    return RolesDto.builder()
		        .id(roles.getId())
		        .roleName(roles.getRoleName())
		        .build();
		  }
	 
	 
	 public static Roles toEntity(RolesDto rolesDto) {
		    if (rolesDto == null) {
		      return null;
		    }
		    return Roles.builder()
		        .id(rolesDto.getId())
		        .roleName(rolesDto.getRoleName())
		        .build();
		  }
}
