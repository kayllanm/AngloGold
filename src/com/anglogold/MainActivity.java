package com.anglogold;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
 
public class MainActivity extends TabActivity {
 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
 
		TabHost tabHost = getTabHost(); 
 
		// Home tab
		Intent intentHome = new Intent().setClass(this, HomeActivity.class);
		TabSpec tabSpecHome = tabHost
		  .newTabSpec("Home")
		  .setIndicator("Home", getResources().getDrawable(R.drawable.btn_home_35_35))
		  .setContent(intentHome);
 
		// Xml tab
		Intent intentXml = new Intent().setClass(this, XmlActivity.class);
		TabSpec tabSpecXml = tabHost
		  .newTabSpec("Forms")
		  .setIndicator("Forms", getResources().getDrawable(R.drawable.btn_folder_35_35))
		  .setContent(intentXml);
 
		// Save tab
		Intent intentSave = new Intent().setClass(this, HistoryActivity.class);
		TabSpec tabSpecSave = tabHost
		  .newTabSpec("History")
		  .setIndicator("History", getResources().getDrawable(R.drawable.btn_history__35_35))
		  .setContent(intentSave);
 
		// add all tabs 
		tabHost.addTab(tabSpecHome);
		tabHost.addTab(tabSpecXml);
		tabHost.addTab(tabSpecSave);
 
	}
 
}
