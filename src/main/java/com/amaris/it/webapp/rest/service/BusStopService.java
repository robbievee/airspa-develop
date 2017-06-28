package com.amaris.it.webapp.rest.service;

import java.io.IOException;
import java.util.List;

import com.amaris.it.webapp.model.BusStop;

public interface BusStopService {

	public List<BusStop> getBusStopList() throws IOException;
}
