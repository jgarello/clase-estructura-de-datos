package proyecto2;

import linealdata.*;


public class nodografo implements Node {
	
	String etiqueta;
	List conexiones;
	nodografo next = null;
	
	
	public nodografo(String etiqueta) {
		this.etiqueta=etiqueta;
		this.conexiones=new List();
	}

	@Override
	public void setNext(Node node) {
		this.next=(nodografo)node;
		
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
		nodografo temp=(nodografo)node;
		return this.etiqueta.equals(temp.etiqueta) ? true:false;
	}

	@Override
	public boolean isLessThan(Node node) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String toString() {
		
		return ("etiqueta: "+this.etiqueta );

	}

}
