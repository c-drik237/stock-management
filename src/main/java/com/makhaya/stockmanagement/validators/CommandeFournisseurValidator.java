package com.makhaya.stockmanagement.validators;

import java.util.ArrayList;
import java.util.List;

import com.makhaya.stockmanagement.dto.CommandeFournisseurDto;
import org.springframework.util.StringUtils;


public class CommandeFournisseurValidator {

    public static List<String> validate(CommandeFournisseurDto commandeFournisseurDto){

        List<String> errors = new ArrayList<>();

        if(commandeFournisseurDto == null){
            errors.add("Veuillez renseigner le fournisseur de la commande");
            errors.add("Veuillez renseigner le code de la commande");
            errors.add("Veuillez renseigner la date de la commande");
        }

        if(!StringUtils.hasLength(commandeFournisseurDto.getCode())){
            errors.add("Veuillez renseigner le code de la commande");
        }
        if(commandeFournisseurDto.getFournisseurDto() == null){
            errors.add("Veuillez renseigner le fournisseur de la commande");
        }
        if(commandeFournisseurDto.getDateCommande() == null){
            errors.add("Veuillez renseigner la date de la commande");
        }

        return errors;
    }
    
}
