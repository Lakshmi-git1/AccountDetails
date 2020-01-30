package com.bank.accountdetails.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bank.accountdetails.model.Account;
import com.bank.accountdetails.repository.AccountRepository;

@Service
public class AccountDetailsService {

	@Autowired
	private AccountRepository accountRepo;

	final Logger logger = LoggerFactory.getLogger(AccountDetailsService.class);
	
	public List<Account> getAllAccountDetails() {
		
		final List<Account> accountData = accountRepo.findAll();
		logger.info("Account details are " + accountData);
		return accountData;
	}
}
