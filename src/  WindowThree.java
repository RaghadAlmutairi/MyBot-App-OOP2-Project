package groupProject;

import java.awt.*;
import javax.swing.*;

import groupProject.Menu;

public class WindowThree extends JFrame{
	
	private JButton button1,button2,button3,button4,button5;
	private JLabel label1,label2,label3,label4,label5;
	private ImageIcon image1,image2,image3,image4,image5;
	
	public WindowThree() {
		
		
		 JFrame frame=new JFrame("My Bot Application");
		 frame.setSize(500, 500);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 
		 label5 =new JLabel(image1,SwingConstants.CENTER);
		 label5.setSize(1280,820);
		 
		 image1 =new ImageIcon(getClass().getResource("7.png"));
		 //try and catch
		 Image dabImage=image1.getImage();
		 Image modifeddabImage=dabImage.getScaledInstance(1380, 759, java.awt.Image.SCALE_SMOOTH);
		 image1=new ImageIcon(modifeddabImage);
		 label5 =new JLabel(image1,SwingConstants.CENTER);
		 label5.setSize(1280,820);
		 
		 //component
		 button1=new JButton();
		 button2=new JButton();
		 button3=new JButton();
		 button4=new JButton();
		 button5=new JButton("exit");
		 Font font=new Font("Monospaced",Font.BOLD,20);
		 button5.setFont(font);
		 button1.setBounds(250,50,200,200);
		 button2.setBounds(780,50,200,200);
		 button3.setBounds(250,300,200,200);
		 button4.setBounds(780,300,200,200);
		 button5.setBounds(515,550,200,50);
		 
		 button5.setBackground(Color.BLACK);
		 button5.setForeground(Color.WHITE);
		 
		 Font font2=new Font("Monospaced",Font.BOLD,20);
		 label1=new JLabel("robot name");
		 label2=new JLabel("robot name");
		 label3=new JLabel("robot name");
		 label4=new JLabel("robot name");
		 label1.setFont(font2);
		 label2.setFont(font2);
		 label3.setFont(font2);
		 label4.setFont(font2);
		 label1.setBounds(290,220,200,100);
		 label2.setBounds(820,220,200,100);
		 label3.setBounds(290,470,200,100);
		 label4.setBounds(820,470,200,100);
		 
		 label5.add(button1);
		 label5.add(button2);
		 label5.add(button3);
		 label5.add(button4);
		 label5.add(button5);
		 
		 label5.add(label1);
		 label5.add(label2);
		 label5.add(label3);
		 label5.add(label4);
		 
		 Menu m=new Menu();
		 frame.add(label5,BorderLayout.CENTER);
		 frame.add(m.getMenuBar(),BorderLayout.NORTH);
		 frame.setExtendedState(MAXIMIZED_BOTH);
		 frame.setVisible(true);
		 
		 
	}

}
