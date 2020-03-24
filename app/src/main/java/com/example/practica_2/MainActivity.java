package com.example.practica_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class MainActivity extends Activity {
    CheckBox pizza, cafe, hamb;
    Button btnOrdenar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }

    private void addListenerOnButtonClick() {
        pizza = (CheckBox)findViewById(R.id.checkBox1);
        cafe = (CheckBox)findViewById(R.id.checkBox2);
        hamb = (CheckBox)findViewById(R.id.checkBox3);
        btnOrdenar=(Button)findViewById(R.id.button1);

        btnOrdenar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int total=0;
                StringBuilder result = new StringBuilder();
                result.append("Productos seleccionados: ");
                if(pizza.isChecked()){
                    result.append("\nPizza $50");
                    total+=50;
                }
                if(cafe.isChecked()){
                    result.append("\nCafé $25");
                    total+=25;
                }
                if(hamb.isChecked()){
                    result.append("\nHamburguesa $45");
                    total+=45;
                }
                result.append("\nTotal: "+total+" pesos");
                Toast.makeText(getApplicationContext(),result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
