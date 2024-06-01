package com.ms.user.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.ms.user.dtos.UserRequestDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private String email;

    public UserModel(UserRequestDTO userRequestDTO) {

        this.nome = userRequestDTO.getNome();
        this.email = userRequestDTO.getEmail();

    }
}
