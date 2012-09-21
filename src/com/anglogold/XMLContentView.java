package com.anglogold;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import android.app.Activity;

import android.os.Bundle;
import android.os.Environment;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class XMLContentView extends Activity{ 
    @Override
    public void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.single_list_item_view);
        
        TextView myXmlContent = (TextView)findViewById(R.id.my_xml);
        String stringXmlContent;
        
        Bundle extras = getIntent().getExtras();
      
            String value = extras.getString("List");
        

        File file = new File(Environment.getExternalStorageDirectory()
                + "/AgaHistory/" + value );
            
        stringXmlContent = getContents(file);
        myXmlContent.setMovementMethod(new ScrollingMovementMethod());

        myXmlContent.setText(stringXmlContent);
    }

    /**
     * Fetch the entire contents of a text file, and return it in a String.
     * This style of implementation does not throw Exceptions to the caller.
     *
     * @param aFile is a file which already exists and can be read.
     * File file = new File(Environment.getExternalStorageDirectory() + "file path");
     */
     static public String getContents(File aFile) {
       //...checks on aFile are elided
       StringBuilder contents = new StringBuilder();

       try {
         //use buffering, reading one line at a time
         //FileReader always assumes default encoding is OK!
         BufferedReader input =  new BufferedReader(new FileReader(aFile));
         try {
           String line = null; //not declared within while loop
           /*
           * readLine is a bit quirky :
           * it returns the content of a line MINUS the newline.
           * it returns null only for the END of the stream.
           * it returns an empty String if two newlines appear in a row.
           */
           while (( line = input.readLine()) != null){
             contents.append("\n" + line);
           
           }
         }
         finally {
           input.close();
         }
       }
       catch (IOException ex){
         ex.printStackTrace();
       }

       return contents.toString();
     }
  }