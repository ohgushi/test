package En;

abstract class Vehicle124
{
	protected int speed;
	public void setSpeed(int s)
	{
		speed = s;
		System.out.println("���x��" + speed + "�ɂ��܂���");
	}
	abstract void show();
}
class En124
{	
	public static void main(String[] args)
	{
		Vehicle124 vc;
//		vc = new Vehicle124(); //new���ł��Ȃ�

//		vc.setSpeed(500);
//		vc.show();		
	}
}
