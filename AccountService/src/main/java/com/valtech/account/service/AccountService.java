package com.valtech.account.service;

import java.util.List;

import com.valtech.account.enitity.Account;

public interface AccountService {

	Account createAccount(Account acc);

	Account updateAccount(Account acc);

	Account getAccount(long id);

	List<Account> getAllAccounts();
	
	Account createSavingAccount(double balance);
	
	Account createCurrentAccount(double balance);

}