package br.com.fiap.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String senha = "Senha";
	private String email = "Email";
	private String nome = "Nome";
	private LocalDate dataNascimento = LocalDate.of(02, 05, 23);

	@Override
	public String toString() {
		return "Usuario [nome =" + nome +",Data de nascimento =" + dataNascimento +",  + e-mail= " + email+ ",senha =" + senha + "  ]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	


}
