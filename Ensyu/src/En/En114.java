package En;
class CarEn114
{
	protected int num;				//�t�B�[���h���Ӗ�����
	protected double gas;				//�t�B�[���h���Ӗ�����
	
	public CarEn114()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ԃ��쐬���܂����B");
	}		
	public void setCarEn114(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�i���o�[��" + num + "�ɃK�\�����ʂ�" + gas + "�ɂ��܂����B");
	}	
	public String toString()
	{
		String str = "�i���o�[" + num + "�K�\������" + gas + "�̎Ԃł�";
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

