package com.home.app.service;

import com.home.app.model.Account;

public interface AccountService {

	public void updateAccountBalance(Account account, long amount);

	//Account getAccountBycustomerId(String custId) throws Exception;

}
