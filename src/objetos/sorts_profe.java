package objetos;

import java.util.Random;
import java.io.*;

public class sorts_profe {

	public static int[] quickSort(int[] array, int index)
	{
		if(array.length > 0)
		{	
			int pivot = array[0];
			
			int index_less = 0, index_greater = 0, index_result = 0;
			int[] less_array = new int[array.length];
			int[] greater_array = new int[array.length];
			int[] result = new int[array.length];
			
			
			for(int i = 0; i < index_less; i++)
			{
				result[index_result] = less_array[i];
				index_result += 1;
			}
			
			result[index_result] = pivot;
			index_result += 1;
			
			for(int i = 0; i < index_greater; i++)
			{
				result[index_result] = greater_array[i];
				index_result += 1;
			}
			
			return result;
		}
		else
			return array;
	}
	

	/**
	 * 
	 * @param array
	 * @param value
	 * @param upperBound
	 * @param lowerBound
	 * @return
	 */
	public static int binarySearch(int[] array, int value, int lowerBound, int upperBound)
	{
		int middle = (lowerBound + upperBound) / 2;
		
		if(lowerBound > upperBound)
			return -1;
		else	
			if(array[middle] == value)
				return middle;
			else
				if(value < array[middle])
					return binarySearch(array, value, lowerBound, middle - 1);
				else
					return binarySearch(array, value, middle + 1, upperBound);
	}
	
	
	/**
	 * 
	 * @param size
	 * @return
	 */
	public static int[] generateArrays(int size)
	{
		int[] array = new int[size];
		
		Random rd = new Random();
		for(int i = 0; i < size; i++)
			array[i] = rd.nextInt(20);
		
		return array;
	}
	
	
	/**
	 * 
	 * @param experiments
	 * @param array_sizes
	 */
	public static void run_experiments(int experiments, int[] array_sizes)
	{
		int[] array_data = null;
		
		double time_start = 0.0, time_end = 0.0;
		double[] time_results = new double[experiments];
		
		for(int m = 0; m < array_sizes.length; m++)
		{
			array_data = generateArrays( array_sizes[m] );
			for(int i = 0; i < experiments; i++)
			{
				time_start = System.nanoTime();
				quickSort(array_data, array_data.length);
				time_end = System.nanoTime();
				
				time_results[i] = (time_end - time_start) * Math.pow(10,9);
			}
		
			printArray(time_results);
		}
	}
	
	
	/**
	 * 
	 * @param array
	 */
	public static void printArray(double[] array)
	{
		try
		{
			FileWriter fw = new FileWriter("Vagos.csv");
			//BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
			BufferedWriter bw = new BufferedWriter( fw );
			
			for(int i = 0; i < array.length; i++)
				bw.write(array[i] + ",");
			
			bw.write("\n");
			bw.flush();
			bw.close();
		}
		catch(Exception ex) {}
	}
	
	public static void printArray(int[] array)
	{
		try
		{
			BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
			
			for(int i = 0; i < array.length; i++)
				bw.write(array[i] + ",");
			
			bw.write("\n");
			bw.flush();
			bw.close();
		}
		catch(Exception ex) {}
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.gc();
		
		try
		{
			BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
			BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
		
			int[] array = generateArrays(15);
			//printArray(array);
			bw.write( binarySearch(array, 10, 0, array.length - 1) + "\n" );
			
			int experiments = 0;
			int[] array_sizes = null;
			String[] sizes = null;
			
			bw.write("Defina la cantidad de experimentos: ");
			bw.flush();
			experiments = Integer.parseInt( br.readLine() );
			
			bw.write("Ingrese los tamanios de los arreglos (separados por coma y sin espacio): ");
			bw.flush();
			
			sizes = br.readLine().split(",");
			array_sizes = new int[sizes.length];
			for(int i = 0; i < sizes.length; i++)
				array_sizes[i] = Integer.parseInt( sizes[i] );
			
			run_experiments(experiments, array_sizes);
			
		}
		catch(Exception ex) {}

	}

}