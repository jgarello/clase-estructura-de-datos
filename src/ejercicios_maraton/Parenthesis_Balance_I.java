package ejercicios_maraton;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import  linealdata.*;
public class Parenthesis_Balance_I {
	public class parentesis implements Node
	{
		public String name = "";
		
		public parentesis next = null;
		
		public parentesis(String name_)
		{
			this.name = name_;
			
		}
		
		@Override
		public void setNext(Node node) 
		{
			this.next = (parentesis)node;
		}

		@Override
		public Node getNext() 
		{
			return this.next;
		}

		@Override
		public Node clone() 
		{
			return new parentesis(name);
		}

		@Override
		public boolean isEqual(Node node) 
		{
			parentesis temp = (parentesis)node;
			return (Boolean) null;
		}

		@Override
		public boolean isLessThan(Node node) {
			// TODO Auto-generated method stub
			return false;
		}
		
	}
	public Parenthesis_Balance_I() {}
	
	public void solution() {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		Stack pila=new Stack();
		try
		{
			
			while(br.readLine()!=null) {
					
				
			
			String[] lectura=br.readLine().split("");
			
			for (int i = 0; i < lectura.length; i++) {
				if(lectura[i].equals("(")) {
					
					pila.push(new parentesis(lectura[i]));
				}
				if(lectura[i].equals(")")){
					if(!pila.isEmpty()){
						pila.pop();
					}else{
						pila.push(new parentesis(lectura[i]));
					}
				}
		}
			
		
			if(pila.isEmpty()) {
				bw.write ("correcto"+"/");
				bw.flush();
			}else {
				bw.write ("incorrecto"+"/");
				bw.flush();
			}
		}
		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		Parenthesis_Balance_I problem = new Parenthesis_Balance_I();
		problem.solution() ;
			
	}

}
