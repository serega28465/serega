package domashya2;

public class Array2 {

	public static void main(String[] args) {
		/*
		 * Створіть масив з усіх непарних чисел від 1 до 99, виведіть його на
		 * екран у рядок, а потім цей же масив виведіть на екран теж в рядок,
		 * але в зворотному порядку (99 97 95 93 ... 7 5 3 1)
		 */
		
		int a = 0;
		for (int i = 1; i <= 99; i++) {
			if(i%2!=0)a++;
		}
		int[] Arr = new int[a];
		for(int i = 1, b = 0; i<=99; i++){
			if(i%2 != 0){
				Arr[b] = i;
				System.out.print(Arr[b] + " ");
				b++;
			}
		}
		System.out.println("");
		for (int i = Arr.length-1;i>=0;i--){
			System.out.print(Arr[i] + " ");
		}
	}

}

