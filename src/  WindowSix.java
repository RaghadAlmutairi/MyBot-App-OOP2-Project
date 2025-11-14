
package groupProject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.*;


public class WindowSix extends JFrame implements ActionListener{
    private JButton button1,button2 ;
	private JLabel labelText, labelBackG,labelRot;
	private ImageIcon image1backgroung;
        private String name, KindOfSale;
        private double RobotPrice;
        private WindowThree price=new WindowThree();
        
        
        public WindowSix(){
            
        }
        public WindowSix(String name) {
	
	 this.name=name;
	 JFrame frame=new JFrame(name+ " Bot ^.^ ");
	 frame.setSize(500, 500);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
         labelText=new JLabel("Would you like to..");
         button1=new JButton("Buy bot");
         button2 =new JButton("Rent bot");
          
         
	//try and catch
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
	 
	 
	 Font font1=new Font("Serif",Font.BOLD,50);
     Font fontb1=new Font("Monospaced",Font.BOLD,20);
     
	 labelText.setForeground(Color.BLACK);
	 labelText.setFont(font1);
	 button1.setBackground(Color.BLACK);
	 button1.setForeground(Color.WHITE);
	 button2.setBackground(Color.BLACK);
	 button2.setForeground(Color.WHITE);
	 button1.setBorder(BorderFactory.createEtchedBorder());
	 button2.setBorder(BorderFactory.createEtchedBorder());
	 button1.setFont(fontb1);
     button2.setFont(fontb1);
     
     button1.setBounds(400,350,200,50);
	 button2.setBounds(700,350,200,50);
     labelText.setBounds(400, 100, 1000, 200);
     
	 button1.addActionListener(this);
	 button2.addActionListener(this);
         
     labelBackG.add(labelText);
	 labelBackG.add(button1);
     labelBackG.add(button2);
         
     
	 Menu m=new Menu(name);
     
	 frame.add(labelBackG,BorderLayout.CENTER);
	 frame.add(m.getMenuBar(),BorderLayout.NORTH);
	 frame.setExtendedState(MAXIMIZED_BOTH);
	 frame.setVisible(true);
	 
}

public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()==button1) {
                setKindOfSale("Buy");
                setBuyPrice(+30000);
                writeInFile();
		new WindowEight(name);
	}
	else if(e.getSource()==button2) {
                setKindOfSale("rent");
                setBuyPrice(0);
                writeInFile();
		new WindowSeven(name);
	}
    }
public String getKindOfSale(){ 
    
    return KindOfSale;
}
public double getBuyPrice(){
    return RobotPrice;
}
public void setKindOfSale(String KindOfSale){ 
    
    this.KindOfSale= KindOfSale;
}
public void setBuyPrice(double RobotPrice ){
    this.RobotPrice= RobotPrice;
}

      public void writeInFile() {
            try{
                File file=new File(name+".txt");
                FileWriter fw=new FileWriter(file,true);
                PrintWriter pw=new PrintWriter(fw);
                pw.println("-Kind of sale: "+getKindOfSale()+"\n");
                pw.println("      >>>     *Buy price: +"+getBuyPrice()+" SR*\n");
                pw.close();
            }catch(Exception e){
                System.err.println(e.getMessage());
            }
            
        
}
}
    

