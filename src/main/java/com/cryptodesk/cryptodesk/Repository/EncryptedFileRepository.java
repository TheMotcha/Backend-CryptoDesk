package com.cryptodesk.cryptodesk.Repository;

import com.cryptodesk.cryptodesk.Entity.EncryptedFile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EncryptedFileRepository extends JpaRepository<EncryptedFile, Long> {
    List<EncryptedFile> findByUserId(Long userId);
}
