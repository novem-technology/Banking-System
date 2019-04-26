package Novem.Finance.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Novem.Finance.Repository.AccountRepo;
import Novem.Finance.Models.*;
@Service
public class AccountService {
@Autowired	
private AccountRepo Account;
	
public Collection<Account> getAllAccounts()
{
	List<Account> AccountList = new ArrayList<>();
	Account.findAll().forEach(AccountList::add);
	return AccountList;
}

public void AddAccount(Account Accounts)
{
	Account.save(Accounts);
}
public Optional<Account> GetAccount(String AccountNumber)
{
	return Account.findById(AccountNumber);
	 
}
public Collection<Account> GetAccountByCustomerId(String CustomerID)
{
	return Account.findByCustomerId(CustomerID);
	 
}
}
