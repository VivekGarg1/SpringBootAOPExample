package com.home.app.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

import com.home.app.aspect.Auditable;
import com.home.app.aspect.Auditable.AuditDestination;
import com.home.app.model.Account;
import com.home.app.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	
	Map<String,Account> map=new HashMap<String, Account>();

	@Auditable(AuditDestination.DATABASE)
	@Override
	public void updateAccountBalance(Account account, long amount) {
		System.out.println("Account No: "+account.getAccountNumber()+" ,Amount: "+amount);
	}
	
	/*@Override
	public Account getAccountBycustomerId(String custId) throws Exception {
		Account account=null;
		if(custId==null)
			throw new Exception("Customer Id is invalid!!!");
		map.put("CU3456789", new Account("123456789", "Saving Account"));
		map.put("CU4356789", new Account("987654321", "Current Account"));
		Set<Entry<String, Account>> entrySet = map.entrySet();
		for (Entry<String, Account> entry : entrySet) {
			if(entry.getKey().equals(custId))
				account=entry.getValue();
		}
		return account;
	}*/

}
