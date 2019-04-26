package Novem.Finance.Repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;


import Novem.Finance.Models.BankTransaction;

public interface TransactionRepo extends CrudRepository<BankTransaction,String>{
	
public List<BankTransaction>findByAccountAccountNumber(String AccountNumber);
public List<BankTransaction>findByAccount1(String AccountNumber);
	//GetAllAccounts
	//GetEmployee String(Id)
	//UpdateEmployee(Id)
	//DeleteEmployee(id)

}

