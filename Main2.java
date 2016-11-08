package lesson3;

import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть ваш вік");
		int vik = sc.nextInt();
		System.out.println("У якому році ви вийшли на пенсію ? ");
		int pvik = sc.nextInt();
		System.out.println("Скільки складають ваші заощадження на рік ?");
		double z = sc.nextInt();
		System.out.println("Enter rate");
		double rate = sc.nextDouble();
		
		double[] arr = new double[vik-pvik];
		arr[0] = z;
		for (int i = 1; i < arr.length; i++) {
			arr[i] = (arr[i-1])*((100+rate)/100)+z;
		}
		for (int i=0; i < arr.length;i++){
			System.out.println("Вік = " + (vik+i) + " sum = " + arr[i]);
		}
		System.out.println("Ваш вік " + vik + " років");
		System.out.println("Ви вийшли на пенсію у " + pvik + " років");
		System.out.println("Ваші заощадження на рік складають " + z);
	}

}
