package com.makhaya.stockmanagement.validators;

import java.util.ArrayList;
import java.util.List;

import com.makhaya.stockmanagement.dto.FournisseurDto;
import org.springframework.util.StringUtils;


public class FournisseurValidator {

    public static List<String> validate(FournisseurDto fournisseurDto){

        List<String> errors = new ArrayList<>();

        if(fournisseurDto == null){
        }

        if(!StringUtils.hasLength(fournisseurDto.getEmail())){
            errors.add("Veuillez renseigner l'email du fournisseur");
        }
        if(!StringUtils.hasLength(fournisseurDto.getNom())){
            errors.add("Veuillez renseigner le nom du fournisseur");
        }
        if(!StringUtils.hasLength(fournisseurDto.getTelephone())){
            errors.add("Veuillez renseigner le numéro de téléphone du fournisseur");
        }
        if(fournisseurDto.getAdresseDto() == null){
            errors.add("Veuillez renseigner l'adresse du fournisseur");
            List<String> adresseDtofournisseurErrors = AdresseValidator.validate(fournisseurDto.getAdresseDto());
            for (String error  : adresseDtofournisseurErrors) {
                errors.add(error + "du fournisseur");
            }
        }

        return errors;
    }
    
}
