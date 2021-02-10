package com.example.citi.micros.controller;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.citi.micros.models.RequestTest;
import com.example.citi.micros.service.MicrosService;




@RestController
public class MicrosController {

	
	private final HttpServletRequest httpServletRequest;
	
	private final MicrosService microservice;
	
	public MicrosController(HttpServletRequest httpServletRequest, MicrosService microservice) {
		this.httpServletRequest = httpServletRequest;
		this.microservice = microservice;
	}

	
	@PostMapping(value = "/punto1", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> punto1(@RequestBody RequestTest request) {
		Map<String, List<String>> response = microservice.getHttpHeaders1(httpServletRequest);
	  
	   return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	
	@PostMapping(value = "/punto2", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> punto2(@RequestBody RequestTest request) {
		Map<String, List<String>> response = microservice.getHttpHeaders2(httpServletRequest, request.getTestList());
	  
	   return new ResponseEntity<>(response, HttpStatus.OK);
	}
	

	
	
}
