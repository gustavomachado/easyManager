package org.com.easymanager.view.custumers.adapters;

import java.util.List;

import org.com.easymanager.R;
import org.com.easymanager.model.bean.PessoaBanca;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListaPessoasCustomizada extends BaseAdapter{
	
	private final Activity activity;
	private final List<PessoaBanca>listaPessoas;
	
	

	public ListaPessoasCustomizada(Activity activity, List<PessoaBanca> listaPessoas) {
		super();
		this.activity = activity;
		this.listaPessoas = listaPessoas;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return listaPessoas.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return listaPessoas.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return listaPessoas.get(position).getId();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = activity.getLayoutInflater().inflate(R.layout.layout_lista_pessoa, null);
		
		TextView nome = (TextView)view.findViewById(R.id.tvNomePessoa);
		TextView funcao = (TextView)view.findViewById(R.id.tvFuncaoPessoa);
		TextView numeroBanca = (TextView)view.findViewById(R.id.tvNumBanca);
		TextView telefone = (TextView)view.findViewById(R.id.tvTelefone);
		
		PessoaBanca pessoa = listaPessoas.get(position);
		
		nome.setText("Nome : "+pessoa.getNome());
		
		if(pessoa.isAdmin()){
			funcao.setText("Função : Empreendedor");
		}else{
			funcao.setText("Função : Auxiliar");
		}
		if(pessoa.getNumeroBanca() != null){
			numeroBanca.setText("Nº Banca : "+pessoa.getNumeroBanca());
		}else{
			numeroBanca.setText("Nº Banca : SEM BANCA");
		}
		if(pessoa.getTelefone() != null){
			telefone.setText("Tel : "+pessoa.getTelefone().get(0));
		}else{
			telefone.setText("Tel : SEM TELEFONE");
		}
		ImageView foto = (ImageView)view.findViewById(R.id.imFotoLista);
		Bitmap bmp;
		if(pessoa.getFoto() != null){
			bmp = BitmapFactory.decodeFile(pessoa.getFoto());
		}else{
			bmp = BitmapFactory.decodeResource(activity.getResources(), 
												R.drawable.ic_no_image);
		}
		foto.setImageBitmap(bmp);
		return view;
	}

}
