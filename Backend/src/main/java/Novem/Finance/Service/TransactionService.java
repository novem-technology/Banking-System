package Novem.Finance.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Novem.Finance.Repository.TransactionRepo;
import Novem.Finance.Models.*;
@Service
public class TransactionService{
@Autowired	
private TransactionRepo Transaction;
	
public Collection<BankTransaction> getAllTransaction()
{
	List<BankTransaction> TransactionList = new ArrayList<>();
	Transaction.findAll().forEach(TransactionList::add);
	
	return TransactionList;
}

public void AddTransaction(BankTransaction Transaction)
{
	this.Transaction.save(Transaction);
}
public Optional<BankTransaction> GetTransaction(String TransactionID)
{
	return this.Transaction.findById(TransactionID);
	 
}

public List<BankTransaction> getAllTransactionsFromAccount(String AccountNumber)
{
	List<BankTransaction> TransactionList = new ArrayList<>();
	Transaction.findByAccountAccountNumber(AccountNumber).forEach(TransactionList::add);
	return TransactionList;
}

public List<BankTransaction> getAllTransactionsFromAccount2(String AccountNumber)
{
	List<BankTransaction> TransactionList = new ArrayList<>();
	Transaction.findByAccount1(AccountNumber).forEach(TransactionList::add);
	return TransactionList;
}


}
