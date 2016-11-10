package domashya2;

public class Array1 {

	public static void main(String[] args) {
		/*
		 * —оздайте массив из всех чЄтных чисел от 2 до 20 и выведите элементы
		 * массива на экран сначала в строку, отдел€€ один элемент от другого
		 * пробелом, а затем в столбик (отдел€€ один элемент от другого началом
		 * новой строки). ѕеред созданием массива подумайте, какого он будет
		 * размера. 2 4 6 Е 18 20 2 4 6 Е 20
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
