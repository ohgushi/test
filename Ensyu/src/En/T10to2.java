package En;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class T10to2 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("0～255の数値を入力してください。");

			String str = br.readLine();

			if (IsNumber(str)) {
				// 数値
				int res = Integer.parseInt(str);

				// 0から255の範囲かチェック
				if (0 <= res && res <= 255) {
					String after = byteTo16(res);

					System.out.print("10進数「" + res + "」を2進数に変換すると「" + after
							+ "」です。");

					break;
				} else {
					System.out.println("0から255以外の数値が入力されました。もう一度入力して下さい");
				}
			} else {
				// 数値以外
				System.out.println("数値以外の値が入力されました。もう一度入力して下さい。");
			}
		}
	}

	// 2進数から16進数へ変換
	private static String byteTo16(int num) {
		int[] target = new int[8];

		for (int i = 0; i < 8; i++) {
			target[i] = num % 2;
			num = num / 2;
//			if(num == 0)break;			
		}

		String strAfter = "";
		// 配列の中身反転
		for (int i = target.length - 1; i >= 0; i--) {
			strAfter += target[i];
		}

		return strAfter;
	}

	// 数値チェック（戻り：数値ならばtrue 数値でないならfalse）
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