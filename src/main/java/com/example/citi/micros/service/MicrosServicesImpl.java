package com.example.citi.micros.service;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;


@Service
public class MicrosServicesImpl implements MicrosService {

	@Override
	public Map<String, List<String>> getHttpHeaders1(HttpServletRequest request) {

		Map<String, List<String>> response = Collections.list(request.getHeaderNames()).stream().collect(Collectors.toMap(s->s,  s-> Collections.list(request.getHeaders(s))));
		
		return response;

	}

	@Override
	public Map<String, List<String>> getHttpHeaders2(HttpServletRequest request, List<String> headerNames) {

		Map<String, List<String>> response = Collections.list(request.getHeaderNames()).stream().filter(f-> headerNames.stream().anyMatch(h->h.equals(f)) ).collect(Collectors.toMap(s->s,  s-> Collections.list(request.getHeaders(s))));
		
		return response;

	}
}