package domashnya1;

import java.util.Scanner;
public class Circle7 {

	public static void main(String[] args) {
		//  ������� ��������, ��� �������� �������� ������������ ����� n,
		// ��� ���������� ����� � ���������
		int n;
		int a = 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �����");
		if(sc.hasNextInt()){
			n=sc.nextInt();
			for (int i = n; i > 0; i--) {
				a*=i;
			}
			System.out.println(" �������� ����� "+ n + " ������� " + a );
		} else{
			System.out.println("�������. �������� ������� �� � ������ ��� �������� ��������� ��������");
		}
		sc.close();
	}

}
