package com.robbievee.it.webapp.rest.service.implementation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import com.robbievee.it.webapp.model.BusStop;
import com.robbievee.it.webapp.rest.integration.AirIntegration;
import com.robbievee.it.webapp.rest.service.BusStopService;

@Service
public class BusStopServiceImpl implements BusStopService {

  private List<BusStop> busStops = new ArrayList<>();

  @Override
  public List<BusStop> getBusStopList() throws IOException {
    if (busStops == null || busStops.isEmpty()) {
      busStops = AirIntegration.getAirStops();
    }
    return busStops;
  }

}
