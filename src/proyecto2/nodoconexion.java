package proyecto2;

import linealdata.Node;

public class nodoconexion implements Node{
	String etiqueta;
	nodoconexion next = null;
	
	 public nodoconexion( String etiqueta) {
		this.etiqueta=etiqueta;
	}
	
	
	@Override
	public void setNext(Node node) {
		this.next=(nodoconexion)node;
		
	}

	@Override
	public Node getNext() {
		// TODO Auto-generated method stub
		return this.next;
	}

	@Override
	public Node clone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEqual(Node node) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLessThan(Node node) {
		// TODO Auto-generated method stub
		return false;
	}
public String toString() {
		
		return (""+ this.etiqueta+",");
	}
}
