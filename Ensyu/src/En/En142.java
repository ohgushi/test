package En;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class En142 {
	public static void main(String[]args)
	{
		PrintWriter pw = null;	//これを入れたら
		
	 try{
//		 PrintWriter pw = new PrintWriter　//上を入れたら下記のように変更しないとエラーになる
		 pw = new PrintWriter
	     (new BufferedWriter(new FileWriter("testEN142.txt")));
     
	     pw.println("A long time ago,");
	     pw.println("There was a little gir1");
	     System.out.println("ファイルに書きこみました。");

	     pw.close();
	 }
	 catch(IOException e){
		 System.out.println("入出力エラーです。");
	 }
	 finally			//何かエラーになった時にファイルがクローズされないので、この命令を入れた方がよい
	 {
		 pw.close();
		 
	 }
	 }
	
}
