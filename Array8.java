package domashya2;

public class Array8 {

	public static void main(String[] args) {
		/*
		 * Створіть масив з 12 випадкових цілих чисел з відрізка [-15; 15].
		 * Визначте який елемент є в цьому масиві максимальним і повідомте
		 * індекс його останнього входження в масив.
		 */

		int Arr[] = new int[12];
		int e = 0;
		int max = 0;
		for (int i = 0; i < Arr.length; i++) {
			if(i > 0.5){
				Arr[i] = (int) (Math.random() * 15);
			}else{
				Arr[i] = (int) (Math.random() * -15);
			}
			System.out.print(Arr[i] + "; ");
			if (i > 0 && Arr[i] > max) {
				e = i;
				max = Arr[i];
			}
		}
		System.out.println(" Максимальне число у масиві - " + max);
		System.out.println("Останнє входження у масив елемента - " + e);

	}
}
