package Novem.Finance.Controller;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Novem.Finance.Models.Account;

import Novem.Finance.Service.AccountService;

@RestController
@RequestMapping("/Accounts")
public class AccountController 
{
@Autowired
private AccountService AccountService;

@Secured("ROLE_ADMIN")
@RequestMapping(method = RequestMethod.GET)
public Collection<Account> GetAllAccounts()
{
	return AccountService.getAllAccounts();
}

@Secured("ROLE_ADMIN")
@RequestMapping(method = RequestMethod.POST)
public void AddAccount(@RequestBody Account Account)
{
	AccountService.AddAccount(Account);

	
}
@Secured("ROLE_ADMIN")
@RequestMapping("/{AccountNumber}")
public Optional<Account> GetEmployee(@PathVariable String AccountNumber)
{
	return AccountService.GetAccount(AccountNumber);
}
@Secured("ROLE_ADMIN")
@RequestMapping("/Customer/{CustomerID}")
public Collection<Account>GetAllAccountbyCustomer(@PathVariable String CustomerID)
{
	return AccountService.GetAccountByCustomerId(CustomerID);
}



}
