package linealdata;
import java.io.*;

public class Stack {
	
	public Node top = null; //top
	
	public Stack() {}
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		return top == null ? true : false;
	}
	
	
	/**
	 * 
	 * @param newNode
	 */
	public void push(Node newNode)
	{
		newNode.setNext(top);
		top=newNode;
		
	}
	
	
	/**
	 * 
	 * @return
	 */
	public Node pop()
	{
		Node temp=top;
		top=top.getNext();
		System.gc();
		return temp;
		
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String peek()
	{
		return top.toString();
	}
	
	
	/**
	 * 
	 */
	public void printStack()
	{
		BufferedWriter bw = new BufferedWriter(	new OutputStreamWriter( System.out ));
		
		try
		{
			while(!isEmpty())
				bw.write(pop().toString());
			
			bw.flush();
		}
		catch(Exception ex) { ex.printStackTrace(); }
	}
}