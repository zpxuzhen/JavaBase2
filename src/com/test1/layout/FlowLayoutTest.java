package com.test1.layout;

import java.awt.*;
import javax.swing.*;

/*��ʽ���ֹ�����*/
/**
 * 
 * @author xuzhen
 *ע�����
 *1.�������������������Ĵ�С��������������Ѵ�С
 *2.������������ʱ�������λ�ÿ��ܱ仯��������Ĵ�С����
 *3.Ĭ������Ǿ��ж��룬����ͨ��FlowLayout(int align)������ָ�����뷽ʽ
 */

public class FlowLayoutTest  extends JFrame{

	//�������
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowLayoutTest test = new FlowLayoutTest();
	}

	public  FlowLayoutTest() {
		//�������
		jb1 = new JButton("����");
		jb2 = new JButton("�ŷ�");
		jb3 = new JButton("����");
		jb4 = new JButton("��");
		jb5 = new JButton("����");
		jb6 = new JButton("κ��");
		
		//������
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb5);
		this.add(jb6);
		
		//���ò��ֹ�����
		this.setLayout(new FlowLayout(FlowLayout.LEFT));//�����
		
		//���ô�������
		this.setTitle("��ʽ���ֵ���ʾ");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//��ֹ�û��ı䴰���С
		this.setResizable(false);
		
		//��ʾ����
		this.setVisible(true);
	}
	
}
