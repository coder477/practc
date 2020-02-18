package com.transaction.controller;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.transaction.model.Statistics;
import com.transaction.model.Transaction;
import com.transaction.service.TransactionService;

@RestController
@RequestMapping("/api")
public class TransactionAPI {

	@Autowired
	private TransactionService service;

	@RequestMapping(method = RequestMethod.POST, value = "/postTransaction")
	public ResponseEntity postTransaction(@RequestBody Transaction transaction) {
		System.out.println("gott"+transaction.getTimeStamp());
		transaction.setTimeStamp(Instant.now().getEpochSecond());
		service.createTransaction(transaction);
		return new ResponseEntity(HttpStatus.CREATED);

	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/stats")
	public Statistics getStatistics() {
		
		return service.getStats();

	}
	
	

}
