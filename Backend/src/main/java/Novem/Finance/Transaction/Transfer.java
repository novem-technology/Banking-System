package Novem.Finance.Transaction;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Novem.Finance.Models.Account;
import Novem.Finance.Models.BankTransaction;
import Novem.Finance.Service.AccountService;
@Service
public class Transfer implements Itransaction
{

	private String AccountNumber;	//Holds The Account Number to WithDraw from
	private String AccountNumber2;
	@Autowired	
	private AccountService accountService; //Instance of the Account Service
	
	private Optional<Account> Taccount;		//Hold Account
	private Optional<Account> Taccount2;
	private Account existingAccount;		//Hold Account
	private Account existingAccount2;
			
	
	private BigDecimal balance;
	private BigDecimal amount;
	private BigDecimal newBalance;
	
	
	public Transfer() {}
	
	public Transfer(BankTransaction Transaction, AccountService Aserve) 
	{
		amount = new BigDecimal(Transaction.getAmount()).setScale(2);
		this.accountService=Aserve;
		this.AccountNumber = Transaction.getAccount1();
		this.AccountNumber2 = Transaction.getAccount2();
	}


	
	
	public boolean execute() 
		{
		Taccount=accountService.GetAccount(AccountNumber);
		Taccount2=accountService.GetAccount(AccountNumber2);
			if(Taccount.isPresent()&&Taccount2.isPresent()) 
			{
		
			existingAccount= Taccount.get();
			existingAccount2=Taccount2.get();
			balance= new BigDecimal(existingAccount.getAccountBalance()).setScale(2);
		    newBalance =balance.subtract(amount);
		    
		    existingAccount.setAccountBalance(newBalance.toString());
		    accountService.AddAccount(existingAccount);
		    
		    balance= new BigDecimal(existingAccount2.getAccountBalance()).setScale(2);
		    newBalance =balance.add(amount);
		    
		    existingAccount2.setAccountBalance(newBalance.toString());
		    accountService.AddAccount(existingAccount2);
		    
		    
		    return true;
			}
		
		else		
			return false;
		}

}