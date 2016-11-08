package domashnya1;

public class Cirle2 {

	public static void main(String[] args) {
		// Створіть програму, що виводить на екран перші 55 елементів
		// послідовності 1 3 5 7 9 11 13 15 17
		
		for (int a = 1, i=0;i<55 && a < 1000; a=a+2, i++) {
			System.out.println(a);
		}
		System.out.println("Кількість елементів досягла 55-ти");
	}

}
