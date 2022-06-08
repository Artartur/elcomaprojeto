package com.cadastro.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cadastro.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	
}
