package domashnya1;

public class Circle4 {

	public static void main(String[] args) {
		// ������� ��������, �� �������� �� ����� ����� 20 ��������
		// ����������� 2 4 8 16 32 64 128
		for (int i = 1, n=1; i < 1000000 && n < 21; i=i*2, n++) {
			System.out.println(i + " - ������� � - " + n);
		}
		System.out.println("ʳ������ �������� ������� 20-��");
	}

}
