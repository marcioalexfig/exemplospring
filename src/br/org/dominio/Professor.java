package br.org.dominio;

import javax.inject.Named;

import br.org.interf.Membro;

@Named
public class Professor implements Membro{
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	private String telefone;
	@Override
	public String mostraNome() {
		// TODO Auto-generated method stub
		return "Professor: "+this.nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
