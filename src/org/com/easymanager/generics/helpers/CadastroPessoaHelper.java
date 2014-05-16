package org.com.easymanager.generics.helpers;

import java.io.Serializable;

import org.com.easymanager.R;
import org.com.easymanager.controller.helpers.AdicionarEnderecoHelper;
import org.com.easymanager.controller.helpers.AdicionarTelefoneHelper;
import org.com.easymanager.interfaces.Recordable;
import org.com.easymanager.interfaces.RecordableHelper;
import org.com.easymanager.model.bean.PessoaBanca;

import android.app.Activity;
import android.widget.EditText;
import android.widget.ImageView;

public abstract class CadastroPessoaHelper extends GenericHelper {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8338621737816526364L;
	
	private EditText nome;
	private EditText rg;
	private EditText cpf;
	private ImageView foto;
	
	private PessoaBanca pessoa;
	private AdicionarEnderecoHelper enderecoHelper;
	private AdicionarTelefoneHelper telefoneHelper;
	
	public CadastroPessoaHelper(Activity context){
		enderecoHelper = new AdicionarEnderecoHelper(context);
		telefoneHelper = new AdicionarTelefoneHelper(context);
		nome = (EditText)context.findViewById(R.id.edNomePessoa);
		rg = (EditText)context.findViewById(R.id.edRgPessoa);
		cpf = (EditText)context.findViewById(R.id.edCPFPessoa);
		foto = (ImageView)context.findViewById(R.id.ivFotoPessoa);
		
		pessoa = (PessoaBanca) createRecordable();
	}

	@Override
	public Recordable createRecordable() {
		return	new PessoaBanca(null,
				nome.getText().toString(),
				rg.getText().toString(),
				cpf.getText().toString(),
				null,
				null, 
				foto.toString(),
				false,
				0);
	}

	@Override
	public Recordable getRecordable() {
		return this.pessoa;
	}
	@Override
	public void setRecordable(Recordable recordable) {
		this.pessoa = (PessoaBanca) recordable;
	}
	@Override
	public void showRecordableData(Recordable recordable) {	
		PessoaBanca p = (PessoaBanca)recordable;
		nome.setText(p.getNome());	
	}
}
