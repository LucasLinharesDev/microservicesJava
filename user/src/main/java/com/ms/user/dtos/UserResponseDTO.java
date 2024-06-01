package com.ms.user.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ms.user.models.UserModel;

import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserResponseDTO {

    @JsonProperty("id")
    private UUID id;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("email")
    private String email;

    public UserResponseDTO(UserModel userModel) {

        this.id = userModel.getId();
        this.nome = userModel.getNome();
        this.email = userModel.getEmail();
    }
}
