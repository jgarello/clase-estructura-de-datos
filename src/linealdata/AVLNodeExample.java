package linealdata;

public class AVLNodeExample  implements AVLNode {

	public int value = -1;
	public int unbalance_factor = 0;
	public AVLNodeExample left = null;
	public AVLNodeExample right = null;
	
	public AVLNodeExample(int value)
	{
		this.value = value;
	}
	
	
	@Override
	public void setLeft(AVLNode node) 
	{
		left = (AVLNodeExample)node;
	}

	@Override
	public AVLNode getLeft() 
	{
		return this.left;
	}

	@Override
	public void setRight(AVLNode node) 
	{
		right = (AVLNodeExample)node;
	}

	@Override
	public AVLNode getRight() 
	{
		return this.right;
	}

	@Override
	public AVLNode clone() 
	{
		return new AVLNodeExample( this.value );
	}

	@Override
	public boolean isEqual(AVLNode node) 
	{
		AVLNodeExample temp = (AVLNodeExample) node;
		return this.value == temp.value ? true : false;
	}
	

	@Override
	public boolean isLessThan(AVLNode node) 
	{
		AVLNodeExample temp = (AVLNodeExample) node;
		return this.value < temp.value ? true : false;
	}
}