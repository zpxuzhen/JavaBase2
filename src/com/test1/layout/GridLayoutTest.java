package com.test1.layout;

import java.awt.*;

import javax.swing.*;

/*网格布局管理器*/
/**
 * 
 * @author xuzhen
 *注意事项：
 *1.组件的相对位置不随容器的缩放而变化，但大小会变化
 *2.所有组件的大小相同
 *3.可以通过GridLayout(int rows,int cols,int hgap,int vgap)来指定网格的行、列，水平间隔、垂直间隔
 */

public class GridLayoutTest  extends JFrame{

	//定义组件
	JButton jbs[] = new JButton[9];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridLayoutTest test = new GridLayoutTest();
	}

	public  GridLayoutTest() {
		//创建组件
		for(int i=0;i<jbs.length;i++)
		{
			jbs[i]=new JButton(String.valueOf(i+1));
		}
		
		//设置布局管理器
		this.setLayout(new GridLayout(3,3,10,10));//几行几列,间距
		
		//添加组件
		for(int i=0;i<jbs.length;i++)
		{
			this.add(jbs[i]);
		}
				
		//设置窗体属性
		this.setTitle("网格布局的演示");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//显示窗体
		this.setVisible(true);
	}
	
}
