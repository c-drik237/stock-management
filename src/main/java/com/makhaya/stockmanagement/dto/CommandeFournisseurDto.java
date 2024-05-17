package com.makhaya.stockmanagement.dto;
import com.makhaya.stockmanagement.entities.CommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Data
@Builder
public class CommandeFournisseurDto {
    private Integer id;
    private String code;
    private LocalDate dateCommande;
    private FournisseurDto fournisseurDto;
    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurDtos;

    public static CommandeFournisseurDto toDto(CommandeFournisseur commandeFournisseur){
        if(commandeFournisseur == null){
            return null;
        }
        return CommandeFournisseurDto.builder()
                .id(commandeFournisseur.getId())
                .code(commandeFournisseur.getCode())
                .dateCommande(commandeFournisseur.getDateCommande())
                .build();
    }

    public static CommandeFournisseur toEntity(CommandeFournisseurDto  commandeFournisseurDto){
        if(commandeFournisseurDto == null){
            return null;
        }
        CommandeFournisseur commandeFournisseur = new CommandeFournisseur();
        commandeFournisseur.setId(commandeFournisseurDto.getId());
        commandeFournisseur.setDateCommande(commandeFournisseurDto.getDateCommande());
        commandeFournisseur.setCode(commandeFournisseurDto.getCode());
        return commandeFournisseur;
    }
}
