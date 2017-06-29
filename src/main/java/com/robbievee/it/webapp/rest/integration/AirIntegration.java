package com.robbievee.it.webapp.rest.integration;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.robbievee.it.webapp.model.BusStop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirIntegration {

  private AirIntegration() {
  }

  public static List<BusStop> getAirStops() throws IOException {
    Document doc =
        Jsoup.connect("http://ro.autobus.it/ro/asp/ricercaorari.asp?user=air").get();
    String stopsContainerElementId = "LocDest";
    Element timetables = doc.getElementById(stopsContainerElementId);

    Elements optionList = timetables.select("option");
    List<String> valuesList = optionList.eachAttr("value");
    List<BusStop> stopList = new ArrayList<>();
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
