package org.com.easymanager.view.fragments;

import org.com.easymanager.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentGerarOcorrencia extends Fragment{

	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
		
		View view = inflater.inflate(R.layout.fragment_gerar_ocorrencia,container,false);		
		
	return view;
	}
}
