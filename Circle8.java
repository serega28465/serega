package domashnya1;

import java.util.Scanner;
public class Circle8 {

	public static void main(String[] args) {
		//  ������� �� ����� �� �������� ��������� ������������ �����,
		// ��������� ������������ � ���������
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���������� �����");
		if(sc.hasNextInt()){
			n=sc.nextInt();
			System.out.println(" ����������� ����� " + n + " � ");
			
			for(int i = n; i > 0; i--){
				int a = n % i;
				if(a==0)
					System.out.print(i + " ");
			}
		}else{
			System.out.println("�������. ������, �������� � ��������� �� � ������");
		}
		sc.close();
	}

}
