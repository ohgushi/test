package En;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AnsKuku {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("1～9の数値を入力してください。");

			String str = br.readLine();

			if (IsNumber(str)) {
				// 数値
				int res = Integer.parseInt(str);

				// 1から9の範囲かチェック
				if (1 <= res && res <= 9) {
					kuku(res);
					break;
				} else {
					System.out.println("1から9以外の数値が入力されました。もう一度入力して下さい");
				}
			} else {
				// 数値以外
				System.out.println("数値以外の値が入力されました。もう一度入力して下さい。");
			}
		}
	}

	// 九九表を算出
	private static void kuku(int x) {
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= x; j++) {
				System.out.print(i + " * " + j + " = "
						+ ((i * j) > 9 ? "" : " ") + i * j + " ");
			}
			System.out.print("\n");
		}
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
