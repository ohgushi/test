package En;

import java.applet.Applet;
import java.awt.BasicStroke;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class JannkenPon extends Applet implements ActionListener {

	String[] strResult = { "Let's �W�����P���I�I", "���Ȃ��̏����B������ˁI�I", "���Ȃ��̕����B�c�O�B",
			"�������B�����P��I" };// ���ʕ\��
	int intResult = 0; // ���ʂ̒l (Index)

	int gx = 0;
	int gy = 0;

	Button bt1;// �{�^��1~3
	Button bt2;
	Button bt3;

	Image img;// �W�����P���̎�̃C���[�W
	Image img2;
	Image img3;

	Image imgcom;// ������COM�̎�̃C���[�W
	Image imgme;

	Image imghead;//�w�b�h�摜

	Graphics graphics;

	// **********������**********

	public void init() {
		graphics = getGraphics();
//		addMouseListener(this);
//		addMouseMotionListener(this);

		img = getImage(getDocumentBase(), "goo.gif");
		img2 = getImage(getDocumentBase(), "choki.GIF");
		img3 = getImage(getDocumentBase(), "paa.GIF");
		imgcom = getImage(getDocumentBase(), "goo.gif");
		imgme = getImage(getDocumentBase(), "goo.gif");
		imghead = getImage(getDocumentBase(), "head.gif");

			img = getImage(getDocumentBase(), "guu.GIF");

			bt1 = new Button("�O�[");
			bt2 = new Button("�`���L");
			bt3 = new Button("�p�[");
			add(bt1);
			add(bt2);
			add(bt3);
			bt1.addActionListener(this);
			bt2.addActionListener(this);
			bt3.addActionListener(this);
			this.setLayout(null);
			bt1.setSize(100, 20);
			bt1.setLocation(550, 600);

			bt2.setSize(100, 20);
			bt2.setLocation(670, 600);

			bt3.setSize(100, 20);
			bt3.setLocation(790, 600);
		}
	
	public void actionPerformed(ActionEvent ae) {
		String strButton = ae.getActionCommand();
		int com = 0;
		int me = 0;
		if (strButton.equals("�O�[")) {
			imgme = img;
			me = 1;
		} else if (strButton.equals("�`���L")) {
			imgme = img2;
			me = 2;
		} else if (strButton.equals("�p�[")) {
			imgme = img3;
			me = 3;
		}

		com = (int) (Math.random() * 3);
		// **********COM�̎�̐ݒ�**********

				com = (int) (Math.random() * 3) + 1;
				switch (com) {
				case 1: // �O�[
					imgcom = img;
					break;
				case 2: // �`���L
					imgcom = img2;
					break;
				case 3: // �p�[
					imgcom = img3;
					break;
				}
		System.out.println("�R���s���[�^�́A" + com + "�ł��B");

		// ���u�������v

		if (me == com)
			intResult = 3;//("�������I�I");
//		repaint();
		// ���u���Ȃ��̏����v

		else if ((me == 0 && com == 1) || (me == 1 && com == 2)
				|| (me == 2 && com == 0))
			intResult = 1;//("���Ȃ��̏���");

		// ���u���Ȃ��̕����v
//		repaint();
		else
			intResult = 2;//("���Ȃ��̕���");
		repaint();
	}






public void mouseMoved(MouseEvent e) {

	gx = e.getX();
	gy = e.getY();

}


// **********�\��**********

public void paint(Graphics g) {

	Graphics2D g2 = (Graphics2D) g;

	BasicStroke wideStroke = new BasicStroke(3.0f);
	g2.setStroke(wideStroke);

	g.setColor(Color.lightGray);
	g.setFont(new Font("Monospaced", Font.BOLD, 24));
	g.fillRect(50, 50, 900, 600);

	g.setColor(Color.orange);
	g.drawRect(50, 50, 900, 600);

	g.drawLine(50, 520, 950, 520);

	g.drawString("�W�����P���Q�[��", 410, 30);

	g.setColor(Color.black);
	g.drawString("���{�^���őI��ŉ�������", 570, 570);
	g.drawString("COM", 300, 100);
	g.drawString("����", 670, 100);

	g.drawImage(imgme, 530, 140, this);
	g.drawImage(imgcom, 150, 140, this);
	g.drawImage(imghead, 370, 50, this);

	g.setColor(Color.magenta);
	g.drawString(strResult[intResult], 150, 600);

}

}
