package groupProject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class WindowTwo extends JFrame implements ActionListener{
	private JButton button1;
	private JLabel label1,label2,label3;
	private JTextField text1;
	private ImageIcon image1;
	
public WindowTwo() {
	
	 JFrame frame=new JFrame("My Bot Application");
	 frame.setSize(500, 500);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 label3 =new JLabel(image1,SwingConstants.CENTER);
	 label3.setSize(1280,820);
	 
	 button1=new JButton("continue");
	 label1=new JLabel("Welcome..");
	 label2=new JLabel("Enter your name ");
	 text1=new JTextField(10);
	 
	 
	 
	 image1 =new ImageIcon(getClass().getResource("1.png"));
	//try and catch
	 Image dabImage=image1.getImage();
	 Image modifeddabImage=dabImage.getScaledInstance(1380, 759, java.awt.Image.SCALE_SMOOTH);
	 image1=new ImageIcon(modifeddabImage);
	 label3 =new JLabel(image1,SwingConstants.CENTER);
	 label3.setSize(1280,820);
	 
	 
	 Font font1=new Font("Serif",Font.BOLD,70);
	 Font font2=new Font("Serif",Font.BOLD,30);
	 label1.setForeground(Color.BLACK);
	 label2.setForeground(Color.BLACK);
	 label1.setFont(font1);
	 label2.setFont(font2);
	 text1.setBounds(700, 300, 150, 25);
	 label1.setBounds(500, 40, 1000, 200);
	 label2.setBounds(400, 210, 1000, 200);
	 button1.setBounds(550,470,200,50);
	 button1.setBackground(Color.BLACK);
	 button1.setForeground(Color.WHITE);
	 button1.setBorder(BorderFactory.createEtchedBorder());
	 Font font=new Font("Monospaced",Font.BOLD,20);
	 button1.setFont(font);
	 button1.addActionListener(this);
	 label3.add(label1);
	 label3.add(label2);
	 label3.add(text1);
	 label3.add(button1);
	 
	 Menu m=new Menu();
	 frame.add(label3,BorderLayout.CENTER);
	 frame.add(m.getMenuBar(),BorderLayout.NORTH);
	 frame.setExtendedState(MAXIMIZED_BOTH);
	 frame.setVisible(true);
	 
}
public boolean register() {
	
	/*
	 * wr file 
	 * read first if the name is unique
	 * write the name 
	 * if its not display message that the name already exist
	 * using get text to compare
	 */
	 
	 return true;
	 
}
public boolean login() {
	/*
	 * wr file 
	 * read first if the name exist 
	 * continue   
	 * if its not ask to enter the name again
	 * using get text to compare
	 */
	return true;
}
public void actionPerformed(ActionEvent e) {
	
	
	  if(login()||register()) {
		if(e.getSource()==button1) {
			new WindowThree();
		}
	  }
}
}
