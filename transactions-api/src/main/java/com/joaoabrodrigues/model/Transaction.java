package com.joaoabrodrigues.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import org.springframework.data.annotation.Id;

public class Transaction {
	
	@Id
	private String transactionId;
	
	private String accountId;
	
	private String operationTypeId;
	
	private BigDecimal amount;
	
	private BigDecimal balance;
	
	private LocalDate eventDate;
	
	private LocalDate dueDate;
	
	public String getTransactionId() {
		return transactionId;
	}

	public String getAccountId() {
		return accountId;
	}

	public String getOperationTypeId() {
		return operationTypeId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}
	
	public static class TransactionBuilder {
		
		private Transaction transaction;
		
		public TransactionBuilder() {
			transaction = new Transaction();
		}
		
		public TransactionBuilder withTransactionId(String transactionId) {
			transaction.transactionId = transactionId;
			return this;
		}
		
		public TransactionBuilder withAccountId(String accountId) {
			transaction.accountId = accountId;
			return this;
		}
		
		public TransactionBuilder withOperationTypeId(String operationTypeId) {
			transaction.operationTypeId = operationTypeId;
			return this;
		}
		
		public TransactionBuilder withAmount(BigDecimal amount) {
			transaction.amount = amount;
			return this;
		}
		
		public TransactionBuilder withBalance(BigDecimal balance) {
			transaction.balance = balance;
			return this;
		}
		
		public TransactionBuilder withEventDate(LocalDate eventDate) {
			transaction.eventDate = eventDate;
			return this;
		}
		
		public TransactionBuilder withDueDate(LocalDate dueDate) {
			transaction.dueDate = dueDate;
			return this;
		}
		
		public Transaction build() {
			return transaction;
		}
	}
}
