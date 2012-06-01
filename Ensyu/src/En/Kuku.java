package En;

class Kuku {
	public static void main(String[] args){

		int ans = 0;

		for (int i = 1; i <= 9; i++) {

			for (int k = 1; k <= 9; k++) {
				ans = k * i;
				if (ans <= 9) {

					System.out.print(k + " * " + i + " = " + " " + ans + " ");
				} else {

					System.out.print(k + " * " + i + " = " + ans + " ");
				}
			}
			System.out.print("\n");
		}
	}
}
