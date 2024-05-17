package com.makhaya.stockmanagement.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.makhaya.stockmanagement.entities.Category;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class CategoryDto {
    private Integer id;
    private String code;
    private String designation;
    @JsonIgnore
    private List<ArticleDto> articleDtos;

    public static CategoryDto toDto(Category category){
        if(category == null){
            return null;
        }
        return CategoryDto.builder()
                .id(category.getId())
                .code(category.getCode())
                .designation(category.getDesignation())
                .build();
    }

    public static Category toEntity(CategoryDto  categoryDto){
        if(categoryDto == null){
            return null;
        }
        Category category = new Category();
        category.setId(categoryDto.getId());
        category.setDesignation(categoryDto.getDesignation());
        category.setCode(categoryDto.getCode());
        return category;
    }
}
