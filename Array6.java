package domashya2;

public class Array6 {

	public static void main(String[] args) {
		/*
		 * Створіть масив з 4 випадкових цілих чисел з відрізка [10; 99],
		 * виведіть його на екран у рядок. Визначити і вивести на екран
		 * повідомлення про те, чи є масив строго зростаючої послідовністю
		 */

		int[] Arr = new int[4];

		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = (int) (Math.random() * 90 + 10);
			System.out.print(Arr[i] + " ");
		}

		for (int i = 0; i < Arr.length; i++) {

			if (i > 0) {
				if (Arr[i - 1] >= Arr[i]) {
					System.out.println("Послідовність не зростає");
					break;

				}
			}

			if (i == Arr.length - 1)
				System.out.println("Послідовність зростаюча");
		}
	}

}
