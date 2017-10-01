package com.example.kerbe.tacksa;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AdminActivity extends AppCompatActivity {
    Spinner fromm_sp, too_sp;
    Button save_b, add_to_list;
    EditText add_et, price_et;
    String[] fromm = {};

    final String SAVED_TEXT = "saved_text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        fromm_sp = (Spinner) findViewById(R.id.fromm_sp);
        too_sp = (Spinner) findViewById(R.id.too_sp);
        save_b = (Button) findViewById(R.id.save_b);
        add_to_list = (Button) findViewById(R.id.add_to_list);
        add_et = (EditText) findViewById(R.id.add_et);
        price_et = (EditText) findViewById(R.id.price_et);
        Intent in = getIntent();
        fromm = in.getStringArrayExtra("from");
        String[] too = in.getStringArrayExtra("to");

        ArrayAdapter<String> from_adapter = new ArrayAdapter<String>(this, R.layout.spinner_item, fromm);
        from_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fromm_sp.setAdapter(from_adapter);
        fromm_sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Position = " + position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter<String> to_adapter = new ArrayAdapter<String>(this, R.layout.spinner_item, too);
        to_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        too_sp.setAdapter(to_adapter);
        too_sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Position = " + position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
       /* add_to_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sPref = getPreferences(MODE_PRIVATE);
                SharedPreferences.Editor ed = sPref.edit();
                Set<String> myset = new HashSet<String>(Arrays.asList(fromm));
                myset.add(add_et.getText().toString());
                ed.putStringSet(SAVED_TEXT, myset);
                ed.commit();
                Toast.makeText(getBaseContext(), "Text saved", Toast.LENGTH_SHORT).show();


                sPref = getPreferences(MODE_PRIVATE);
                Set<String> myyset = sPref.getStringSet(SAVED_TEXT,null);
                fromm = myyset.toArray(new String[myyset.size()]);
                Toast.makeText(getBaseContext(), "Text loaded", Toast.LENGTH_SHORT).show();
            }
        });*/
    }
}
