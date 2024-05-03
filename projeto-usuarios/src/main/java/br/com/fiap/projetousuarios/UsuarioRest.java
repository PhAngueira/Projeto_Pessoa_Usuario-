package br.com.fiap.projetousuarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/index")
public class UsuarioRest {

	@Autowired
	private UsuarioRepository rep;
	
	@GetMapping(value ="/todos")
	public List<Usuario> RetornaTodosUsuarios(){
		return rep.findAll();
	}
	
	@PostMapping
	public Usuario inserirUsuario(@RequestBody Usuario user) {
		rep.save(user);
		return user;
	}
}
