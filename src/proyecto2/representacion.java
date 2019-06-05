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
	public static int[] particion(grafo graph ,int muestra){
		int[] arreglo=new int[5];
		if(muestra==2) {
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
		}else {
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
	}
	
	public static int promedio(grafo graph,int muestra) {
		nodografo tempmayor=(nodografo)graph.nodos.head;
		int acumulador=0;
		if(muestra==2) {
			while (tempmayor!=null) {

				if(tempmayor.conexiones.length()<=50) {

					acumulador=acumulador+tempmayor.conexiones.length();
				}
				tempmayor=tempmayor.next;
			}

			int[]arreglo=particion(graph,2);
			return acumulador/arreglo[0];
		}else {
			while (tempmayor!=null) {

				acumulador=acumulador+tempmayor.conexiones.length();

				tempmayor=tempmayor.next;
			}

			return acumulador/graph.nodos.length();
		}
	}
	public static double desviacion(grafo graph,int muestra) {
		nodografo tempmayor=(nodografo)graph.nodos.head;
		int acumulador=0;

		if(muestra==2) {


			int media=promedio(graph,2);

			while (tempmayor!=null) {
				int valor=0;
				if(tempmayor.conexiones.length()<=50) {
					valor=(int)Math.pow(tempmayor.conexiones.length()-media, 2);
					acumulador=acumulador+valor;
				}
				tempmayor=tempmayor.next;
			}
			int[]arreglo=particion(graph,2);
			double desviacion_estandar=Math.sqrt(acumulador/arreglo[0]);

			return desviacion_estandar;
		}else {

			int media=promedio(graph,1);

			while (tempmayor!=null) {
				int valor=0;

				valor=(int)Math.pow(tempmayor.conexiones.length()-media, 2);
				acumulador=acumulador+valor;
				tempmayor=tempmayor.next;
			}

			double desviacion_estandar=Math.sqrt(acumulador/graph.nodos.length());

			return desviacion_estandar;
		}
	}
	public static double coeficiente(grafo graph, int muestra) {
		nodografo tempmayor=(nodografo)graph.nodos.head;
		if(muestra==2) {


			double acumulador=desviacion(graph,2);
			int media=promedio(graph,2);
			return  (acumulador/media)*100;
		}else {

			double acumulador=desviacion(graph,1);
			int media=promedio(graph,1);
			return  (acumulador/media)*100;	
		}

	}
	public static void main(String[] args) throws IOException {
		grafo graph = solution("C:\\Users\\julian\\Desktop\\1111");
		
		System.out.println();
		System.out.println(graph.nodos.length()+" longitud grafo");
		//		System.out.println(lista_mayor(graph)+" MAYOR CONEXION DEL GRAFO");
		//		int[]arreglo=particion(graph);
		//		for (int i = 0; i < arreglo.length; i++) {
		//			if(i<4)
		//				System.out.println(arreglo[i]+" GENTE ENTRE "+ i*50+ " Y "+(i+1)*50);
		//			else {
		//				System.out.println(arreglo[i]+" GENTE MAYOR A Y "+(i+1)*50);
		//			}
		//
		//		}
int arreglo=1;
		if(arreglo==2) {
			
		
		int[]arreglo2=particion(graph,2);
		for (int i = 0; i < arreglo2.length; i++) {
			if(i<4)
				System.out.println(arreglo2[i]+" personas entre "+ i*10+ " Y "+(i+1)*10+" conexiones");
			else {
				System.out.println(arreglo2[i]+" personas mayor a "+(i)*10+" conexiones");
			}
		}
		
		System.out.println("Coeficiente "+coeficiente(graph,2));
		System.out.println("Desviacion "+desviacion(graph,2));
		System.out.println("Promedio "+promedio(graph,2));
		}else {
			int[]arreglo2=particion(graph,1);
			for (int i = 0; i < arreglo2.length; i++) {
				if(i<4)
					System.out.println(arreglo2[i]+" personas entre "+ i*50+ " Y "+(i+1)*50+" conexiones");
				else {
					System.out.println(arreglo2[i]+" personas mayor a "+(i)*50+" conexiones");
				}
			}
			System.out.println( "la conexion mas grande "+lista_mayor(graph));
			System.out.println("Coeficiente "+coeficiente(graph,1));
			System.out.println("Desviacion "+desviacion(graph,1));
			System.out.println("Promedio "+promedio(graph,1));
		}

	}
}

