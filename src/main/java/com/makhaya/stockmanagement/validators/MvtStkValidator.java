package com.makhaya.stockmanagement.validators;

import java.util.ArrayList;
import java.util.List;

import com.makhaya.stockmanagement.dto.MvtStkDto;


public class MvtStkValidator {
    
    public static List<String> validate(MvtStkDto mvtStkDto){

        List<String> errors = new ArrayList<>();

        if(mvtStkDto == null){
        }

        if(mvtStkDto.getArticleDto() == null){
            errors.add("Veuillez renseigner l'article du mouvement'");
        }
        if(mvtStkDto.getDateMvt() == null){
            errors.add("Veuillez renseigner la date du mouvement de stock");
        }
        if(mvtStkDto.getQuantite() == null){
            errors.add("Veuillez renseigner la quantité du mouvement");
        }
        if(mvtStkDto.getTypeMvtStk() == null){
            errors.add("Veuillez renseigner le type de mouvement");
        }

        return errors;
    }
}
