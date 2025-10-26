package com.cryptodesk.cryptodesk.Repository;

import com.cryptodesk.cryptodesk.Entity.Archivo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArchivoRepository extends JpaRepository<Archivo, Integer> {
}