package com.test1.layout;

import java.awt.*;

import javax.swing.*;

/*���񲼾ֹ�����*/
/**
 * 
 * @author xuzhen
 *ע�����
 *1.��������λ�ò������������Ŷ��仯������С��仯
 *2.��������Ĵ�С��ͬ
 *3.����ͨ��GridLayout(int rows,int cols,int hgap,int vgap)��ָ��������С��У�ˮƽ�������ֱ���
 */

public class GridLayoutTest  extends JFrame{

	//�������
	JButton jbs[] = new JButton[9];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridLayoutTest test = new GridLayoutTest();
	}

	public  GridLayoutTest() {
		//�������
		for(int i=0;i<jbs.length;i++)
		{
			jbs[i]=new JButton(String.valueOf(i+1));
		}
		
		//���ò��ֹ�����
		this.setLayout(new GridLayout(3,3,10,10));//���м���,���
		
		//������
		for(int i=0;i<jbs.length;i++)
		{
			this.add(jbs[i]);
		}
				
		//���ô�������
		this.setTitle("���񲼾ֵ���ʾ");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//��ʾ����
		this.setVisible(true);
	}
	
}
