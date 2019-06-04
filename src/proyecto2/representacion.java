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

	public static  int lista_mayor(grafo graph) {
		nodografo tempmayor=(nodografo)graph.nodos.head;
		int mayor=tempmayor.conexiones.length();
		String etiqueta=tempmayor.etiqueta;
		while (tempmayor!=null) {
			if(tempmayor.conexiones.length()>mayor  ) {
				mayor=tempmayor.conexiones.length();
				etiqueta=tempmayor.etiqueta;
			}
			tempmayor=tempmayor.next;
		}
		return mayor;

	}
	public static int[] particion(grafo graph){
		int[] arreglo=new int[5];
		nodografo tempmayor=(nodografo)graph.nodos.head;
		int contador1=0,contador2=0,contador3=0,contador4=0,contador5=0;

		while (tempmayor!=null) {

			if(tempmayor.conexiones.length()<=50) {
				contador1++;
			}else if(tempmayor.conexiones.length()>50&&tempmayor.conexiones.length()<=100) {
				contador2++;
			}else if(tempmayor.conexiones.length()>100&&tempmayor.conexiones.length()<=150) {
				contador3++;
			}else if(tempmayor.conexiones.length()>150&&tempmayor.conexiones.length()<=200) {
				contador4++;
			}else if(tempmayor.conexiones.length()>200) {
				contador5++;
			}

			tempmayor=tempmayor.next;
		}
		arreglo[0]=contador1;
		arreglo[1]=contador2;
		arreglo[2]=contador3;
		arreglo[3]=contador4;
		arreglo[4]=contador5;


		return arreglo;

	}
	public static int[] particion2(grafo graph){
		int[] arreglo=new int[5];
		nodografo tempmayor=(nodografo)graph.nodos.head;
		int contador1=0,contador2=0,contador3=0,contador4=0,contador5=0;

		while (tempmayor!=null) {

			if(tempmayor.conexiones.length()<=10) {
				contador1++;
			}else if(tempmayor.conexiones.length()>10&&tempmayor.conexiones.length()<=20) {
				contador2++;
			}else if(tempmayor.conexiones.length()>20&&tempmayor.conexiones.length()<=30) {
				contador3++;
			}else if(tempmayor.conexiones.length()>30&&tempmayor.conexiones.length()<=40) {
				contador4++;
			}else if(tempmayor.conexiones.length()>40 &&tempmayor.conexiones.length()<=50 ) {
				contador5++;
			}

			tempmayor=tempmayor.next;
		}
		arreglo[0]=contador1;
		arreglo[1]=contador2;
		arreglo[2]=contador3;
		arreglo[3]=contador4;
		arreglo[4]=contador5;

		return arreglo;

	}

	public static int promedio(grafo graph) {
		nodografo tempmayor=(nodografo)graph.nodos.head;
		int acumulador=0;

		while (tempmayor!=null) {



			acumulador=acumulador+tempmayor.conexiones.length();

			tempmayor=tempmayor.next;
		}


		return acumulador/graph.nodos.length();

	}
	public static double desviacion(grafo graph) {
		nodografo tempmayor=(nodografo)graph.nodos.head;
		int acumulador=0;
		int media=promedio(graph);

		while (tempmayor!=null) {
			int valor=0;

			valor=(int)Math.pow(tempmayor.conexiones.length()-media, 2);
			acumulador=acumulador+valor;

			tempmayor=tempmayor.next;
		}
		double desviacion_estandar=Math.sqrt(acumulador/3171);

		return desviacion_estandar;

	}
	public static double coeficiente(grafo graph) {
		nodografo tempmayor=(nodografo)graph.nodos.head;
		double acumulador=desviacion(graph);
		int media=promedio(graph);
		return  (acumulador/media)*100;

	}
	public static void main(String[] args) throws IOException {
		grafo graph = solution("C:\\Users\\57314\\Desktop\\grafo");
		graph.imprimir();
		System.out.println();
		System.out.println(graph.nodos.length()+" longitud grafo");
		System.out.println(lista_mayor(graph)+" MAYOR CONEXION DEL GRAFO");
		int[]arreglo=particion2(graph);
		for (int i = 0; i < arreglo.length; i++) {
			if(i<4)
			System.out.println(arreglo[i]+" GENTE ENTRE 0 Y "+(i+1)*50);
			else {
				System.out.println(arreglo[i]+" GENTE MAYOR A Y "+(i+1)*50);
			}
			
		}
		System.out.println("coeficiente "+coeficiente(graph));
		System.out.println("desviacion "+desviacion(graph));
		System.out.println(" promedio "+promedio(graph));
		System.out.println(" MAS EN PROFUNDIDAD");
		int[]arreglo2=particion2(graph);
		for (int i = 0; i < arreglo.length; i++) {
			if(i<4)
			System.out.println(arreglo[i]+" GENTE ENTRE 0 Y "+(i+1)*10);
			else {
				System.out.println(arreglo[i]+" GENTE MAYOR A Y "+(i)*50);
			}
		}
		

	}
}

