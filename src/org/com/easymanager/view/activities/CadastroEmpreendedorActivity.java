package org.com.easymanager.view.activities;

import org.com.easymanager.R;
import android.support.v4.app.FragmentActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class CadastroEmpreendedorActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro);	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cadastro_empreendedor, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		
		switch(item.getItemId()){
		case R.id.imAddTelefone:
			startActivity(new Intent(CadastroEmpreendedorActivity.this, AdicionaTelefonesActivity.class));
			break;
		case R.id.imAddAuxiliar:
			startActivity(new Intent(CadastroEmpreendedorActivity.this, AdicionaAuxiliarActivity.class));
			break;
		}
		return super.onOptionsItemSelected(item);
	}


}
