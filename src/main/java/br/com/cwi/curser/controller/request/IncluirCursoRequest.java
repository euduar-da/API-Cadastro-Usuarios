package br.com.cwi.curser.controller.request;

import br.com.cwi.curser.domain.Nivel;
import br.com.cwi.curser.domain.Tipo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class IncluirCursoRequest {

    @NotBlank
    private String titulo;

    @NotNull
    private Tipo tipo;

    @NotNull
    private Nivel nivel;

    @NotNull
    private LocalDate dataInicio;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
}
