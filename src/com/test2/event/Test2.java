package com.test2.event;

/**
 * 加深对事件处理机制的理解
 * @author xuzhen 
 *1。通过上下左右键，来控制一个小球的移动
 */
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

//事件监听者 类
public class Test2 extends JFrame {
	
	MyPanel mp = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t = new Test2();
	}
	public Test2(){
		mp = new MyPanel();
		this.add(mp);
		
		//注册监听
		this.addKeyListener(mp);
		
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}

class MyPanel extends JPanel implements KeyListener{
	
	int x = 10;
	int y = 10;
	public void paint(Graphics g) {
		super.paint(g);
		g.fillOval(x, y, 10, 10);
	}
	
	//事件监听者    ----  处理方法

	//键值被输出
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	//键被按下
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_UP){
			y--;
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN){
			y++;
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT){
			x--;
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			x++;
		}
		//重绘
		this.repaint();
	}
	//键被释放
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
		
}


