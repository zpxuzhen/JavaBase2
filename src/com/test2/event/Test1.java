package com.test2.event;

/**
 * 讲解事件处理机制
 * @author xuzhen 
 *
 */
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

//事件监听者 类
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
		jb1 = new JButton("黑色");
		jb2 = new JButton("红色");
		
		this.add(jb1,BorderLayout.NORTH);
		mp.setBackground(Color.BLACK);
		this.add(mp);
		this.add(jb2,BorderLayout.SOUTH);
		
		//事件源  ---  注册监听
		jb1.addActionListener(this);
		//指定action命令
		jb1.setActionCommand("aa");
		jb2.addActionListener(this);
		//指定action命令
		jb2.setActionCommand("bb");
		
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	//事件监听者    ----  处理方法
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//判断是哪个按钮被点击
		if(e.getActionCommand().equals("aa")){
			System.out.println("你点击的是黑色按钮");
			mp.setBackground(Color.BLACK);
		}else if(e.getActionCommand().equals("bb")){
			System.out.println("你点击的是红色按钮");
			mp.setBackground(Color.red);
		}
	}

}
