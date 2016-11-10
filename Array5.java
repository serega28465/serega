package domashya2;

public class Array5 {

	public static void main(String[] args) {
		/*
		 * Створіть 2 масиви з 5 випадкових цілих чисел з відрізка [0; 5] кожен,
		 * виведіть масиви на екран у двох окремих рядках. Порахуйте середнє
		 * арифметичне елементів кожного масиву і повідомте, для якого з масивів
		 * це значення виявилося більше (або повідомте, що їх середні
		 * арифметичні рівні)
		 */
		
		double Arr1sa = 0, Arr2sa = 0;
		
		int[] Arr1 = new int[5];
		for(int i = 0; i < Arr1.length;i++){
			Arr1[i]=(int)(Math.random()*6);
			System.out.print(Arr1[i] + " ");
			
			Arr1sa+=(double)Arr1[i]/Arr1.length;
		}
		System.out.println(" - Перший масив");
		
		int[] Arr2 = new int[5];
		for(int i = 0; i < Arr2.length;i++){
			Arr2[i]=(int)(Math.random()*6);
			System.out.print(Arr2[i] + " ");
			
			Arr2sa+=(double)Arr2[i]/Arr2.length;
		}
		System.out.println(" - Другий масив");
		if(Arr1sa==Arr2sa)System.out.println("Середні арифметичні двох масивів рівні");
			else{if(Arr1sa>Arr2sa){
				System.out.println("Середні арифметичні значення першого масиву більше");
						}else{
							System.out.println("Середні арифметичні значення другого масиву більше");
						}
				
					}
				}
	}


