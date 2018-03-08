package com.test2.event;

/**
 * �����¼��������
 * @author xuzhen 
 *
 */
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

//�¼������� ��
public class Test1 extends JFrame implements ActionListener{
	
	JPanel mp = null;
	JButton jb1 = null;
	JButton jb2 = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = new Test1();
	}
	public Test1(){
		mp = new JPanel();
		jb1 = new JButton("��ɫ");
		jb2 = new JButton("��ɫ");
		
		this.add(jb1,BorderLayout.NORTH);
		mp.setBackground(Color.BLACK);
		this.add(mp);
		this.add(jb2,BorderLayout.SOUTH);
		
		//�¼�Դ  ---  ע�����
		jb1.addActionListener(this);
		//ָ��action����
		jb1.setActionCommand("aa");
		jb2.addActionListener(this);
		//ָ��action����
		jb2.setActionCommand("bb");
		
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	//�¼�������    ----  ������
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//�ж����ĸ���ť�����
		if(e.getActionCommand().equals("aa")){
			System.out.println("�������Ǻ�ɫ��ť");
			mp.setBackground(Color.BLACK);
		}else if(e.getActionCommand().equals("bb")){
			System.out.println("�������Ǻ�ɫ��ť");
			mp.setBackground(Color.red);
		}
	}

}
