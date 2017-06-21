package com.amaris.it.webapp.parsing;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParsingApp {
	
	private List<String> stopCode;
	private List<String> stopName;
	private List<String> terminalCode;
 	
	public static void main(String[] args) throws IOException{
		 Document doc = Jsoup.connect("http://ro.autobus.it/ro/asp/ricercaorari.asp?user=air").get();  
         String stopsContainerElementId = "LocDest";
		 Element timetables = doc.getElementById(stopsContainerElementId);
         
		 Elements optionList = timetables.select("option");
		 List<String> valuesList = optionList.eachAttr("value");
		 for (String value : valuesList) {
			for(int i=0; i <= valuesList.size(); i++){
			 String[] output = value.split("|");
			 System.out.println(output[i]);
			 }
		}
	}

}