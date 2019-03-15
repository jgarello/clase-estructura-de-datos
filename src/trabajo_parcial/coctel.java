package trabajo_parcial;
import java.util.*;
public class coctel {

	public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	double cantidad[]=new double[] {2.0,4.0,0.5,2.0};
	String precio[]=new String[]{"gin","agua tónica", "limón","Hielo"};
	System.out.println("familiares en la reunion: ");
	int personas=teclado.nextInt();
	for (int i = 0; i < cantidad.length; i++) {
		cantidad[i]=cantidad[i]*personas;
	}
	 System.out.println("para el gin tonic sera necesario");
	for (int i = 0; i < precio.length; i++) {
	
		System.out.println(i+") "+ "producto" +" "+ precio[i]+" " +"necesario"+" " + cantidad[i] );
	}
	}
}
