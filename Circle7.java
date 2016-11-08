package domashnya1;

import java.util.Scanner;
public class Circle7 {

	public static void main(String[] args) {
		//  Створіть програму, яка обчислює факторіал натурального числа n,
		// яке користувач введе з клавіатури
		int n;
		int a = 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Введіть число");
		if(sc.hasNextInt()){
			n=sc.nextInt();
			for (int i = n; i > 0; i--) {
				a*=i;
			}
			System.out.println(" Факторіал числа "+ n + " дорівнює " + a );
		} else{
			System.out.println("Помилка. Введений елемент не є числом або перевищує допустиме значення");
		}
		sc.close();
	}

}
