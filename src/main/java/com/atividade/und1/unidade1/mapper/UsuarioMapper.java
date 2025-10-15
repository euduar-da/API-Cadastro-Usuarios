package com.atividade.und1.unidade1.mapper;

import com.atividade.und1.unidade1.controller.request.UsuarioRequest;
import com.atividade.und1.unidade1.controller.response.UsuarioResponse;
import com.atividade.und1.unidade1.domain.Usuario;

public class UsuarioMapper {
    public static Usuario toEntity(UsuarioRequest request) {
        if (request == null) {
            return null;
        }
        Usuario entity = new Usuario();
        entity.setNomeCompleto(request.getNomeCompleto());
        entity.setEmail(request.getEmail());
        entity.setDataNascimento(request.getDataNascimento());
        entity.setSenha(request.getSenha()); // senha sem encode
        return entity;
    }

    public static UsuarioResponse toResponse(Usuario entity) {
        if (entity == null) {
            return null;
        }
        return UsuarioResponse.builder()
                .id(entity.getId())
                .nomeCompleto(entity.getNomeCompleto())
                .email(entity.getEmail())
                .dataNascimento(entity.getDataNascimento())
                .build();
    }
}
