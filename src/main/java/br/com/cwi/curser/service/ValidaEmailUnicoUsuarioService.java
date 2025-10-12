package br.com.cwi.curser.service;

import br.com.cwi.curser.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY;

@Service
public class ValidaEmailUnicoUsuarioService {

    private final UsuarioRepository usuarioRepository;

    public ValidaEmailUnicoUsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void validar(String email) {
        if(usuarioRepository.existsByEmail(email)) {
            throw new ResponseStatusException(UNPROCESSABLE_ENTITY, "Já existe um usuario com este email.");
        }
    }
}


