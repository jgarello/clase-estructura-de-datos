package proyecto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import ejercicios_maraton.Jingle_Composing.parentesis;
import  linealdata.*;
public class nodo  implements Node{
 public String etiqueta;
 public List nodos;
 public nodo next = null;
	
	public nodo(String etiqueta)
	{
		this.etiqueta=etiqueta;
		this.nodos=new List();
		
	}

	
public String getEtiqueta() {
		return etiqueta;
	}


	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}


	public List getNodos() {
		return nodos;
	}


	public void setNodos(List nodos) {
		this.nodos = nodos;
	}
	public void añadirborde(edge edge) {
        if (nodos == null) {
            nodos = new List();
        }
        nodos.insertAtBegin(edge);
    }
	public String toString() {
		nodos.printList();
        return "\n " +"soy el nodo"+ etiqueta ;
    }
@Override
public void setNext(Node node) {
	this.next = (nodo)node;
	
}

@Override
public Node getNext() {
	return this.next;
}

@Override
public Node clone() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean isEqual(Node node) {
	
	return this.etiqueta.equals(node);
}

@Override
public boolean isLessThan(Node node) {
	// TODO Auto-generated method stub
	return false;
}
 
}
