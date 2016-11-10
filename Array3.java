package domashya2;

public class Array3 {

	public static void main(String[] args) {
		/*
		 * Створіть масив з 15 випадкових цілих чисел з відрізка [0; 9].
		 * Виведіть масив на екран. Підрахуйте скільки в масиві парних елементів
		 * і виведете цю кількість на екран на окремому рядку
		 */
		int b = 0;
		int[] Arr = new int[15];
		for(int i = 0; i < Arr.length; i++){
			Arr[i] = (int) Math.round(Math.random()*(10/2));
			double rand = Math.random();
			System.out.print(Arr[i] + " ");
			if(Arr[i]>0 && Arr[i]%2 == 0)b++;
		}
		System.out.println(" ");
		System.out.println("Всього " + b + " парних елементів");
	}

}
