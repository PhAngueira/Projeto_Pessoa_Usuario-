package br.com.fiap.projetousuarios;

import java.io.Serializable;

import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	@EmbeddedId
	private UsuarioChaveComposta usuario_chave_composta;
	private String senha;
	@OneToOne
	@JoinColumn(name = "id_pessoa")
	private Pessoa pessoa;
	private String email;

	public Usuario() {

	}

	public Usuario(UsuarioChaveComposta usuario_chave_composta, String senha, Pessoa pessoa, String email) {
		super();
		this.usuario_chave_composta = usuario_chave_composta;
		this.senha = senha;
		this.pessoa = pessoa;
		this.email = email;
	}

	public UsuarioChaveComposta getUsuario_chave_composta() {
		return usuario_chave_composta;
	}

	public void setUsuario_chave_composta(UsuarioChaveComposta usuario_chave_composta) {
		this.usuario_chave_composta = usuario_chave_composta;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
