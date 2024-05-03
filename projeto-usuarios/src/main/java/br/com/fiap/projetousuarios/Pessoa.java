package br.com.fiap.projetousuarios;

import java.util.Date;

import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pessoa")
public class Pessoa  extends RepresentationModel<Pessoa> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_pessoa;
	private String nome;
	private Date data_nascimento;
	private String cpf;
	private Long telefone;

	public Pessoa() {

	}

	public Pessoa(Long id_pessoa, String nome, Date data_nascimento, String cpf, Long telefone) {
		super();
		this.id_pessoa = id_pessoa;
		this.nome = nome;
		this.data_nascimento = data_nascimento;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public Long getId_pessoa() {
		return id_pessoa;
	}

	public void setId_pessoa(Long id_pessoa) {
		this.id_pessoa = id_pessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

}
