package br.com.atividade.und1.mapper;

import br.com.atividade.und1.controller.request.UsuarioRequest;
import br.com.atividade.und1.controller.response.UsuarioResponse;
import br.com.atividade.und1.domain.Usuario;

public class UsuarioMapper {


    public static Usuario toEntity(UsuarioRequest request) {
        if (request == null) {
            return null;
        }
        Usuario entity = new Usuario();
        entity.setNomeCompleto(request.getNomeCompleto());
        entity.setEmail(request.getEmail());
        entity.setDataNascimento(request.getDataNascimento());
        entity.setSenha(request.getSenha());
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


