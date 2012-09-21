package com.anglogold;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.DroidGap;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
 
public class HtmlActivity extends DroidGap {
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);
        super.loadUrl("file:///android_asset/www/index.html");
         
   /*     String header = "<html><head><title>AngloGold</title></head>"; 
        String body ="<body><div data-role='page'>";
        String mime = "text/html"; 
        String encoding = "utf-8"; 
         
        
        WebSettings webSettings = wv1.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv1.loadDataWithBaseURL(null, header, mime, encoding, null); 
        wv1.loadDataWithBaseURL(null, body, mime, encoding, null);
        wv1.loadUrl("file:///android_asset/www/index.html");
        Bundle recdData = getIntent().getExtras(); 
        myVal = recdData.getString("List"); 
        
        try { 				     
            File file = new File(Environment.getExternalStorageDirectory()+ "/Xml folder/"+myVal);
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance(); 
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder(); 
            Document doc = docBuilder.parse(file); 
            
            NodeList node = doc.getElementsByTagName("ChecklistGroupName");
            
 
            Element grpName1 = (Element) node.item(0);
            Log.i("group", grpName1.getTextContent());
            NodeList aName = doc.getElementsByTagName("AlternativeName");
            Element label1 = (Element) aName.item(0);
            
            Element grpName2 = (Element) node.item(1);
            Log.i("group", grpName2.getTextContent());
            NodeList aName2 = doc.getElementsByTagName("AlternativeName");
            Element label2 = (Element) aName2.item(1);
            Log.i("group", label2.getTextContent());
            NodeList cvString = doc.getElementsByTagName("cvString");
            
            Element grpName3 = (Element) node.item(2);
            Log.i("group", grpName3.getTextContent());
            NodeList aName3 = doc.getElementsByTagName("AlternativeName");
            Element label3 = (Element) aName3.item(2);
            
            
            if(node != null){
            	for(int i=0; i<10; i++){
            		Element e = (Element) cvString.item(i);
            		String option = "<option>"+e.getTextContent()+"</option>";
            		Log.i("Info", option);
            /*		   wv1.loadData("<html><head><title>AngloGold</title></head><body><table border='1'><tr><th bgcolor='#FF956C'>"+grpName1.getTextContent()+
            		    "</th></tr><tr><td>"+label1.getTextContent()+
            		    "<input type='radio' name='rad' value='yes' /> Yes <input type='radio' name='rad' value='no' /> No </td></tr></table><br /><br /><table border='1'><tr><th bgcolor='#FF956C'>"+grpName2.getTextContent()+
            		   "</th></tr><tr><td>"+label2.getTextContent()+
            		   " <select>"+option+"</select>"+
            		   "</td></tr></table><br /><br /><table border='1'><tr><th bgcolor='#FF956C'>"+grpName3.getTextContent()+
            			 "</th></tr><tr><td>"+label3.getTextContent()+
            			 "<input type='radio' name='hide' value='yes' /> Yes<input type='radio' name='hide' value='no' /> No </td></tr></table><br />"+
            			 "<input type='submit' name='submit' value='Submit' /></body></html>", mime, encoding); 
            		
            	}
            }
         
     /*       TransformerFactory factory = TransformerFactory.newInstance(); 
            Transformer transformer = factory.newTransformer(); 
         
            // initialize StreamResult with File object to save to file 
            StreamResult result = new StreamResult(file); 
            DOMSource source = new DOMSource(doc); 
            transformer.transform(source, result); 
            Log.i("Node", "Node value has been changed!");
        } catch (Exception e) { 
            e.printStackTrace(); 
            Log.e("Node", "Failed to edit node!");
        }*/
    }   
}