/*package Novem.Finance.Transaction;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class transactionTest {

	@Test
	void WithDrawTest() 
	{
		BigDecimal expected = new BigDecimal("80").setScale(2);
		BigDecimal amount = new BigDecimal("20").setScale(2);
		BigDecimal balance= new BigDecimal("100").setScale(2);
		BigDecimal newBalance;
		newBalance = balance.subtract(amount);
		assertEquals(expected,newBalance);
		
	}

	@Test
	void DepositTest() 
	{
		BigDecimal expected = new BigDecimal("120").setScale(2);
		BigDecimal amount = new BigDecimal("20").setScale(2);
		BigDecimal balance= new BigDecimal("100").setScale(2);
		BigDecimal newBalance;
		newBalance = balance.add(amount);
		assertEquals(expected,newBalance);
		
	}


}
*/