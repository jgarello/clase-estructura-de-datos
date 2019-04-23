package linealdata;
import java.io.*;
public class Queue {
	
	Node head = null; //
	
	public Queue() {}
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		return head == null ? true : false;
	}
	
	
	/**
	 * 
	 * @param newNode
	 */
	public void sort() {
		 if (this.length() > 1) {
	            for (int i = 0; i < this.length(); i++ ) {
	                Node currentNode = head;
	                Node next = head.getNext();
	                for (int j = 0; j < this.length() - 1; j++) {
	                    if (currentNode.isLessThan(next) ) {
	                        Node temp = currentNode;
	                        currentNode = next;
	                        next = temp;
	                    } 
	                    currentNode = next;
	                    next = next.getNext();                   
	                } 
	            }
	        }
	}
	public void enqueue(Node newNode)
	{
		if(isEmpty()) head=newNode;
		Node temp=head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();

		}

		temp.setNext(newNode);
		newNode.setNext(null);
		
	}
	
	public void printQueue()
	{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter( System.out ));
		Node temp = head;
		
		try
		{
			while(temp != null)
			{
				bw.write(temp.toString());
				temp = temp.getNext();
			}
			bw.flush();
		}
		catch(Exception ex) { ex.printStackTrace(); }
	}
	
	
	/** 
	 * 
	 * @return
	 */
	public Node dequeue()
	{
		Node temp=head;
		head=temp.getNext();
		temp.setNext(null);
		return temp;
	}
	public int length()
	{
		int cuenta=0;
		Node temp=head;
		while(temp!=null) {
			cuenta=cuenta+1;
			temp=temp.getNext();
			

		}
		return cuenta;

	}
	public Queue quickSort(Queue unsorted)
	{
		
		if(unsorted.length() <= 1)
		{
			return unsorted;	
		}
		else
		{
			Node pivot = unsorted.head;
			Node temp = pivot.getNext();

			Queue less_elements = new Queue();
			Queue greater_elements = new Queue();

			while(temp != null)
			{
				if(temp.isLessThan(pivot))
					less_elements.enqueue(temp.clone());
				else
					greater_elements.enqueue(temp.clone());

				temp = temp.getNext();
			}

			pivot.setNext(null);
			less_elements = quickSort(less_elements);
			less_elements.enqueue(pivot);
			less_elements.enqueue( quickSort(greater_elements).head );

			return less_elements;
		}
		
		
	}

}