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
    @PostMapping("/archivo/encriptar")
    public ResponseEntity<?> encriptarArchivo(@RequestParam("file") MultipartFile file) {
        try {
            byte[] encrypted = tool.encriptarArchivo(file.getBytes());

            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + file.getOriginalFilename() + ".enc")
                    .body(encrypted);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al encriptar archivo: " + e.getMessage());
        }
    }

    //Desencriptar archivo
    @PostMapping("/archivo/desencriptar")
    public ResponseEntity<?> desencriptarArchivo(@RequestParam("file") MultipartFile file) {
        try {
            byte[] decrypted = tool.desencriptarArchivo(file.getBytes());

            String originalName = file.getOriginalFilename().replace(".enc", "");

            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + originalName)
                    .body(decrypted);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al desencriptar archivo: " + e.getMessage());
        }
    }

    @GetMapping("/ping")
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("Cifrado listo (modo archivos)");
    }
}
