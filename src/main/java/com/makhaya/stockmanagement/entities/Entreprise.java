package com.makhaya.stockmanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Builder
public class Entreprise extends AbstractEntity{
    private String nom;
    private String description;
    private Adresse adresse;
    private String codeFiscal;
    private String logo;
    private String email;
    private String numTelephone;
    private String siteWeb;
    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateur> utilisateurs;
}
