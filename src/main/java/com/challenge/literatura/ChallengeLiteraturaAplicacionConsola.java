package com.challenge.literatura;
import com.challenge.literatura.Libreria.Libreria;
import com.challenge.literatura.repository.repositorioAutor;
import com.challenge.literatura.repository.repositorioLibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeLiteraturaAplicacionConsola implements CommandLineRunner {

	@Autowired
	private repositorioLibro libroRepository;
	@Autowired
	private repositorioAutor autorRepository;

	public static void main(String[] args) {
		SpringApplication.run(ChallengeLiteraturaAplicacionConsola.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Libreria libreria = new Libreria(libroRepository, autorRepository);
		libreria.consumo();

	}
}
