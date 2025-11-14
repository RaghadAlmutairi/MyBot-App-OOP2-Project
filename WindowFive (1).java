
package groupProject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.*;

public class WindowFive extends JFrame implements ActionListener{
	

	 private JButton button1;
	 private JLabel labelText1,labelBackG,labelText2;
	 private JTextField text1;
	 private ImageIcon image1backgroung;
     private String name;
     private String text;
     private double TextPrice=0;
	
         
         public WindowFive(){
             
             
         }
	 public WindowFive(String name) {
		
		 this.name=name;
         JFrame frame=new JFrame(name+ " Bot ^.^ ");
		 frame.setSize(500, 500);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
	     
		 labelText1=new JLabel("Enter text to print it on your robot:");
		 labelText2=new JLabel("\"There will be an extra charge\"");
		 text1=new JTextField();
		 button1=new JButton("continue");
		
       
	        try{
	            image1backgroung =new ImageIcon(getClass().getResource("5.png"));
	            Image dabImage=image1backgroung.getImage();
	            Image modifeddabImage=dabImage.getScaledInstance(1380, 759, java.awt.Image.SCALE_SMOOTH);
	            image1backgroung=new ImageIcon(modifeddabImage);
	            labelBackG =new JLabel(image1backgroung,SwingConstants.CENTER);
	            labelBackG.setSize(1280,820);
	            
	            
	        }catch(Exception e){
	            System.err.println("Image not found");
	            System.exit(0); 
	        }
		 
		 
		 Font font1=new Font("Serif",Font.BOLD,25);
		 Font font2=new Font("Serif",Font.BOLD,30);
		 Font font3=new Font("Monospaced",Font.BOLD,20);
		 
		 labelText1.setForeground(Color.BLACK);
		 labelText1.setFont(font2);
		 labelText2.setForeground(Color.BLACK);
		 labelText2.setFont(font1);
		 text1.setForeground(Color.LIGHT_GRAY);
		 text1.setFont(font3);
		 
		 text1.setBounds(800, 170, 333,33);
		 labelText1.setBounds(300,130, 1000, 100);
		 button1.setBounds(555,470,200,50);
		 labelText2.setBounds(470, 200, 1000, 200);
		 
		 button1.setBackground(Color.BLACK);
		 button1.setForeground(Color.WHITE);
		 button1.setBorder(BorderFactory.createEtchedBorder());
		 button1.setFont(font3);
		 button1.addActionListener(this);
		 labelBackG.add(labelText1);
		 labelBackG.add(text1);
		 labelBackG.add(button1);
		 labelBackG.add(labelText2);
                 
                 
		 Menu m=new Menu(name);
		 frame.add(labelBackG,BorderLayout.CENTER);
		 frame.add(m.getMenuBar(),BorderLayout.NORTH);
		 frame.setExtendedState(MAXIMIZED_BOTH);
		 frame.setVisible(true);
		 
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button1) {
            String s=text1.getText();
            
			setTextBot(s);
			
                    if(s.equals("")){
                        setTextPrice(0);
                        writeInFile();
                        new WindowSix(name);
                  }else{
                        setTextPrice(100);
                        writeInFile();
                        new WindowSix(name);
                    }
		}
	    }
        public String getTextBot(){
            return text;
        }
        public double getTextPrice(){
            
            return TextPrice;
        }
        public void setTextBot(String text){
        	
            if(text.equals("")){
                this.text="no text";
            }else{
                this.text=text;
            }
            
        }
        public void setTextPrice(double TextPrice){
            
            this.TextPrice=TextPrice;
            
        }
        
        public void writeInFile() {
            try{
                File file=new File(name+".txt");
                FileWriter fw=new FileWriter(file,true);
                PrintWriter pw=new PrintWriter(fw);
                pw.println("-Text in the robot: \" "+getTextBot()+" \" ");
                pw.println("\t      >>>     *Text price: + "+getTextPrice()+" SR*\n");
                pw.close();
            }catch(Exception e){
                System.err.println(e.getMessage());
            }
            
        
}
        
}