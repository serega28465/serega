package domashnya1;

public class IfElse {

	public static void main(String[] args) {
		// Створити програму, що перевіряє і повідомляє на екран, чи є ціле
		// число записане в змінну n, парним або непарним

		for (int n = 0; n < 100; n++) {

			if (n % 2 <= 0) {
				System.out.println( n + " - парне число");
			} else {
				System.out.println( n + " - непарне число");
			}
		}

	}

}
