package com.test2.event;

/**
 * ������¼�������Ƶ����
 * @author xuzhen 
 *1��ͨ���������Ҽ���������һ��С����ƶ�
 */
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

//�¼������� ��
public class Test2 extends JFrame {
	
	MyPanel mp = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t = new Test2();
	}
	public Test2(){
		mp = new MyPanel();
		this.add(mp);
		
		//ע�����
		this.addKeyListener(mp);
		
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}

class MyPanel extends JPanel implements KeyListener{
	
	int x = 10;
	int y = 10;
	public void paint(Graphics g) {
		super.paint(g);
		g.fillOval(x, y, 10, 10);
	}
	
	//�¼�������    ----  ������

	//��ֵ�����
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	//��������
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_UP){
			y--;
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN){
			y++;
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT){
			x--;
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			x++;
		}
		//�ػ�
		this.repaint();
	}
	//�����ͷ�
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
		
}


