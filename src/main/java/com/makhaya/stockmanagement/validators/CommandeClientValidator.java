package com.makhaya.stockmanagement.validators;

import java.util.ArrayList;
import java.util.List;

import com.makhaya.stockmanagement.dto.CommandeClientDto;
import org.springframework.util.StringUtils;


public class CommandeClientValidator {
    
    public static List<String> validate(CommandeClientDto commandeClientDto){

        List<String> errors = new ArrayList<>();

        if(commandeClientDto == null){
            errors.add("Veuillez renseigner la date de la commande");
            errors.add("Veuillez renseigner le code de la commande client");
            errors.add("Veuillez renseigner le client de la commande");
        }

        if(!StringUtils.hasLength(commandeClientDto.getCode())){
            errors.add("Veuillez renseigner le code de la commande client");
        }
        if(commandeClientDto.getClientDto() == null){
            errors.add("Veuillez renseigner le client de la commande");
        }
        if(commandeClientDto.getDateCommande() == null){
            errors.add("Veuillez renseigner la date de la commande");
        }

        return errors;
    }
}
