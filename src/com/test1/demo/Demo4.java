package com.test1.demo;

import java.awt.*;

import javax.swing.*;

/*��ɽ�ʰ� */
/**
 * 
 * @author xuzhen
 *
 */

public class Demo4  extends JFrame {

	//�������
	JSplitPane jsp;
	JList jlist;
	JLabel jl1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 test = new Demo4();
	}
	
	public  Demo4() {
		//�������
		String []words = {"boy","girl","good"};
		jlist = new JList(words);
		jl1 = new JLabel(new ImageIcon("images/cb.jpg"));
		//��ִ���
		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jlist,jl1);
		//���Ա仯�Ĵ���
		jsp.setOneTouchExpandable(true);
		
		//���ò��ֹ���
		
		//����������
		this.add(jsp);
		
		//���ô�������
		this.setTitle("��ɽ�ʰ�");
		this.setSize(400, 300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//��ʾ����
		this.setVisible(true);
	}
	
}
