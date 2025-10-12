package br.com.cwi.curser.service;

import br.com.cwi.curser.controller.response.CursoResumidoResponse;
import br.com.cwi.curser.mapper.CursoResumidoMapper;
import br.com.cwi.curser.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListarCursosService {

    private final CursoRepository cursoRepository;

    public ListarCursosService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<CursoResumidoResponse> listarAtivos() {
        return cursoRepository.findByAtivo(true).stream()
                .map(CursoResumidoMapper::toResponse)
                .collect(Collectors.toList());
    }

}
