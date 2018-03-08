package com.test1.demo;

import java.awt.*;

import javax.swing.*;

/*QQ聊天界面 */
/**
 * 
 * @author xuzhen
 *
 */

public class Demo5  extends JFrame {

	//定义组件
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
		//创建组件
		jta = new JTextArea();
		//滚动
		jsp = new JScrollPane(jta);
		jp = new JPanel();
		String []chatter={"布什","拉登"};
		jcb = new JComboBox(chatter);
		jtf = new JTextField(10);
		jb = new JButton("发送");
		
		//设置布局管理
		
		//加入各个组件
		jp.add(jcb);
		jp.add(jtf);
		jp.add(jb);
		
		this.add(jsp);
		this.add(jp,BorderLayout.SOUTH);
		//设置窗体属性
		this.setTitle("腾讯QQ");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//左上角的图标
		this.setIconImage(new ImageIcon("images/qq.jpg").getImage());
				
		//显示窗体
		this.setVisible(true);
	}
	
}
