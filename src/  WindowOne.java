package groupProject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WindowOne extends JFrame implements ActionListener{
	
	private JButton button1,button2;
	private JLabel label1,label2;
	private ImageIcon image1,image2,image3;
	
	
	
	public WindowOne() {
		
		
		JFrame frame=new JFrame("My Bot Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		
		image1 =new ImageIcon(getClass().getResource("MYBotIm.jpeg"));
		//try and catch
		Image dabImage=image1.getImage();
		Image modifeddabImage=dabImage.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
		image1=new ImageIcon(modifeddabImage);
		label1 =new JLabel(image1,SwingConstants.CENTER);
		
		
		//try and catch
		image2 =new ImageIcon(getClass().getResource("2030-frysztak-town-outline.gif"));
		Image dabImage2=image2.getImage();
		Image modifeddabImage2=dabImage2.getScaledInstance(50, 50, java.awt.Image.SCALE_FAST);
		image2=new ImageIcon(modifeddabImage2);
		
		image3 =new ImageIcon(getClass().getResource("2.png"));
		//try and catch
		Image dabImage3=image3.getImage();
		Image modifeddabImage3=dabImage3.getScaledInstance(1380, 759, java.awt.Image.SCALE_SMOOTH);
		image3=new ImageIcon(modifeddabImage3);
	    label2 =new JLabel(image3,SwingConstants.CENTER);
		label2.setSize(1280,820);
		
		button1=new JButton("Login");
		Font font=new Font("Monospaced",Font.BOLD,24);
		button1.setFont(font);
		button1.setForeground(Color.WHITE);
		button1.setBackground(Color.BLACK);
		button1.setToolTipText("Click if you have an acount");
		button1.addActionListener(this);
		
		button2=new JButton("Register");
		button2.setFont(font);
		button2.setForeground(Color.WHITE);
		button2.setBackground(Color.BLACK);
		button2.setToolTipText("Click if you do not have an acount");
		button2.addActionListener(this);
		
		label1.setBounds(500, 50, 300, 300);
		button1.setBounds(700,470,200,50);
		button2.setBounds(400,470,200,50);
		
		label2.add(label1);
		label2.add(button1);
		label2.add(button2);
		
		Menu m=new Menu();
		
		frame.add(m.getMenuBar(),BorderLayout.NORTH);
		frame.add(label2);
		frame.setExtendedState(MAXIMIZED_BOTH);
		frame.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
	
		
		if(e.getSource()==button1) {
			
			new WindowTwo();
			
			
		}else if (e.getSource()==button2) {
			
			new WindowTwo();
		}
		
	}
}
