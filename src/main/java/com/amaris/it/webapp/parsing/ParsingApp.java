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
	
	public static void main(String[] args) throws IOException{
		 Document doc = Jsoup.connect("http://ro.autobus.it/ro/asp/ricercaorari.asp?user=air").get();  
         String stopsContainerElementId = "LocDest";
		 Element timetables = doc.getElementById(stopsContainerElementId);
         
		 Elements optionList = timetables.select("option");
		 List<String> valuesList = optionList.eachAttr("value");
		 List<Stop> stopList = new ArrayList<Stop>();
		 for (String value : valuesList) {
		   Stop stop = new Stop();
		   String[] parts = value.split("|");
		   stop.setCodeStop(parts[0]);
		   stop.setName(parts[1]);
		   stop.setTerminalCode(parts[2]);
		   stopList.add(stop);
		}
		 for (Stop stop : stopList) {
      System.out.println(stop.getCodeStop() + " " + stop.getName() + " " + stop.getTerminalCode());
    }
	}

}
