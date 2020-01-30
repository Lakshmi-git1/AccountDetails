package com.bank.accountdetails.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bank.accountdetails.model.Transaction;
import com.bank.accountdetails.repository.TransactionRepository;

@Service
public class TransactionDetailsService {

	@Autowired
	private TransactionRepository transactionRepo;

	final Logger logger = LoggerFactory.getLogger(TransactionDetailsService.class);

	public List<Transaction> getTransactionByAccount(Long accountNumber) {

		final List<Transaction> transactionDetails = transactionRepo.findByAccountNumber(accountNumber);
		logger.info("Transaction details are " + transactionDetails);
		return transactionDetails;
	}

}
