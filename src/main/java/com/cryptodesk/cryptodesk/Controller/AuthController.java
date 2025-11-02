package com.cryptodesk.cryptodesk.Controller;

import com.cryptodesk.cryptodesk.Entity.Usuario;
import com.cryptodesk.cryptodesk.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UsuarioService usuarioService;

    // Iniciar sesión (login)
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam String correo, @RequestParam String contrasena) {
        Optional<Usuario> usuarioOpt = usuarioService.buscarPorCorreo(correo);

        if (usuarioOpt.isEmpty()) {
            return ResponseEntity.status(404).body("Usuario no encontrado");
        }

        Usuario usuario = usuarioOpt.get();

        boolean valido = usuarioService.validarCredenciales(usuario, contrasena);
        if (!valido) {
            return ResponseEntity.status(401).body("Contraseña incorrecta");
        }

        return ResponseEntity.ok(usuario);
    }

    // Verificar si un correo está registrado
    @GetMapping("/check/{correo}")
    public ResponseEntity<?> verificarCorreo(@PathVariable String correo) {
        Optional<Usuario> usuarioOpt = usuarioService.buscarPorCorreo(correo);

        if (usuarioOpt.isPresent()) {
            return ResponseEntity.ok("El correo está registrado");
        } else {
            return ResponseEntity.status(404).body("El correo no está registrado");
        }
    }
}
