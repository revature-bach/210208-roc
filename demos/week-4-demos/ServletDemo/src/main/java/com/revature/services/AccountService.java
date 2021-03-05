package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import com.revature.exception.AccountNotFoundException;
import com.revature.models.Account;

public class AccountService {

	private List<Account> accounts = new ArrayList<>();
	
	public AccountService() {
		this.accounts.add(new Account(1, "checking", 100.12));
		this.accounts.add(new Account(2, "savings", 1000.20));
		this.accounts.add(new Account(3, "checking", 20023.23));
	}
	
	public List<Account> getAllAccounts() {
		return this.accounts;
	}
	
	public Account getAccountById(int id) throws AccountNotFoundException {
		for (Account account : accounts) {
			if (account.getId() == id) {
				return account;
			}
		}
		
		throw new AccountNotFoundException("Account with account id " + id + " does not exist!");
	}
	
}
