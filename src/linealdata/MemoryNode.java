package linealdata;

public class MemoryNode implements Node {

	AVLNode information = null;
	MemoryNode next = null;
	
	public MemoryNode(AVLNode node)
	{
		information = node;
	}
	
	@Override
	public void setNext(Node node) 
	{
		next = (MemoryNode)node;
	}

	@Override
	public Node getNext() 
	{
		return next;
	}

	@Override
	public Node clone() 
	{
		return new MemoryNode(this.information);
	}

	@Override
	public boolean isEqual(Node node) 
	{
		return false;
	}

	@Override
	public boolean isLessThan(Node node) 
	{
		return false;
	}

}