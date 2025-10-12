package br.com.cwi.curser.service;

import br.com.cwi.curser.domain.Curso;
import br.com.cwi.curser.repository.CursoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY;

@Service
public class BuscarCursoService {

    private final CursoRepository cursoRepository;

    public BuscarCursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public Curso porId(Long id) {
        return cursoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(UNPROCESSABLE_ENTITY, "Curso não encontrado"));
    }
}
