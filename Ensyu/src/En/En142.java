package En;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class En142 {
	public static void main(String[]args)
	{
		PrintWriter pw = null;	//�������ꂽ��
		
	 try{
//		 PrintWriter pw = new PrintWriter�@//�����ꂽ�牺�L�̂悤�ɕύX���Ȃ��ƃG���[�ɂȂ�
		 pw = new PrintWriter
	     (new BufferedWriter(new FileWriter("testEN142.txt")));
     
	     pw.println("A long time ago,");
	     pw.println("There was a little gir1");
	     System.out.println("�t�@�C���ɏ������݂܂����B");

	     pw.close();
	 }
	 catch(IOException e){
		 System.out.println("���o�̓G���[�ł��B");
	 }
	 finally			//�����G���[�ɂȂ������Ƀt�@�C�����N���[�Y����Ȃ��̂ŁA���̖��߂���ꂽ�����悢
	 {
		 pw.close();
		 
	 }
	 }
	
}
