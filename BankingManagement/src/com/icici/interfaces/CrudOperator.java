package com.icici.interfaces;

import com.icici.models.Account;

public interface CrudOperator {
	
	public void add(Account newAccount);
	
	public Account[] getAll();
	
	public Account getByName(String name);
	
	public void update(Account existingAccount,Account updatedAccount);

}
