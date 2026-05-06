package com.makhaya.stockmanagement.validators;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.util.StringUtil;

import com.makhaya.stockmanagement.dto.AdresseDto;

//import io.micrometer.common.util.StringUtils;
import org.springframework.util.StringUtils;

public class AdresseValidator {
    
    public static List<String> validate(AdresseDto adresseDto){

        List<String> errors = new ArrayList<>();

        if(adresseDto == null){
            errors.add("Veuillez renseigner le champ adresse");
            errors.add("Veuillez renseigner le champ Ville");
            errors.add("Veuillez renseigner le champ codePostale");
            errors.add("Veuillez renseigner le champ pays");
        }

        if(!StringUtils.hasLength(adresseDto.getAdresse())){
            errors.add("Veuillez renseigner le champ adresse");
        }
        if(!StringUtils.hasLength(adresseDto.getVille())){
            errors.add("Veuillez renseigner le champ Ville");
        }
        if(!StringUtils.hasLength(adresseDto.getCodePostale())){
            errors.add("Veuillez renseigner le champ codePostale");
        }
        if(!StringUtils.hasLength(adresseDto.getPays())){
            errors.add("Veuillez renseigner le champ pays");
        }

        return errors;
    }
}
