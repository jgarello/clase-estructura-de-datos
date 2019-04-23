package linealdata;

public class AVL  
{
	AVLNode root = null; //
	 
	/**
	 * 
	 */
	public AVL() {}
	
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		return root == null ? true : false;
	}
	
	
	/**
	 * 
	 * @param value
	 */
	public void insert(AVLNode node)
	{
		if(isEmpty())
		{
			root = node;
		}
		else
		{
			Stack path = new Stack();
			
			AVLNode temp = root;
			AVLNode parent = root;
			
			while(temp != null)
			{
				parent = temp;
				path.push( new MemoryNode( temp ) );
				
				if(node.isLessThan(temp))
					temp = temp.getLeft();
				else
					temp = temp.getRight();
			}
			
			if(node.isLessThan(parent))
				parent.setLeft(node);
			else
				parent.setRight(node);
		}
	}
	
	
	public void calculate_unbalance(Stack path)
	{
		while(!path.isEmpty())
		{
			MemoryNode temp = (MemoryNode)path.pop();
			
			
		}
	}
	
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public AVLNode search(AVLNode nodeToSearch)
	{
		AVLNode temp = root;
		
		while(temp != null)
		{
			if(temp.isEqual(nodeToSearch))
				break;
			else
				if(nodeToSearch.isLessThan(temp))
					temp = temp.getLeft();
				else
					temp = temp.getRight();
		}
		
		return temp;
	}

	
	public AVLNode getParent(AVLNode node)
	{
		AVLNode temp = root;
		AVLNode parent = root;
		
		while(temp != null)
			if(node.isEqual(temp))
				break;
			else
			{
				parent = temp;
				if(node.isLessThan(temp))
					temp = temp.getLeft();
				else
					temp = temp.getRight();
			}
		
		
		return parent;
	}
	
	
	
	/**
	 * 
	 * @param value
	 */
	public void delete(AVLNode nodeToDelete)
	{
		AVLNode parent = getParent(nodeToDelete);
		
		if( isLeaf(nodeToDelete) )
		{
			if(nodeToDelete.isLessThan(parent))
				parent.setLeft( null );
			else
				parent.setRight( null );
			
			nodeToDelete = null;
		}
		else
		{
			if( oneChild(nodeToDelete) )
			{
				if( nodeToDelete.getLeft() != null )
					if(nodeToDelete.isLessThan(parent))
						parent.setLeft( nodeToDelete.getLeft() );
					else
						parent.setRight( nodeToDelete.getLeft() );
				else
					if(nodeToDelete.isLessThan(parent))
						parent.setLeft( nodeToDelete.getRight() );
					else
						parent.setRight( nodeToDelete.getRight() );
				
				nodeToDelete = null;
			}
			else
			{
				AVLNode temp = nodeToDelete.getLeft();
				AVLNode temp_parent = nodeToDelete;
				
				while(temp.getRight() != null)
				{	
					temp_parent = temp;
					temp = temp.getRight();
				}
				
				if(temp_parent.isEqual(nodeToDelete))
					temp.setRight( nodeToDelete.getRight() );
				else
				{	
					temp_parent.setRight( temp.getLeft() ); 
					temp.setLeft( nodeToDelete.getLeft() );
					temp.setRight( nodeToDelete.getRight() );
				}
				
				if(nodeToDelete.isLessThan(parent))
					parent.setLeft( temp );
				else
					parent.setRight( temp );
			}
		}
	}
	
	
	/**
	 * 
	 * @param node
	 * @return
	 */
	public boolean isLeaf(AVLNode node)
	{
		return (node.getLeft() == null && node.getRight() == null) ? true : false;
	}
	
	
	/**
	 * 
	 * @param node
	 * @return
	 */
	public boolean oneChild(AVLNode node)
	{
		return (node.getLeft() != null && node.getRight() != null) ? false : true;
	}
	
	
	/**
	 * 
	 * @param node
	 */
	public void preorder(AVLNode node, int counter)
	{
		if(node != null)
		{
			System.out.print(node.toString() + " ");
			preorder(node.getLeft(), counter += 1);
			//duda
			preorder(node.getRight(),counter);
		}
	}
	
	
	/**
	 * 
	 * @param node
	 */
	public void postorder(AVLNode node)
	{
		if(node != null)
		{
			postorder(node.getLeft());
			postorder(node.getRight());
			System.out.print(node.toString() + " ");
		}
		
	}
	
	
	/**
	 * 
	 * @param node
	 */
	public void inorder(AVLNode node)
	{
		if(node != null)
		{
			inorder(node.getLeft());
			System.out.print (node.toString() + " ");
			inorder(node.getRight());
		}
			
	}
	
}
