package com.example.citi.micros.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface MicrosService {
	Map<String, List<String>> getHttpHeaders1(HttpServletRequest request);
	Map<String, List<String>> getHttpHeaders2(HttpServletRequest request, List<String> headerNames);
}
