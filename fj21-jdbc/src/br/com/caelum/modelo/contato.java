package br.com.caelum.modelo;

import java.util.Calendar;

public class contato {

	private Long id;
	private String nome;
	private String email;
	private String endereco;
	private Calendar dataNascimento;
	
	
	
	
	public String getEmail() {
		return email;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public Calendar getDataNascimento1(){
		return this.dataNascimento;
	}
	
	public void setDataNascimento(Calendar dataNascimento){
		this.dataNascimento = dataNascimento;
	}
	
}
