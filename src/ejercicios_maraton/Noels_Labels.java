package ejercicios_maraton;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Noels_Labels {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
	BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
	HashMap <String,String> hash=new HashMap<String,String>();
	int casos =Integer.parseInt(br.readLine());
	for (int i = 0; i < casos; i++) {
		hash.put(br.readLine(), br.readLine());
	}
	int casos_2=Integer.parseInt(br.readLine());
	for (int i = 0; i <  casos; i++) {
		String nombre=br.readLine();
		String clave=br.readLine();
		bw.write(nombre);
		bw.write('\n');
		bw.write(hash.get(clave));
		bw.flush();
	}
}
}
