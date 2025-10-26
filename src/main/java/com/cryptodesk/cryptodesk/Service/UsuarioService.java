package com.cryptodesk.cryptodesk.service;

import com.cryptodesk.cryptodesk.Entity.Usuario;
import com.cryptodesk.cryptodesk.Repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // Crear o actualizar usuario
    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Obtener todos los usuarios
    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    // Buscar usuario por ID
    public Optional<Usuario> buscarPorId(int id) {
        return usuarioRepository.findById(id);
    }

    // Eliminar usuario
    public void eliminar(int id) {
        usuarioRepository.deleteById(id);
    }
}