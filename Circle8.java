package domashnya1;

import java.util.Scanner;
public class Circle8 {

	public static void main(String[] args) {
		//  Виведіть на екран всі позитивні подільники натурального числа,
		// введеного користувачем з клавіатури
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть натуральне число");
		if(sc.hasNextInt()){
			n=sc.nextInt();
			System.out.println(" Подільниками числа " + n + " є ");
			
			for(int i = n; i > 0; i--){
				int a = n % i;
				if(a==0)
					System.out.print(i + " ");
			}
		}else{
			System.out.println("Помилка. Символ, введений з клавіатури не є числом");
		}
		sc.close();
	}

}
