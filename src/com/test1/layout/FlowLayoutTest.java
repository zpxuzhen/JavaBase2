package com.test1.layout;

import java.awt.*;
import javax.swing.*;

/*流式布局管理器*/
/**
 * 
 * @author xuzhen
 *注意事项：
 *1.不限制它所管理的组件的大小，允许他们有最佳大小
 *2.当容器被缩放时，组件的位置可能变化，但组件的大小不变
 *3.默认组件是居中对齐，可以通过FlowLayout(int align)函数来指定对齐方式
 */

public class FlowLayoutTest  extends JFrame{

	//定义组件
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowLayoutTest test = new FlowLayoutTest();
	}

	public  FlowLayoutTest() {
		//创建组件
		jb1 = new JButton("关羽");
		jb2 = new JButton("张飞");
		jb3 = new JButton("赵云");
		jb4 = new JButton("马超");
		jb5 = new JButton("黄忠");
		jb6 = new JButton("魏延");
		
		//添加组件
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb5);
		this.add(jb6);
		
		//设置布局管理器
		this.setLayout(new FlowLayout(FlowLayout.LEFT));//左对齐
		
		//设置窗体属性
		this.setTitle("流式布局的演示");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//禁止用户改变窗体大小
		this.setResizable(false);
		
		//显示窗体
		this.setVisible(true);
	}
	
}
