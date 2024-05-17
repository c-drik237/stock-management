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
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Builder
public class MvtStk extends  AbstractEntity {
    private LocalDate dateMvt;
    private BigDecimal quantite;
    private TypeMvtStk typeMvtStk;
    @ManyToOne
    @JoinColumn(name = "id_article")
    private Article article;

}
