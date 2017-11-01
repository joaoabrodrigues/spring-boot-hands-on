package com.joaoabrodrigues.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

public class Account {
	
	@Id
	private String accountId;
	
    private BigDecimal availableCreditLimit;
	
	private BigDecimal availableWithdrawalLimit;
	
	public BigDecimal getAvailableCreditLimit() {
		return availableCreditLimit;
	}

	public void setAvailableCreditLimit(BigDecimal availableCreditLimit) {
		this.availableCreditLimit = availableCreditLimit;
	}

	public BigDecimal getAvailableWithdrawalLimit() {
		return availableWithdrawalLimit;
	}

	public void setAvailableWithdrawalLimit(BigDecimal availableWithdrawalLimit) {
		this.availableWithdrawalLimit = availableWithdrawalLimit;
	}
	
	public Account() { }
	
	public Account(String accountId, BigDecimal availableCreditLimit, BigDecimal availableWithdrawalLimit) {
		this.accountId = accountId;
		this.availableCreditLimit = availableCreditLimit;
		this.availableWithdrawalLimit = availableWithdrawalLimit;
	}
	
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
}
