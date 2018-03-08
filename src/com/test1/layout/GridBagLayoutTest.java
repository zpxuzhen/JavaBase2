package com.test1.layout;

/*��ʾ��������ֵ�ʹ��*/

import java.awt.*;

import javax.swing.*;

public class GridBagLayoutTest extends JFrame{

	private static final long serialVersionUID = 1L;
	//�����������������Ӧ�õ����пռ����ն����������������
	private JPanel contentPanel;
	//����ͨ������7����ť����ʾ���ֲ��ַ�ʽ��Ч��
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JPanel paddingPanel1;//��������һ�е�β���ռ�
	private JPanel paddingPanel2;//�������ڶ��е�β���ռ�
	private JPanel paddingPanel3;//�����������е�β���ռ�
	private JPanel paddingPanel4;//�����������е�β���ռ�
	private JPanel paddingPanel5;//�����������е�β���ռ�
	
	public GridBagLayoutTest() {
		super();
		//��ʼ�����пؼ�
		initComponent();
		//��������Ӧ�ý���
		initUI();
		//��ʼ��JFrame����
		initJFrame();
	
	}
	//��ʼ�����пؼ�
	private void initComponent(){
		
		btn1 = new JButton("��ťһ");
		btn2 = new JButton("��ť��");
		btn3 = new JButton("��ť��");
		btn4 = new JButton("��ť��");
		btn5 = new JButton("��ť��");
		btn6 = new JButton("��ť��");
		btn7 = new JButton("��ť��");
		btn8 = new JButton("��ť��");
		btn9 = new JButton("��ť��");
		paddingPanel1 = new JPanel();
		paddingPanel2 = new JPanel();
		paddingPanel3 = new JPanel();
		paddingPanel4 = new JPanel();
		
		//���������������������Ӧ�õ����пռ����ն����������������
		contentPanel = new JPanel();
	}
	//��������Ӧ�ý���
	private void initUI(){
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		//���û����Ĳ��ַ�ʽ
		contentPanel.setLayout(gridBagLayout);
		//�����пؼ����ս�����ʾ��˳����ȫ�����õ�������
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
		//ͨ��GridBagConstraints�������ƿؼ�����ʾ����ķֲ�
		GridBagConstraints s = new GridBagConstraints();
		/**
		 * ����������������������Ҫ��ʱ�����ǿ�������fill��ֵ�����ƿؼ�����չ��ʾ��ʽ
		 * fill ����������ȡֵ:
		 * NONE:�����������С
		 * HORIZONTAL:�ӿ������ʹ����ˮƽ��������������ʾ���򣬵��ǲ��ı�߶�
		 * VERTICAL:�Ӹ������ʹ���ڴ�ֱ��������������ʾ���򣬵��ǲ��ı���
		 * BOTH:ʹ�����ȫ��������ʾ����
		 */
		s.fill = GridBagConstraints.NONE;
		s.anchor = GridBagConstraints.WEST;//�ؼ��ڸ����ڵ���ʾ��λ
		s.insets = new Insets(10, 5, 5, 0);//��������ϣ����£����ĸ��߾�
		s.gridwidth=1;//�÷������������ˮƽ��ռ�õĸ����������Ϊ0����˵��������Ǹ��е����һ��������һ��gridwidth=0���ͱ���һ�н����ˣ�
		s.gridheight=1;//�����ֱ��ռ�õĸ�����
		s.weightx = 0;//�÷����������ˮƽ��������ȣ����Ϊ0��˵�������죬��Ϊ0�����Ŵ��ڵ�����������죬0��1֮��
		s.weighty = 0;//�÷������������ֱ��������ȣ����Ϊ0��˵�������죬��Ϊ0�����Ŵ��ڵ�����������죬0��1֮��
		s.ipadx = 100;//���ؼ���x�᷽���Ͻ���ָ����С������
		s.ipadx = 50;//���ؼ���y�᷽���Ͻ���ָ����С������
		
		//���õ�һ��
		s.gridheight = 3;//btn1,��1�У�3��
		s.fill = GridBagConstraints.VERTICAL;//btn1,��ֱ����������
		//gridBagLayout�������Ա��ֲ��伴�ɣ�������޸ĺ�Ķ������õ�btn1����ؼ��ϼ��ɸı�btn1����ʽ��������ͬ��
		gridBagLayout.setConstraints(btn1, s);
		s.gridwidth = 2;//btn2,��2��
		s.gridheight = 2;//btn2,��2��
		s.fill = GridBagConstraints.BOTH;//btn2,ˮƽ��ֱͬʱ��չ����������
		gridBagLayout.setConstraints(btn2, s);
		s.gridwidth = 1;//btn3,��1��
		s.gridheight = 1;//btn3,��1��
		s.fill = GridBagConstraints.NONE;//btn3,����Ҫ��չ���
		gridBagLayout.setConstraints(btn3, s);
		s.gridwidth=0;//��һ�н�������β�����һ���ؼ���ռ��ʣ��ռ�
		gridBagLayout.setConstraints(paddingPanel1, s);
		
		//���õڶ���
		s.gridwidth = 1;//btn4,���1��1��
		gridBagLayout.setConstraints(btn4, s);
		s.gridwidth=0;//�ڶ��н�������β�����һ���ؼ���ռ��ʣ��ռ�
		gridBagLayout.setConstraints(paddingPanel2, s);
		
		//���õ�����
		s.gridwidth = 1;//btn5,btn6,btn7,���1��1��
		gridBagLayout.setConstraints(btn5, s);
		gridBagLayout.setConstraints(btn6, s);
		gridBagLayout.setConstraints(btn7, s);
		s.gridwidth=0;//�����н�������β�����һ���ؼ���ռ��ʣ��ռ�
		gridBagLayout.setConstraints(paddingPanel3, s);
		
		//���õ�����
		s.gridwidth = 2;
		s.fill = GridBagConstraints.BOTH;
		gridBagLayout.setConstraints(btn8, s);
		gridBagLayout.setConstraints(btn9, s);
		s.gridwidth=0;//�����н�������β�����һ���ؼ���ռ��ʣ��ռ�
		gridBagLayout.setConstraints(paddingPanel4, s);
		
	}
	
	//��ʼ��JFrame����
	private void initJFrame(){
		
		//���������JFrame
		this.add(contentPanel,BorderLayout.CENTER);
		this.setTitle("��ʾ��������ֵ�ʹ��");
		this.setSize(638, 368);
		//��ֹ�������
//		this.setResizable(Boolean.FALSE);
		//�˴��ڽ�������Ļ������
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(Boolean.TRUE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridBagLayoutTest test = new GridBagLayoutTest();
		
	}

}
