package Novem.Finance.Controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Novem.Finance.Models.Account;
import Novem.Finance.Models.CustomerProfile;
import Novem.Finance.Service.CustomerProfileService;

@RestController
@RequestMapping("/Customer")
public class CustomerController 
{

@Autowired
private CustomerProfileService CustomerService;

@RequestMapping(method = RequestMethod.GET)
public Collection<CustomerProfile> GetAllAccounts()
{
	return CustomerService.getAllCustomerProfiles();
	
}

@RequestMapping(method = RequestMethod.POST)
public void AddCustomer(@RequestBody CustomerProfile NewCustomerProfile)
{
	CustomerService.Add(NewCustomerProfile);
	
}


@RequestMapping("/Social/{Social}")
public Optional<CustomerProfile> GetEmployee(@PathVariable String Social)
{
	return CustomerService.GetCustomerBySocial(Social);
}


}
