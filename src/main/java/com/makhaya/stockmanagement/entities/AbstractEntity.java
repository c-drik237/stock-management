package com.makhaya.stockmanagement.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@MappedSuperclass
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@SuperBuilder(toBuilder = true)
public class AbstractEntity  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @CreatedDate
    @Column(nullable = false)
    @JsonIgnore
    private LocalDate createAt;
    @CreatedDate
    @Column(nullable = false)
    @JsonIgnore
    private LocalDate lastModifiedAt;
    @CreatedBy
    @JsonIgnore
    private String createdBy;
    @LastModifiedBy
    @JsonIgnore 
    private String lastModifiedBy;
}
