package org.com.easymanager.view.activities;

import org.com.easymanager.R;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

public class AdicionaAuxiliarActivity extends FragmentActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro_auxiliar);	
		
	/*	ListView listaAuxiliares = (ListView)findViewById(R.id.lvAuxiliares);
		List<PessoaBanca>pessoas = new ArrayList<PessoaBanca>();
		pessoas.add(new PessoaBanca(1l, "Diego", "3132312", "45645645654", null, null, null, false, 1));
		pessoas.add(new PessoaBanca(1l, "Gustavo", "3132312", "45645645654", null, null, null, false, 3));
		pessoas.add(new PessoaBanca(1l, "Mailson", "3132312", "45645645654", null, null, null, false, 6));
		pessoas.add(new PessoaBanca(1l, "Jaidson", "3132312", "45645645654", null, null, null, false, 5));
		
		ListaPessoasCustomizada adapter = new ListaPessoasCustomizada(this, pessoas);
		
		listaAuxiliares.setAdapter(adapter);
		*/
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cadastro_auxiliar, menu);
		return true;
	}
}
