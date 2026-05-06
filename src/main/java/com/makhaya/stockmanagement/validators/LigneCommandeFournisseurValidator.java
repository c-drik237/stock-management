package com.makhaya.stockmanagement.validators;

import java.util.ArrayList;
import java.util.List;

import com.makhaya.stockmanagement.dto.LigneCommandeFournisseurDto;
import org.springframework.util.StringUtils;


public class LigneCommandeFournisseurValidator {
    
    public static List<String> validate(LigneCommandeFournisseurDto ligneCommandeFournisseurDto){

        List<String> errors = new ArrayList<>();

        if(ligneCommandeFournisseurDto == null){
            errors.add("Veuillez renseigner la quantité de la ligne commande");
            errors.add("Veuillez renseigner l'article de la ligne commande");
            errors.add("Veuillez renseigner le peix unitaire de la ligne commande");
            errors.add("Veuillez renseigner la commande client");
        }

        if(ligneCommandeFournisseurDto.getArticleDto() == null){
            errors.add("Veuillez renseigner l'article de la ligne commande");
        }
        if(ligneCommandeFournisseurDto.getCommandeFournisseurDto() == null){
            errors.add("Veuillez renseigner la commande client");
        }
        if(ligneCommandeFournisseurDto.getPrixUnitaire() == null){
            errors.add("Veuillez renseigner le peix unitaire de la ligne commande");
        }
        if(ligneCommandeFournisseurDto.getQuantite() == null){
            errors.add("Veuillez renseigner la quantité de la ligne commande");
        }

        return errors;
    }
}
