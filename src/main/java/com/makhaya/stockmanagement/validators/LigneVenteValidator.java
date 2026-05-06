package com.makhaya.stockmanagement.validators;

import java.util.ArrayList;
import java.util.List;

import com.makhaya.stockmanagement.dto.LigneVenteDto;
import org.springframework.util.StringUtils;


public class LigneVenteValidator {
    
    public static List<String> validate(LigneVenteDto ligneVenteDto){

        List<String> errors = new ArrayList<>();

        if(ligneVenteDto == null){
            errors.add("Veuillez renseigner la vente");
            errors.add("Veuillez renseigner la quantite de la ligne");
            errors.add("Veuillez renseigner le prix unitaire de la ligne vente");
        }

        if(ligneVenteDto.getPrixUnitaire() == null){
            errors.add("Veuillez renseigner le prix unitaire de la ligne vente");
        }
        if(ligneVenteDto.getQuantite() == null){
            errors.add("Veuillez renseigner la quantite de la ligne");
        }
        if(ligneVenteDto.getVenteDto() == null){
            errors.add("Veuillez renseigner la vente");
        }

        return errors;
    }
}
