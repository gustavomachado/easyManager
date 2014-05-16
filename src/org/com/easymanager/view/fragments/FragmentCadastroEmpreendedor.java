package org.com.easymanager.view.fragments;

import java.io.File;

import org.com.easymanager.R;
import org.com.easymanager.controller.helpers.CadastroEmpreendedorHelper;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FragmentCadastroEmpreendedor extends Fragment {

	private CadastroEmpreendedorHelper helper;
	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
		
		View view = inflater.inflate(R.layout.fragment_cadastro_empreendedor,container,false);
		
		helper = new CadastroEmpreendedorHelper(getActivity());
		
		
	return view;
	}
}
