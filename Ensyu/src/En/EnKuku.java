package En;

import java.io.*;

class Ku {
	int kaerusu;
	int kakeRareusu;
}

class EnKuku {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("1�`9�̐��l����͂��Ă��������B");

			String str = br.readLine();

			if (IsNumber(str)) {
				// ���l
				int res = Integer.parseInt(str);

				// 1����9�͈̔͂��`�F�b�N
				if (1 <= res && res <= 9) {

					switch (res) {
					case 1:
						Kuku(res);
						break;
					case 2:
						Kuku(res);
						break;
					case 3:
						Kuku(res);
						break;
					case 4:
						Kuku(res);
						break;
					case 5:
						Kuku(res);
						break;
					case 6:
						Kuku(res);
						break;
					case 7:
						Kuku(res);
						break;
					case 8:
						Kuku(res);
						break;
					case 9:
						Kuku(res);
						break;
					default:
						System.out.println("���������l����͂��ĉ������B");
						break;
					}

					break;

				} else {
					System.out.println("1����9�ȊO�̐��l�����͂���܂����B������x���͂��ĉ�����");
				}
			} else {
				// ���l�ȊO
				System.out.println("���l�ȊO�̒l�����͂���܂����B������x���͂��ĉ������B");
			}
		}

		try {

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���������l����͂��ĉ�����");
		}

	}

	private static void Kuku(int j) {
		{

			int i = j;

			for (int k = 1; k <= 9; k++) {
				int ans = k * i;
				if (ans <= 9) {
					System.out.print(i + " * " + k + " = " + " " + ans + " ");
				} else {
					System.out.print(i + " * " + k + " = " + ans + " ");
				}
			}
			System.out.print("\n");

		}

	}

	// ���l�`�F�b�N�i�߂�F���l�Ȃ��true ���l�łȂ��Ȃ�false�j
	private static boolean IsNumber(String str) {
		boolean flg = true;
		try {
			Integer.parseInt(str);
		} catch (Exception e) {
			flg = false;
		}
		return flg;
	}

}
