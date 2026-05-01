package com.makhaya.stockmanagement.dto;

import com.makhaya.stockmanagement.entities.Adresse;
import com.makhaya.stockmanagement.entities.Client;
import com.makhaya.stockmanagement.entities.Entreprise;
import com.makhaya.stockmanagement.entities.Roles;
import com.makhaya.stockmanagement.entities.Utilisateur;
import jakarta.persistence.Embedded;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Data
@Builder
public class UtilisateurDto {
    private Integer id;
    private String nom;
    private String prenom;
    private String photo;
    private String email;
    private String telephone;
    private String password;
    private LocalDate dateNaissance;
    private AdresseDto adresseDto;
    private EntrepriseDto entrepriseDto;
    private List<RolesDto> rolesDtos;

    public static UtilisateurDto toDto(Utilisateur utilisateur){
        if(utilisateur == null){
            return null;
        }
        return UtilisateurDto.builder()
                .id(utilisateur.getId())
                .nom(utilisateur.getNom())
                .prenom(utilisateur.getPrenom())
                .photo(utilisateur.getPhoto())
                .email(utilisateur.getEmail())
                .telephone(utilisateur.getTelephone())
                .password(utilisateur.getPassword())
                .dateNaissance(utilisateur.getDateNaissance())
                .build();
    }

    public static Utilisateur toDto(UtilisateurDto utilisateurDto) {
        if (utilisateurDto == null) {
            return null;
        }
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(utilisateurDto.getId());
        utilisateur.setNom(utilisateurDto.getNom());
        utilisateur.setPrenom(utilisateurDto.getPrenom());
        utilisateur.setPhoto(utilisateurDto.getPhoto());
        utilisateur.setEmail(utilisateurDto.getEmail());
        utilisateur.setTelephone(utilisateurDto.getTelephone());
        utilisateur.setPassword(utilisateurDto.getPassword());
        utilisateur.setDateNaissance(utilisateurDto.getDateNaissance());

        return utilisateur;
    }
}
