package com.anglogold;

import java.io.File;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;

  
public class HistoryActivity extends ListActivity {
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);

		File direct = new File(Environment.getExternalStorageDirectory()
				+ "/AgaHistory");
		// File[] list = direct.listFiles();
		String[] files = direct.list();
		if (direct.exists()) {
				Log.i("New Dir", "Folder exists!");
				ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
						android.R.layout.simple_list_item_1, files);
				setListAdapter(adapter);
				getListView().setOnItemClickListener(new OnItemClickListener() {

					public void onItemClick(AdapterView<?> arg0, View view,
							int position, long arg3) {
						String item = (String) getListAdapter().getItem(
								position);
						Log.i("List", item);
						// Launching new Activity on selecting single List Item
						Intent i = new Intent(getApplicationContext(),
								XMLContentView.class);
						// sending data to new activity
						i.putExtra("List", item);
						startActivity(i);

					}

				});
		}else{
			if(direct.mkdir()){
				System.out.println("Directory created!");
			}
		}
	}
}