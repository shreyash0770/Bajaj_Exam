package com.example.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Request;
import com.example.entity.Response;

@Service
public class ServiceClass {
	public Response getApiResponse(Request request) {
		Response response = new Response();

		response.setIs_success(true);
		response.setUser_id("Shreyash_Abhang_12345");
		response.setEmail("shreyash@gmail.com");
		response.setRoll_number("ABCD123");

		List<String> chars = new ArrayList<String>();
		List<String> ints = new ArrayList<String>();

		for(String listAll : request.getData()) {
			if(listAll.matches("[a-zA-Z]+")) {
				chars.add(listAll);
			}else {
				ints.add(listAll);
			}

		}

		response.setAlphabets(chars);
		response.setNumbers(ints);

		return response;

	}
}
