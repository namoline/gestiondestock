package com.nnemou.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RolesDto {
	
	private String roleName;	
	private UtilisateurDto utilisateur;
}
