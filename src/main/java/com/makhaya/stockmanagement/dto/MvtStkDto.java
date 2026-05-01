package com.makhaya.stockmanagement.dto;

import com.makhaya.stockmanagement.entities.Article;
import com.makhaya.stockmanagement.entities.LigneCommandeClient;
import com.makhaya.stockmanagement.entities.MvtStk;
import com.makhaya.stockmanagement.entities.TypeMvtStk;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
@Data
@Builder
public class MvtStkDto {
    private Integer id;
    private LocalDate dateMvt;
    private BigDecimal quantite;
    private TypeMvtStk typeMvtStk;
    private ArticleDto articleDto;

    public static MvtStkDto toDto(MvtStk mvtStk){
        if(mvtStk == null){
            return null;
        }
        return MvtStkDto.builder()
                .id(mvtStk.getId())
                .dateMvt(mvtStk.getDateMvt())
                .quantite(mvtStk.getQuantite())
                .typeMvtStk(mvtStk.getTypeMvtStk())
                .build();
    }

    public static MvtStk toEntity(MvtStkDto  mvtStkDto){
        if(mvtStkDto == null){
            return null;
        }
        MvtStk mvtStk = new MvtStk();
        mvtStk.setId(mvtStkDto.getId());
        mvtStk.setQuantite(mvtStkDto.getQuantite());
        mvtStk.setDateMvt(mvtStkDto.getDateMvt());
        mvtStk.setTypeMvtStk(mvtStkDto.getTypeMvtStk());
        return mvtStk;
    }
}
