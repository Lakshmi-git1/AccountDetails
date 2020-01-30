package com.bank.accountdetails.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bank.accountdetails.model.Account;
import com.bank.accountdetails.model.Transaction;
import com.bank.accountdetails.service.AccountDetailsService;
import com.bank.accountdetails.service.TransactionDetailsService;

@RestController
public class CommonController {

	@Autowired
	private AccountDetailsService accountService;

	@Autowired
	private TransactionDetailsService transactionService;

	@GetMapping("/viewaccountdetails")
	public List<Account> getAccountDetails() {
		return accountService.getAllAccountDetails();
	}

	@GetMapping("/viewtransactiondetails")
	public List<Transaction> getTransactions(@RequestParam("accountNumber") Long accountNumber) {
		return transactionService.getTransactionByAccount(accountNumber);
	}
}
