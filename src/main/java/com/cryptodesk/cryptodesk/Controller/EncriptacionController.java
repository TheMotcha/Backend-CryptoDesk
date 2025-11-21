package com.cryptodesk.cryptodesk.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.web.multipart.MultipartFile;

import com.cryptodesk.cryptodesk.Tools.EncripDesencripTool;

@RestController
@RequestMapping("/api/encriptacion")
@CrossOrigin(origins = "*")
public class EncriptacionController {

    private final EncripDesencripTool tool;

    public EncriptacionController() {
        this.tool = new EncripDesencripTool();
    }

    //Encriptar archivo
    @PostMapping("/texto/encriptar")
    public ResponseEntity<?> encriptarTexto(@RequestParam("texto") String texto) {
        try {
            String encrypted = tool.encrypt(texto);
            return ResponseEntity.ok(encrypted);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al encriptar texto: " + e.getMessage());
        }
    }

    @PostMapping("/texto/desencriptar")
    public ResponseEntity<?> desencriptarTexto(@RequestParam("texto") String textoEncriptado) {
        try {
            String decrypted = tool.decrypt(textoEncriptado);
            return ResponseEntity.ok(decrypted);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al desencriptar texto: " + e.getMessage());
        }
    }
    @GetMapping("/ping")
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("Cifrado listo (modo archivos)");
    }
}
