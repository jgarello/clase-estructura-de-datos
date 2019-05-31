package proyecto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class representacion {
	public static grafo solution(String archivo) throws IOException {
		String cadena;
	      FileReader f = new FileReader(archivo);
	      BufferedReader b = new BufferedReader(f);
	      grafo graph = new grafo();
	      while((cadena = b.readLine())!=null) {
	          String[]arreglo=cadena.split(" ");
	          nodo nuevo=new nodo(arreglo[0]+"");
	          nodo nuevo2=new nodo(arreglo[1]+"");
	          nuevo.nodos.insertAtBegin(nuevo2);
	          graph.añadirnodo(nuevo);
			
	       
	      }
	      b.close();
	
        return graph;
	}

public static void main(String[] args) throws IOException {
        grafo graph = solution("C:\\Users\\julian\\Desktop\\prueba.txt");

        for (int i = 0; i < graph.getNodos().length(); i++) {
            System.out.println(graph.getNodos().get(i));
    }
}
}