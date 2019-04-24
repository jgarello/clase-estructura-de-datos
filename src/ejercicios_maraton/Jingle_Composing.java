package ejercicios_maraton;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import ejercicios_maraton.Parenthesis_Balance_I.parentesis;
import  linealdata.*;
public class Jingle_Composing {
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
	public Jingle_Composing() {}
	public int solution() {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		
		return 0;
		
	}
	public double cantidad() {
		return 0;
		
	}
	public static void main(String[] args) {
		
	}
}
