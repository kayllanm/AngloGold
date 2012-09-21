package com.anglogold;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;
 
public class HomeActivity extends Activity {
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int display_mode = getResources().getConfiguration().orientation;
        
        if(display_mode == 1){
        	setContentView(R.layout.home);
        }else{
        	setContentView(R.layout.home_lan);
        }
    }
    
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
            setContentView(R.layout.home_lan);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
            setContentView(R.layout.home);
        }
    }
}
