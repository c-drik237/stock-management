package com.makhaya.stockmanagement.entities;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Builder
public class Utilisateur extends AbstractEntity {
    private String nom;
    private String prenom;
    private String photo;
    private String email;
    private String telephone;
    private String password;
    private LocalDate dateNaissance;
    @Embedded
    private Adresse adresse;
    @ManyToOne
    @JoinColumn(name = "entreprise")
    private Entreprise entreprise;
    @OneToMany(mappedBy = "utilisateur")
    private List<Roles> roles;
}
