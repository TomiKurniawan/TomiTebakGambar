package com.jakatomi.tebakgambar;

import android.support.v7.app.ActionBarActivity;
import android.text.InputFilter;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LaptopActivity extends ActionBarActivity {
	//deklarasi variabel
			EditText jawabanText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_laptop);
		//cari komponen edit text
				jawabanText=(EditText)findViewById(R.id.editText1);
				
			//setting input huruf besar
				jawabanText.setFilters(new InputFilter[] {new InputFilter.AllCaps()});
		}
			public void cekJawaban(View v){
			String jawabanBenar = "TOPI";
			String jawabanUser = jawabanText.getText().toString();
			if (jawabanUser.equals(jawabanBenar)){
				Toast.makeText(getApplicationContext(),
						"BENAR", Toast.LENGTH_LONG).show();
				Intent i = new Intent (getApplicationContext(), NasiActivity.class);
				startActivity(i);
				
			}
			else{
				// pesan Toast
				Toast.makeText(getApplicationContext(), 
						"SALAH!", Toast.LENGTH_LONG).show();
			}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.laptop, menu);
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
}
