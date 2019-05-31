package proyecto;

import linealdata.List;

public class grafo {
 public List nodos;
 public void añadirnodo(nodo node) {
     if (nodos == null) {
         nodos = new List();
     }
    nodos.insertAtBegin(node);
     }
     
 

public List getNodos() {
	return nodos;
}
public void setNodos(List nodos) {
	this.nodos = nodos;
} 
public String toString() {
	nodos.printList();
    return "grafo [nodos="+nodos+"]";
}
}
