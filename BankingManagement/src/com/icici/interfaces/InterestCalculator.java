package com.icici.interfaces;

import com.icici.models.Account;

public interface InterestCalculator {
	
	// if the account type is savings interest 10%;
	// if it is current account then it 15% 
	public float calculateInterest(Account account);

}
