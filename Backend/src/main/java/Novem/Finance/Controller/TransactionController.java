package Novem.Finance.Controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Novem.Finance.Models.Account;
import Novem.Finance.Models.BankTransaction;
import Novem.Finance.Service.AccountService;
import Novem.Finance.Service.TransactionService;
import Novem.Finance.Transaction.TransactionExe;
import Novem.Finance.Transaction.Withdraw;
import Novem.Finance.Transaction.Deposit;
import Novem.Finance.Transaction.Transfer;

@RestController
@RequestMapping("/Transactions")
public class TransactionController 
{
@Autowired
private AccountService Aserve;
@Autowired
private TransactionExe TServe;
@Autowired
private TransactionService TransactionServ;

@RequestMapping(value= "/Withdraw",method = RequestMethod.POST)
public void WithDrawFromAccount(@RequestBody BankTransaction BankTrans)
{
	Withdraw WithDrawTransaction = new Withdraw(BankTrans,Aserve);
	
	//TServe.addTransaction(new Withdraw(BankTran.getAmount(),WithdrawTran.getAccount(),Aserve));
	TServe.addTransaction(WithDrawTransaction);
	TServe.executeTransaction();
	BankTrans.setAccount(new Account(BankTrans.getAccount1(),"0","0"));
	TransactionServ.AddTransaction(BankTrans);
}
	
@RequestMapping(value= "/Deposit",method = RequestMethod.POST)
public void DepositToAccount(@RequestBody BankTransaction BankTrans)
{
	
	Deposit DepositTransaction = new Deposit(BankTrans,Aserve);
	TServe.addTransaction(DepositTransaction);
	TServe.executeTransaction();
	//BankTrans.setAccount(new Account("","",""));
	TransactionServ.AddTransaction(BankTrans);
}
	
@RequestMapping(value= "/Transfer",method = RequestMethod.POST)
public void Transfer(@RequestBody BankTransaction BankTrans)
{
	
	Transfer DepositTransaction = new Transfer(BankTrans,Aserve);
	TServe.addTransaction(DepositTransaction);
	TServe.executeTransaction();
	//BankTrans.setAccount(new Account(,"",""));
	TransactionServ.AddTransaction(BankTrans);
}

@RequestMapping("/Account/{AccountNumber}")
public List<BankTransaction> GetAllTransFromAccount(@PathVariable String AccountNumber)
{
	return TransactionServ.getAllTransactionsFromAccount2(AccountNumber);
}


@RequestMapping(value= "/All", method = RequestMethod.GET)
public Collection<BankTransaction> GetAllTransactions()
{
	return TransactionServ.getAllTransaction();
	
	
}

@RequestMapping("/TransactionId/{id}")
public Optional<BankTransaction> GetEmployee(@PathVariable String id)
{
	return TransactionServ.GetTransaction(id);
}



}



