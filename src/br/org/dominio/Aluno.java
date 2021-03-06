package br.org.dominio;

import javax.inject.Named;

import br.org.interf.Membro;
@Named
public class Aluno implements Membro{
	private String nome;
	private String telefone;
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
	@Override
	public String mostraNome() {
		return "Aluno: "+this.nome;
	}
}
