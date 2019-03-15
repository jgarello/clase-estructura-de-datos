package trabajo_parcial;
import java.util.*;
public class parranda {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int precio[]=new int[] {3500,25000,30000};
		String cosas[]=new String[]{"cervezas","agua ardiente", "comida"};
		System.out.println("pcuantan personas van");
		int persona=teclado.nextInt();
		int valor=0;
		for (int i = 0; i < cosas.length; i++) {
			valor=valor+precio[i]*persona;
		}
		valor=valor/persona;
		System.out.println("cada persona tiene que poner"+valor);
	}

}
