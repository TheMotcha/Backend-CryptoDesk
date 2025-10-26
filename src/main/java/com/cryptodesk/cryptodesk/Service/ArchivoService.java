package com.cryptodesk.cryptodesk.Service;

import com.cryptodesk.cryptodesk.Entity.Archivo;
import com.cryptodesk.cryptodesk.Repository.ArchivoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArchivoService {

    private final ArchivoRepository archivoRepository;

    public ArchivoService(ArchivoRepository archivoRepository) {
        this.archivoRepository = archivoRepository;
    }

    // Crear o actualizar archivo
    public Archivo guardar(Archivo archivo) {
        return archivoRepository.save(archivo);
    }

    // Listar todos los archivos
    public List<Archivo> listarTodos() {
        return archivoRepository.findAll();
    }

    // Buscar archivo por ID
    public Optional<Archivo> buscarPorId(int id) {
        return archivoRepository.findById(id);
    }

    // Eliminar archivo
    public void eliminar(int id) {
        archivoRepository.deleteById(id);
    }
}
