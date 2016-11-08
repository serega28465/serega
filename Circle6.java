package domashnya1;

public class Circle6 {

	public static void main(String[] args) {
		// Виведіть на екран всі двозначні члени послідовності 2a+200, де a1 =
		// -166
		for (int a = -166; a < 100; a = 2 * a + 200) {
			if (a > -100) {
				System.out.println(a);
			}
		}
		System.out.println("Більше двозначних елементів послідовності нема");
	}

}
