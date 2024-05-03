package br.com.fiap.projetousuarios;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@EnableJpaRepositories
@EntityScan
@Component
@SpringBootApplication
public class ProjetoUsuariosApplication implements CommandLineRunner{

	@Autowired
	private UsuarioRepository rep;
	public static void main(String[] args) {
		SpringApplication.run(ProjetoUsuariosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Projeto iniciado");
		
		List<UsuarioProjection> lista = rep.retornaSenha("usuario1@fiap.com.br");
		
		for(UsuarioProjection i : lista) {
			System.out.println("Senha: " + i.getSenha());
		}
	}

}
