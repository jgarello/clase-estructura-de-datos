package proyecto;

import linealdata.List;

public class grafo {
 public List nodos;
 public void añadirnodo(nodo node) {
     if (nodos == null) {
         nodos = new List();
     }else {
    	 if(nodos.linealSearch(node)==null){
    	 nodos.insertAtEnd(node);
    	 }
    	 
     }
     }
 

public List getNodos() {
	return nodos;
}
public void setNodos(List nodos) {
	this.nodos = nodos;
} 
public String toString() {
	nodos.printList();
    return " ";
}
}
