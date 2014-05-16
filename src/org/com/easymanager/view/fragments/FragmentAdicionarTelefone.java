package org.com.easymanager.view.fragments;

import java.util.ArrayList;

import org.com.easymanager.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class FragmentAdicionarTelefone extends Fragment {

	
	@Override
	public View onCreateView(LayoutInflater inflater,
							ViewGroup container,
							Bundle savedInstanceState){
		View view = inflater.inflate(R.layout.fragment_add_telefone,container,false);
		
		Spinner listaOperadoras = (Spinner)view.findViewById(R.id.spOperadora);
		
		ArrayList<String>operadoras = new ArrayList<String>();
		
		operadoras.add("Vivo");
		operadoras.add("TIM");
		operadoras.add("Claro");
		operadoras.add("OI");
		
		ArrayAdapter<String>adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,operadoras);
		
		Button botao = (Button)view.findViewById(R.id.btSalvar);
		
		botao.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				getActivity().finish();
			}
		});
		listaOperadoras.setAdapter(adapter);
		
		return view;
	} 
	
}
