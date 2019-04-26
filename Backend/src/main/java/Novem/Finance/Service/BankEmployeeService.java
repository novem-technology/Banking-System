package Novem.Finance.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Novem.Finance.Models.BankEmployee;
import Novem.Finance.Repository.BankEmployeeRepo;
@Service
public class BankEmployeeService {


@Autowired
private BankEmployeeRepo Emp;
private List<BankEmployee> Employeelist2 = new ArrayList<>();


public Collection<BankEmployee> getAllEmployees()
	{
	//return EmployeeDAO.getAllBankEmployees();
	List<BankEmployee> Employeelist = new ArrayList<>();
	//Employeelist.add(new BankEmployee("ME","Me","100"));
	
	Emp.findAll().forEach(Employeelist::add);
	return  Employeelist;
	}

	public void AddEmployee(BankEmployee Employee)
	{
		//Employeelist2.add(new BankEmployee("ME","Me","100"));
		//Employeelist2.add(Employee);
		Emp.save(Employee);
	}
	
	public Optional<BankEmployee> GetEmployee(Long id)
	{
		return Emp.findById(id);
		 
	}




}