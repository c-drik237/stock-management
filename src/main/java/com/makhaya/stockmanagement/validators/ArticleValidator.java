package com.makhaya.stockmanagement.validators;

import java.util.ArrayList;
import java.util.List;

import com.makhaya.stockmanagement.dto.ArticleDto;
import org.springframework.util.StringUtils;


public class ArticleValidator {

    public static List<String> validate(ArticleDto articleDto){

        List<String> errors = new ArrayList<>();

        if(articleDto == null){
            errors.add("Veuillez renseigner le prix unitaire de l'article");
            errors.add("Veuillez renseigner le désignation de l'article");
            errors.add("Veuillez renseigner le code article");
            errors.add("Veuillez renseigner le prix unitaire TTC de l'article");
            errors.add("Veuillez renseigner le taux TVA de l'article");
            errors.add("Veuillez renseigner la catégorie de l'article");
        }

        if(!StringUtils.hasLength(articleDto.getCodeArticle())){
            errors.add("Veuillez renseigner le code article");
        }
        if(!StringUtils.hasLength(articleDto.getDesignation())){
            errors.add("Veuillez renseigner le désignation de l'article");
        }
        if(articleDto.getPrixUnitaireHt() == null){
            errors.add("Veuillez renseigner le prix unitaire de l'article");
        }
        if(articleDto.getPrixUnitaireTtc() == null){
            errors.add("Veuillez renseigner le prix unitaire TTC de l'article");
        }
        if(articleDto.getTauxTva() == null){
            errors.add("Veuillez renseigner le taux TVA de l'article");
        }
        if(articleDto.getCategoryDto() == null){
            errors.add("Veuillez renseigner la catégorie de l'article");
        }

        return errors;
    }
    
}
