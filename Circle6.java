package domashnya1;

public class Circle6 {

	public static void main(String[] args) {
		// ������� �� ����� �� �������� ����� ����������� 2a+200, �� a1 =
		// -166
		for (int a = -166; a < 100; a = 2 * a + 200) {
			if (a > -100) {
				System.out.println(a);
			}
		}
		System.out.println("������ ���������� �������� ����������� ����");
	}

}
