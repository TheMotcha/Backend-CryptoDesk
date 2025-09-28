package com.cryptodesk.cryptodesk.Service;


import com.cryptodesk.cryptodesk.Entity.Usuario;
import com.cryptodesk.cryptodesk.Repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private UsuarioRepository repo;
    public void addUsuario (Usuario user){
        repo.save(user);
    }

    public void deleteUsuario (Usuario user){
        repo.delete(user);
    }
}
