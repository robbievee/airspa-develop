package com.robbievee.it.webapp.rest.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.robbievee.it.webapp.model.BusStop;
import com.robbievee.it.webapp.rest.service.BusStopService;

@RestController
@RequestMapping("/busstop")
public class BusStopController {

	@Autowired
	private BusStopService service;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<BusStop> getBusStopList() throws IOException {
		return service.getBusStopList();
	}
}
