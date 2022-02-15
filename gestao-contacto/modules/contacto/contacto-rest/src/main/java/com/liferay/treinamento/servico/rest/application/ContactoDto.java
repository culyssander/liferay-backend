package com.liferay.treinamento.servico.rest.application;


import java.io.Serializable;

public class ContactoDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private long groupId;
	private String nome;
	private String telefone;
	private String email;
	private int idade;
	
	
	public long getGroupId() {
		return groupId;
	}
	
	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idada) {
		this.idade = idada;
	}
	
	
}