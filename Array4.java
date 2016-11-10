package domashya2;

public class Array4 {

	public static void main(String[] args) {
		/*
		 * Створіть масив з 8 випадкових цілих чисел з відрізка [1; 10].
		 * Виведіть масив на екран у рядок. Замініть кожен елемент з непарним
		 * індексом на нуль. Знову виведете масив на екран на окремому рядку.
		 */
		
		int[] Arr = new int[8];
		for(int i = 0; i < Arr.length; i++){
			Arr[i]=(int)(Math.random()*10-1);
			System.out.print(Arr[i] + " ");
		}
		System.out.println(" ");
		for (int i = 0; i < Arr.length; i++) {
			if(Arr[i]%2!=0)Arr[i]=0;
			System.out.print(Arr[i] + " ");
		}
	}

}
