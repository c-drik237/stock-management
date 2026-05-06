package com.makhaya.stockmanagement.validators;

import java.util.ArrayList;
import java.util.List;

import com.makhaya.stockmanagement.dto.LigneCommandeClientDto;



public class LigneCommandeClientValidator {

    public static List<String> validate(LigneCommandeClientDto ligneCommandeClientDto){

        List<String> errors = new ArrayList<>();

        if(ligneCommandeClientDto == null){
            errors.add("Veuillez renseigner la quantité de la ligne commande");
            errors.add("Veuillez renseigner l'article de la ligne commande");
            errors.add("Veuillez renseigner le peix unitaire de la ligne commande");
            errors.add("Veuillez renseigner la commande client");
        }

        if(ligneCommandeClientDto.getArticleDto() == null){
            errors.add("Veuillez renseigner l'article de la ligne commande");
        }
        if(ligneCommandeClientDto.getCommandeClientDto() == null){
            errors.add("Veuillez renseigner la commande client");
        }
        if(ligneCommandeClientDto.getPrixUnitaire() == null){
            errors.add("Veuillez renseigner le peix unitaire de la ligne commande");
        }
        if(ligneCommandeClientDto.getQuantite() == null){
            errors.add("Veuillez renseigner la quantité de la ligne commande");
        }

        return errors;
    }
    
}
