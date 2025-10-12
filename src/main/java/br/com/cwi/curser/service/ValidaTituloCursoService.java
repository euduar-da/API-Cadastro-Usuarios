package br.com.cwi.curser.service;

import br.com.cwi.curser.repository.CursoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY;

@Service
public class ValidaTituloCursoService {

    private final CursoRepository cursoRepository;

    public ValidaTituloCursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public void validar(String titulo) {
        if (cursoRepository.existsByTitulo(titulo)) {
            throw new ResponseStatusException(UNPROCESSABLE_ENTITY, "Já existe um curso com este título");
        }
    }
}
