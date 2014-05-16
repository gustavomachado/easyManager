package org.com.easymanager.model.bean;

import java.util.List;

import org.com.easymanager.model.bean.contato.Endereco;
import org.com.easymanager.model.bean.contato.Telefone;

public class Empreendedor extends PessoaBanca {

	
	private Integer numeroImplurb;
	
	public Empreendedor(Long id, String nome, String rg, String cpf,
			List<Endereco> enderecos, List<Telefone> telefones, String foto,
			Integer numeroBanca) {
		super(id, nome, rg, cpf, enderecos, telefones, foto, true, numeroBanca);
		// TODO Auto-generated constructor stub
	}

}
