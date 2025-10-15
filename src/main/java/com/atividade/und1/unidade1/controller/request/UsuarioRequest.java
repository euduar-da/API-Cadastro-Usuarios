package com.atividade.und1.unidade1.controller.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class UsuarioRequest {

    @NotBlank
    private String nomeCompleto;

    @NotBlank
    @Email
    private String email;



    @NotNull
    private LocalDate dataNascimento;

    @NotBlank
    private String senha;
}
