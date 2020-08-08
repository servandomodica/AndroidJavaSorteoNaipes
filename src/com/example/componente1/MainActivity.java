package com.example.componente1;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;

public class MainActivity extends Activity {
	Carta carta1,carta2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carta1=(Carta)findViewById(R.id.carta1);
        carta2=(Carta)findViewById(R.id.carta2);
    }

    
    public void cambiar (View v) {
    	carta1.cambiar();
    	carta2.cambiar();
    }
    
}
