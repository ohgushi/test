package En;
import java.io.*;
public class En102 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("英字を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuffer gyaku = new StringBuffer(str) ;
		gyaku.reverse();
		System.out.println(str + "を逆にすると" + gyaku  +  "です。");
	}
}
