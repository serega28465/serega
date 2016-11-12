package domashya2;

public class Array10 {

	public static void main(String[] args) {
		/*
		 * Створіть масив з 11 випадкових цілих чисел з відрізка [-1; 1],
		 * виведіть масив на екран у рядок. Визначте який елемент зустрічається
		 * в масиві найчастіше і виведіть про це повідомлення на екран. Якщо два
		 * якихось елемента зустрічаються однакову кількість разів, то не
		 * виводьте нічого
		 */
		
		int am = 0;
		int an = 0;
		int a1 = 0;
		
		int[] ara = new int[11];
		for (int i = 0; i < ara.length; i++) {
			ara[i] = (int)(Math.random()*3)-1;
			System.out.print(ara[i] + " ");
			if(ara[i] > 0) {
				am++;
				}
			if(ara[i] == 0){ 
				an++;
			}
			if(ara[i] < 0) {
				a1++;
			}
			
			if(i==ara.length-1){
				if(a1>an&&a1>am){
					System.out.println("Найчастіше зустрічається число -1");
				}
				if(an>a1&&an>am){
					System.out.println("Найчастіше зустрічається число 0");
				}
				if(am>a1&&am>an){
					System.out.println("Найчастіше зустрічається число 1");
				}
			}
		}
		
	}
}
