package com.ms.user.services;

import com.ms.user.dtos.UserRequestDTO;
import com.ms.user.dtos.UserResponseDTO;
import com.ms.user.models.UserModel;
import com.ms.user.repositories.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@AllArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserResponseDTO buscarUserPorID (UUID id){

        UserModel userModel = userRepository.findById(id).get();

        return new UserResponseDTO(userModel);
    }

    @Transactional
    public UserResponseDTO criarUser (UserRequestDTO userRequestDTO){

        UserModel userModel = new UserModel(userRequestDTO);

        var userModelRetornoDB = userRepository.save(userModel);

        return new UserResponseDTO(userModelRetornoDB);

    }





}
