package Novem.Finance.Models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BankTransaction 
{

//Generate ID
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long transactionID;
private String transactionType;
private String amount;
private String date;
private String account1;
private String account2;
@ManyToOne
private Account account;

public BankTransaction() {}





public BankTransaction( String transactionType, String amount, String date, String account1,
		String account2) {
	
	
	this.transactionType = transactionType;
	this.amount = amount;
	this.date = date;
	this.account1 = account1;
	this.account2 = account2;
	this.account = new Account("","","");
}





public String getTransactionType() {
	return transactionType;
}


public void setTransactionType(String transactionType) {
	this.transactionType = transactionType;
}


public String getAmount() {
	return amount;
}


public void setAmount(String amount) {
	this.amount = amount;
}


public String getDate() {
	return date;
}


public void setDate(String date) {
	this.date = date;
}




public long getTransactionID() {
	return transactionID;
}




public String getAccount1() {
	return account1;
}


public void setAccount1(String account1) {
	this.account1 = account1;
}


public String getAccount2() {
	return account2;
}


public void setAccount2(String account2) {
	this.account2 = account2;
}





public Account getAccount() {
	return account;
}





public void setAccount(Account account) {
	this.account = account;
}



}
