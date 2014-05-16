package org.com.easymanager.view.activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.com.easymanager.R;
import org.com.easymanager.model.bean.PessoaBanca;
import org.com.easymanager.view.custumers.adapters.ListaPessoasCustomizada;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.EditText;
import android.widget.ListView;

public class BuscaPessoaBancaActivity extends FragmentActivity {

	private List<PessoaBanca>nomes;
	private ListaPessoasCustomizada adapterPessoas ;
	private ListView listaResultado;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_busca_pessoa);
		nomes = new ArrayList<PessoaBanca>();
		
		nomes.add(new PessoaBanca(1l, "gustavo", null, null, null, null, null,true, 1));
		nomes.add(new PessoaBanca(2l, "Thiago", null, null, null, null, null,false, 2));
		nomes.add(new PessoaBanca(3l, "Carol", null, null, null, null, null,false, 1));
		nomes.add(new PessoaBanca(4l, "Isete", null, null, null, null, null,true, 2));
		nomes.add(new PessoaBanca(5l, "João", null, null, null, null, null,false, 5));
		nomes.add(new PessoaBanca(6l, "Gessy Camilly", null, null, null, null, null,false, 6));
		nomes.add(new PessoaBanca(7l, "Joyce", null, null, null, null, null,true, 7));
		nomes.add(new PessoaBanca(8l, "Diego", null, null, null, null, null,true, 8));
		nomes.add(new PessoaBanca(9l, "Marciano", null, null, null, null, null,false, 9));
		nomes.add(new PessoaBanca(10l, "Safira", null, null, null, null, null,true, 10));
		
		adapterPessoas = new ListaPessoasCustomizada(BuscaPessoaBancaActivity.this,nomes);
		EditText valorBusca = (EditText)findViewById(R.id.edValorParaBusca);
		listaResultado = (ListView)findViewById(R.id.lvResultado);
		listaResultado.setAdapter(adapterPessoas);
		registerForContextMenu(listaResultado);
		
		
		valorBusca.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				// TODO Auto-generated method stub
				List<PessoaBanca>resultado = getResult(nomes);
				
				adapterPessoas = new ListaPessoasCustomizada(BuscaPessoaBancaActivity.this,
													resultado);
				listaResultado.setAdapter(adapterPessoas);
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View view,
			ContextMenuInfo menuInfo) {
		super.onCreateContextMenu(menu, view, menuInfo);

		getMenuInflater().inflate(R.menu.menu_contexto_busca, menu);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.busca_empreendedor, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = null;
			return rootView;
		}
	}
	private List<PessoaBanca>getResult(List<PessoaBanca>listaCompleta){
		ArrayList<PessoaBanca>listaResultado = new ArrayList<PessoaBanca>();
		EditText edValorBusca = (EditText)findViewById(R.id.edValorParaBusca);
		String valorBusca = edValorBusca.getText().toString().toUpperCase();
		int i = listaCompleta.size()-1;
		for(; i > -1; i--){
			String aux = listaCompleta.get(i).getNome().toUpperCase();
			if(aux.contains(valorBusca)){
				listaResultado.add(listaCompleta.get(i));
			}
		}
		return listaResultado;
	}
}
