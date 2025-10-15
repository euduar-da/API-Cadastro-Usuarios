package com.atividade.und1.unidade1.controller.response;


import lombok.*;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsuarioResponse {

    private Long id;
    private String nomeCompleto;
    private String email;
    private LocalDate dataNascimento;


}