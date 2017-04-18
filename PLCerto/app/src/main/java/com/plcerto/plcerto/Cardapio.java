package com.plcerto.plcerto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Cardapio extends AppCompatActivity {

    private Spinner spn1;
    private List<String> restaurantes = new ArrayList<String>();

    private Spinner spn2;
    private List<String> datas = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio);

        restaurantes.add("Pança");
        restaurantes.add("Repolho");
        restaurantes.add("Gula");
        restaurantes.add("Xarope");
        restaurantes.add("Pança que me balança");

        datas.add("12/04/2017");
        datas.add("13/04/2017");
        datas.add("14/04/2017");
        datas.add("15/04/2017");
        datas.add("16/04/2017");

        String[] itens = { "Arroz", "Feijão", "xuxu", "Macaco" };


        //Identifica o Spinner no layout
        spn1 = (Spinner) findViewById(R.id.spinRestaurante);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, restaurantes);
        ArrayAdapter<String> spinnerArrayAdapter = arrayAdapter;
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spn1.setAdapter(spinnerArrayAdapter);

        //Identifica o Spinner no layout
        spn2 = (Spinner) findViewById(R.id.spinData);

        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, datas);
        ArrayAdapter<String> spinnerArrayAdapter2 = arrayAdapter2;
        spinnerArrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spn2.setAdapter(spinnerArrayAdapter2);

        ListView list = (ListView) findViewById(R.id.listReceitas);
        list.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, itens));


    }
}
