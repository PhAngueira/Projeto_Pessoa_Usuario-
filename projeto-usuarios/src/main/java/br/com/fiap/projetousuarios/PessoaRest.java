package br.com.fiap.projetousuarios;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/index_pessoa")
public class PessoaRest {

	@Autowired
	private PessoaRepository rep;

	@GetMapping(value = "/todas")
	public List<Pessoa> retornaTodas() {

		List<Pessoa> lista = rep.findAll();

		for (Pessoa i : lista) {
			i.add(linkTo(methodOn(PessoaRest.class).findById(i.getId_pessoa()))
					.withRel("Quer consulta a pessoa por ID? Acesse este link: "));
		}

		return lista;
	}

	@GetMapping(value = "/{id}")
	public Pessoa findById(@PathVariable Long id) {
		return rep.findById(id).get();
	}
}
