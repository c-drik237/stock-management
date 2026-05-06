package com.makhaya.stockmanagement.validators;

import java.util.ArrayList;
import java.util.List;

import com.makhaya.stockmanagement.dto.UtilisateurDto;
import org.springframework.util.StringUtils;


public class UtilisateurValidator {
    
    public static List<String> validate(UtilisateurDto utilisateurDto){

        List<String> errors = new ArrayList<>();

        if(utilisateurDto == null){
            errors.add("Veuillez renseigner l'email du client");
            errors.add("Veuillez renseigner le numéro de téléphone du client");
            errors.add("Veuillez renseigner le nom du client");
            errors.add("Veuillez renseigner l'adresse du client");
        }

        if(!StringUtils.hasLength(utilisateurDto.getEmail())){
            errors.add("Veuillez renseigner l'email du client");
        }
        if(!StringUtils.hasLength(utilisateurDto.getNom())){
            errors.add("Veuillez renseigner le nom du client");
        }
        if(!StringUtils.hasLength(utilisateurDto.getTelephone())){
            errors.add("Veuillez renseigner le numéro de téléphone du client");
        }
        if(utilisateurDto.getAdresseDto() == null){
            errors.add("Veuillez renseigner l'adresse du client");
            List<String> adresseDtoClientErrors = AdresseValidator.validate(utilisateurDto.getAdresseDto());
            for (String error  : adresseDtoClientErrors) {
                errors.add(error + "du client");
            }
        }

        return errors;
    }
}
