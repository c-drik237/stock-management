package com.makhaya.stockmanagement.dto;
import com.makhaya.stockmanagement.entities.Entreprise;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class EntrepriseDto {
    private Integer id;
    private String nom;
    private String description;
    private AdresseDto adresseDto;
    private String codeFiscal;
    private String logo;
    private String email;
    private String numTelephone;
    private String siteWeb;
    private List<UtilisateurDto> utilisateurDtos;

    public static EntrepriseDto toDto(Entreprise entreprise){
        if(entreprise == null){
            return null;
        }
        return EntrepriseDto.builder()
                .id(entreprise.getId())
                .nom(entreprise.getNom())
                .description(entreprise.getDescription())
                .codeFiscal(entreprise.getCodeFiscal())
                .logo(entreprise.getLogo())
                .email(entreprise.getEmail())
                .numTelephone(entreprise.getNumTelephone())
                .siteWeb(entreprise.getSiteWeb())
                .build();
    }

    public static Entreprise toEntity(EntrepriseDto  entrepriseDto){
        if(entrepriseDto == null){
            return null;
        }
        Entreprise entreprise = new Entreprise();
        entreprise.setId(entrepriseDto.getId());
        entreprise.setNom(entrepriseDto.getNom());
        entreprise.setDescription(entrepriseDto.getDescription());
        entreprise.setCodeFiscal(entrepriseDto.getCodeFiscal());
        entreprise.setLogo(entrepriseDto.getLogo());
        entreprise.setEmail(entrepriseDto.getEmail());
        entreprise.setNumTelephone(entrepriseDto.getNumTelephone());
        entreprise.setSiteWeb(entrepriseDto.getSiteWeb());
        return entreprise;
    }
}
