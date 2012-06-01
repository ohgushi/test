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
			System.out.println("1～9の数値を入力してください。");

			String str = br.readLine();

			if (IsNumber(str)) {
				// 数値
				int res = Integer.parseInt(str);

				// 1から9の範囲かチェック
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
						System.out.println("正しい数値を入力して下さい。");
						break;
					}

					break;

				} else {
					System.out.println("1から9以外の数値が入力されました。もう一度入力して下さい");
				}
			} else {
				// 数値以外
				System.out.println("数値以外の値が入力されました。もう一度入力して下さい。");
			}
		}

		try {

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("正しい数値を入力して下さい");
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
