package com.makhaya.stockmanagement.validators;

import java.util.ArrayList;
import java.util.List;

import com.makhaya.stockmanagement.dto.VenteDto;
import org.springframework.util.StringUtils;


public class VenteValidator {
 
    public static List<String> validate(VenteDto venteDto){

        List<String> errors = new ArrayList<>();

        if(venteDto == null){
            errors.add("Veuillez renseigner la date de la commande");
            errors.add("Veuillez renseigner le code de la commande client");
            errors.add("Veuillez renseigner le client de la commande");
        }

        if(!StringUtils.hasLength(venteDto.getCode())){
            errors.add("Veuillez renseigner le code de la vente");
        }
        if(venteDto.getDateVente() == null){
            errors.add("Veuillez renseigner la date de la vante");
        }

        return errors;
    }
}
