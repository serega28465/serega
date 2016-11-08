package domashnya1;

public class IfElse1 {

	public static void main(String[] args) {
		//  Створити програму, що виводить на екран найближче до 10 з двох
		//чисел, записаних в змінні m і n. Наприклад, серед чисел 8,5 і 11,45
		//найближче до десяти 11,45.
		for (int m = 3, n = 2; m < 100 && n < 100 ;n++, m++) {
			if(m>10 || n>10){
				System.out.println(m + " - найближче до 10");
				System.out.println(n + " - найближче до 10 ");
			}
		}
		
		
	}
}
