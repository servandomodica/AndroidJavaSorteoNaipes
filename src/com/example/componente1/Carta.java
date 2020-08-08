package com.example.componente1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

//Nueva clase, que hereda de android.view.View
//La carta la buscaré luego en Custom & Library Views (en la mail xml)

public class Carta extends View { //implemento el 2do constructor (tiene 2 parámetros)
	private String palo="Oro"; //oro,basto,copa,espada
	private int numero=1;
	
	public Carta(Context context, AttributeSet attrs) {
		super(context, attrs);

	}


	protected void onDraw(Canvas canvas) { //Para crearlo voy a Source, Override, onDraw
		super.onDraw(canvas);
		
		canvas.drawRGB(255, 255, 0); //amarillo
		
		Paint pincel1=new Paint();
		pincel1.setARGB(255, 255, 0, 0);		
		canvas.drawText(numero+" - "+palo, 10, 40, pincel1);
	}

	
	public void cambiar () {
		numero=1+(int)(Math.random()*12);
		int nro=1+(int)(Math.random()*4);
		
		switch(nro) {
		case 1:palo="Oro";
		break;
		case 2:palo="Basto";
		break;
		case 3:palo="Copa";
		break;
		case 4:palo="Espada";
		break;
		}
		
		invalidate(); //hace refresh visual, como un repaint
	}
	
}
