package domashya2;

public class Array1 {

	public static void main(String[] args) {
		/*
		 * Створіть масив з усіх парних чисел від 2 до 20 і виведіть
		*	елементи масиву на екран спочатку в рядок, відокремлюючи один елемент
		*	від іншого прогалиною, а потім в стовпчик (відокремлюючи один елемент
		*	від іншого початком нового рядка). Перед створенням масиву подумайте,	
		*	якого він буде розміру.
		*
		*	2 4 6 … 18 20
		*	2
		*	4
		*	6
		*	…
		*	20
		 */
		
		int a = 0;
		for (int i = 2; i <= 20; i++) {
			if(i%2==0)a++;
		}
		
		int[] Arr = new int[a];
		for(int i = 2, b = 0; i <= 20; i++){
			if(i%2 == 0){
				Arr[b] = i;
				System.out.print(Arr[b] + " ");
				b++;
			}
		}
		System.out.println(" ");
		for (int i = 0; i < Arr.length; i++) {
			System.out.println(Arr[i]);
		}
	}

}
