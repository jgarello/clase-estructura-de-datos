package trabajo_parcial;
import java.util.*;
public class mercado {
	public static void main(String[] args) {
		int cantidades[]=new int[10];
		int precio[]=new int[]{3000,2000,4000,5000,2000,1000,2000,4000,15000,8000};
		Scanner teclado=new Scanner(System.in);
		System.out.println("cuantos productos va a llevar : ");
		int productos=teclado.nextInt();
	
		for (int i = 0; i < productos; i++) {
		System.out.println("Productos disponibles : ");
		System.out.println("1: LECHE $3.000");
		System.out.println("2: PAN $2.000");
		System.out.println("3: NARANJAS $4.000");
		System.out.println("4: GALLETAS $5.000");
		System.out.println("5: ARROZ $2.000");
		System.out.println("6: LENTEJAS $1.000");
		System.out.println("7: SHAMPOO $2.000");
		System.out.println("8: MANTEQUILLA $4.000");
		System.out.println("9: CARNE $15.000");
		System.out.println("10: POLLO $8.000");
		System.out.println("Favor seleccione los productos que desea llevar:");
		int producto_a_llevar=teclado.nextInt();
		cantidades[producto_a_llevar+1]=cantidades[producto_a_llevar]+1;
		
	}
		int valor_mercado=0;
		for (int i = 0; i < cantidades.length; i++) {
			if(cantidades[i]>0) {
				valor_mercado=cantidades[i]*precio[i];
			}
		}
		System.out.println(valor_mercado);

}
}