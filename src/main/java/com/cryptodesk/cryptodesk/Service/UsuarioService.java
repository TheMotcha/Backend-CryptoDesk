package com.cryptodesk.cryptodesk.Service;

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

    public Optional<Usuario> buscarPorCorreo(Object correo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorCorreo'");
    }

    public boolean validarCredenciales(Usuario encontrado, Object contrasena) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validarCredenciales'");
    }

    public Optional<Usuario> buscarPorCorreo(String correo) {
    return usuarioRepository.findAll()
            .stream()
            .filter(u -> u.getCorreo() != null && ((String) u.getCorreo()).equalsIgnoreCase(correo))
            .findFirst();
    }

    public boolean validarCredenciales(Usuario usuario, String contrasena) {
    if (usuario == null || contrasena == null) {
        return false;
    }
    
    return usuario.getContrasena().equals(contrasena);
}
}