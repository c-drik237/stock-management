package com.makhaya.stockmanagement.validators;

import java.util.ArrayList;
import java.util.List;

import com.makhaya.stockmanagement.dto.EntrepriseDto;
import org.springframework.util.StringUtils;

public class EntrepriseValidator {
    
    public static List<String> validate(EntrepriseDto entrepriseDto){

        List<String> errors = new ArrayList<>();

        if(entrepriseDto == null){
            errors.add("Veuillez renseigner l'adresse de l'entreprise");
            errors.add("Veuillez renseigner le code fiscal de l'entreprise");
            errors.add("Veuillez renseigner le lien du site web de l'entreprise");
            errors.add("Veuillez renseigner le nom de l'entreprise");
            errors.add("Veuillez renseigner le numéro de téléphone de l'entreprise");
            errors.add("Veuillez renseigner l'email de l'entreprise");
        }

        if(!StringUtils.hasLength(entrepriseDto.getCodeFiscal())){
            errors.add("Veuillez renseigner le code fiscal de l'entreprise");
        }
        if(!StringUtils.hasLength(entrepriseDto.getEmail())){
            errors.add("Veuillez renseigner l'email de l'entreprise");
        }
        if(!StringUtils.hasLength(entrepriseDto.getNom())){
            errors.add("Veuillez renseigner le nom de l'entreprise");
        }
        if(!StringUtils.hasLength(entrepriseDto.getNumTelephone())){
            errors.add("Veuillez renseigner le numéro de téléphone de l'entreprise");
        }
        if(!StringUtils.hasLength(entrepriseDto.getSiteWeb())){
            errors.add("Veuillez renseigner le lien du site web de l'entreprise");
        }
        if(entrepriseDto.getAdresseDto() == null){
            errors.add("Veuillez renseigner l'adresse de l'entreprise");
            List<String> adresseDtoClientErrors = AdresseValidator.validate(entrepriseDto.getAdresseDto());
            for (String error  : adresseDtoClientErrors) {
                errors.add(error + "de l'entreprise");
            }
        }

        return errors;
    }
}
