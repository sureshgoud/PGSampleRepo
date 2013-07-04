package com.example.sample;

import org.apache.cordova.DroidGap;

import android.content.res.Configuration;
import android.os.Bundle;
 
import android.view.Menu;

public class MainActivity extends   DroidGap{//Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		if (checkScreenSize().equals("large") || checkScreenSize().equals("xlarge")) {
			super.onCreate(savedInstanceState);
			super.init();
			super.loadUrl("file:///android_asset/www/index.html");
		} else {
			super.onCreate(savedInstanceState);
			super.init();
			super.loadUrl("file:///android_asset/www/index.html");
		}
	}
	
	private String checkScreenSize() {
		String screenSize;
		if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_XLARGE) {
			screenSize = "xlarge";
		} else if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_LARGE) {
			screenSize = "large";
		} else if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_NORMAL) {
			screenSize = "normal";
		} else if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_SMALL) {
			screenSize = "small";
		} else {
			screenSize = "normal";
		}
		return screenSize;
	}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
