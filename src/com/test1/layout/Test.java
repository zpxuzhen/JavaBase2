package com.test1.layout;

import java.awt.*;

import javax.swing.*;

/*多种布局管理器的使用*/
/**
 * 
 * @author xuzhen
 *注意事项：
 *1.JPanel是JComponent的子类
 *2.属于容器类组件，可以加入别的组件
 *3.默认布局管理器是  流式布局 （FlowLayout）
 **/
public class Test extends JFrame{

	//定义组件
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
	}
	
	public  Test() {
		//创建组件
		//JPanel默认布局是FlowLayout
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		jb1 = new JButton("西瓜");
		jb2 = new JButton("苹果");
		jb3 = new JButton("荔枝");
		jb4 = new JButton("葡萄");
		jb5 = new JButton("桔子");
		jb6 = new JButton("香蕉");
	
		//设置布局管理
		
		//添加JPanel
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		
		//把Panel加入JFrame
		this.add(jp1,BorderLayout.NORTH);
		this.add(jb6,BorderLayout.CENTER);
		this.add(jp2,BorderLayout.SOUTH);
		
		//设置窗体属性
		this.setTitle("复杂布局JPanel的演示");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//显示窗体
		this.setVisible(true);
	}

}
