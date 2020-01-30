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
import com.bank.accountdetails.model.Account;
import com.bank.accountdetails.repository.AccountRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountDetailsServiceTest {

	@InjectMocks
	private AccountDetailsService accountService;

	@Mock
	private AccountRepository accountRepo;
	
	final static Long accountNumber = 123456789L;
	@Test
	public void testFindAllAccountDetailsSuccess() {
		when(accountRepo.findAll()).thenReturn(getAccountDetails());
		List<Account> result = accountService.getAllAccountDetails();
		assertThat(result.size()).isEqualTo(1);
	}

	@Test
	public void testFindAllAccountDetailsFail() {
		when(accountRepo.findAll()).thenReturn(new ArrayList<>());
		List<Account> result = accountService.getAllAccountDetails();
		assertTrue(result.isEmpty());
	}
	
	private List<Account> getAccountDetails() {
		final Account accData = new Account();
		accData.setAccountName("SGSavings726");
		accData.setAccountNumber(accountNumber);
		accData.setAccountType("Saings");
		accData.setBalanceDate(new Date(2020-01-17));
		accData.setCurrency("SUG");
		accData.setOpeningAvailableBalance(85400.00);
		List<Account> accDetails = new ArrayList<Account>();
		accDetails.add(accData);
		return accDetails;
	}
}
