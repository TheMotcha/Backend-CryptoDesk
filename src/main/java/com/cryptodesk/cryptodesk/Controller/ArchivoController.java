package com.cryptodesk.cryptodesk.Controller;


import com.cryptodesk.cryptodesk.Entity.Archivo;
import com.cryptodesk.cryptodesk.Service.ArchivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/archivos")
public class ArchivoController {

        @Autowired
        private ArchivoService archivoService;

        // 🔹 Crear usuario
        @PostMapping
        public ResponseEntity<Archivo> crearUsuario(@RequestBody Archivo archivo) {
            Archivo nuevoArchivo = archivoService.guardar(archivo);
            return ResponseEntity.ok(nuevoArchivo);
        }

        // 🔹 Obtener todos
        @GetMapping
        public ResponseEntity<List<Archivo>> listarUsuarios() {
            List<Archivo> usuarios = archivoService.listarTodos();
            return ResponseEntity.ok(usuarios);
        }

        // 🔹 Buscar por ID
        @GetMapping("/{id}")
        public ResponseEntity<Archivo> obtenerPorId(@PathVariable int id) {
            Optional<Archivo> usuario = archivoService.buscarPorId(id);
            return usuario.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
        }

        // 🔹 Actualizar usuario
        @PutMapping("/{id}")
        public ResponseEntity<Archivo> actualizarUsuario(@PathVariable int id, @RequestBody Archivo usuario) {
            usuario.setIdArchivo(id); // Aseguramos que el ID de la URL prevalezca
            Archivo actualizado = archivoService.guardar(usuario);
            return ResponseEntity.ok(actualizado);
        }

        // 🔹 Eliminar usuario
        @DeleteMapping("/{id}")
        public ResponseEntity<Void> eliminarUsuario(@PathVariable int id) {
            archivoService.eliminar(id);
            return ResponseEntity.noContent().build();
        }
}
