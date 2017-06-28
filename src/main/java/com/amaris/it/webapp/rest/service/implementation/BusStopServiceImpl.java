package com.amaris.it.webapp.rest.service.implementation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import com.amaris.it.webapp.model.BusStop;
import com.amaris.it.webapp.rest.service.BusStopService;

@Service
public class BusStopServiceImpl implements BusStopService{

	@Override
	public List<BusStop> getBusStopList() throws IOException{
		  Document doc = Jsoup.connect("http://ro.autobus.it/ro/asp/ricercaorari.asp?user=air").get();  
	      String stopsContainerElementId = "LocDest";
			 Element timetables = doc.getElementById(stopsContainerElementId);
	      
			 Elements optionList = timetables.select("option");
			 List<String> valuesList = optionList.eachAttr("value");
			 List<BusStop> stopList = new ArrayList<BusStop>();
			 for (String value : valuesList) {
			   BusStop stop = new BusStop();
			   String[] parts = value.split("\\|");
			   stop.setCodeStop(parts[0]);
			   stop.setName(parts[1]);
			   stop.setTerminalCode(parts[2]);
			   stopList.add(stop);
			 }
		  return stopList;
	  }

}
