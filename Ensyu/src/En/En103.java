package En;
import java.io.*;
public class En103 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("英字を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuffer sou = new StringBuffer(str) ;
		
		System.out.println("aの挿入位置を整数で入力してください。");
//		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
//		String str1 = br1.readLine();
		
		int i = Integer.
		sou.append("a");
		
		System.out.println(str + "を逆にすると" + sou  +  "です。");
	}
}
