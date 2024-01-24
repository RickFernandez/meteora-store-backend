package com.meteorastorebackend.models.user;

import com.meteorastorebackend.enums.UserType;
import com.meteorastorebackend.persistence.entites.Address;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Set;
import java.util.UUID;

public record UserRequest(
        @NotBlank(message = "Nome é obrigatório")
        String firstName,
        @NotBlank(message = "Sobrenome é obrigatório")
        String lastName,
        @NotBlank(message = "Email é obrigatório")
        @Email(message = "Email inválido")
        String email,
        @NotBlank(message = "Senha é obrigatória")
        String password,
        @NotBlank(message = "Documento é obrigatório")
        @Size(min = 11, max = 14, message = "Documento inválido")
        String document,
        @NotNull
        UserType userType
) { }
