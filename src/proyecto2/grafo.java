package proyecto2;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

import linealdata.List;


public class grafo {
	 public List nodos;
	 public grafo() {
		this.nodos=new List();
	 }
	 public void añadirnodo(nodografo node) {
	    nodos.insertAtBegin(node);
	 }

	public List getNodos() {
		return nodos;
	}
	public void setNodos(List nodos) {
		this.nodos = nodos;
	} 
	public String toString() {
		
	    return "grafo [nodos="+nodos+"]";
	}
	
	public void imprimir() {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		nodografo temp=(nodografo)this.nodos.head;
		try {
			
			while(temp!=null) {
				bw.write(temp.toString()+" ");
				bw.flush();
				temp.conexiones.printList();
				bw.write(" \n");
				temp=(nodografo)temp.getNext();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
}
}
