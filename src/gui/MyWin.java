/*graphic programming을 spring으로 한 번 만들어보자!
 * 최대한 의존관계를 약화시키기 위해 
 * DI를 적용해본다. */
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
		this.txt = txt; //생성자 주입
		this.bt = bt; //생성자 주입
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout());
		add(txt);
		add(bt);
		setSize(300,400); //윈도우 크기 설정
		setVisible(true);//윈도우 보이게 
	}
	
	public static void main(String[] args) {
		//spring 설정 파일 ㅣ읽기
	
	}

}
