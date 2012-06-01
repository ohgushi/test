package En;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AnsKuku {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("1�`9�̐��l����͂��Ă��������B");

			String str = br.readLine();

			if (IsNumber(str)) {
				// ���l
				int res = Integer.parseInt(str);

				// 1����9�͈̔͂��`�F�b�N
				if (1 <= res && res <= 9) {
					kuku(res);
					break;
				} else {
					System.out.println("1����9�ȊO�̐��l�����͂���܂����B������x���͂��ĉ�����");
				}
			} else {
				// ���l�ȊO
				System.out.println("���l�ȊO�̒l�����͂���܂����B������x���͂��ĉ������B");
			}
		}
	}

	// ���\���Z�o
	private static void kuku(int x) {
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= x; j++) {
				System.out.print(i + " * " + j + " = "
						+ ((i * j) > 9 ? "" : " ") + i * j + " ");
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
