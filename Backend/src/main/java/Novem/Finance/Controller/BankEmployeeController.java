package Novem.Finance.Controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Novem.Finance.Models.BankEmployee;
import Novem.Finance.Security2.CurrentUser;
import Novem.Finance.Security2.UserPrincipal;
import Novem.Finance.Service.BankEmployeeService;

@RestController
@RequestMapping("/E")
public class BankEmployeeController {
@Autowired
private BankEmployeeService EmployeeService;




@RequestMapping(method = RequestMethod.GET)
public Collection<BankEmployee> getAllEmployees(){
	return EmployeeService.getAllEmployees();
}

@RequestMapping(method = RequestMethod.POST)
public void AddEmployee(@RequestBody BankEmployee Employee)
{
	EmployeeService.AddEmployee(Employee);

	
}

@RequestMapping("/{id}")
public Optional<BankEmployee> GetEmployee(@PathVariable Long id)
{
	return EmployeeService.GetEmployee(id);
}


@GetMapping("/me")
@PreAuthorize("hasRole('ADMIN')")
public Optional<BankEmployee> GetEmployeeME(@CurrentUser UserPrincipal currentUser) {
  
    return EmployeeService.GetEmployee(currentUser.getId());
}





}
