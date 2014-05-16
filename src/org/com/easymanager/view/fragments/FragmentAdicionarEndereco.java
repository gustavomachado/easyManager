package org.com.easymanager.view.fragments;

import org.com.easymanager.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentAdicionarEndereco extends Fragment{
	@Override
	public View onCreateView(LayoutInflater inflater,
							ViewGroup container,
							Bundle savedInstanceState){
		View view = inflater.inflate(R.layout.fragment_add_endereco,container,false);
	return view;
	}

}
