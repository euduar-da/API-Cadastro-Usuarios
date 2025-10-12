package br.com.cwi.curser.controller.response;

import java.time.LocalDate;

public class CursoResumidoResponse {

    private Long id;
    private String titulo;
    private LocalDate dataInicio;

    public CursoResumidoResponse(Long id, String titulo, LocalDate dataInicio) {
        this.id = id;
        this.titulo = titulo;
        this.dataInicio = dataInicio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
}
