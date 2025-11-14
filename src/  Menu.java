package groupProject;

import java.awt.*;
import javax.swing.*;

public class Menu {

	private JMenu menu1,menu2;
	private JMenuItem item1,item2,item3,item4,item5;
	private JMenuBar menuBar;
	private ImageIcon image1,image2;
	
	public Menu() {
		
		//try and catch
		image1 =new ImageIcon(getClass().getResource("17-avatar-man-nodding-outline.gif"));
		Image dabImage=image1.getImage();
		Image modifeddabImage=dabImage.getScaledInstance(40, 40, java.awt.Image.SCALE_FAST);
		image1=new ImageIcon(modifeddabImage);
		
		//try and catch
		image2 =new ImageIcon(getClass().getResource("2030-frysztak-town-outline.gif"));
		Image dabImage2=image2.getImage();
		Image modifeddabImage2=dabImage2.getScaledInstance(40, 40, java.awt.Image.SCALE_FAST);
		image2=new ImageIcon(modifeddabImage2);
		
		Font font=new Font("CENTER_BASELINE",Font.BOLD,14);
		Font font2=new Font("Monospaced",Font.BOLD,13);
		
		menu1=new JMenu("Account");
		menu2=new JMenu("Home");
		menu1.setIcon(image1);
		menu2.setIcon(image2);
		menu1.setFont(font);
		menu2.setFont(font);
		menu1.setForeground(Color.BLACK);
		menu2.setForeground(Color.BLACK);
		item1=new JMenuItem("view account");
		item1.setForeground(Color.ORANGE);
		item1.setBackground(Color.WHITE);
		item1.setFont(font2);
	    item2=new JMenuItem("Orders");
	    item2.setForeground(Color.ORANGE);
	    item2.setBackground(Color.WHITE);
	    item2.setFont(font2);
	    item3=new JMenuItem("Edit info");
	    item3.setForeground(Color.ORANGE);
	    item3.setBackground(Color.WHITE);
	    item3.setFont(font2);
	    item4=new JMenuItem("Home");
	    item4.setForeground(Color.ORANGE);
	    item4.setBackground(Color.WHITE);
	    item4.setFont(font2);
	    item5=new JMenuItem("About us");
	    item5.setForeground(Color.ORANGE);
	    item5.setBackground(Color.WHITE);
	    item5.setFont(font2);
	    
	    menu1.add(item1);
	    menu1.add(item2);
	    menu1.add(item3);
	    menu2.add(item4);
	    menu2.add(item5);
	    
	    menuBar=new JMenuBar();
	    menuBar.setBackground(Color.white);
	    menuBar.add(menu2);
	    menuBar.add(menu1);
	  
	}
	public JMenuBar getMenuBar() {
		
		
		return this.menuBar;
	}
}
