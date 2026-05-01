package com.makhaya.stockmanagement.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.makhaya.stockmanagement.entities.Client;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class ClientDto {
    private Integer id;
    private String nom;
    private String prenom;
    private String photo;
    private String email;
    private String telephone;
    private AdresseDto adresseDto;
    @JsonIgnore
    private List<LigneCommandeClientDto> commandeClientDtos;

    public static ClientDto toDto(Client client){
        if(client == null){
            return null;
        }
        return ClientDto.builder()
                .id(client.getId())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .photo(client.getPhoto())
                .email(client.getEmail())
                .telephone(client.getTelephone())
                .build();
    }

    public static Client toDto(ClientDto clientDto) {
        if (clientDto == null) {
            return null;
        }
        Client client = new Client();
        client.setId(clientDto.getId());
        client.setNom(clientDto.getNom());
        client.setPrenom(clientDto.getPrenom());
        client.setPhoto(clientDto.getPhoto());
        client.setEmail(clientDto.getEmail());
        client.setTelephone(clientDto.getTelephone());

        return client;
    }
}
