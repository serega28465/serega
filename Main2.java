package lesson3;

import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ��� ��");
		int vik = sc.nextInt();
		System.out.println("� ����� ���� �� ������ �� ����� ? ");
		int pvik = sc.nextInt();
		System.out.println("������ ��������� ���� ����������� �� �� ?");
		double z = sc.nextInt();
		System.out.println("Enter rate");
		double rate = sc.nextDouble();
		
		double[] arr = new double[vik-pvik];
		arr[0] = z;
		for (int i = 1; i < arr.length; i++) {
			arr[i] = (arr[i-1])*((100+rate)/100)+z;
		}
		for (int i=0; i < arr.length;i++){
			System.out.println("³� = " + (vik+i) + " sum = " + arr[i]);
		}
		System.out.println("��� �� " + vik + " ����");
		System.out.println("�� ������ �� ����� � " + pvik + " ����");
		System.out.println("���� ����������� �� �� ��������� " + z);
	}

}
