package objetos;

public class sorts {

	public static void main(String[] args) {
		int[]array=new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i]=array.length-i;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		margeSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}

	}
	public static void bubbleSort(int []array) {
		int temp;
		boolean  swapped=false;
		do{
			swapped=false;
			for (int i = 0; i < array.length-1; i++) {
				if(array[i]>array[i+1]) {
					temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
					swapped=true;
				}
			}
		}
		while(swapped);
	}
	public static void insertionSort(int[]array) {
		int index,temp;
		for (int i = 1; i < array.length; i++) {
			index=i;
			temp=array[i];
			while(index>0 &&temp < array[index-1] ) {
				array[index]=array[index-1];
				index-=1;
			}
			array[index]=temp;
		}
	}
	public static int[] margeSort(int[]array) {
		int size=array.length;
		if(size>1) {
			int size_par=size/2;
			int[]array1=new int[size];
			int[]array2=new int[size-size_par];
			for (int i = size_par; i < size; i++) {
				array2[i-size_par]=array[i];
			}
			for (int i = 0; i < size; i++) {
				array1[i]=array[i];
			}
			array1=margeSort(array1);
			array2=margeSort(array2);
			array=merge(array1,array2);
		}
		return array;
	}
	public static int[] merge(int[] array1, int[] array2) {
		int[]resp=new int[array1.length+array2.length];
		int indexA_1=0,index=0,indexA_2=0;
		
		while((indexA_1<array1.length)&&(indexA_2<array2.length)) {
			if(array1[indexA_1]<array2[indexA_2]) {
				resp[index]=array1[indexA_1];
				index+=1;
				indexA_1+=1;
			}else {
				resp[index]=array2[indexA_2];
				index+=1;
				indexA_2+=1;
			}
			if(indexA_1<array1.length) {
				for (int i = indexA_1 ; i < array1.length; i++) {
					resp[index]=array1[i];
					index+=1;
				}
			}else {
				for (int i = indexA_2 ; i < array2.length; i++) {
					resp[index]=array2[i];
					index+=1;
				}
			}
		
		}
		return resp;
	}
	}

