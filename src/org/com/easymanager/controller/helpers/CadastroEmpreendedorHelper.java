package org.com.easymanager.controller.helpers;


import org.com.easymanager.R;
import org.com.easymanager.generics.helpers.CadastroPessoaHelper;
import org.com.easymanager.interfaces.Recordable;
import org.com.easymanager.model.bean.PessoaBanca;

import android.app.Activity;
import android.widget.EditText;
import android.widget.Spinner;

public class CadastroEmpreendedorHelper extends CadastroPessoaHelper{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6522943357463370641L;

	private EditText numeroImplurb;	
	private Spinner atividadeBanca;
	private Spinner numeroBanca;
	
	public CadastroEmpreendedorHelper(Activity context){
		super(context);
		numeroImplurb = (EditText)context.findViewById(R.id.edNumeroImplurb);
		atividadeBanca = (Spinner)context.findViewById(R.id.spTipoAtividade);
		numeroBanca = (Spinner)context.findViewById(R.id.spNumeroBanca);
	}
	public void showRecordableData(){
		super.showRecordableData(getRecordable());
	}

	@Override
	public Recordable getRecordable() {
		return super.createRecordable();
	}

	@Override
	public void setRecordable(Recordable recordable) {
	//	this.pessoa = (PessoaBanca) this.createRecordable();
	}

	@Override
	public void showRecordableData(Recordable recordable) {	
//		nome.setText(this.pessoa.getNome());
		
	}
}
