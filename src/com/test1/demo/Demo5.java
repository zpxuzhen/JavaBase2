package com.test1.demo;

import java.awt.*;

import javax.swing.*;

/*QQ������� */
/**
 * 
 * @author xuzhen
 *
 */

public class Demo5  extends JFrame {

	//�������
	JTextArea jta=null;
	JScrollPane jsp=null;
	JPanel jp=null;
	JComboBox jcb=null;
	JTextField jtf=null;
	JButton jb=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo5 test = new Demo5();
	}
	
	public  Demo5() {
		//�������
		jta = new JTextArea();
		//����
		jsp = new JScrollPane(jta);
		jp = new JPanel();
		String []chatter={"��ʲ","����"};
		jcb = new JComboBox(chatter);
		jtf = new JTextField(10);
		jb = new JButton("����");
		
		//���ò��ֹ���
		
		//����������
		jp.add(jcb);
		jp.add(jtf);
		jp.add(jb);
		
		this.add(jsp);
		this.add(jp,BorderLayout.SOUTH);
		//���ô�������
		this.setTitle("��ѶQQ");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���Ͻǵ�ͼ��
		this.setIconImage(new ImageIcon("images/qq.jpg").getImage());
				
		//��ʾ����
		this.setVisible(true);
	}
	
}
