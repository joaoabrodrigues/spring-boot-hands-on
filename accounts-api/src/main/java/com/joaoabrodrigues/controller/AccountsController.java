package com.joaoabrodrigues.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.joaoabrodrigues.model.Account;
import com.joaoabrodrigues.service.AccountService;

@RestController
@RequestMapping("/v1/accounts")
public class AccountsController {
	
	@Autowired
	private AccountService accountService;

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Void> createAccount(@RequestBody Account account) {
		accountService.saveAccount(account);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@RequestMapping(path = "/{id}", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Void> updateAccountLimit(@PathVariable("id") String id, @RequestBody Account account) {
		accountService.updateAccount(account, id);
		return ResponseEntity.ok().build();
	}
	
	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteAccount(@PathVariable("id") String id) {
		accountService.deleteAccount(id);
		return ResponseEntity.ok().build();
	}
	
	@RequestMapping(path = "/limits", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Account> getAccountsLimits() {
		return accountService.getAccountLimits();
	}
}