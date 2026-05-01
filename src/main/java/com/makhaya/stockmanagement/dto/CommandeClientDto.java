package com.makhaya.stockmanagement.dto;

import com.makhaya.stockmanagement.entities.Category;
import com.makhaya.stockmanagement.entities.CommandeClient;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Builder
@Data
public class CommandeClientDto {
    private Integer id;
    private String code;
    private LocalDate dateCommande;
    private ClientDto clientDto;
    private List<LigneCommandeClientDto> ligneCommandeClientDtos;

    public static CommandeClientDto toDto(CommandeClient commandeClient){
        if(commandeClient == null){
            return null;
        }
        return CommandeClientDto.builder()
                .id(commandeClient.getId())
                .code(commandeClient.getCode())
                .dateCommande(commandeClient.getDateCommande())
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
