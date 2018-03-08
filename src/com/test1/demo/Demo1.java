package com.test1.demo;

import java.awt.*;
import javax.swing.*;

/*会员管理系统--登录界面*/
/**
 * 
 * @author xuzhen
 *
 */
public class Demo1 extends JFrame {

	//定义组件
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
		//创建组件
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jlb1 = new JLabel("用户名");
		jlb2 = new JLabel("密    码");
		jb1 = new JButton("登录");
		jb2 = new JButton("取消");
		jtf1 = new JTextField(10);
		jpf1 = new JPasswordField(10);
		
		//设置布局管理
		this.setLayout(new GridLayout(3,1));
		
		//加入各个组件
		//添加JPanel
		jp1.add(jlb1);
		jp1.add(jtf1);
		jp2.add(jlb2);
		jp2.add(jpf1);
		jp3.add(jb1);
		jp3.add(jb2);		
		//把Panel加入JFrame
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		//设置窗体属性
		this.setTitle("会员管理系统");
		this.setSize(300, 150);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//显示窗体
		this.setVisible(true);
	}

}
