package com.atividade.und1.unidade1.service;

import com.atividade.und1.unidade1.controller.request.UsuarioRequest;
import com.atividade.und1.unidade1.controller.response.UsuarioResponse;
import com.atividade.und1.unidade1.domain.Usuario;
import com.atividade.und1.unidade1.mapper.UsuarioMapper;
import com.atividade.und1.unidade1.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class UsuarioService {


    private final UsuarioRepository usuarioRepository;

    public UsuarioResponse incluir(UsuarioRequest request) {
        Usuario usuario = UsuarioMapper.toEntity(request);

        usuarioRepository.save(usuario);

        return UsuarioMapper.toResponse(usuario);
    }

    public List<UsuarioResponse> listar() {
        return usuarioRepository.findAll()
                .stream()
                .map(UsuarioMapper::toResponse)
                .collect(Collectors.toList());
    }
}
