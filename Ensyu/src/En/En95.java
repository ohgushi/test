package En;
class Zahyou
{
	private int x;				//�t�B�[���h���Ӗ�����
	private int y;				//�t�B�[���h���Ӗ�����
	
	public int getX()				//���\�b�h
	{
		System.out.println("�w���W�𒲂ׂ܂����B");	
		return x;
	}
	public int getY()				//���\�b�h
	{
		System.out.println("�x���W�𒲂ׂ܂����B");
		return y;
	}

	public void setXY(int px,int py)
	{
	x = px;				//�t�B�[���h���Ӗ�����
	y = py;				//�t�B�[���h���Ӗ�����
	System.out.println("X���W��:" + x + "y���W��:" + y + "�ɂ��܂���" );	//���\�b�h���`�@x,y:�u�������g�v�̃t�B�[���h���Ӗ�����
	}
/*	void show()				//���\�b�h
	{
		System.out.println("�w�̍��W��" + x + "�ł��B");	//���\�b�h���`�@num:�u�������g�v�̃t�B�[���h���Ӗ�����
		System.out.println("�x�̍��W��" + y + "�ł��B");		//���\�b�h���`  gas:�u�������g�v�̃t�B�[���h���Ӗ�����
	}
*/
}

public class En95 {
	public static void main(String[]args)
	{
	Zahyou za = new Zahyou();	//�C���X�^���X�𐶐�
	za.setXY(100,200);
	
	int xza = za.getX();	//car1�̃t�B�[���h���Ӗ�����
	int yza  = za.getY();
	
	System.out.println("���W�𒲂ׂ��Ƃ���");	
	System.out.println("�w�̍��W��:" + xza + "�w�̍��W��:" + yza + "�ł���");		//���\�b�h���`  gas:�u�������g�v�̃t�B�[���h���Ӗ�����
	}
}
