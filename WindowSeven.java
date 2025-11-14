
package groupProject;

import javax.swing.*;
import java.awt.*;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author rkhm3
 */
public class WindowSeven implements ActionListener{
    private JButton button1 ;
    private JLabel labelText,labelBackG;
    private ImageIcon image1backgroung;
    private JRadioButton hours,day,month,year ;
    private ButtonGroup group;
    private JTextField text1;
    private String name ;
    private double price=0;
    
    
    public WindowSeven( ){
        
    }
        public WindowSeven(String name){
	this.name=name;
	 JFrame frame=new JFrame(name+ " Bot ^.^ ");
	 frame.setSize(500, 500);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     

        hours=new JRadioButton("Hours",true);
        day =new JRadioButton("Day");
        month =new JRadioButton("Month");
        year =new JRadioButton("Year");
        
        group = new ButtonGroup();
        group.add(hours);
        group.add(day);
        group.add(month);
        group.add(year);
        
        hours.setOpaque(false);
        day.setOpaque(false);
        month.setOpaque(false);
        year.setOpaque(false);
        
       
        labelText=new JLabel("Enter how long do you need the bot:");
        text1=new JTextField(15);
    	button1=new JButton("Done");
        
        
	//try and catch
        try{
            image1backgroung =new ImageIcon(getClass().getResource("7.png"));
            labelBackG =new JLabel(image1backgroung,SwingConstants.CENTER);
            labelBackG.setSize(1280,820);
            Image dabImage=image1backgroung.getImage();
            Image modifeddabImage=dabImage.getScaledInstance(1380, 759, java.awt.Image.SCALE_SMOOTH);
            image1backgroung=new ImageIcon(modifeddabImage);
            labelBackG =new JLabel(image1backgroung,SwingConstants.CENTER);
            labelBackG.setSize(1280,820);
            
        
        }catch(Exception e){
            System.err.println("Image not found");
            System.exit(0); 
        }
	 

     Font font1=new Font("Monospaced",Font.BOLD,20);
	 Font font2=new Font("Serif",Font.BOLD,30);
     Font font3=new Font("Serif",Font.BOLD,26);
	 
     labelText.setForeground(Color.BLACK);
	 labelText.setFont(font2);
	 labelText.setBounds(300,150, 1000, 200);
	 text1.setBounds(780, 240, 200, 33);
	 
     hours.setForeground(Color.BLACK);
	 hours.setFont(font3);
	 hours.setBounds(300, 350,100, 50); 
     day.setForeground(Color.BLACK);
	 day.setFont(font3);
	 day.setBounds(500, 350, 100, 50); 
     month.setForeground(Color.BLACK);
	 month.setFont(font3);
	 month.setBounds(700, 350,100,50); 
     year.setForeground(Color.BLACK);
	 year.setFont(font3);
	 year.setBounds(900, 350, 100,50); 
	 text1.setFont(font1);
         
	 button1.setBounds(550,500,200,50);
	 button1.setBackground(Color.BLACK);
	 button1.setForeground(Color.WHITE);
	 button1.setBorder(BorderFactory.createEtchedBorder());
     button1.setFont(font1);
       
	 button1.addActionListener(this);


        labelBackG.add(hours);
        labelBackG.add(day);
        labelBackG.add(month);
        labelBackG.add(year);
        labelBackG.add(labelText);
        labelBackG.add(button1);
        labelBackG.add(text1);
        
         
	 Menu m=new Menu(name);
     
	 frame.add(labelBackG,BorderLayout.CENTER);
	 frame.add(m.getMenuBar(),BorderLayout.NORTH);
	 frame.setExtendedState(MAXIMIZED_BOTH);
	 frame.setVisible(true);
	 
}

public void actionPerformed(ActionEvent e) {
    double number=Double.parseDouble(text1.getText());
    
	if(hours.isSelected()){
            setPrice (number*80);
            writeInFile();
        }else if (day.isSelected()){
            setPrice (number*160);
            writeInFile();
        }else if(month.isSelected()){
            setPrice ( number*240);
            writeInFile();
        }else{
            setPrice(number*320);
            writeInFile();
        }
    
	 new WindowEight(name);
    }

public double getPrice(){
    
        return price;
}
public void setPrice(double price){
    
        this.price = price;
}
 public void writeInFile() {
            try{
                File file=new File(name+".txt");
                FileWriter fw=new FileWriter(file,true);
                PrintWriter pw=new PrintWriter(fw);
                pw.println("      >>>     *Rent price: +"+getPrice()+" SR*\n");
                pw.close();
            }catch(Exception e){
                System.err.println(e.getMessage());
            }
            
        
}
}


