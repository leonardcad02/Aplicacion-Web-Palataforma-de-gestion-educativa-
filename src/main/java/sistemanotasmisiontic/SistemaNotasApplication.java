package sistemanotasmisiontic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SistemaNotasApplication {

	public static void main(String[] args) {
		System.out.println("Funcionando");
		SpringApplication.run(SistemaNotasApplication.class, args);
	}

	// Generar la clave para utilizarla en todas las clases

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder () {
		return new BCryptPasswordEncoder();
	}

}
