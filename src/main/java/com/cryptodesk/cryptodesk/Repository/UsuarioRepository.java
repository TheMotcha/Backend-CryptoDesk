package com.cryptodesk.cryptodesk.Repository;

import com.cryptodesk.cryptodesk.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findBytagUsuario(String tagUsuario);
}
