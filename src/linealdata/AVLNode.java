package linealdata;

public interface AVLNode {

	
	/**
	 * 
	 * @param node
	 */
	public void setLeft(AVLNode node);
	
	
	/**
	 * 
	 * @return
	 */
	public AVLNode getLeft();
	
	
	/**
	 * 
	 * @param node
	 */
	public void setRight(AVLNode node);
	
	
	/**
	 * 
	 * @return
	 */
	public AVLNode getRight();
	
	
	/**
	 * 
	 * @return
	 */
	public AVLNode clone();
	
	
	/**
	 * 
	 * @param node
	 * @return
	 */
	public boolean isEqual(AVLNode node);
	
	
	/**
	 * 
	 * @param node
	 * @return
	 */
	public boolean isLessThan(AVLNode node);	
	
	
	/**
	 * 
	 * @return
	 */
	public String toString();
}