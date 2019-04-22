package linealdata;

public class StringNode implements Node {

	/*
	 * 
	 */
	char character;
	Node next = null;
	
	public StringNode(char character) 
	{
		this.character = character;
	}

	
	@Override
	public void setNext(Node node) 
	{
		this.next = node;
	}

	
	@Override
	public Node getNext() 
	{
		return this.next;
	}

	
	@Override
	public Node clone() 
	{
		StringNode clone = new StringNode(this.character);
		return clone;
	}

	
	@Override
	public boolean isEqual(Node node)
	{
		StringNode temp = (StringNode) node;
		return temp.character == this.character ? true : false;
	}

	
	@Override
	public boolean isLessThan(Node node) 
	{
		StringNode temp = (StringNode) node;
		return (int)this.character < (int)temp.character ? true : false;
	}
}