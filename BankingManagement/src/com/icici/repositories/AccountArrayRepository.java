package com.icici.repositories;

import com.icici.interfaces.CrudOperator;
import com.icici.interfaces.InterestCalculator;
import com.icici.models.Account;

public class AccountArrayRepository implements CrudOperator,InterestCalculator {
	
	private Account accounts[];
	private int length;
	private int index;
	
	public AccountArrayRepository(int length) {
		this.length = length;
		this.index = 0;
		this.accounts = new Account[length];
	}

	@Override
	public float calculateInterest(Account account) {
		
		if(account.getType() == Account.CURRENT_ACCOUNT) {
			return 15;
		}
		
		return 10;
		
	}

	@Override
	public void add(Account newAccount) {		
		this.accounts[index] = newAccount;
		++index;
	}

	@Override
	public Account[] getAll() {
		return this.accounts;
	}

	@Override
	public Account getByName(String name) {
		for(Account account : this.accounts) {
			
			if(account == null) continue;
			
			if(account.getName().equals(name)) {
				return account;
			}
		}
		return null;
	}

	@Override
	public void update(Account existingAccount, Account updatedAccount) {
		
		existingAccount.setName(updatedAccount.getName());
		existingAccount.setType(updatedAccount.getType());
		
	}

	public int getLength() {
		return length;
	}

	public int getIndex() {
		return index;
	}

}
