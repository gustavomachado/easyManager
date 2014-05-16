package org.com.easymanager.generics.model.bean;

import java.util.List;

import org.com.easymanager.interfaces.Recordable;
import org.com.easymanager.model.bean.contato.Endereco;
import org.com.easymanager.model.bean.contato.Telefone;

public abstract class Pessoa implements Recordable {

	private Long id;
	private String nome;
	private String rg;
	private String cpf;
	private List<Endereco>enderecos;
	private List<Telefone>telefones;
	
	
	
	public Pessoa(Long id, String nome, String rg, String cpf,
			List<Endereco> enderecos, List<Telefone> telefones) {
		super();
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.enderecos = enderecos;
		this.telefones = telefones;
	}
	@Override
	public Long getId() {
		return  this.id;
	}
	@Override
	public void setId(Long id){
		this.id = id;
	}
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public List<Endereco> getEnderecos() {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Telefone> getTelefone() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getRG() {
		// TODO Auto-generated method stub
		return null;
	}

}
