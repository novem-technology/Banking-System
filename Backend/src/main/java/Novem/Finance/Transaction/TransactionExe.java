package Novem.Finance.Transaction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.springframework.stereotype.Service;

import antlr.collections.List;
@Service
public class TransactionExe 
{

private Queue<Itransaction> TransactionQueue = new LinkedList<>();
private Stack<Itransaction> ExeStack = new Stack<>();

public void addTransaction(Itransaction Trans) 
{
	TransactionQueue.add(Trans);
	
}

public void executeTransaction()
{
	while(!TransactionQueue.isEmpty())
	{
		Itransaction CurrentTransaction=TransactionQueue.poll();
		if(CurrentTransaction.execute())
		{
			ExeStack.push(CurrentTransaction);
			
		}
		
	}
	
}
}
