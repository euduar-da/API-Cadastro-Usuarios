package br.com.cwi.curser.mapper;

import br.com.cwi.curser.controller.request.IncluirUsuarioRequest;
import br.com.cwi.curser.controller.response.IdResponse;
import br.com.cwi.curser.domain.Usuario;

public class IncluirUsuarioMapper {
    
    public static Usuario toEntity(IncluirUsuarioRequest request) {
        return new Usuario(request.getNome(), request.getEmail());
    }

    public static IdResponse toResponse(Long id) {
        return new IdResponse(id);
    }
}
