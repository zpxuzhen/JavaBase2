package com.test1.demo;

import java.awt.*;

import javax.swing.*;

/*�û��������*/
/**
 * 
 * @author xuzhen
 *
 */

public class Demo3  extends JFrame {

	//�������
	JPanel jp1,jp2;
	JLabel jl1,jl2;
	JComboBox jcb1;
	JList jlist;
	JScrollPane jsp;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 test = new Demo3();
	}
	
	public  Demo3() {
		//�������
		jp1 = new JPanel();
		jp2 = new JPanel();
		jl1 = new JLabel("��ļ���");
		jl2 = new JLabel("���εص�");
		
		String [] jg = {"����","�Ϻ�","���","����"};
		jcb1 = new JComboBox(jg);
		
		String [] dd = {"��կ��","�ʹ�","����","�찲��"};
		jlist = new JList(dd);
		//������ϣ����ʾ����ѡ��
		jlist.setVisibleRowCount(1);
		jsp = new JScrollPane(jlist);
		

	
		//���ò��ֹ���
		this.setLayout(new GridLayout(2,1));
		
		//����������
		//���JPanel
		jp1.add(jl1);
		jp1.add(jcb1);
		jp2.add(jl2);
		jp2.add(jsp);
	
		//��Panel����JFrame
		this.add(jp1);
		this.add(jp2);

		
		//���ô�������
		this.setTitle("�û�����");
		this.setSize(300, 150);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//��ʾ����
		this.setVisible(true);
	}
	
}
