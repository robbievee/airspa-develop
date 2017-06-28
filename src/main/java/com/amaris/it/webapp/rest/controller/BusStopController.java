package com.amaris.it.webapp.rest.controller;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amaris.it.webapp.rest.service.BusStopService;
import com.amaris.it.webapp.model.BusStop;

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
