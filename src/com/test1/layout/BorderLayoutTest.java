package com.test1.layout;

import java.awt.*;
import javax.swing.*;

/*�߽粼�ֹ�����*/
/**
 * 
 * @author xuzhen
 * ���裺
 * 1.�̳�JFrame
 * 2.������Ҫ�����
 * 3.������������캯����
 * 4.������
 * 5.���ô�������
 * 6.��ʾ����
 *
 *ע�����
 *1.����������ֶ��������
 *2.�в�������Զ����ڴ�С
 *3.JFrame,JDialog Ĭ�ϲ��ֹ���������BorderLayout
 */

public class BorderLayoutTest extends JFrame{
	
	//�������
	JButton jb1,jb2,jb3,jb4,jb5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BorderLayoutTest test = new BorderLayoutTest();
	}
	
	public  BorderLayoutTest() {
		//�������
		jb1 = new JButton("�в�");
		jb2 = new JButton("����");
		jb3 = new JButton("����");
		jb4 = new JButton("�ϲ�");
		jb5 = new JButton("����");
		
		//������
		this.add(jb1,BorderLayout.CENTER);
		this.add(jb2,BorderLayout.NORTH);
		this.add(jb3,BorderLayout.EAST);
		this.add(jb4,BorderLayout.SOUTH);
		this.add(jb5,BorderLayout.WEST);
		
		//���ô�������
		this.setTitle("�߽粼�ֵ���ʾ");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//��ʾ����
		this.setVisible(true);
	}

}
