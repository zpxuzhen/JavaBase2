package com.test1.layout;

/*演示网格包布局的使用*/

import java.awt.*;

import javax.swing.*;

public class GridBagLayoutTest extends JFrame{

	private static final long serialVersionUID = 1L;
	//外层最大的容器，整个应用的所有空间最终都放置在这个容器内
	private JPanel contentPanel;
	//我们通过如下7个按钮来演示这种布局方式的效果
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JPanel paddingPanel1;//用于填充第一行的尾部空间
	private JPanel paddingPanel2;//用于填充第二行的尾部空间
	private JPanel paddingPanel3;//用于填充第三行的尾部空间
	private JPanel paddingPanel4;//用于填充第三行的尾部空间
	private JPanel paddingPanel5;//用于填充第三行的尾部空间
	
	public GridBagLayoutTest() {
		super();
		//初始化所有控件
		initComponent();
		//构建整个应用界面
		initUI();
		//初始化JFrame窗体
		initJFrame();
	
	}
	//初始化所有控件
	private void initComponent(){
		
		btn1 = new JButton("按钮一");
		btn2 = new JButton("按钮二");
		btn3 = new JButton("按钮三");
		btn4 = new JButton("按钮四");
		btn5 = new JButton("按钮五");
		btn6 = new JButton("按钮六");
		btn7 = new JButton("按钮七");
		btn8 = new JButton("按钮八");
		btn9 = new JButton("按钮九");
		paddingPanel1 = new JPanel();
		paddingPanel2 = new JPanel();
		paddingPanel3 = new JPanel();
		paddingPanel4 = new JPanel();
		
		//创建外层最大的容器，整个应用的所有空间最终都放置在这个容器内
		contentPanel = new JPanel();
	}
	//构建整个应用界面
	private void initUI(){
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		//设置画布的布局方式
		contentPanel.setLayout(gridBagLayout);
		//将所有控件按照界面显示的顺序先全部放置到画布上
		contentPanel.add(btn1);
		contentPanel.add(btn2);
		contentPanel.add(btn3);
		contentPanel.add(paddingPanel1);
		contentPanel.add(btn4);
		contentPanel.add(paddingPanel2);
		contentPanel.add(btn5);
		contentPanel.add(btn6);
		contentPanel.add(btn7);
		contentPanel.add(paddingPanel3);
		contentPanel.add(btn8);
		contentPanel.add(btn9);
		contentPanel.add(paddingPanel4);
		//通过GridBagConstraints对象限制控件在显示区域的分布
		GridBagConstraints s = new GridBagConstraints();
		/**
		 * 如果组件所在区域比组件本身要大时，我们可以设置fill的值来控制控件的扩展显示样式
		 * fill 属性有如下取值:
		 * NONE:不调整组件大小
		 * HORIZONTAL:加宽组件，使它在水平方向上填满其显示区域，但是不改变高度
		 * VERTICAL:加高组件，使它在垂直方向上填满其显示区域，但是不改变宽度
		 * BOTH:使组件完全填满其显示区域
		 */
		s.fill = GridBagConstraints.NONE;
		s.anchor = GridBagConstraints.WEST;//控件在格子内的显示方位
		s.insets = new Insets(10, 5, 5, 0);//设置组件上，左，下，右四个边距
		s.gridwidth=1;//该方法是设置组件水平所占用的格子数，如果为0，就说明该组件是该行的最后一个（出现一次gridwidth=0，就表明一行结束了）
		s.gridheight=1;//组件垂直所占用的格子数
		s.weightx = 0;//该方法设置组件水平的拉伸幅度，如果为0就说明不拉伸，不为0就随着窗口的增大进行拉伸，0到1之间
		s.weighty = 0;//该方法设置组件垂直的拉伸幅度，如果为0就说明不拉伸，不为0就随着窗口的增大进行拉伸，0到1之间
		s.ipadx = 100;//将控件在x轴方向上进行指定大小的扩大
		s.ipadx = 50;//将控件在y轴方向上进行指定大小的扩大
		
		//设置第一行
		s.gridheight = 3;//btn1,跨1行，3列
		s.fill = GridBagConstraints.VERTICAL;//btn1,垂直填充这个区域
		//gridBagLayout其余属性保持不变即可，将这个修改后的对象设置到btn1这个控件上即可改变btn1的样式，以下类同！
		gridBagLayout.setConstraints(btn1, s);
		s.gridwidth = 2;//btn2,跨2行
		s.gridheight = 2;//btn2,跨2列
		s.fill = GridBagConstraints.BOTH;//btn2,水平垂直同时扩展填充这个区域
		gridBagLayout.setConstraints(btn2, s);
		s.gridwidth = 1;//btn3,跨1行
		s.gridheight = 1;//btn3,跨1列
		s.fill = GridBagConstraints.NONE;//btn3,不需要扩展填充
		gridBagLayout.setConstraints(btn3, s);
		s.gridwidth=0;//第一行结束，在尾部添加一个控件，占据剩余空间
		gridBagLayout.setConstraints(paddingPanel1, s);
		
		//设置第二行
		s.gridwidth = 1;//btn4,其跨1行1列
		gridBagLayout.setConstraints(btn4, s);
		s.gridwidth=0;//第二行结束，在尾部添加一个控件，占据剩余空间
		gridBagLayout.setConstraints(paddingPanel2, s);
		
		//设置第三行
		s.gridwidth = 1;//btn5,btn6,btn7,其跨1行1列
		gridBagLayout.setConstraints(btn5, s);
		gridBagLayout.setConstraints(btn6, s);
		gridBagLayout.setConstraints(btn7, s);
		s.gridwidth=0;//第三行结束，在尾部添加一个控件，占据剩余空间
		gridBagLayout.setConstraints(paddingPanel3, s);
		
		//设置第四行
		s.gridwidth = 2;
		s.fill = GridBagConstraints.BOTH;
		gridBagLayout.setConstraints(btn8, s);
		gridBagLayout.setConstraints(btn9, s);
		s.gridwidth=0;//第三行结束，在尾部添加一个控件，占据剩余空间
		gridBagLayout.setConstraints(paddingPanel4, s);
		
	}
	
	//初始化JFrame窗体
	private void initJFrame(){
		
		//将组件加入JFrame
		this.add(contentPanel,BorderLayout.CENTER);
		this.setTitle("演示网格包布局的使用");
		this.setSize(638, 368);
		//禁止窗口最大化
//		this.setResizable(Boolean.FALSE);
		//此窗口将置于屏幕的中央
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(Boolean.TRUE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridBagLayoutTest test = new GridBagLayoutTest();
		
	}

}
