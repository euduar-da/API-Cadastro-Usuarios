package com.atividade.und1.unidade1.repository;

import com.atividade.und1.unidade1.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
