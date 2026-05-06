package com.makhaya.stockmanagement.validators;

import java.util.ArrayList;
import java.util.List;

import com.makhaya.stockmanagement.dto.CategoryDto;
import org.springframework.util.StringUtils;


public class categoryDtoValidator {

    public static List<String> validate(CategoryDto categoryDto){

        List<String> errors = new ArrayList<>();

        if(categoryDto == null){
            errors.add("Veuillez renseigner le code de la categorie");
            errors.add("Veuillez renseigner le désignation de la catégorie");
        }

        if(!StringUtils.hasLength(categoryDto.getCode())){
            errors.add("Veuillez renseigner le code de la categorie");
        }
        if(!StringUtils.hasLength(categoryDto.getDesignation())){
            errors.add("Veuillez renseigner le désignation de la catégorie");
        }
        
        return errors;
    }
    
}
