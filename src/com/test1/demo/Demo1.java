package com.test1.demo;

import java.awt.*;
import javax.swing.*;

/*��Ա����ϵͳ--��¼����*/
/**
 * 
 * @author xuzhen
 *
 */
public class Demo1 extends JFrame {

	//�������
	JPanel jp1,jp2,jp3;
	JLabel jlb1,jlb2;
	JButton jb1,jb2;
	JTextField jtf1;
	JPasswordField jpf1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 test = new Demo1();
	}
	
	public  Demo1() {
		//�������
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jlb1 = new JLabel("�û���");
		jlb2 = new JLabel("��    ��");
		jb1 = new JButton("��¼");
		jb2 = new JButton("ȡ��");
		jtf1 = new JTextField(10);
		jpf1 = new JPasswordField(10);
		
		//���ò��ֹ���
		this.setLayout(new GridLayout(3,1));
		
		//����������
		//���JPanel
		jp1.add(jlb1);
		jp1.add(jtf1);
		jp2.add(jlb2);
		jp2.add(jpf1);
		jp3.add(jb1);
		jp3.add(jb2);		
		//��Panel����JFrame
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		//���ô�������
		this.setTitle("��Ա����ϵͳ");
		this.setSize(300, 150);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//��ʾ����
		this.setVisible(true);
	}

}
