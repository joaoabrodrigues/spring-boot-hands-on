package com.joaoabrodrigues.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaoabrodrigues.model.Account;
import com.joaoabrodrigues.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	public void saveAccount(Account account) {
		accountRepository.save(account);
	}
	
	public void updateAccount(Account account, String id) {
		account.setAccountId(id);
		saveAccount(account);
	}
	
	public List<Account> getAccountLimits() {
		return accountRepository.findAll();
	}
	
	public void deleteAccount(String id) {
		accountRepository.delete(id);
	}

}
