package br.com.cwi.curser.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;

    @ManyToMany(mappedBy = "alunos")
    private List<Curso> cursos = new ArrayList<>();

    @OneToMany(mappedBy = "instrutor")
    private List<Aula> aulasMinistradas = new ArrayList<>();

    public Usuario(Long id, String nome, String email, List<Curso> cursos, List<Aula> aulasMinistradas) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cursos = cursos;
        this.aulasMinistradas = aulasMinistradas;
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Usuario() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Aula> getAulasMinistradas() {
        return aulasMinistradas;
    }

    public void setAulasMinistradas(List<Aula> aulasMinistradas) {
        this.aulasMinistradas = aulasMinistradas;
    }
}
