package com.makhaya.stockmanagement.dto;

import com.makhaya.stockmanagement.entities.Adresse;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdresseDto {
    private Integer id;
    private String adresse;
    private String ville;
    private String codePostale;
    private String pays;

    public static AdresseDto toDto(Adresse adresse){
        if(adresse == null){
            return null;
        }
        return AdresseDto.builder()
                .adresse(adresse.getAdresse())
                .ville(adresse.getVille())
                .codePostale(adresse.getCodePostale())
                .pays(adresse.getPays())
                .build();
    }

    public static Adresse toEntity(AdresseDto adresseDto){
        if(adresseDto == null){
            return null;
        }
        return Adresse.builder()
                .adresse(adresseDto.getAdresse())
                .ville(adresseDto.getVille())
                .codePostale(adresseDto.getCodePostale())
                .pays(adresseDto.getPays()).build();
    }
}
