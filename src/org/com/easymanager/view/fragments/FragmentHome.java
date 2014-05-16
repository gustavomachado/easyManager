package org.com.easymanager.view.fragments;

import org.com.easymanager.R;
import org.com.easymanager.view.activities.BuscaPessoaBancaActivity;
import org.com.easymanager.view.activities.CadastroEmpreendedorActivity;
import org.com.easymanager.view.activities.GeraOcorrenciaActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentHome extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
		View view = inflater.inflate(R.layout.fragment_home,container,false);
		
		((Button)view.findViewById(R.id.btCadastrar)).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(getActivity(), CadastroEmpreendedorActivity.class));
			}
		});
		((Button)view.findViewById(R.id.btBuscar)).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(getActivity(), BuscaPessoaBancaActivity.class));
			}
		});
		((Button)view.findViewById(R.id.btGerarOcorrencia)).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(getActivity(), GeraOcorrenciaActivity.class));
			}
		});
		return view;
	}
	private void changeSize(View view){
		Button cadastrar = (Button)view.findViewById(R.id.btCadastrar);
		cadastrar.setWidth(cadastrar.getWidth() - 10);
		cadastrar.setHeight(cadastrar.getHeight() -10);
	}
}
