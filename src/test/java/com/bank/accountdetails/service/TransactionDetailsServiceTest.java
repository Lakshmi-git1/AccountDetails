package com.bank.accountdetails.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.bank.accountdetails.model.Transaction;
import com.bank.accountdetails.repository.TransactionRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransactionDetailsServiceTest {

	@InjectMocks
	private TransactionDetailsService transactionService;

	@Mock
	private TransactionRepository transactionRepo;

	final static Long accountNumber = 123456789L;

	@Test
	public void testFindAllTransactionDetailsForSucceess() {
		when(transactionRepo.findByAccountNumber(accountNumber)).thenReturn(getTransactonDetails());
		List<Transaction> result = transactionService.getTransactionByAccount(accountNumber);
		assertThat(result.size()).isEqualTo(1);
	}

	@Test
	public void testFindAllTransactionDetailsFail() {
		when(transactionRepo.findByAccountNumber(accountNumber)).thenReturn(new ArrayList<>());
		List<Transaction> result = transactionService.getTransactionByAccount(accountNumber);
		assertTrue(result.isEmpty());
	}

	private List<Transaction> getTransactonDetails() {
		final Transaction transactionData = new Transaction();
		transactionData.setAccountName("SGSavings726");
		transactionData.setAccountNumber(accountNumber);
		transactionData.setCreditAmount(2000.00);
		transactionData.setDebitAmount(0.00);
		transactionData.setCreditDebit("credit");
		transactionData.setCurrency("AUG");
		transactionData.setId(0);
		transactionData.setTransactionNarrative("");
		transactionData.setValueDate(new Date(2020 - 01 - 17));
		List<Transaction> transactionDetails = new ArrayList<Transaction>();
		transactionDetails.add(transactionData);
		return transactionDetails;
	}
}
