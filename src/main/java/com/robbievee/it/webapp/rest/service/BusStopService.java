package com.robbievee.it.webapp.rest.service;

import java.io.IOException;
import java.util.List;

import com.robbievee.it.webapp.model.BusStop;

public interface BusStopService {

	public List<BusStop> getBusStopList() throws IOException;
}
