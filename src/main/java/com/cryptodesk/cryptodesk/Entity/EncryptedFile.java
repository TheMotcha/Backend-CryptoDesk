package com.cryptodesk.cryptodesk.Model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "encrypted_files")
public class EncryptedFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // puedes usar UUID si prefieres
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private String filename;

    private Long fileSize;

    private String fileType;

    @Lob
    @Column(nullable = false)
    private byte[] data; // Archivo cifrado

    private LocalDateTime createdAt = LocalDateTime.now();
}
