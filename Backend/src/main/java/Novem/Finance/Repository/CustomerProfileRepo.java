package Novem.Finance.Repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import Novem.Finance.Models.BankEmployee;
import Novem.Finance.Models.CustomerProfile;;


public interface CustomerProfileRepo extends CrudRepository<CustomerProfile,String>{

	 Optional<CustomerProfile> findBySsn(String ssn);


}







