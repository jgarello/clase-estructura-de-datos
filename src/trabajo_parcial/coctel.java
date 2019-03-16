package trabajo_parcial;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
public class coctel {

	public static void main(String[] args) {
		try
		{
			BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
			BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
		
			double quantity[]=new double[] {2.0,4.0,0.5,2.0};
			String price[]=new String[]{"gin","agua tónica", "limón","Hielo"};
			bw.write("familiares en la reunion: ");
			bw.flush();
			int person=Integer.parseInt( br.readLine());
			for (int i = 0; i < quantity.length; i++) {
				quantity[i]=quantity[i]*person;
			}
			bw.write("para el gin tonic sera necesario");
			bw.flush();
			for (int i = 0; i < price.length; i++) {
				bw.write("\n"+i+") "+ "producto" +" "+ price[i]+" " +"necesario"+" " + quantity[i] );
				bw.flush();
			}
	}
		catch(Exception ex) {
			ex.printStackTrace();
		}
}
}
