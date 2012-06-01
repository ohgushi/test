package En;
class CarEn114
{
	protected int num;				//フィールドを意味する
	protected double gas;				//フィールドを意味する
	
	public CarEn114()
	{
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}		
	public void setCarEn114(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}	
	public String toString()
	{
		String str = "ナンバー" + num + "ガソリン量" + gas + "の車です";
		return str;
	}

}

public class En114
{
	public static void main(String[] args)
	{
		CarEn114 car1 = new CarEn114();
		car1.setCarEn114(1234,20.5);
		System.out.println(car1);		
	}
}

