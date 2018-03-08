package com.test1.graphics;

import java.awt.*;
import javax.swing.*;

/**
 * 
 * @author xuzhen
 * 功能：java绘图基本原理
 * 画直线drawLine
 * 画矩形边框drawRect
 * 画圆drawOval
 * 画图片drawImage
 * 画字符串drawString
 * 填充矩形fillRect
 * 填充椭圆fillOval
 * 设置画笔颜色setColor
 * 设置画笔字体setFont
 */
public class GraphicsTest extends JFrame{
	
	MyPanel mp=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicsTest demo01=new GraphicsTest();
	}
	public  GraphicsTest(){
		mp=new MyPanel();
		this.add(mp);
		
		//设置窗体大小
		this.setSize(400,300);
		//设置窗体坐标位置
		this.setLocation(200, 200);
		//禁止用户改变窗体大小
		this.setResizable(false);
		//关闭窗体则关闭应用程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//窗体可见
		this.setVisible(true);
	} 
}

//定义一个MyPanel(用于绘图和显示绘图的区域)

class MyPanel extends JPanel{
	//覆盖JPanel的paint方法
	//Graphics是绘图的重要类，可以理解为一只画笔
	public void paint(Graphics g) {
		//1.调用父类函数完成初始化,这句话，不能少
		super.paint(g);
		//先画一个圆
		g.drawOval(10, 10, 30, 30);
	}
}
