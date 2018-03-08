package com.test1.layout;

import java.awt.*;
import javax.swing.*;

/*边界布局管理器*/
/**
 * 
 * @author xuzhen
 * 步骤：
 * 1.继承JFrame
 * 2.定义需要的组件
 * 3.创建组件（构造函数）
 * 4.添加组件
 * 5.设置窗体属性
 * 6.显示窗体
 *
 *注意事项：
 *1.不是五个部分都必须添加
 *2.中部组件会自动调节大小
 *3.JFrame,JDialog 默认布局管理器就是BorderLayout
 */

public class BorderLayoutTest extends JFrame{
	
	//定义组件
	JButton jb1,jb2,jb3,jb4,jb5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BorderLayoutTest test = new BorderLayoutTest();
	}
	
	public  BorderLayoutTest() {
		//创建组件
		jb1 = new JButton("中部");
		jb2 = new JButton("北部");
		jb3 = new JButton("东部");
		jb4 = new JButton("南部");
		jb5 = new JButton("西部");
		
		//添加组件
		this.add(jb1,BorderLayout.CENTER);
		this.add(jb2,BorderLayout.NORTH);
		this.add(jb3,BorderLayout.EAST);
		this.add(jb4,BorderLayout.SOUTH);
		this.add(jb5,BorderLayout.WEST);
		
		//设置窗体属性
		this.setTitle("边界布局的演示");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//显示窗体
		this.setVisible(true);
	}

}
