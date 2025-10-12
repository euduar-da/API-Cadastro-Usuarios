package br.com.cwi.curser.service;

import br.com.cwi.curser.controller.request.IncluirUsuarioRequest;
import br.com.cwi.curser.controller.response.IdResponse;
import br.com.cwi.curser.domain.Usuario;
import br.com.cwi.curser.mapper.IncluirUsuarioMapper;
import br.com.cwi.curser.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class IncluirUsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final ValidaEmailUnicoUsuarioService validaEmailUnicoUsuarioService;

    public IncluirUsuarioService(UsuarioRepository usuarioRepository,
                                 ValidaEmailUnicoUsuarioService validaEmailUnicoUsuarioService) {
        this.usuarioRepository = usuarioRepository;
        this.validaEmailUnicoUsuarioService = validaEmailUnicoUsuarioService;
    }

    public IdResponse incluir(IncluirUsuarioRequest request) {
        validaEmailUnicoUsuarioService.validar(request.getEmail());

        Usuario usuario = usuarioRepository.save(IncluirUsuarioMapper.toEntity(request));

        return IncluirUsuarioMapper.toResponse(usuario.getId());
    }
}
