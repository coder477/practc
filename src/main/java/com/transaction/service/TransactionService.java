package com.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transaction.model.Statistics;
import com.transaction.model.Transaction;
import com.transaction.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	TransactionRepository repository;

	public void createTransaction(Transaction transaction) {

		repository.add(transaction);

	}

	public Statistics getStats() {
		// TODO Auto-generated method stub
		return repository.getstats();
	}

}
