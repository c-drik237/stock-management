package com.makhaya.stockmanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Builder
public class LigneVente extends AbstractEntity{
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
    @ManyToOne
    @JoinColumn(name = "id_vente")
    private Vente vente;
}
