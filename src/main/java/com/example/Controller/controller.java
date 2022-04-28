package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Request;
import com.example.entity.Response;
import com.example.service.ServiceClass;

@RestController
@RequestMapping(path = "/")
public class controller {

	@Autowired
	private ServiceClass service;

	@PostMapping(path="/bfhl", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Response getResponse(@RequestBody Request request){
		return service.getApiResponse(request);
	}

}
