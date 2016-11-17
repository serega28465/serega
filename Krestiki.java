package lesson7;

import java.util.Scanner;

public class Krestiki {

	public static void main(String[] args) {
		int[][] field = new int[3][3];
		Scanner sc = new Scanner(System.in);

		fielder(field);

		while (true) {

			System.out.println("Ход користувача");
			System.out.println("Введіть координату x");
			int k1 = sc.nextInt();
			System.out.println("Введіть координату y");
			int k2 = sc.nextInt();

			if (field[k1][k2] == 0) {
				field[k1][k2] = 2;
			} else if (field[k1][k2] == 1) {
				System.out.println("Місце зайнято");
			} else if (field[k1][k2] == 2) {
				System.out.println("Тут вже є двійка");
			}

			System.out.println(field[k1][k2] + " ");
			int i1 = 0;
			int j1 = 0;
			for (int i = 0; i < field.length; i++) {
				for (int j = 0; j < field[i].length; j++) {
					if (field[i][j] == 0) {
						i1++;
						j1++;
					}
				}
			}
			if (i1 == 0 && j1 == 0) {
				System.out.println("Нічия! Гру завершено!");
				System.exit(0);
			}

			if (field[0][0] == 2 && field[0][1] == 2 && field[0][2] == 2) {
				System.out.println("Гру закінчено, користувач переміг");
				System.exit(0);
			}
			if (field[1][0] == 2 && field[1][1] == 2 && field[1][2] == 2) {
				System.out.println("Гру закінчено, користувач переміг");
				System.exit(0);
			}
			if (field[2][0] == 2 && field[2][1] == 2 && field[2][2] == 2) {
				System.out.println("Гру закінчено, користувач переміг");
				System.exit(0);
			}
			if (field[0][0] == 2 && field[1][1] == 2 && field[2][2] == 2) {
				System.out.println("Гру закінчено, користувач переміг");
				System.exit(0);
			}
			if (field[2][0] == 2 && field[1][1] == 2 && field[0][2] == 2) {
				System.out.println("Гру закінчено, користувач переміг");
				System.exit(0);
			}
			if (field[0][1] == 2 && field[1][1] == 2 && field[2][1] == 2) {
				System.out.println("Гру закінчено, користувач переміг");
				System.exit(0);
			}
			if (field[1][0] == 2 && field[1][1] == 2 && field[1][2] == 2) {
				System.out.println("Гру закінчено, користувач переміг");
				System.exit(0);
			}

			System.out.println("Ход комп`ютера");

			int y = random(0, 2);
			int x = random(0, 2);
			if (field[x][y] == 0) {

				field[x][y] = 1;

			} else if (field[x][y] != 0) {
				int a = random(0, 2);
				int b = random(0, 2);

				if (field[a][b] == 0) {
					field[a][b] = 1;
				} else if (field[a][b] != 0) {
					int a1 = random(0, 2);
					int b1 = random(0, 2);
					if (field[a1][b1] == 0) {
						field[a1][b1] = 1;
					} else if (field[a1][b1] != 0) {
						int a2 = random(0, 2);
						int b2 = random(0, 2);
						if (field[a2][b2] == 0) {
							field[a2][b2] = 1;
						} else {

							for (int i = 0, i2 = 0; i < field.length; i++) {
								for (int j = 0; j < field[i].length; j++) {
									if (field[i][j] == 0) {
										field[i][j] = 1;
										i2++;
									}

								}
								if (i2 == 0) {
									System.out.println("Нічия!!!!");
									System.exit(0);
								}
							}

						}
					}
				}
			}

			fielder(field);

			if (field[0][0] == 1 && field[0][1] == 1 && field[0][2] == 1) {
				System.out.println("Гру закінчено, комп`ютер переміг");
				System.exit(0);
			}
			if (field[1][0] == 1 && field[1][1] == 1 && field[1][2] == 1) {
				System.out.println("Гру закінчено, комп`ютер переміг");
				System.exit(0);
			}
			if (field[2][0] == 1 && field[2][1] == 1 && field[2][2] == 1) {
				System.out.println("Гру закінчено, комп`ютер переміг");
				System.exit(0);
			}
			if (field[0][0] == 1 && field[1][1] == 1 && field[2][2] == 1) {
				System.out.println("Гру закінчено, комп`ютер переміг");
				System.exit(0);
			}
			if (field[0][1] == 1 && field[1][1] == 1 && field[2][1] == 1) {
				System.out.println("Гру закінчено, комп`ютер переміг");
				System.exit(0);
			}
			if (field[1][0] == 1 && field[1][1] == 1 && field[1][2] == 1) {
				System.out.println("Гру закінчено, комп`ютер переміг");
				System.exit(0);
			}
			if (field[2][0] == 1 && field[1][1] == 1 && field[0][2] == 1) {
				System.out.println("Гру закінчено, комп`ютер переміг");
				System.exit(0);
			}

			System.out.println();

		}

	}

	static int random(int min, int max) {
		return (int) Math.round(Math.random() * (max - min) + min);

	}

	static void fielder(int[][] field) {
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				System.out.print(field[i][j] + " ");
			}
			System.out.println();
		}
	}
}


