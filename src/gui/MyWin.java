/*graphic programming�� spring���� �� �� ������!
 * �ִ��� �������踦 ��ȭ��Ű�� ���� 
 * DI�� �����غ���. */
package gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import org.springframework.context.ApplicationContext;

public class MyWin extends JFrame {

	JTextField txt;
	JButton bt;
	public MyWin(JTextField txt, JButton bt) {
		this.txt = txt; //������ ����
		this.bt = bt; //������ ����
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout());
		add(txt);
		add(bt);
		setSize(300,400); //������ ũ�� ����
		setVisible(true);//������ ���̰� 
	}
	
	public static void main(String[] args) {
		//spring ���� ���� ���б�
	
	}

}
