package groupProject;


import java.awt.*;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.*;


public class WindowEight extends JFrame implements ActionListener{
    
    private JButton button1,button2 ;
	private JLabel labelBackG;
	private ImageIcon image1backgroung;
        private String data="";
        private double totalPrice;
        private JTextArea bill;
        
    public WindowEight(String name) {
	
       
	 JFrame frame=new JFrame(name+ " Bot ^.^ ");
	 frame.setSize(500, 500);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
    
         bill =new JTextArea();
         
           try{
                File file= new File(name+".txt");
                Scanner readFile=new Scanner(file);
               
                while(readFile.hasNextLine()) {
                   String currentLine = readFile.nextLine();
                   String words[] = currentLine.split(" ");

                    for(String str : words) {
                        try {
                           double num = Double.parseDouble(str);
                           totalPrice += num;
                        }catch(NumberFormatException nfe) { }; 
                     }
		 }
		 readFile.close();
            }catch(Exception e){
                System.err.println(e.getMessage());
            }
         
         try{
                File file=new File(name+".txt");
                FileWriter fw=new FileWriter(file,true);
                PrintWriter pw=new PrintWriter(fw);
                pw.println("\n   ***TOTAL PRICE OF YOUR BOT*** ");
                pw.println("\t**"+totalPrice+" SR**");
                pw.close();
            }catch(Exception e){
                System.err.println(e.getMessage());
            }
         
         
         try{
                File file= new File(name+".txt");
                Scanner readFile=new Scanner(file);
                while(readFile.hasNext()) {
                    data+="\n";
                    data+=readFile.nextLine();
		 }
		 bill =new JTextArea(data);
                 readFile.close();
            }catch(Exception e){
                System.err.println(e.getMessage());
            }
         
       
         
         
         button1=new JButton("Home ^o^");
         button2 =new JButton("Exit");
        

        
        try{
            image1backgroung =new ImageIcon(getClass().getResource("1.png"));
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
	 
	 
	 Font font1=new Font("Serif",Font.BOLD,15);
     Font fontb1=new Font("Monospaced",Font.BOLD,20);
     
     bill.setForeground(Color.BLACK);
	 bill.setFont(font1);
	 button1.setBackground(Color.BLACK);
	 button1.setForeground(Color.WHITE);
	 button2.setBackground(Color.BLACK);
	 button2.setForeground(Color.WHITE);
	 button1.setBorder(BorderFactory.createEtchedBorder());
	 button2.setBorder(BorderFactory.createEtchedBorder());
	 button1.setFont(fontb1);
     button2.setFont(fontb1);
     
    bill.setOpaque(false);
    bill.setEditable(false);
    bill.setBounds(500, 30, 600, 500);
    button1.setBounds(460,550,200,50);
    button2.setBounds(700,550,200,50);
	button1.addActionListener(this);
	button2.addActionListener(this);
        
    labelBackG.add(bill);
	 labelBackG.add(button1);
     labelBackG.add(button2);
         
	Menu m=new Menu(name);
     
	 frame.add(labelBackG,BorderLayout.CENTER);
	 frame.add(m.getMenuBar(),BorderLayout.NORTH);
	 frame.setExtendedState(MAXIMIZED_BOTH);
	 frame.setVisible(true);
	 
}

    public void actionPerformed(ActionEvent e) {
	if(e.getSource()==button1){
            new  WindowOne();
        }else if(e.getSource()==button2){
            System.exit(0);
        }
 }

   
}  


