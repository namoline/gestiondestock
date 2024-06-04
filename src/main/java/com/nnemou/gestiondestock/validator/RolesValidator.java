package com.nnemou.gestiondestock.validator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.nnemou.gestiondestock.dto.MvtStkDto;
import com.nnemou.gestiondestock.dto.RolesDto;

public class RolesValidator {
	public static List<String> validate(RolesDto dto) {
	    List<String> errors = new ArrayList<>();
	    if (dto == null) {
	      errors.add("Veuillez renseigner la date du mouvenent");
	      

	      return errors;
	    }
	    if (!StringUtils.hasLength(dto.getRoleName())) {
	      errors.add("Veuillez renseigner le nom du role");
	    }
	

	    return errors;
	  }
}
