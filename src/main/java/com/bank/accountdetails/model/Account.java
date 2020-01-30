package com.bank.accountdetails.model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_details")
public class Account {

	@Id
	private Long AccountNumber;
	private String AccountName;
	private String AccountType;
	private Date BalanceDate;
	private String Currency;
	private Double OpeningAvailableBalance;

	public Account() {

	}

	public Long getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		AccountNumber = accountNumber;
	}

	public String getAccountName() {
		return AccountName;
	}

	public void setAccountName(String accountName) {
		AccountName = accountName;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public Date getBalanceDate() {
		return BalanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		BalanceDate = balanceDate;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public Double getOpeningAvailableBalance() {
		return OpeningAvailableBalance;
	}

	public void setOpeningAvailableBalance(Double openingAvailableBalance) {
		OpeningAvailableBalance = openingAvailableBalance;
	}

	@Override
	public String toString() {
		return "Account [AccountNumber=" + AccountNumber + ", AccountName=" + AccountName + ", AccountType="
				+ AccountType + ", BalanceDate=" + BalanceDate + ", Currency=" + Currency + ", OpeningAvailableBalance="
				+ OpeningAvailableBalance + "]";
	}
}
