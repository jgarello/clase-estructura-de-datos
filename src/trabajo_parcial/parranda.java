package trabajo_parcial;
import java.util.*;
public class parranda {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int precio[]=new int[] {3500,25000,30000};
		String cosas[]=new String[]{"cervezas","agua ardiente", "comida"};
		System.out.println("cuantas personas van");
		int persona=teclado.nextInt();
		int valor_comida=0,valor_cerveza=0,valor_aguardiente,valor_total=0;
		System.out.println("cuantas personas toman cerveza");
		int beer_person=teclado.nextInt();
		System.out.println("cuantas personas toman aguardiente");
		int aguardiente_person=teclado.nextInt();
		valor_comida=persona*precio[2];
		valor_cerveza=beer_person*precio[0];
		valor_aguardiente=aguardiente_person*precio[0];
		valor_total=valor_comida+valor_cerveza+valor_aguardiente;
		
		System.out.println("la comida costara"+valor_comida+ "la cerveza costara"+valor_cerveza+" el aguardiente costara"+valor_aguardiente+" el costo total sera"+valor_total);
	}

}
