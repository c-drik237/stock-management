package com.makhaya.stockmanagement.dto;


import com.makhaya.stockmanagement.entities.Vente;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Builder
@Data
public class VenteDto {
    private Integer id;
    private String code;
    private LocalDate dateVente;
    private String commentaire;

    public static VenteDto toDto(Vente vente){
        if(vente == null){
            return null;
        }
        return VenteDto.builder()
                .id(vente.getId())
                .code(vente.getCode())
                .dateVente(vente.getDateVente())
                .commentaire(vente.getCommentaire())
                .build();
    }

    public static Vente toEntity(VenteDto  venteDto){
        if(venteDto == null){
            return null;
        }
        Vente vente = new Vente();
        vente.setId(venteDto.getId());
        vente.setCode(venteDto.getCode());
        vente.setDateVente(venteDto.getDateVente());
        vente.setCommentaire(venteDto.getCommentaire());
        return vente;
    }
}
