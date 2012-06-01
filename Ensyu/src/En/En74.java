package En;
import java.io.*;

public class En74 
{

	public static void main(String[]args) throws IOException
	{

				BufferedReader br =
				 new BufferedReader(new InputStreamReader(System.in));
				int [] test = new int[5];

				System.out.println("5人のテストの点数を入力してください。");	
					
				for(int i=0; i<test.length; i++){			//
						String str = br.readLine();
						test[i] = Integer.parseInt(str);
				}
				for(int j = 0; j<test.length; j++){	
					System.out.println( (j+1) + "番目の人の点数は" + test[j] + "です。");
				}
				int saikou = 0;
				for(int j = 0; j<=test.length; j++){	
					if(saikou>test[j]){
						saikou = test[j];
					}
				}
				System.out.println("最高点は" + saikou + "です。");	
	}
}
				

		
