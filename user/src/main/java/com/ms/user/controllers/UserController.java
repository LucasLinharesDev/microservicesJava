package com.ms.user.controllers;

import com.ms.user.dtos.UserRequestDTO;
import com.ms.user.dtos.UserResponseDTO;
import com.ms.user.services.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("user/")
public class UserController {

    private final UserService userService;

    @GetMapping("{id}")
    public ResponseEntity<UserResponseDTO> buscarUser (@PathVariable UUID id){

        UserResponseDTO userResponseDTO = userService.buscarUserPorID(id);
        return ResponseEntity.ok(userResponseDTO);
    }

    @PostMapping
    public ResponseEntity<UserResponseDTO> criarUser (@RequestBody @Valid UserRequestDTO userRequestDTO){

        UserResponseDTO userResponseDTO = userService.criarUser(userRequestDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(userResponseDTO);
    }
}
