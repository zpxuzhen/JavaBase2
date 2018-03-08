package com.test1.graphics;

import java.awt.*;
import javax.swing.*;

/**
 * 
 * @author xuzhen
 * ���ܣ�java��ͼ����ԭ��
 * ��ֱ��drawLine
 * �����α߿�drawRect
 * ��ԲdrawOval
 * ��ͼƬdrawImage
 * ���ַ���drawString
 * ������fillRect
 * �����ԲfillOval
 * ���û�����ɫsetColor
 * ���û�������setFont
 */
public class GraphicsTest extends JFrame{
	
	MyPanel mp=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicsTest demo01=new GraphicsTest();
	}
	public  GraphicsTest(){
		mp=new MyPanel();
		this.add(mp);
		
		//���ô����С
		this.setSize(400,300);
		//���ô�������λ��
		this.setLocation(200, 200);
		//��ֹ�û��ı䴰���С
		this.setResizable(false);
		//�رմ�����ر�Ӧ�ó���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//����ɼ�
		this.setVisible(true);
	} 
}

//����һ��MyPanel(���ڻ�ͼ����ʾ��ͼ������)

class MyPanel extends JPanel{
	//����JPanel��paint����
	//Graphics�ǻ�ͼ����Ҫ�࣬�������Ϊһֻ����
	public void paint(Graphics g) {
		//1.���ø��ຯ����ɳ�ʼ��,��仰��������
		super.paint(g);
		//�Ȼ�һ��Բ
		g.drawOval(10, 10, 30, 30);
	}
}
