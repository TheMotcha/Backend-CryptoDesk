package com.cryptodesk.cryptodesk.config;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;

@Configuration
public class FirebaseConfiguration {

    @PostConstruct
    public void init() throws IOException {
        // Evitar inicializar Firebase más de una vez
        if (FirebaseApp.getApps().isEmpty()) {
            // Cargar el archivo de credenciales desde resources
            InputStream serviceAccount = getClass().getClassLoader()
                    .getResourceAsStream("firebase/serviceAccountKey.json");

            if (serviceAccount == null) {
                throw new IOException("No se encontró el archivo serviceAccountKey.json en resources/firebase/");
            }

            // Configuración de Firebase
            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    // Si usas Realtime Database:
                    // .setDatabaseUrl("https://<tu-proyecto>.firebaseio.com")
                    // Si usas Firestore, basta con las credenciales
                    .build();

            FirebaseApp.initializeApp(options);
            System.out.println("✅ Conexión a Firebase inicializada correctamente");
        }
    }
}
