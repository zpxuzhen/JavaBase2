package com.test1.layout;

import java.awt.*;

import javax.swing.*;

/*���ֲ��ֹ�������ʹ��*/
/**
 * 
 * @author xuzhen
 *ע�����
 *1.JPanel��JComponent������
 *2.������������������Լ��������
 *3.Ĭ�ϲ��ֹ�������  ��ʽ���� ��FlowLayout��
 **/
public class Test extends JFrame{

	//�������
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
	}
	
	public  Test() {
		//�������
		//JPanelĬ�ϲ�����FlowLayout
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		jb1 = new JButton("����");
		jb2 = new JButton("ƻ��");
		jb3 = new JButton("��֦");
		jb4 = new JButton("����");
		jb5 = new JButton("����");
		jb6 = new JButton("�㽶");
	
		//���ò��ֹ���
		
		//���JPanel
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		
		//��Panel����JFrame
		this.add(jp1,BorderLayout.NORTH);
		this.add(jb6,BorderLayout.CENTER);
		this.add(jp2,BorderLayout.SOUTH);
		
		//���ô�������
		this.setTitle("���Ӳ���JPanel����ʾ");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//��ʾ����
		this.setVisible(true);
	}

}
