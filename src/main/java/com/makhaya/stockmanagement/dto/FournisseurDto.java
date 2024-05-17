package com.makhaya.stockmanagement.dto;

import com.makhaya.stockmanagement.entities.Adresse;
import com.makhaya.stockmanagement.entities.Client;
import com.makhaya.stockmanagement.entities.CommandeFournisseur;
import com.makhaya.stockmanagement.entities.Fournisseur;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class FournisseurDto {
    private Integer id;
    private String nom;
    private String prenom;
    private String photo;
    private String email;
    private String telephone;
    private AdresseDto adresseDto;
    private List<CommandeFournisseurDto> commandeFournisseurDtos;

    public static FournisseurDto toDto(Fournisseur fournisseur){
        if(fournisseur == null){
            return null;
        }
        return FournisseurDto.builder()
                .id(fournisseur.getId())
                .nom(fournisseur.getNom())
                .prenom(fournisseur.getPrenom())
                .photo(fournisseur.getPhoto())
                .email(fournisseur.getEmail())
                .telephone(fournisseur.getTelephone())
                .build();
    }

    public static Fournisseur toDto(FournisseurDto fournisseurDto) {
        if (fournisseurDto == null) {
            return null;
        }
        Fournisseur fournisseur = new Fournisseur();
        fournisseur.setId(fournisseurDto.getId());
        fournisseur.setNom(fournisseurDto.getNom());
        fournisseur.setPrenom(fournisseurDto.getPrenom());
        fournisseur.setPhoto(fournisseurDto.getPhoto());
        fournisseur.setEmail(fournisseurDto.getEmail());
        fournisseur.setTelephone(fournisseurDto.getTelephone());

        return fournisseur;
    }
}
