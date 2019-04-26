package linealdata;
import java.io.*;
public class StringAsList {

	private List string = new List();
	
	/**
	 * 
	 */
	public StringAsList()
	{
		string = new List();
	}
	
	/**
	 * 
	 * @param string_
	 */
	public StringAsList(char[] string_)
	{
		string = new List();
				
		for(int i = 0; i < string_.length; i++)
			string.insertAtEnd(new StringNode( string_[i] ));
	}
	
	
	/**
	 * 
	 * @param newString
	 */
	public void concatenate(StringAsList newString)
	{
		string.insertAtEnd( newString.string.head );
	}
	
	
	/**
	 * 
	 * @param regex
	 * @return
	 */
	public StringAsList[] split(StringAsList regex)
	{
		Node temp=string.head;
		Node temp2=regex.string.head;
		int contador=0;
		int contador_lista1=0;
		while(!temp.equals(temp2)) {
			contador_lista1++;
			temp=temp.getNext();
			if(temp.equals(temp2)) {
				contador++;
			}
			if(contador<regex.length()) {
				temp2=temp2.getNext();
			}
		}
		List lista_pequeña=string.sublist(0, contador_lista1);
		
		StringAsList[] response = new StringAsList[lista_pequeña.length()];
		for (int i = 0; i < lista_pequeña.length(); i++) {
			response[i]=(StringAsList) lista_pequeña.get(i);
		}	
		return response; 
	}
	
	
	/**
	 * 
	 * @param regex
	 * @return
	 */
	public boolean contains(StringAsList regex)
	{
		return false;
	}
	
	
	/**
	 * 
	 * @param beginIndex
	 * @return
	 */
	public StringAsList substring(int beginIndex)
	{
		StringAsList subString = new StringAsList();
		subString.string = this.string.sublist(beginIndex);
		return subString;
	}
	
	
	/**
	 * 
	 * @param beginIndex
	 * @param endIndex
	 * @return
	 */
	public StringAsList substring(int beginIndex, int endIndex)
	{
		StringAsList subString = new StringAsList();
		subString.string = this.string.sublist(beginIndex, endIndex);
		return subString;
	}
	
	
	/**
	 * 
	 * @param regex
	 * @return
	 */
	public int indexOf(StringAsList regex)
	{
		return 0; 
	}
	
	
	/**
	 * 
	 * @param string_
	 * @return
	 */
	public boolean equals(StringAsList string_)
	{
		return this.string.equals( string_.string );
	}
	
	
	/**
	 * 
	 * @return
	 */
	public int length()
	{
		return this.string.length();
	}
	
	
	/**
	 * 
	 * @return
	 */
	public StringAsList reverse()
	{
		StringAsList reverse = new StringAsList();
		reverse.string = this.string.cloneList();
		reverse.string.reverse();

		return reverse;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public boolean isPalindrome()
	{
		return false;
	}
	
	
	/**
	 * 
	 * @param anagramCandidate
	 * @return
	 */
	public boolean isAnagram(StringAsList anagramCandidate)
	{
		return false;
	}
	
	
	public void print()
	{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringNode temp = (StringNode)string.head;
			
		try 
		{
			while(temp != null)
			{
				bw.write(temp.character);
				temp = (StringNode)temp.getNext();
			}
			bw.flush();
		}
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}
	}
}