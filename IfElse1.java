package domashnya1;

public class IfElse1 {

	public static void main(String[] args) {
		//  �������� ��������, �� �������� �� ����� ��������� �� 10 � ����
		//�����, ��������� � ���� m � n. ���������, ����� ����� 8,5 � 11,45
		//��������� �� ������ 11,45.
		for (int m = 3, n = 2; m < 100 && n < 100 ;n++, m++) {
			if(m>10 || n>10){
				System.out.println(m + " - ��������� �� 10");
				System.out.println(n + " - ��������� �� 10 ");
			}
		}
		
		
	}
}
