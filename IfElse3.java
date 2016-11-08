package domashnya1;

public class IfElse3 {

	public static void main(String[] args) {
		// У три змінні a, b і c записані три дійсних числа. Створити
		// програму, яка буде знаходити і виводити на екран речові коріння
		// квадратного рівняння ax² + bx + c = 0, або повідомляти, що коріння
		// немає.

		double a = 1;
		double b = 2;
		double c = 0;
		double x;
		double des = (b * b) - (4 * a * c);
		if (des < 0) {
			System.out.println("Коренів нема");
		} else {
			if (des > 0) {
				System.out.println("Рівняння має два корені");
				x = (Math.sqrt(des) - b) / 2 * a;
				System.out.println("x1 = " + x);
				x = (Math.sqrt(des) + b) / 2 * a;
				System.out.println("x2 = " + x);
			} else {
				x = -b / (2 * a);
				System.out.println("Рівняння має один корінь");
				System.out.println("x = " + x);
			}

		}
		;

	}

}
