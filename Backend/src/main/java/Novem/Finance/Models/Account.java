package Novem.Finance.Models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

enum accountType{
	SAVING, CHECKING
}
@Entity
public class Account 
{
@Id
private String accountNumber;		//Account Number of Account
private String accountBalance;		//Account Balance was String Switching to big Decimal	
private BigDecimal accountBalanceD;
private String accountType;			//Type Of Account Savings Or checking 
private String customerId;
//@OneToMany
//private List<BankTransaction> Transactions = new ArrayList<>();;
@ManyToOne
private CustomerProfile custProfile;

public Account() {}

public Account(String accountNumber, String accountBalance, String accountType) {
	this.accountNumber = accountNumber;
	this.accountBalance = accountBalance;
	this.accountType = accountType;
	this.accountBalanceD= new BigDecimal(accountBalance);

}

public String getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}

public String getAccountBalance() {
	return accountBalance;
}

public void setAccountBalance(String accountBalance) {
	this.accountBalance = accountBalance;
}

public String getAccountType() {
	return accountType;
}

public void setAccountType(String accountType) {
	this.accountType = accountType;
}

public BigDecimal getAccountBalanceD() {
	return accountBalanceD;
}

public CustomerProfile getCustProfile() {
	return custProfile;
}

public void setAccountBalanceD(BigDecimal accountBalanceD) {
	this.accountBalanceD = accountBalanceD;
}

public void setCustProfile(CustomerProfile custProfile) {
	this.custProfile = custProfile;
}

public String getCustomerId() {
	return customerId;
}

public void setCustomerId(String customerId) {
	this.customerId = customerId;
}



}
