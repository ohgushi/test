package En;
class Zahyou
{
	private int x;				//フィールドを意味する
	private int y;				//フィールドを意味する
	
	public int getX()				//メソッド
	{
		System.out.println("Ｘ座標を調べました。");	
		return x;
	}
	public int getY()				//メソッド
	{
		System.out.println("Ｙ座標を調べました。");
		return y;
	}

	public void setXY(int px,int py)
	{
	x = px;				//フィールドを意味する
	y = py;				//フィールドを意味する
	System.out.println("X座標を:" + x + "y座標を:" + y + "にしました" );	//メソッドを定義　x,y:「自分自身」のフィールドを意味する
	}
/*	void show()				//メソッド
	{
		System.out.println("Ｘの座標は" + x + "です。");	//メソッドを定義　num:「自分自身」のフィールドを意味する
		System.out.println("Ｙの座標は" + y + "です。");		//メソッドを定義  gas:「自分自身」のフィールドを意味する
	}
*/
}

public class En95 {
	public static void main(String[]args)
	{
	Zahyou za = new Zahyou();	//インスタンスを生成
	za.setXY(100,200);
	
	int xza = za.getX();	//car1のフィールドを意味する
	int yza  = za.getY();
	
	System.out.println("座標を調べたところ");	
	System.out.println("Ｘの座標は:" + xza + "Ｘの座標は:" + yza + "でした");		//メソッドを定義  gas:「自分自身」のフィールドを意味する
	}
}
