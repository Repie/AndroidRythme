package com.example.androidrythme;

import UI.Cercle;
import UI.CustomCircleView;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private Handler oHandler;
	Cercle cercleExt;
	private int rayonExt;
	private CustomCircleView custumcercle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Cercle cercle = new  Cercle(300,300,100);             
        custumcercle =(CustomCircleView)findViewById(R.id.Canvas01);       
        custumcercle.setCercleInt(cercle); 
        
        rayonExt=250;
        cercleExt = new Cercle(300,300,rayonExt);   
        cercleExt.setRayon(rayonExt);
        custumcercle.setCercleExt(cercleExt);
        
        oHandler = new Handler();
        oHandler.postDelayed(mUpdateTimeTask, 10);
      
    	Log.v("man", "end MAin");

    }

    private Runnable mUpdateTimeTask = new Runnable() {
    	  public void run() { 
    		  
    		if(rayonExt>100){
    			cercleExt.setRayon(rayonExt);
    			custumcercle.setCercleExt(cercleExt);
    			oHandler.postDelayed(this, 10);
    			rayonExt--;
    		}    	        	    
    	  }
    };
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    private Runnable _stop = new Runnable() {
		public void run() {
			System.exit(RESULT_OK);
		}
	};
    
}
