package En;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class T10to2 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("0�`255�̐��l����͂��Ă��������B");

			String str = br.readLine();

			if (IsNumber(str)) {
				// ���l
				int res = Integer.parseInt(str);

				// 0����255�͈̔͂��`�F�b�N
				if (0 <= res && res <= 255) {
					String after = byteTo16(res);

					System.out.print("10�i���u" + res + "�v��2�i���ɕϊ�����Ɓu" + after
							+ "�v�ł��B");

					break;
				} else {
					System.out.println("0����255�ȊO�̐��l�����͂���܂����B������x���͂��ĉ�����");
				}
			} else {
				// ���l�ȊO
				System.out.println("���l�ȊO�̒l�����͂���܂����B������x���͂��ĉ������B");
			}
		}
	}

	// 2�i������16�i���֕ϊ�
	private static String byteTo16(int num) {
		int[] target = new int[8];

		for (int i = 0; i < 8; i++) {
			target[i] = num % 2;
			num = num / 2;
//			if(num == 0)break;			
		}

		String strAfter = "";
		// �z��̒��g���]
		for (int i = target.length - 1; i >= 0; i--) {
			strAfter += target[i];
		}

		return strAfter;
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