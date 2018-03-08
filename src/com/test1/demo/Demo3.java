package com.test1.demo;

import java.awt.*;

import javax.swing.*;

/*用户调查界面*/
/**
 * 
 * @author xuzhen
 *
 */

public class Demo3  extends JFrame {

	//定义组件
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
		//创建组件
		jp1 = new JPanel();
		jp2 = new JPanel();
		jl1 = new JLabel("你的籍贯");
		jl2 = new JLabel("旅游地点");
		
		String [] jg = {"北京","上海","天津","火星"};
		jcb1 = new JComboBox(jg);
		
		String [] dd = {"九寨沟","故宫","长城","天安门"};
		jlist = new JList(dd);
		//设置你希望显示多少选项
		jlist.setVisibleRowCount(1);
		jsp = new JScrollPane(jlist);
		

	
		//设置布局管理
		this.setLayout(new GridLayout(2,1));
		
		//加入各个组件
		//添加JPanel
		jp1.add(jl1);
		jp1.add(jcb1);
		jp2.add(jl2);
		jp2.add(jsp);
	
		//把Panel加入JFrame
		this.add(jp1);
		this.add(jp2);

		
		//设置窗体属性
		this.setTitle("用户调查");
		this.setSize(300, 150);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//显示窗体
		this.setVisible(true);
	}
	
}
