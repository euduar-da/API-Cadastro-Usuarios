package br.com.cwi.curser.mapper;

import br.com.cwi.curser.controller.request.IncluirCursoRequest;
import br.com.cwi.curser.domain.Curso;

public class IncluirCursoMapper {

    public static Curso toEntity(IncluirCursoRequest request) {
        return new Curso(request.getTitulo(), request.getTipo(), request.getNivel(), request.getDataInicio());
    }
}
