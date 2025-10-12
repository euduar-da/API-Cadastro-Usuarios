package br.com.atividade.und1.service;

import br.com.atividade.und1.controller.request.UsuarioRequest;
import br.com.atividade.und1.controller.response.UsuarioResponse;
import br.com.atividade.und1.domain.Usuario;
import br.com.atividade.und1.mapper.UsuarioMapper;
import br.com.atividade.und1.repository.UsuarioRepository;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioResponse incluir(UsuarioRequest request) {
        Usuario usuario = UsuarioMapper.toEntity(request);

        // 2. A senha agora é salva diretamente como veio na requisição (texto puro)
        usuario.setSenha(request.getSenha());

        usuarioRepository.save(usuario);

        return UsuarioMapper.toResponse(usuario);
    }
}
