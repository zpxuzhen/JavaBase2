package com.test1.demo;

import java.awt.*;

import javax.swing.*;

/*金山词霸 */
/**
 * 
 * @author xuzhen
 *
 */

public class Demo4  extends JFrame {

	//定义组件
	JSplitPane jsp;
	JList jlist;
	JLabel jl1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 test = new Demo4();
	}
	
	public  Demo4() {
		//创建组件
		String []words = {"boy","girl","good"};
		jlist = new JList(words);
		jl1 = new JLabel(new ImageIcon("images/cb.jpg"));
		//拆分窗口
		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jlist,jl1);
		//可以变化的窗口
		jsp.setOneTouchExpandable(true);
		
		//设置布局管理
		
		//加入各个组件
		this.add(jsp);
		
		//设置窗体属性
		this.setTitle("金山词霸");
		this.setSize(400, 300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//显示窗体
		this.setVisible(true);
	}
	
}
