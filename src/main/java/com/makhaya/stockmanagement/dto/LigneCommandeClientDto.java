package com.makhaya.stockmanagement.dto;

import com.makhaya.stockmanagement.entities.Article;
import com.makhaya.stockmanagement.entities.Category;
import com.makhaya.stockmanagement.entities.CommandeClient;
import com.makhaya.stockmanagement.entities.LigneCommandeClient;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Data
@Builder
public class LigneCommandeClientDto {
    private Integer id;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
    private ArticleDto articleDto;
    private CommandeClientDto commandeClientDto;

    public static LigneCommandeClientDto toDto(LigneCommandeClient ligneCommandeClient){
        if(ligneCommandeClient == null){
            return null;
        }
        return LigneCommandeClientDto.builder()
                .id(ligneCommandeClient.getId())
                .quantite(ligneCommandeClient.getQuantite())
                .prixUnitaire(ligneCommandeClient.getPrixUnitaire())
                .build();
    }

    public static LigneCommandeClient toEntity(LigneCommandeClientDto  ligneCommandeClientDto){
        if(ligneCommandeClientDto == null){
            return null;
        }
        LigneCommandeClient ligneCommandeClient = new LigneCommandeClient();
        ligneCommandeClient.setId(ligneCommandeClientDto.getId());
        ligneCommandeClient.setQuantite(ligneCommandeClientDto.getQuantite());
        ligneCommandeClient.setPrixUnitaire(ligneCommandeClientDto.getPrixUnitaire());
        return ligneCommandeClient;
    }
}
