package En;

abstract class Vehicle124
{
	protected int speed;
	public void setSpeed(int s)
	{
		speed = s;
		System.out.println("速度を" + speed + "にしました");
	}
	abstract void show();
}
class En124
{	
	public static void main(String[] args)
	{
		Vehicle124 vc;
//		vc = new Vehicle124(); //newができない

//		vc.setSpeed(500);
//		vc.show();		
	}
}
