package Novem.Finance.Repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import Novem.Finance.Models.Account;
import Novem.Finance.Models.CustomerProfile;

public interface AccountRepo extends CrudRepository<Account,String>{
	
	List<Account> findByCustomerId(String CustomerID);
	//GetAllAccounts
	//GetEmployee String(Id)
	//UpdateEmployee(Id)
	//DeleteEmployee(id)

}








