package proyecto2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class representacion {

	public static grafo solution(String archivo) throws IOException {
		String cadena;
	      FileReader f = new FileReader(archivo);
	      BufferedReader b = new BufferedReader(f);
	      grafo graph = new grafo();
	      cadena=b.readLine();
	      while(cadena !=null) {
	          String[]arreglo=cadena.split(" ");
	          nodografo nuevo=new nodografo(arreglo[0]+"");
	          nodoconexion nuevo2=new nodoconexion(arreglo[1]+"");
	          if (graph.nodos.binarySearch(nuevo)==-1) {
	        	  graph.añadirnodo(nuevo);
	        	  nuevo.conexiones.insertAtEnd(nuevo2);
			}else {
				int posicion = graph.nodos.binarySearch(nuevo);
				nodografo c=(nodografo)graph.nodos.get(posicion);
				c.conexiones.insertAtBegin(nuevo2);
			}
	          
	          
	        
			cadena=b.readLine();
	       
	      }
	      b.close();
	
        return graph;
	}
	
	public static int lista_larga(grafo graph) {
		nodografo tempmayor=(nodografo)graph.nodos.get(0);
		int mayor=tempmayor.conexiones.length();
		int j=0;
		for (int i = 0; i < graph.nodos.length(); i++) {
			if(i!=3564) {
				
			
			nodografo temp=(nodografo)graph.nodos.get(i);
			int mayor2=temp.conexiones.length();
			if(mayor2>mayor) {
				mayor=mayor2;
				j=i;
			}
		}
		}
		return j;

	}
public static void main(String[] args) throws IOException {
        grafo graph = solution("C:\\Users\\julian\\Desktop\\1111");
        graph.imprimir();
      
    

}
}

