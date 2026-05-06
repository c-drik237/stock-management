package com.makhaya.stockmanagement.validators;

import java.util.ArrayList;
import java.util.List;

import com.makhaya.stockmanagement.dto.AdresseDto;
import com.makhaya.stockmanagement.dto.ClientDto;
import org.springframework.util.StringUtils;


public class ClientValidator {

    public static List<String> validate(ClientDto clientDto){

        List<String> errors = new ArrayList<>();

        if(clientDto == null){
            errors.add("Veuillez renseigner l'email du client");
            errors.add("Veuillez renseigner le numéro de téléphone du client");
            errors.add("Veuillez renseigner le nom du client");
            errors.add("Veuillez renseigner l'adresse du client");
        }

        if(!StringUtils.hasLength(clientDto.getEmail())){
            errors.add("Veuillez renseigner l'email du client");
        }
        if(!StringUtils.hasLength(clientDto.getNom())){
            errors.add("Veuillez renseigner le nom du client");
        }
        if(!StringUtils.hasLength(clientDto.getTelephone())){
            errors.add("Veuillez renseigner le numéro de téléphone du client");
        }
        if(clientDto.getAdresseDto() == null){
            errors.add("Veuillez renseigner l'adresse du client");
            List<String> adresseDtoClientErrors = AdresseValidator.validate(clientDto.getAdresseDto());
            for (String error  : adresseDtoClientErrors) {
                errors.add(error + "du client");
            }
        }

        return errors;
    }
    
}
