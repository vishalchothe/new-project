package com.httpstatuscode.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
  public class HomeController {

	@GetMapping("/get")
	public ResponseEntity<String> getUser() {
		ResponseEntity<String> response = new ResponseEntity<String>("Welcome to Status Code..",HttpStatus.BAD_REQUEST);
		return response;
	}
}
 