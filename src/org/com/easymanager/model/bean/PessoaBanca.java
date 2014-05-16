package org.com.easymanager.model.bean;

import java.util.List;

import org.com.easymanager.generics.model.bean.Pessoa;
import org.com.easymanager.model.bean.contato.Endereco;
import org.com.easymanager.model.bean.contato.Telefone;



public class PessoaBanca  extends Pessoa{

	private String foto;
	private Boolean admin;
	private Integer numeroBanca;
	
	public PessoaBanca(Long id, String nome, String rg, String cpf,
		List<Endereco> enderecos, List<Telefone> telefones, String foto, Boolean admin, Integer numeroBanca) {
		super(id, nome, rg, cpf, enderecos, telefones);
		this.foto = foto;
		this.admin = admin;
		this.numeroBanca = numeroBanca;
	}
	public String getFoto() {
		return this.foto;
	}
	public void setFoto(String foto){
		this.foto = foto;
	}
	public Boolean isAdmin() {
		return admin;
	}
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
	public Integer getNumeroBanca() {
		return numeroBanca;
	}
	public void setNumeroBanca(Integer numeroBanca) {
		this.numeroBanca = numeroBanca;
	}
	
}
