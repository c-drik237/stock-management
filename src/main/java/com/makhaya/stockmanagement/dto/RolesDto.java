package com.makhaya.stockmanagement.dto;

import com.makhaya.stockmanagement.entities.Category;
import com.makhaya.stockmanagement.entities.Roles;
import com.makhaya.stockmanagement.entities.Utilisateur;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDto {
    private Integer id;
    private String roleName;
    private UtilisateurDto utilisateurDto;

    public static RolesDto toDto(Roles roles){
        if(roles == null){
            return null;
        }
        return RolesDto.builder()
                .id(roles.getId())
                .roleName(roles.getRoleName())
                .build();
    }

    public static Roles toEntity(RolesDto  rolesDto){
        if(rolesDto == null){
            return null;
        }
        Roles roles = new Roles();
        roles.setId(rolesDto.getId());
        roles.setRoleName(rolesDto.getRoleName());
        return  roles;
    }
}
