package En;
import java.io.*;
public class En102 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("‰pš‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuffer gyaku = new StringBuffer(str) ;
		gyaku.reverse();
		System.out.println(str + "‚ğ‹t‚É‚·‚é‚Æ" + gyaku  +  "‚Å‚·B");
	}
}
