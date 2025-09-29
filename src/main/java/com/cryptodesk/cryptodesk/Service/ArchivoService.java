package com.cryptodesk.cryptodesk.Service;

import com.cryptodesk.cryptodesk.Entity.Archivo;
import com.cryptodesk.cryptodesk.Repository.ArchivoRepository;
import org.springframework.stereotype.Service;

@Service
public class ArchivoService {

    private ArchivoRepository a_file;

    public void addArchivo(Archivo file){
        a_file.save(file);
    }

    public void deleteArchivo(Archivo file){
        a_file.delete(file);
    }

    public void updateArchivo(Archivo file){
        a_file.update(file);
    }
}
