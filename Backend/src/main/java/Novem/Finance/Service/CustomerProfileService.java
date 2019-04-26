package Novem.Finance.Service;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Novem.Finance.Repository.CustomerProfileRepo;
import Novem.Finance.Models.*;

@Service
public class CustomerProfileService 
{
@Autowired
private CustomerProfileRepo Customer;


public Collection<CustomerProfile> getAllCustomerProfiles()
{
	List<CustomerProfile> CustomerList = new ArrayList<>();
	Customer.findAll().forEach(CustomerList::add);
	return CustomerList;
}

public void Add(CustomerProfile NewCustomer)
{
	Customer.save(NewCustomer);
}
public Optional<CustomerProfile> GetCustomerById(String id)
{
	return Customer.findById(id);
	
}

public Optional<CustomerProfile> GetCustomerBySocial(String Social)
{
	return Customer.findBySsn(Social);
	
}


}
