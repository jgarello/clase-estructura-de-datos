package trabajo_parcial;
import java.util.*;
import java.io.*;
public class mercado {
	public static void main(String[] args) {
		System.gc();
		
		try
		{
			BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
			BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
		
		int amounts[]=new int[10];
		int price[]=new int[]{3000,2000,4000,5000,2000,1000,2000,4000,15000,8000};
		bw.write("cuantos productos va a llevar : ");
		bw.flush();
		int items= Integer.parseInt( br.readLine());
	
		for (int i = 0; i < items; i++) {
		bw.write("Productos disponibles : "+"\n" +"1: LECHE $3.000"+"\n" +"2: PAN $2.000"
		+"\n"+"3: NARANJAS $4.000"+"\n"+"4: GALLETAS $5.000"+"\n"+"5: ARROZ $2.000"
		+"\n"+"6: LENTEJAS $1.000"+"\n"+"7: SHAMPOO $2.000"+"\n"+"8: MANTEQUILLA $4.000"+"\n"
		+"9: CARNE $15.000"+"\n"+"10: POLLO $8.000"+"\n"+"Favor seleccione los productos que desea llevar:");
		bw.flush();
		int product_to_carry=Integer.parseInt( br.readLine());
		amounts[product_to_carry+1]=amounts[product_to_carry]+1;
		
	}
		int Total_price=0;
		for (int i = 0; i < amounts.length; i++) {
			if(amounts[i]>0) {
				Total_price=amounts[i]*price[i];
			}
		}
		bw.write(Total_price);
		bw.flush();

}
		catch(Exception ex) {
			ex.printStackTrace();
		}
}
}