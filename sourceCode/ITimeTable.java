import java.lang.Object;
import java.util.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;
 
public class ITimeTable extends JFrame
{
     
       JPanel PPage3 = new JPanel(null);
       Container c = getContentPane();
       JLabel lb1=new JLabel("Invigilator Timetable");
     
       Font f=new Font("Times",Font.BOLD,13);
       Font f1=new Font("Times",Font.BOLD,24);
       Font f2=new Font("Times",Font.BOLD,19);
        Font f3=new Font("Times",Font.BOLD,14);
       JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12; 
       JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
       JButton b1;


    public ITimeTable()
      {
        super("Day Selection");
        setPreferredSize(new Dimension(2000,2000));
       

        l1=new JLabel("WELCOME TO INVIGILATOR TIMETABLE MANAGEMENT");
        l1.setBounds(310,20,700,100);
        l1.setFont(f1);
        l2=new JLabel("SELECT THE DAYS FOR MANAGING INVIGILATION");
        l2.setBounds(390,90,600,100);
        l2.setFont(f2);
        l3=new JLabel("Monday - FN");
        l3.setBounds(430,180,100,100);
        l3.setFont(f);
        l4=new JLabel("Tuesday - FN");
        l4.setBounds(430,230,100,100);
        l4.setFont(f);
        l5=new JLabel("Wednesday - FN");
        l5.setBounds(430,280,120,100);
        l5.setFont(f);
        l6=new JLabel("Thursday - FN");
        l6.setBounds(430,330,100,100);
        l6.setFont(f);
        l7=new JLabel("Friday - FN");
        l7.setBounds(430,380,100,100);
        l7.setFont(f);
        l8=new JLabel("Saturday - FN");
        l8.setBounds(430,430,100,100);
        l8.setFont(f);
  
        l9=new JLabel("Monday - AN");
        l9.setBounds(630,180,100,100);
        l9.setFont(f);
        l10=new JLabel("Tuesday - AN");
        l10.setBounds(630,230,100,100);
        l10.setFont(f);
        l11=new JLabel("Wednesday - AN"); 
        l11.setBounds(630,280,120,100);  
        l11.setFont(f);
        l12=new JLabel("Thursday - AN");
        l12.setBounds(630,330,100,100);
        l12.setFont(f);
        l13=new JLabel("Friday - AN");
        l13.setBounds(630,380,100,100);
        l13.setFont(f);
        l14=new JLabel("Saturday - AN"); 
        l14.setBounds(630,430,100,100);
        l14.setFont(f);

 
   
        PPage3.add(l1);
        PPage3.add(l2);
        PPage3.add(l3);
        PPage3.add(l4);
        PPage3.add(l5);
        PPage3.add(l6);
        PPage3.add(l7);
        PPage3.add(l8);
        PPage3.add(l9);
        PPage3.add(l10);
        PPage3.add(l11);
        PPage3.add(l12);
        PPage3.add(l13);
        PPage3.add(l14);
      
        c1=new JCheckBox("MondayFN");
        c1.setBounds(560,220,20,20);
        c2=new JCheckBox("TuesdayFN");
        c2.setBounds(560,270,20,20);
        c3=new JCheckBox("WednesdayFN");
        c3.setBounds(560,320,20,20);
        c4=new JCheckBox("ThursdayFN");
        c4.setBounds(560,370,20,20); 
        c5=new JCheckBox("FridayFN");
        c5.setBounds(560,420,20,20);
        c6=new JCheckBox("SaturdayFN");
        c6.setBounds(560,470,20,20);
        c7=new JCheckBox("MondayAN");
        c7.setBounds(760,220,20,20);
        c8=new JCheckBox("TuesdayAN");
        c8.setBounds(760,270,20,20);
        c9=new JCheckBox("WednesdayAN");
        c9.setBounds(760,320,20,20);
        c10=new JCheckBox("ThursdayAN");
        c10.setBounds(760,370,20,20); 
        c11=new JCheckBox("FridayAN");
        c11.setBounds(760,420,20,20);
        c12=new JCheckBox("SaturdayAN");
        c12.setBounds(760,470,20,20);

        PPage3.add(c1);
        PPage3.add(c2);
        PPage3.add(c3);
        PPage3.add(c4); 
        PPage3.add(c5);
        PPage3.add(c6);      
        PPage3.add(c7);
        PPage3.add(c8);
        PPage3.add(c9);
        PPage3.add(c10); 
        PPage3.add(c11);
        PPage3.add(c12);        


        b1=new JButton("Proceed"); 
        b1.setBounds(570,550,100,20);
        PPage3.add(b1); 

        setVisible(true);
	c.add(PPage3);
	pack();
	setVisible(true);
        b1.addActionListener(new Button()); 
	
      }


      
    public static void main(String args[])
	{
		ITimeTable p=new ITimeTable();
	}
class Button implements ActionListener
{
       public void actionPerformed(ActionEvent e)
       {
        if(e.getActionCommand()=="Proceed")
              new Page32(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12);
             
       }
}
}



class Page32 extends JFrame
{
	JPanel PPage3 = new JPanel(null);

        String c11,c22,c33,c44,c55,c66,c77,c88,c99,c111,c222,c333="5";
        ResultSet rs=null;
        Connection con=null;
        Statement stmt=null;

        Font f1=new Font("Times",Font.BOLD,18);
        Font f2=new Font("Times",Font.BOLD,25);


        JLabel Lname1 = new JLabel("Names");
        JLabel Lname2 = new JLabel("INVIGILATOR SELECTION");


    
        JCheckBox m1=new JCheckBox("1");
        JCheckBox m2=new JCheckBox("2");
        JCheckBox m3=new JCheckBox("3");
        JCheckBox m4=new JCheckBox("4");
        JCheckBox m5=new JCheckBox("5");
        JCheckBox m6=new JCheckBox("6");
        JCheckBox m7=new JCheckBox("7");
        JCheckBox m8=new JCheckBox("8");
        JCheckBox m9=new JCheckBox("9");
        JCheckBox m10=new JCheckBox("10");
        JCheckBox m11=new JCheckBox("11");
        JCheckBox m12=new JCheckBox("12");
        JCheckBox m13=new JCheckBox("13");
        JCheckBox m14=new JCheckBox("14");
        JCheckBox m15=new JCheckBox("15");
        JCheckBox m16=new JCheckBox("16");
        JCheckBox m17=new JCheckBox("17");
        JCheckBox m18=new JCheckBox("18");
        JCheckBox m19=new JCheckBox("19");
        JCheckBox m20=new JCheckBox("20");
        JCheckBox m21=new JCheckBox("21");
        JCheckBox m22=new JCheckBox("22");
        JCheckBox m23=new JCheckBox("23");
        JCheckBox m24=new JCheckBox("24");
        JCheckBox m25=new JCheckBox("25");
        JCheckBox m26=new JCheckBox("26");
        JCheckBox m27=new JCheckBox("27");
        JCheckBox m28=new JCheckBox("28");

        JCheckBox tu1=new JCheckBox("1");
        JCheckBox tu2=new JCheckBox("2");
        JCheckBox tu3=new JCheckBox("3");
        JCheckBox tu4=new JCheckBox("4");
        JCheckBox tu5=new JCheckBox("5");
        JCheckBox tu6=new JCheckBox("6");
        JCheckBox tu7=new JCheckBox("7");
        JCheckBox tu8=new JCheckBox("8");
        JCheckBox tu9=new JCheckBox("9");
        JCheckBox tu10=new JCheckBox("10");
        JCheckBox tu11=new JCheckBox("11");
        JCheckBox tu12=new JCheckBox("12");
        JCheckBox tu13=new JCheckBox("13");
        JCheckBox tu14=new JCheckBox("14");
        JCheckBox tu15=new JCheckBox("15");
        JCheckBox tu16=new JCheckBox("16");
        JCheckBox tu17=new JCheckBox("17");
        JCheckBox tu18=new JCheckBox("18");
        JCheckBox tu19=new JCheckBox("19");
        JCheckBox tu20=new JCheckBox("20");
        JCheckBox tu21=new JCheckBox("21");
        JCheckBox tu22=new JCheckBox("22");
        JCheckBox tu23=new JCheckBox("23");
        JCheckBox tu24=new JCheckBox("24");
        JCheckBox tu25=new JCheckBox("25");
        JCheckBox tu26=new JCheckBox("26");
        JCheckBox tu27=new JCheckBox("27");
        JCheckBox tu28=new JCheckBox("28");


        JCheckBox we1=new JCheckBox("1");
        JCheckBox we2=new JCheckBox("2");
        JCheckBox we3=new JCheckBox("3");
        JCheckBox we4=new JCheckBox("4");
        JCheckBox we5=new JCheckBox("5");
        JCheckBox we6=new JCheckBox("6");
        JCheckBox we7=new JCheckBox("7");
        JCheckBox we8=new JCheckBox("8");
        JCheckBox we9=new JCheckBox("9");
        JCheckBox we10=new JCheckBox("10");
        JCheckBox we11=new JCheckBox("11");
        JCheckBox we12=new JCheckBox("12");
        JCheckBox we13=new JCheckBox("13");
        JCheckBox we14=new JCheckBox("14");
        JCheckBox we15=new JCheckBox("15");
        JCheckBox we16=new JCheckBox("16");
        JCheckBox we17=new JCheckBox("17");
        JCheckBox we18=new JCheckBox("18");
        JCheckBox we19=new JCheckBox("19");
        JCheckBox we20=new JCheckBox("20");
        JCheckBox we21=new JCheckBox("21");
        JCheckBox we22=new JCheckBox("22");
        JCheckBox we23=new JCheckBox("23");
        JCheckBox we24=new JCheckBox("24");
        JCheckBox we25=new JCheckBox("25");
        JCheckBox we26=new JCheckBox("26");
        JCheckBox we27=new JCheckBox("27");
        JCheckBox we28=new JCheckBox("28");

        JCheckBox th1=new JCheckBox("1");
        JCheckBox th2=new JCheckBox("2");
        JCheckBox th3=new JCheckBox("3");
        JCheckBox th4=new JCheckBox("4");
        JCheckBox th5=new JCheckBox("5");
        JCheckBox th6=new JCheckBox("6");
        JCheckBox th7=new JCheckBox("7");
        JCheckBox th8=new JCheckBox("8");
        JCheckBox th9=new JCheckBox("9");
        JCheckBox th10=new JCheckBox("10");
        JCheckBox th11=new JCheckBox("11");
        JCheckBox th12=new JCheckBox("12");
        JCheckBox th13=new JCheckBox("13");
        JCheckBox th14=new JCheckBox("14");
        JCheckBox th15=new JCheckBox("15");
        JCheckBox th16=new JCheckBox("16");
        JCheckBox th17=new JCheckBox("17");
        JCheckBox th18=new JCheckBox("18");
        JCheckBox th19=new JCheckBox("19");
        JCheckBox th20=new JCheckBox("20");
        JCheckBox th21=new JCheckBox("21");
        JCheckBox th22=new JCheckBox("22");
        JCheckBox th23=new JCheckBox("23");
        JCheckBox th24=new JCheckBox("24");
        JCheckBox th25=new JCheckBox("25");
        JCheckBox th26=new JCheckBox("26");
        JCheckBox th27=new JCheckBox("27");
        JCheckBox th28=new JCheckBox("28");

        JCheckBox fr1=new JCheckBox("1");
        JCheckBox fr2=new JCheckBox("2");
        JCheckBox fr3=new JCheckBox("3");
        JCheckBox fr4=new JCheckBox("4");
        JCheckBox fr5=new JCheckBox("5");
        JCheckBox fr6=new JCheckBox("6");
        JCheckBox fr7=new JCheckBox("7");
        JCheckBox fr8=new JCheckBox("8");
        JCheckBox fr9=new JCheckBox("9");
        JCheckBox fr10=new JCheckBox("10");
        JCheckBox fr11=new JCheckBox("11");
        JCheckBox fr12=new JCheckBox("12");
        JCheckBox fr13=new JCheckBox("13");
        JCheckBox fr14=new JCheckBox("14");
        JCheckBox fr15=new JCheckBox("15");
        JCheckBox fr16=new JCheckBox("16");
        JCheckBox fr17=new JCheckBox("17");
        JCheckBox fr18=new JCheckBox("18");
        JCheckBox fr19=new JCheckBox("19");
        JCheckBox fr20=new JCheckBox("20");
        JCheckBox fr21=new JCheckBox("21");
        JCheckBox fr22=new JCheckBox("22");
        JCheckBox fr23=new JCheckBox("23");
        JCheckBox fr24=new JCheckBox("24");
        JCheckBox fr25=new JCheckBox("25");
        JCheckBox fr26=new JCheckBox("26");
        JCheckBox fr27=new JCheckBox("27");
        JCheckBox fr28=new JCheckBox("28");

        JCheckBox sa1=new JCheckBox("1");
        JCheckBox sa2=new JCheckBox("2");
        JCheckBox sa3=new JCheckBox("3");
        JCheckBox sa4=new JCheckBox("4");
        JCheckBox sa5=new JCheckBox("5");
        JCheckBox sa6=new JCheckBox("6");
        JCheckBox sa7=new JCheckBox("7");
        JCheckBox sa8=new JCheckBox("8");
        JCheckBox sa9=new JCheckBox("9");
        JCheckBox sa10=new JCheckBox("10");
        JCheckBox sa11=new JCheckBox("11");
        JCheckBox sa12=new JCheckBox("12");
        JCheckBox sa13=new JCheckBox("13");
        JCheckBox sa14=new JCheckBox("14");
        JCheckBox sa15=new JCheckBox("15");
        JCheckBox sa16=new JCheckBox("16");
        JCheckBox sa17=new JCheckBox("17");
        JCheckBox sa18=new JCheckBox("18");
        JCheckBox sa19=new JCheckBox("19");
        JCheckBox sa20=new JCheckBox("20");
        JCheckBox sa21=new JCheckBox("21");
        JCheckBox sa22=new JCheckBox("22");
        JCheckBox sa23=new JCheckBox("23");
        JCheckBox sa24=new JCheckBox("24");
        JCheckBox sa25=new JCheckBox("25");
        JCheckBox sa26=new JCheckBox("26");
        JCheckBox sa27=new JCheckBox("27");
        JCheckBox sa28=new JCheckBox("28");
  
        JButton b=new JButton("Proceed");
	
        JCheckBox a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12;

        TextField tf1=new TextField(20);
        TextField tf2=new TextField(20);
        TextField tf3=new TextField(20);
        TextField tf4=new TextField(20);
        TextField tf5=new TextField(20);
        TextField tf6=new TextField(20);
        TextField tf7=new TextField(20);
        TextField tf8=new TextField(20);
        TextField tf9=new TextField(20);
        TextField tf10=new TextField(20);
        TextField tf11=new TextField(20);
        TextField tf12=new TextField(20);
        TextField tf13=new TextField(20);
        TextField tf14=new TextField(20);
        
        

        TextField tm1=new TextField(20);
        TextField tm2=new TextField(20);
 
        TextField ttu1=new TextField(20);
        TextField ttu2=new TextField(20);
    
        TextField twe1=new TextField(20);
        TextField twe2=new TextField(20);
   
        TextField tth1=new TextField(20);
        TextField tth2=new TextField(20);
     
        TextField tfr1=new TextField(20);
        TextField tfr2=new TextField(20);
 
        TextField tsa1=new TextField(20);
        TextField tsa2=new TextField(20);

        TextField tf15=new TextField(20);
        TextField tf16=new TextField(20);
        TextField tf17=new TextField(20);
        TextField tf18=new TextField(20);
        TextField tf19=new TextField(20);

        TextField tf32=new TextField(20);
        TextField tf33=new TextField(20);
        TextField tf34=new TextField(20);
        TextField tf35=new TextField(20);
        TextField tf36=new TextField(20);
        TextField tf37=new TextField(20);
        TextField tf38=new TextField(20);
        TextField tf39=new TextField(20);
        TextField tf40=new TextField(20);

        TextField tf20=new TextField(20);
        TextField tf21=new TextField(20);
        TextField tf22=new TextField(20);
        TextField tf23=new TextField(20);
        TextField tf24=new TextField(20);
        TextField tf25=new TextField(20);
        TextField tf26=new TextField(20);
        TextField tf27=new TextField(20);
        TextField tf28=new TextField(20);
        TextField tf29=new TextField(20);
        TextField tf30=new TextField(20);
        TextField tf31=new TextField(20);


        JButton b1=new JButton("Total");
        JButton b2=new JButton("Total");
        JButton b3=new JButton("Total");
        JButton b4=new JButton("Total");
        JButton b5=new JButton("Total");
        JButton b6=new JButton("Total");
        JButton b7=new JButton("Total");
        JButton b8=new JButton("Total");
        JButton b9=new JButton("Total");
        JButton b10=new JButton("Total");
        JButton b11=new JButton("Total");
        JButton b12=new JButton("Total");
        JButton b13=new JButton("Total");
        JButton b14=new JButton("Total");

        JButton b15=new JButton("Sum");
        JButton b16=new JButton("Sum");
        JButton b17=new JButton("Sum");
        JButton b18=new JButton("Sum");
        JButton b19=new JButton("Sum");
        JButton b20=new JButton("Sum");
        JButton b21=new JButton("Sum");
        JButton b22=new JButton("Sum");
        JButton b23=new JButton("Sum");
        JButton b24=new JButton("Sum");
        JButton b25=new JButton("Sum");
        JButton b26=new JButton("Sum");
  
 
         Container c = getContentPane();
	
	public Page32(JCheckBox c1,JCheckBox c2,JCheckBox c3,JCheckBox c4,JCheckBox c5,JCheckBox c6,JCheckBox c7,JCheckBox c8,JCheckBox c9,JCheckBox c10,JCheckBox c11,JCheckBox c12)
	{ 
                super("Options");
		setPreferredSize(new Dimension(2000,2000));
             
                 a1=c1;
                 a2=c2;
                 a3=c3;
                 a4=c4;
                 a5=c5;
                 a6=c6;
                 a7=c7;
                 a8=c8;
                 a9=c9;
                 a10=c10;
                 a11=c11;
                 a12=c12;
                                            
                 connect(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12);
 
                Lname1.setBounds(60,100,80,20);
                Lname1.setFont(f1);
                Lname2.setBounds(450,10,400,35);
                Lname2.setFont(f2);

 

               tf1.setBounds(50,150,130,20);
               tf2.setBounds(50,180,130,20);
               tf3.setBounds(50,210,130,20);
               tf4.setBounds(50,240,130,20);                  
               tf5.setBounds(50,270,130,20); 
               tf6.setBounds(50,300,130,20);
               tf7.setBounds(50,330,130,20);
               tf8.setBounds(50,360,130,20);
               tf9.setBounds(50,390,130,20);                  
               tf10.setBounds(50,420,130,20);   
               tf11.setBounds(50,450,130,20);
               tf12.setBounds(50,480,130,20);
               tf13.setBounds(50,510,130,20);                  
               tf14.setBounds(50,540,130,20); 

               tf15.setBounds(1130,150,50,20);
               tf16.setBounds(1130,180,50,20);
               tf17.setBounds(1130,210,50,20);
               tf18.setBounds(1130,240,50,20);
               tf19.setBounds(1130,270,50,20);
               tf32.setBounds(1130,300,50,20);
               tf33.setBounds(1130,330,50,20);
               tf34.setBounds(1130,360,50,20);
               tf35.setBounds(1130,390,50,20);
               tf36.setBounds(1130,420,50,20);
               tf37.setBounds(1130,450,50,20);
               tf38.setBounds(1130,480,50,20);
               tf39.setBounds(1130,510,50,20);
               tf40.setBounds(1130,540,50,20);
              

               b.setBounds(560,655,100,20);
               b1.setBounds(1010,150,80,20);
               b2.setBounds(1010,180,80,20);
               b3.setBounds(1010,210,80,20);
               b4.setBounds(1010,240,80,20);                  
               b5.setBounds(1010,270,80,20);
               b6.setBounds(1010,300,80,20);
               b7.setBounds(1010,330,80,20);
               b8.setBounds(1010,360,80,20);
               b9.setBounds(1010,390,80,20);                  
               b10.setBounds(1010,420,80,20);
               b11.setBounds(1010,450,80,20);
               b12.setBounds(1010,480,80,20);
               b13.setBounds(1010,510,80,20);                  
               b14.setBounds(1010,540,80,20);
 
                PPage3.add(Lname1);
                PPage3.add(Lname2);

		
                
                PPage3.add(m1);
                PPage3.add(m2);
                PPage3.add(m3);
                PPage3.add(m4);
                PPage3.add(m5);
                PPage3.add(m6);
                PPage3.add(m7);
                PPage3.add(m8);
                PPage3.add(m9);
                PPage3.add(m10);
                PPage3.add(m11);
                PPage3.add(m12);
                PPage3.add(m13);
                PPage3.add(m14);
                PPage3.add(m15);
                PPage3.add(m16);
                PPage3.add(m17);
                PPage3.add(m18);
                PPage3.add(m19);
                PPage3.add(m20);
                PPage3.add(m21);
                PPage3.add(m22);
                PPage3.add(m23);
                PPage3.add(m24);
                PPage3.add(m25);
                PPage3.add(m26);
                PPage3.add(m27);
                PPage3.add(m28);
               
                PPage3.add(tu1);
                PPage3.add(tu2);
                PPage3.add(tu3);
                PPage3.add(tu4);
                PPage3.add(tu5);
                PPage3.add(tu6);
                PPage3.add(tu7);
                PPage3.add(tu8);
                PPage3.add(tu9);
                PPage3.add(tu10);
                PPage3.add(tu11);
                PPage3.add(tu12);
                PPage3.add(tu13);
                PPage3.add(tu14);
                PPage3.add(tu15);
                PPage3.add(tu16);
                PPage3.add(tu17);
                PPage3.add(tu18);
                PPage3.add(tu19);
                PPage3.add(tu20);
                PPage3.add(tu21);
                PPage3.add(tu22);
                PPage3.add(tu23);
                PPage3.add(tu24);
                PPage3.add(tu25);
                PPage3.add(tu26);
                PPage3.add(tu27);
                PPage3.add(tu28);

                PPage3.add(we1);
                PPage3.add(we2);
                PPage3.add(we3);
                PPage3.add(we4);
                PPage3.add(we5);
                PPage3.add(we6);
                PPage3.add(we7);
                PPage3.add(we8);
                PPage3.add(we9);
                PPage3.add(we10);
                PPage3.add(we11);
                PPage3.add(we12);
                PPage3.add(we13);
                PPage3.add(we14);
                PPage3.add(we15);
                PPage3.add(we16);
                PPage3.add(we17);
                PPage3.add(we18);
                PPage3.add(we19);
                PPage3.add(we20);
                PPage3.add(we21);
                PPage3.add(we22);
                PPage3.add(we23);
                PPage3.add(we24);
                PPage3.add(we25);
                PPage3.add(we26);
                PPage3.add(we27);
                PPage3.add(we28);

                PPage3.add(th1);
                PPage3.add(th2);
                PPage3.add(th3);
                PPage3.add(th4);
                PPage3.add(th5);
                PPage3.add(th6);
                PPage3.add(th7);
                PPage3.add(th8);
                PPage3.add(th9);
                PPage3.add(th10);
                PPage3.add(th11);
                PPage3.add(th12);
                PPage3.add(th13);
                PPage3.add(th14);
                PPage3.add(th15);
                PPage3.add(th16);
                PPage3.add(th17);
                PPage3.add(th18);
                PPage3.add(th19);
                PPage3.add(th20);
                PPage3.add(th21);
                PPage3.add(th22);
                PPage3.add(th23);
                PPage3.add(th24);
                PPage3.add(th25);
                PPage3.add(th26);
                PPage3.add(th27);
                PPage3.add(th28);

                PPage3.add(fr1);
                PPage3.add(fr2);
                PPage3.add(fr3);
                PPage3.add(fr4);
                PPage3.add(fr5);
                PPage3.add(fr6);
                PPage3.add(fr7);
                PPage3.add(fr8);
                PPage3.add(fr9);
                PPage3.add(fr10);
                PPage3.add(fr11);
                PPage3.add(fr12);
                PPage3.add(fr13);
                PPage3.add(fr14);
                PPage3.add(fr15);
                PPage3.add(fr16);
                PPage3.add(fr17);
                PPage3.add(fr18);
                PPage3.add(fr19);
                PPage3.add(fr20);
                PPage3.add(fr21);
                PPage3.add(fr22);
                PPage3.add(fr23);
                PPage3.add(fr24);
                PPage3.add(fr25);
                PPage3.add(fr26);
                PPage3.add(fr27);
                PPage3.add(fr28);

                PPage3.add(sa1);
                PPage3.add(sa2);
                PPage3.add(sa3);
                PPage3.add(sa4);
                PPage3.add(sa5);
                PPage3.add(sa6);
                PPage3.add(sa7);
                PPage3.add(sa8);
                PPage3.add(sa9);
                PPage3.add(sa10);
                PPage3.add(sa11);
                PPage3.add(sa12);
                PPage3.add(sa13);
                PPage3.add(sa14);
                PPage3.add(sa15);
                PPage3.add(sa16);
                PPage3.add(sa17);
                PPage3.add(sa18);
                PPage3.add(sa19);
                PPage3.add(sa20);
                PPage3.add(sa21);
                PPage3.add(sa22);
                PPage3.add(sa23);
                PPage3.add(sa24);
                PPage3.add(sa25);
                PPage3.add(sa26);
                PPage3.add(sa27);
                PPage3.add(sa28);
               
                 
                PPage3.add(tf1);
                PPage3.add(tf2);
                PPage3.add(tf3);
                PPage3.add(tf4);
                PPage3.add(tf5);
                PPage3.add(tf6);
                PPage3.add(tf7);
                PPage3.add(tf8);
                PPage3.add(tf9);
                PPage3.add(tf10);
                PPage3.add(tf11);
                PPage3.add(tf12);
                PPage3.add(tf13);
                PPage3.add(tf14);

                PPage3.add(tf15);
                PPage3.add(tf16);
                PPage3.add(tf17);
                PPage3.add(tf18);
                PPage3.add(tf19);
                PPage3.add(tf32);
                PPage3.add(tf33);
                PPage3.add(tf34);
                PPage3.add(tf35);
                PPage3.add(tf36);
                PPage3.add(tf37);
                PPage3.add(tf38);
                PPage3.add(tf39);
                PPage3.add(tf40);


                PPage3.add(tf20);
                PPage3.add(tf21);
                PPage3.add(tf22);
                PPage3.add(tf23);
                PPage3.add(tf24);
                PPage3.add(tf25);
                PPage3.add(tf26);
                PPage3.add(tf27);
                PPage3.add(tf28);
                PPage3.add(tf29);
                PPage3.add(tf30);
                PPage3.add(tf31);


                
                PPage3.add(tm1);
                PPage3.add(tm2);
                PPage3.add(ttu1);
                PPage3.add(ttu2);
                PPage3.add(twe1);
                PPage3.add(twe2);
                PPage3.add(tth1);
                PPage3.add(tth2);
                PPage3.add(tfr1);
                PPage3.add(tfr2);
                PPage3.add(tsa1);
                PPage3.add(tsa2);


                PPage3.add(b);
                PPage3.add(b1);
                PPage3.add(b2);
                PPage3.add(b3);
                PPage3.add(b4);
                PPage3.add(b5);
                PPage3.add(b6);
                PPage3.add(b7);
                PPage3.add(b8);
                PPage3.add(b9);
                PPage3.add(b10);
                PPage3.add(b11);
                PPage3.add(b12);
                PPage3.add(b13);
                PPage3.add(b14);

                PPage3.add(b15);
                PPage3.add(b16);
                PPage3.add(b17);
                PPage3.add(b18);
                PPage3.add(b19);
                PPage3.add(b20);
                PPage3.add(b21);
                PPage3.add(b22);
                PPage3.add(b23);
                PPage3.add(b24);
                PPage3.add(b25);
                PPage3.add(b26);
              
          
		setVisible(true);
		c.add(PPage3);
		pack();
		setVisible(true);
               

                b.addActionListener(new Button());
                b1.addActionListener(new Button());
                b2.addActionListener(new Button());
                b3.addActionListener(new Button());
                b4.addActionListener(new Button());
                b5.addActionListener(new Button());
                b6.addActionListener(new Button());
                b7.addActionListener(new Button());
                b8.addActionListener(new Button());
                b9.addActionListener(new Button());
                b10.addActionListener(new Button());
                b11.addActionListener(new Button());
                b12.addActionListener(new Button());
                b13.addActionListener(new Button());
                b14.addActionListener(new Button());
                b15.addActionListener(new Button());
                b16.addActionListener(new Button());
                b17.addActionListener(new Button());
                b18.addActionListener(new Button());
                b19.addActionListener(new Button());
                b20.addActionListener(new Button());
                b21.addActionListener(new Button());
                b22.addActionListener(new Button());
                b23.addActionListener(new Button());
                b24.addActionListener(new Button());
                b25.addActionListener(new Button());
                b26.addActionListener(new Button());
                setVisible(true);
                
	}

        


public void connect(JCheckBox a1,JCheckBox a2,JCheckBox a3,JCheckBox a4,JCheckBox a5,JCheckBox a6,JCheckBox a7,JCheckBox a8,JCheckBox a9,JCheckBox a10,JCheckBox a11,JCheckBox a12)
  {
   try
     {
       
      String driver="sun.jdbc.odbc.JdbcOdbcDriver";
       Class.forName(driver);
 
       String db="jdbc:odbc:db1";
       con=DriverManager.getConnection(db);
       stmt=con.createStatement();
      

if(a1.isSelected()==true && a7.isSelected()==false)
{
     
      m1.setBounds(205,150,20,20);
      m2.setBounds(205,180,20,20);
      m3.setBounds(205,210,20,20);
      m4.setBounds(205,240,20,20);
      m5.setBounds(205,270,20,20);
      m6.setBounds(205,300,20,20);
      m7.setBounds(205,330,20,20);
      m8.setBounds(205,360,20,20);
      m9.setBounds(205,390,20,20);
      m10.setBounds(205,420,20,20);
      m11.setBounds(205,450,20,20);
      m12.setBounds(205,480,20,20);
      m13.setBounds(205,510,20,20);
      m14.setBounds(205,540,20,20);

      tm1.setBounds(185,100,60,20);
      tm1.setText("Mon - FN");
      tf20.setBounds(185,620,60,20);
      b15.setBounds(185,590,60,20);
      setVisible(true);
}
else if(a1.isSelected()==false && a7.isSelected()==true)
{
     
      m15.setBounds(270,150,20,20);
      m16.setBounds(270,180,20,20);
      m17.setBounds(270,210,20,20);
      m18.setBounds(270,240,20,20);
      m19.setBounds(270,270,20,20);
      m20.setBounds(270,300,20,20);
      m21.setBounds(270,330,20,20);
      m22.setBounds(270,360,20,20);
      m23.setBounds(270,390,20,20);
      m24.setBounds(270,420,20,20);
      m25.setBounds(270,450,20,20);
      m26.setBounds(270,480,20,20);
      m27.setBounds(270,510,20,20);
      m28.setBounds(270,540,20,20);
  
      tm2.setBounds(250,100,60,20);
      tm2.setText("Mon - AN");
      tf21.setBounds(250,620,60,20);
      b16.setBounds(250,590,60,20);
      setVisible(true);
}
else if(a1.isSelected()==true && a7.isSelected()==true)
{
     
      m1.setBounds(205,150,20,20);
      m2.setBounds(205,180,20,20);
      m3.setBounds(205,210,20,20);
      m4.setBounds(205,240,20,20);
      m5.setBounds(205,270,20,20);
      m6.setBounds(205,300,20,20);
      m7.setBounds(205,330,20,20);
      m8.setBounds(205,360,20,20);
      m9.setBounds(205,390,20,20);
      m10.setBounds(205,420,20,20);
      m11.setBounds(205,450,20,20);
      m12.setBounds(205,480,20,20);
      m13.setBounds(205,510,20,20);
      m14.setBounds(205,540,20,20);

      tm1.setBounds(185,100,60,20);
      tm1.setText("Mon - FN");
      tf20.setBounds(185,620,60,20);
      b15.setBounds(185,590,60,20);

      
      m15.setBounds(270,150,20,20);
      m16.setBounds(270,180,20,20);
      m17.setBounds(270,210,20,20);
      m18.setBounds(270,240,20,20);
      m19.setBounds(270,270,20,20);
      m20.setBounds(270,300,20,20);
      m21.setBounds(270,330,20,20);
      m22.setBounds(270,360,20,20);
      m23.setBounds(270,390,20,20);
      m24.setBounds(270,420,20,20);
      m25.setBounds(270,450,20,20);
      m26.setBounds(270,480,20,20);
      m27.setBounds(270,510,20,20);
      m28.setBounds(270,540,20,20);
  
      tm2.setBounds(250,100,60,20);
      tm2.setText("Mon - AN");
      tf21.setBounds(250,620,60,20);
      b16.setBounds(250,590,60,20);
      setVisible(true);
}
else if(a1.isSelected()==false && a7.isSelected()==false)
{
}
if(a2.isSelected()==true && a8.isSelected()==false)
{
     
      tu1.setBounds(335,150,20,20);
      tu2.setBounds(335,180,20,20);
      tu3.setBounds(335,210,20,20);
      tu4.setBounds(335,240,20,20);
      tu5.setBounds(335,270,20,20);
      tu6.setBounds(335,300,20,20);
      tu7.setBounds(335,330,20,20);
      tu8.setBounds(335,360,20,20);
      tu9.setBounds(335,390,20,20);
      tu10.setBounds(335,420,20,20);
      tu11.setBounds(335,450,20,20);
      tu12.setBounds(335,480,20,20);
      tu13.setBounds(335,510,20,20);
      tu14.setBounds(335,540,20,20);

      ttu1.setBounds(315,100,60,20);
      ttu1.setText("Tue - FN");
      tf22.setBounds(315,620,60,20);
      b17.setBounds(315,590,60,20);
      setVisible(true);
}
else if(a2.isSelected()==false && a8.isSelected()==true)
{
     
      tu15.setBounds(400,150,20,20);
      tu16.setBounds(400,180,20,20);
      tu17.setBounds(400,210,20,20);
      tu18.setBounds(400,240,20,20);
      tu19.setBounds(400,270,20,20);
      tu20.setBounds(400,300,20,20);
      tu21.setBounds(400,330,20,20);
      tu22.setBounds(400,360,20,20);
      tu23.setBounds(400,390,20,20);
      tu24.setBounds(400,420,20,20);
      tu25.setBounds(400,450,20,20);
      tu26.setBounds(400,480,20,20);
      tu27.setBounds(400,510,20,20);
      tu28.setBounds(400,540,20,20);

      ttu2.setBounds(380,100,60,20);
      ttu2.setText("Tue - AN");
      tf23.setBounds(380,620,60,20);
      b18.setBounds(380,590,60,20);
      setVisible(true);
}
else if(a2.isSelected()==true && a8.isSelected()==true)
{
     
      tu1.setBounds(335,150,20,20);
      tu2.setBounds(335,180,20,20);
      tu3.setBounds(335,210,20,20);
      tu4.setBounds(335,240,20,20);
      tu5.setBounds(335,270,20,20);
      tu6.setBounds(335,300,20,20);
      tu7.setBounds(335,330,20,20);
      tu8.setBounds(335,360,20,20);
      tu9.setBounds(335,390,20,20);
      tu10.setBounds(335,420,20,20);
      tu11.setBounds(335,450,20,20);
      tu12.setBounds(335,480,20,20);
      tu13.setBounds(335,510,20,20);
      tu14.setBounds(335,540,20,20);

      ttu1.setBounds(315,100,60,20);
      ttu1.setText("Tue - FN");
      tf22.setBounds(315,620,60,20);
      b17.setBounds(315,590,60,20);

      
      tu15.setBounds(400,150,20,20);
      tu16.setBounds(400,180,20,20);
      tu17.setBounds(400,210,20,20);
      tu18.setBounds(400,240,20,20);
      tu19.setBounds(400,270,20,20);
      tu20.setBounds(400,300,20,20);
      tu21.setBounds(400,330,20,20);
      tu22.setBounds(400,360,20,20);
      tu23.setBounds(400,390,20,20);
      tu24.setBounds(400,420,20,20);
      tu25.setBounds(400,450,20,20);
      tu26.setBounds(400,480,20,20);
      tu27.setBounds(400,510,20,20);
      tu28.setBounds(400,540,20,20);

      ttu2.setBounds(380,100,60,20);
      ttu2.setText("Tue - AN");
      tf23.setBounds(380,620,60,20);
      b18.setBounds(380,590,60,20);
      setVisible(true);
}
else if(a2.isSelected()==false && a8.isSelected()==false)
{
}
if(a3.isSelected()==true && a9.isSelected()==false)
{
     
      we1.setBounds(465,150,20,20);
      we2.setBounds(465,180,20,20);
      we3.setBounds(465,210,20,20);
      we4.setBounds(465,240,20,20);
      we5.setBounds(465,270,20,20);
      we6.setBounds(465,300,20,20);
      we7.setBounds(465,330,20,20);
      we8.setBounds(465,360,20,20);
      we9.setBounds(465,390,20,20);
      we10.setBounds(465,420,20,20);
      we11.setBounds(465,450,20,20);
      we12.setBounds(465,480,20,20);
      we13.setBounds(465,510,20,20);
      we14.setBounds(465,540,20,20);

      twe1.setBounds(445,100,60,20);
      twe1.setText("Wed - FN");
      tf24.setBounds(445,620,60,20);
      b19.setBounds(445,590,60,20);
      setVisible(true);
}
else if(a3.isSelected()==false && a9.isSelected()==true)
{
     
      we15.setBounds(530,150,20,20);
      we16.setBounds(530,180,20,20);
      we17.setBounds(530,210,20,20);
      we18.setBounds(530,240,20,20);
      we19.setBounds(530,270,20,20);
      we20.setBounds(530,300,20,20);
      we21.setBounds(530,330,20,20);
      we22.setBounds(530,360,20,20);
      we23.setBounds(530,390,20,20);
      we24.setBounds(530,420,20,20);
      we25.setBounds(530,450,20,20);
      we26.setBounds(530,480,20,20);
      we27.setBounds(530,510,20,20);
      we28.setBounds(530,540,20,20);

      twe2.setBounds(510,100,60,20);
      twe2.setText("Wed - AN");
      tf25.setBounds(510,620,60,20);
      b20.setBounds(510,590,60,20);
      setVisible(true);
}
else if(a3.isSelected()==true && a9.isSelected()==true)
{
     
      we1.setBounds(465,150,20,20);
      we2.setBounds(465,180,20,20);
      we3.setBounds(465,210,20,20);
      we4.setBounds(465,240,20,20);
      we5.setBounds(465,270,20,20);
      we6.setBounds(465,300,20,20);
      we7.setBounds(465,330,20,20);
      we8.setBounds(465,360,20,20);
      we9.setBounds(465,390,20,20);
      we10.setBounds(465,420,20,20);
      we11.setBounds(465,450,20,20);
      we12.setBounds(465,480,20,20);
      we13.setBounds(465,510,20,20);
      we14.setBounds(465,540,20,20);

      twe1.setBounds(445,100,60,20);
      twe1.setText("Wed - FN");
      tf24.setBounds(445,620,60,20);
      b19.setBounds(445,590,60,20);
      
      we15.setBounds(530,150,20,20);
      we16.setBounds(530,180,20,20);
      we17.setBounds(530,210,20,20);
      we18.setBounds(530,240,20,20);
      we19.setBounds(530,270,20,20);
      we20.setBounds(530,300,20,20);
      we21.setBounds(530,330,20,20);
      we22.setBounds(530,360,20,20);
      we23.setBounds(530,390,20,20);
      we24.setBounds(530,420,20,20);
      we25.setBounds(530,450,20,20);
      we26.setBounds(530,480,20,20);
      we27.setBounds(530,510,20,20);
      we28.setBounds(530,540,20,20);

      twe2.setBounds(510,100,60,20);
      twe2.setText("Wed - AN");
      tf25.setBounds(510,620,60,20);
      b20.setBounds(510,590,60,20);
      setVisible(true);
}
else if(a3.isSelected()==false && a9.isSelected()==false)
{
}
if(a4.isSelected()==true && a10.isSelected()==false)
{
     
      th1.setBounds(595,150,20,20);
      th2.setBounds(595,180,20,20);
      th3.setBounds(595,210,20,20);
      th4.setBounds(595,240,20,20);
      th5.setBounds(595,270,20,20);
      th6.setBounds(595,300,20,20);
      th7.setBounds(595,330,20,20);
      th8.setBounds(595,360,20,20);
      th9.setBounds(595,390,20,20);
      th10.setBounds(595,420,20,20);
      th11.setBounds(595,450,20,20);
      th12.setBounds(595,480,20,20);
      th13.setBounds(595,510,20,20);
      th14.setBounds(595,540,20,20);

      tth1.setBounds(575,100,60,20);
      tth1.setText("Thu - FN");
      tf26.setBounds(575,620,60,20);
      b21.setBounds(575,590,60,20);
      setVisible(true);
}
else if(a4.isSelected()==false && a10.isSelected()==true)
{
     
      th15.setBounds(660,150,20,20);
      th16.setBounds(660,180,20,20);
      th17.setBounds(660,210,20,20);
      th18.setBounds(660,240,20,20);
      th19.setBounds(660,270,20,20);
      th20.setBounds(660,300,20,20);
      th21.setBounds(660,330,20,20);
      th22.setBounds(660,360,20,20);
      th23.setBounds(660,390,20,20);
      th24.setBounds(660,420,20,20);
      th25.setBounds(660,450,20,20);
      th26.setBounds(660,480,20,20);
      th27.setBounds(660,510,20,20);
      th28.setBounds(660,540,20,20);

      tth2.setBounds(640,100,60,20);
      tth2.setText("Thu - AN");
      tf27.setBounds(640,620,60,20);
      b22.setBounds(640,590,60,20);      
      setVisible(true);
}
else if(a4.isSelected()==true && a10.isSelected()==true)
{
     
      th1.setBounds(595,150,20,20);
      th2.setBounds(595,180,20,20);
      th3.setBounds(595,210,20,20);
      th4.setBounds(595,240,20,20);
      th5.setBounds(595,270,20,20);
      th6.setBounds(595,300,20,20);
      th7.setBounds(595,330,20,20);
      th8.setBounds(595,360,20,20);
      th9.setBounds(595,390,20,20);
      th10.setBounds(595,420,20,20);
      th11.setBounds(595,450,20,20);
      th12.setBounds(595,480,20,20);
      th13.setBounds(595,510,20,20);
      th14.setBounds(595,540,20,20);

      tth1.setBounds(575,100,60,20);
      tth1.setText("Thu - FN");
      tf26.setBounds(575,620,60,20);
      b21.setBounds(575,590,60,20);

      
      th15.setBounds(660,150,20,20);
      th16.setBounds(660,180,20,20);
      th17.setBounds(660,210,20,20);
      th18.setBounds(660,240,20,20);
      th19.setBounds(660,270,20,20);
      th20.setBounds(660,300,20,20);
      th21.setBounds(660,330,20,20);
      th22.setBounds(660,360,20,20);
      th23.setBounds(660,390,20,20);
      th24.setBounds(660,420,20,20);
      th25.setBounds(660,450,20,20);
      th26.setBounds(660,480,20,20);
      th27.setBounds(660,510,20,20);
      th28.setBounds(660,540,20,20);

      tth2.setBounds(640,100,60,20);
      tth2.setText("Thu - AN");
      tf27.setBounds(640,620,60,20);
      b22.setBounds(640,590,60,20);  
      setVisible(true);
}
else if(a4.isSelected()==false && a10.isSelected()==false)
{
}
if(a5.isSelected()==true && a11.isSelected()==false)
{
     
      fr1.setBounds(725,150,20,20);
      fr2.setBounds(725,180,20,20);
      fr3.setBounds(725,210,20,20);
      fr4.setBounds(725,240,20,20);
      fr5.setBounds(725,270,20,20);
      fr6.setBounds(725,300,20,20);
      fr7.setBounds(725,330,20,20);
      fr8.setBounds(725,360,20,20);
      fr9.setBounds(725,390,20,20);
      fr10.setBounds(725,420,20,20);
      fr11.setBounds(725,450,20,20);
      fr12.setBounds(725,480,20,20);
      fr13.setBounds(725,510,20,20);
      fr14.setBounds(725,540,20,20);

      tfr1.setBounds(705,100,60,20);
      tfr1.setText("Fri - FN");
      tf28.setBounds(705,620,60,20);
      b23.setBounds(705,590,60,20);
      setVisible(true);
}
else if(a5.isSelected()==false && a11.isSelected()==true)
{
     
      fr15.setBounds(790,150,20,20);
      fr16.setBounds(790,180,20,20);
      fr17.setBounds(790,210,20,20);
      fr18.setBounds(790,240,20,20);
      fr19.setBounds(790,270,20,20);
      fr20.setBounds(790,300,20,20);
      fr21.setBounds(790,330,20,20);
      fr22.setBounds(790,360,20,20);
      fr23.setBounds(790,390,20,20);
      fr24.setBounds(790,420,20,20);
      fr25.setBounds(790,450,20,20);
      fr26.setBounds(790,480,20,20);
      fr27.setBounds(790,510,20,20);
      fr28.setBounds(790,540,20,20);

      tfr2.setBounds(770,100,60,20);
      tfr2.setText("Fri - AN");
      tf29.setBounds(770,620,60,20);
      b24.setBounds(770,590,60,20);
      setVisible(true);
}
else if(a5.isSelected()==true && a11.isSelected()==true)
{
     
      fr1.setBounds(725,150,20,20);
      fr2.setBounds(725,180,20,20);
      fr3.setBounds(725,210,20,20);
      fr4.setBounds(725,240,20,20);
      fr5.setBounds(725,270,20,20);
      fr6.setBounds(725,300,20,20);
      fr7.setBounds(725,330,20,20);
      fr8.setBounds(725,360,20,20);
      fr9.setBounds(725,390,20,20);
      fr10.setBounds(725,420,20,20);
      fr11.setBounds(725,450,20,20);
      fr12.setBounds(725,480,20,20);
      fr13.setBounds(725,510,20,20);
      fr14.setBounds(725,540,20,20);

      tfr1.setBounds(705,100,60,20);
      tfr1.setText("Fri - FN");
      tf28.setBounds(705,620,60,20);
      b23.setBounds(705,590,60,20);

      
      fr15.setBounds(790,150,20,20);
      fr16.setBounds(790,180,20,20);
      fr17.setBounds(790,210,20,20);
      fr18.setBounds(790,240,20,20);
      fr19.setBounds(790,270,20,20);
      fr20.setBounds(790,300,20,20);
      fr21.setBounds(790,330,20,20);
      fr22.setBounds(790,360,20,20);
      fr23.setBounds(790,390,20,20);
      fr24.setBounds(790,420,20,20);
      fr25.setBounds(790,450,20,20);
      fr26.setBounds(790,480,20,20);
      fr27.setBounds(790,510,20,20);
      fr28.setBounds(790,540,20,20);

      tfr2.setBounds(770,100,60,20);
      tfr2.setText("Fri - AN");
      tf29.setBounds(770,620,60,20);
      b24.setBounds(770,590,60,20);
      setVisible(true);
}
else if(a5.isSelected()==false && a11.isSelected()==false)
{
}
if(a6.isSelected()==true && a12.isSelected()==false)
{
     
      sa1.setBounds(855,150,20,20);
      sa2.setBounds(855,180,20,20);
      sa3.setBounds(855,210,20,20);
      sa4.setBounds(855,240,20,20);
      sa5.setBounds(855,270,20,20);
      sa6.setBounds(855,300,20,20);
      sa7.setBounds(855,330,20,20);
      sa8.setBounds(855,360,20,20);
      sa9.setBounds(855,390,20,20);
      sa10.setBounds(855,420,20,20);
      sa11.setBounds(855,450,20,20);
      sa12.setBounds(855,480,20,20);
      sa13.setBounds(855,510,20,20);
      sa14.setBounds(855,540,20,20);

      tsa1.setBounds(835,100,60,20);
      tsa1.setText("Sat - FN");
      tf30.setBounds(835,620,60,20);
      b25.setBounds(835,590,60,20);
      setVisible(true);
}
else if(a6.isSelected()==false && a12.isSelected()==true)
{
     
      sa15.setBounds(925,150,20,20);
      sa16.setBounds(925,180,20,20);
      sa17.setBounds(925,210,20,20);
      sa18.setBounds(925,240,20,20);
      sa19.setBounds(925,270,20,20);
      sa20.setBounds(925,300,20,20);
      sa21.setBounds(925,330,20,20);
      sa22.setBounds(925,360,20,20);
      sa23.setBounds(925,390,20,20);
      sa24.setBounds(925,420,20,20);
      sa25.setBounds(925,450,20,20);
      sa26.setBounds(925,480,20,20);
      sa27.setBounds(925,510,20,20);
      sa28.setBounds(925,540,20,20);

      tsa2.setBounds(905,100,60,20);
      tsa2.setText("Sat - AN");
      tf31.setBounds(905,620,60,20);
      b26.setBounds(905,590,60,20); 
      setVisible(true);
}
else if(a6.isSelected()==true && a12.isSelected()==true)
{
     
      sa1.setBounds(855,150,20,20);
      sa2.setBounds(855,180,20,20);
      sa3.setBounds(855,210,20,20);
      sa4.setBounds(855,240,20,20);
      sa5.setBounds(855,270,20,20);
      sa6.setBounds(855,300,20,20);
      sa7.setBounds(855,330,20,20);
      sa8.setBounds(855,360,20,20);
      sa9.setBounds(855,390,20,20);
      sa10.setBounds(855,420,20,20);
      sa11.setBounds(855,450,20,20);
      sa12.setBounds(855,480,20,20);
      sa13.setBounds(855,510,20,20);
      sa14.setBounds(855,540,20,20);

      tsa1.setBounds(835,100,60,20);
      tsa1.setText("Sat - FN");
      tf30.setBounds(835,620,60,20);
      b25.setBounds(835,590,60,20);
      
      sa15.setBounds(925,150,20,20);
      sa16.setBounds(925,180,20,20);
      sa17.setBounds(925,210,20,20);
      sa18.setBounds(925,240,20,20);
      sa19.setBounds(925,270,20,20);
      sa20.setBounds(925,300,20,20);
      sa21.setBounds(925,330,20,20);
      sa22.setBounds(925,360,20,20);
      sa23.setBounds(925,390,20,20);
      sa24.setBounds(925,420,20,20);
      sa25.setBounds(925,450,20,20);
      sa26.setBounds(925,480,20,20);
      sa27.setBounds(925,510,20,20);
      sa28.setBounds(925,540,20,20);

      tsa2.setBounds(905,100,60,20);
      tsa2.setText("Sat - AN");
      tf31.setBounds(905,620,60,20);
      b26.setBounds(905,590,60,20);
      setVisible(true);
}
else if(a6.isSelected()==false && a12.isSelected()==false)
{
}
      if (a1.isSelected())
                c11="MondayFN";
      if (a2.isSelected())
                c22="TuesdayFN";
      if (a3.isSelected())
                c33="WednesdayFN";
      if (a4.isSelected())
                c44="ThursdayFN";
      if (a5.isSelected())
                c55="FridayFN";
      if (a6.isSelected())
                c66="SaturdayFN";
      if (a7.isSelected())
                c77="MondayAN";
      if (a8.isSelected())
                c88="TuesdayAN";
      if (a9.isSelected())
                c99="WednesdayAN";
      if (a10.isSelected())
                c111="ThursdayAN";
      if (a11.isSelected())
                c222="FridayAN";
      if (a12.isSelected())
                c333="SaturdayAN";
 
       

      String sql=("(select name from db1 where "+c11+"<1) union (select name from db1 where "+c22+"<1) union (select name from db1 where "+c33+"<1) union (select name from db1 where "+c44+"<1) union (select name from db1 where "+c55+"<1) union (select name from db1 where "+c66+"<1) union (select name from db1 where "+c77+"<1) union (select name from db1 where "+c88+"<1) union (select name from db1 where "+c99+"<1) union (select name from db1 where "+c111+"<1) union (select name from db1 where "+c222+"<1) union (select name from db1 where "+c333+"<1)"); 
       rs=stmt.executeQuery(sql);
     
          rs.next();
          tf1.setText(rs.getString("Name"));
           rs.next();
          tf2.setText(rs.getString("Name"));
           rs.next();
          tf3.setText(rs.getString("Name"));
            rs.next();
          tf4.setText(rs.getString("Name"));
            rs.next();
          tf5.setText(rs.getString("Name"));
          rs.next();
          tf6.setText(rs.getString("Name"));
           rs.next();
          tf7.setText(rs.getString("Name"));
           rs.next();
          tf8.setText(rs.getString("Name"));
            rs.next();
          tf9.setText(rs.getString("Name"));
            rs.next();
          tf10.setText(rs.getString("Name"));
           rs.next();
          tf11.setText(rs.getString("Name"));
           rs.next();
          tf12.setText(rs.getString("Name"));
            rs.next();
          tf13.setText(rs.getString("Name"));
            rs.next();
          tf14.setText(rs.getString("Name"));
         
         
	  
         
     }catch(Exception ex){}
   
   
}
class Button implements ActionListener
{
     int count=0;
    
    
     public void actionPerformed(ActionEvent e)
	{
        if(e.getSource()==b)
               {
                 new Page3(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17,m18,m19,m20,m21,m22,m23,m24,m25,m26,m27,m28,tu1,tu2,tu3,tu4,tu5,tu6,tu7,tu8,tu9,tu10,tu11,tu12,tu13,tu14,tu15,tu16,tu17,tu18,tu19,tu20,tu21,tu22,tu23,tu24,tu25,tu26,tu27,tu28,we1,we2,we3,we4,we5,we6,we7,we8,we9,we10,we11,we12,we13,we14,we15,we16,we17,we18,we19,we20,we21,we22,we23,we24,we25,we26,we27,we28,th1,th2,th3,th4,th5,th6,th7,th8,th9,th10,th11,th12,th13,th14,th15,th16,th17,th18,th19,th20,th21,th22,th23,th24,th25,th26,th27,th28,fr1,fr2,fr3,fr4,fr5,fr6,fr7,fr8,fr9,fr10,fr11,fr12,fr13,fr14,fr15,fr16,fr17,fr18,fr19,fr20,fr21,fr22,fr23,fr24,fr25,fr26,fr27,fr28,sa1,sa2,sa3,sa4,sa5,sa6,sa7,sa8,sa9,sa10,sa11,sa12,sa13,sa14,sa15,sa16,sa17,sa18,sa19,sa20,sa21,sa22,sa23,sa24,sa25,sa26,sa27,sa28);

               }
        if(e.getSource()==b1)
               {
                if(m1.isSelected())
                  count++; 
                if(m15.isSelected())
                  count++;
                if(tu1.isSelected())
                  count++;
                if(tu15.isSelected())
                  count++;
                if(we1.isSelected())
                  count++;
                if(we15.isSelected())
                  count++;
                if(th1.isSelected())
                  count++;
                if(th15.isSelected())
                  count++;
                if(fr1.isSelected())
                  count++;
                if(fr15.isSelected())
                  count++;
                if(sa1.isSelected())
                  count++;
                if(sa15.isSelected())
                  count++;
                 
               
                tf15.setText(count+" ");
                if(count>3)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 3 invigilations");
                count=0;
               }
  
         
        if(e.getSource()==b2)
               {
                if(m2.isSelected())
                  count++; 
                if(m16.isSelected())
                  count++;
                if(tu2.isSelected())
                  count++;
                if(tu16.isSelected())
                  count++;
                if(we2.isSelected())
                  count++;
                if(we16.isSelected())
                  count++;
                if(th2.isSelected())
                  count++;
                if(th16.isSelected())
                  count++;
                if(fr2.isSelected())
                  count++;
                if(fr16.isSelected())
                  count++;
                if(sa2.isSelected())
                  count++;
                if(sa16.isSelected())
                  count++;

               tf16.setText(count+" ");
                if(count>3)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 3 invigilations");
               count=0;
               }
        if(e.getSource()==b3)
               {
                if(m3.isSelected())
                  count++; 
                if(m17.isSelected())
                  count++;
                if(tu3.isSelected())
                  count++;
                if(tu17.isSelected())
                  count++;
                if(we3.isSelected())
                  count++;
                if(we17.isSelected())
                  count++;
                if(th3.isSelected())
                  count++;
                if(th17.isSelected())
                  count++;
                if(fr3.isSelected())
                  count++;
                if(fr17.isSelected())
                  count++;
                if(sa3.isSelected())
                  count++;
                if(sa17.isSelected())
                  count++;

               tf17.setText(count+" ");
                if(count>3)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 3 invigilations");
               count=0;
               }
        if(e.getSource()==b4)
               {
                if(m4.isSelected())
                  count++; 
                if(m18.isSelected())
                  count++;
                if(tu4.isSelected())
                  count++;
                if(tu18.isSelected())
                  count++;
                if(we4.isSelected())
                  count++;
                if(we18.isSelected())
                  count++;
                if(th4.isSelected())
                  count++;
                if(th18.isSelected())
                  count++;
                if(fr4.isSelected())
                  count++;
                if(fr18.isSelected())
                  count++;
                if(sa4.isSelected())
                  count++;
                if(sa18.isSelected())
                  count++;

               tf18.setText(count+" ");
                if(count>3)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 3 invigilations");
               count=0;
               }
        if(e.getSource()==b5)
               {
                if(m5.isSelected())
                  count++; 
                if(m19.isSelected())
                  count++;
                if(tu5.isSelected())
                  count++;
                if(tu19.isSelected())
                  count++;
                if(we5.isSelected())
                  count++;
                if(we19.isSelected())
                  count++;
                if(th5.isSelected())
                  count++;
                if(th19.isSelected())
                  count++;
                if(fr5.isSelected())
                  count++;
                if(fr19.isSelected())
                  count++;
                if(sa5.isSelected())
                  count++;
                if(sa19.isSelected())
                  count++;

               tf19.setText(count+" ");
                if(count>3)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 3 invigilations");
               count=0;
               }
        if(e.getSource()==b6)
               {
                if(m6.isSelected())
                  count++; 
                if(m20.isSelected())
                  count++;
                if(tu6.isSelected())
                  count++;
                if(tu20.isSelected())
                  count++;
                if(we6.isSelected())
                  count++;
                if(we20.isSelected())
                  count++;
                if(th6.isSelected())
                  count++;
                if(th20.isSelected())
                  count++;
                if(fr6.isSelected())
                  count++;
                if(fr20.isSelected())
                  count++;
                if(sa6.isSelected())
                  count++;
                if(sa20.isSelected())
                  count++;

               tf32.setText(count+" ");
                if(count>3)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 3 invigilations");
               count=0;
               }
        if(e.getSource()==b7)
               {
                if(m7.isSelected())
                  count++; 
                if(m21.isSelected())
                  count++;
                if(tu7.isSelected())
                  count++;
                if(tu21.isSelected())
                  count++;
                if(we7.isSelected())
                  count++;
                if(we21.isSelected())
                  count++;
                if(th7.isSelected())
                  count++;
                if(th21.isSelected())
                  count++;
                if(fr7.isSelected())
                  count++;
                if(fr21.isSelected())
                  count++;
                if(sa7.isSelected())
                  count++;
                if(sa21.isSelected())
                  count++;

               tf33.setText(count+" ");
                if(count>3)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 3 invigilations");
               count=0;
               }
        if(e.getSource()==b8)
               {
                if(m8.isSelected())
                  count++; 
                if(m22.isSelected())
                  count++;
                if(tu8.isSelected())
                  count++;
                if(tu22.isSelected())
                  count++;
                if(we8.isSelected())
                  count++;
                if(we22.isSelected())
                  count++;
                if(th8.isSelected())
                  count++;
                if(th22.isSelected())
                  count++;
                if(fr8.isSelected())
                  count++;
                if(fr22.isSelected())
                  count++;
                if(sa8.isSelected())
                  count++;
                if(sa22.isSelected())
                  count++;

               tf34.setText(count+" ");
                if(count>3)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 3 invigilations");
               count=0;
               }
        if(e.getSource()==b9)
               {
                if(m9.isSelected())
                  count++; 
                if(m23.isSelected())
                  count++;
                if(tu9.isSelected())
                  count++;
                if(tu23.isSelected())
                  count++;
                if(we9.isSelected())
                  count++;
                if(we23.isSelected())
                  count++;
                if(th9.isSelected())
                  count++;
                if(th23.isSelected())
                  count++;
                if(fr9.isSelected())
                  count++;
                if(fr23.isSelected())
                  count++;
                if(sa9.isSelected())
                  count++;
                if(sa23.isSelected())
                  count++;

               tf35.setText(count+" ");
                if(count>3)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 3 invigilations");
               count=0;
               }
        if(e.getSource()==b10)
               {
                if(m10.isSelected())
                  count++; 
                if(m24.isSelected())
                  count++;
                if(tu10.isSelected())
                  count++;
                if(tu24.isSelected())
                  count++;
                if(we10.isSelected())
                  count++;
                if(we24.isSelected())
                  count++;
                if(th10.isSelected())
                  count++;
                if(th24.isSelected())
                  count++;
                if(fr10.isSelected())
                  count++;
                if(fr24.isSelected())
                  count++;
                if(sa10.isSelected())
                  count++;
                if(sa24.isSelected())
                  count++;

               tf36.setText(count+" ");
                if(count>3)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 3 invigilations");
               count=0;
               }
        if(e.getSource()==b11)
               {
                if(m11.isSelected())
                  count++; 
                if(m25.isSelected())
                  count++;
                if(tu11.isSelected())
                  count++;
                if(tu25.isSelected())
                  count++;
                if(we11.isSelected())
                  count++;
                if(we25.isSelected())
                  count++;
                if(th11.isSelected())
                  count++;
                if(th25.isSelected())
                  count++;
                if(fr11.isSelected())
                  count++;
                if(fr25.isSelected())
                  count++;
                if(sa11.isSelected())
                  count++;
                if(sa25.isSelected())
                  count++;

               tf37.setText(count+" ");
                if(count>3)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 3 invigilations");
               count=0;
               }
        if(e.getSource()==b12)
               {
                if(m12.isSelected())
                  count++; 
                if(m26.isSelected())
                  count++;
                if(tu12.isSelected())
                  count++;
                if(tu26.isSelected())
                  count++;
                if(we12.isSelected())
                  count++;
                if(we26.isSelected())
                  count++;
                if(th12.isSelected())
                  count++;
                if(th26.isSelected())
                  count++;
                if(fr12.isSelected())
                  count++;
                if(fr26.isSelected())
                  count++;
                if(sa12.isSelected())
                  count++;
                if(sa26.isSelected())
                  count++;

               tf38.setText(count+" ");
                if(count>3)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 3 invigilations");
               count=0;
               }
        if(e.getSource()==b13)
               {
                if(m13.isSelected())
                  count++; 
                if(m27.isSelected())
                  count++;
                if(tu13.isSelected())
                  count++;
                if(tu27.isSelected())
                  count++;
                if(we13.isSelected())
                  count++;
                if(we27.isSelected())
                  count++;
                if(th13.isSelected())
                  count++;
                if(th27.isSelected())
                  count++;
                if(fr13.isSelected())
                  count++;
                if(fr27.isSelected())
                  count++;
                if(sa13.isSelected())
                  count++;
                if(sa27.isSelected())
                  count++;

               tf39.setText(count+" ");
                if(count>3)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 3 invigilations");
               count=0;
               }
        if(e.getSource()==b14)
               {
                if(m14.isSelected())
                  count++; 
                if(m28.isSelected())
                  count++;
                if(tu14.isSelected())
                  count++;
                if(tu28.isSelected())
                  count++;
                if(we14.isSelected())
                  count++;
                if(we28.isSelected())
                  count++;
                if(th14.isSelected())
                  count++;
                if(th28.isSelected())
                  count++;
                if(fr14.isSelected())
                  count++;
                if(fr28.isSelected())
                  count++;
                if(sa14.isSelected())
                  count++;
                if(sa28.isSelected())
                  count++;

               tf40.setText(count+" ");
                if(count>3)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 3 invigilations");
               count=0;
               }
           if(e.getSource()==b15)
               {
                if(m1.isSelected())
                  count++; 
                if(m2.isSelected())
                  count++;
                if(m3.isSelected())
                  count++;
                if(m4.isSelected())
                  count++;
                if(m5.isSelected())
                  count++;
                if(m6.isSelected())
                  count++; 
                if(m7.isSelected())
                  count++;
                if(m8.isSelected())
                  count++;
                if(m9.isSelected())
                  count++;
                if(m10.isSelected())
                  count++;
                if(m11.isSelected())
                  count++;
                if(m12.isSelected())
                  count++;
                if(m13.isSelected())
                  count++;
                if(m14.isSelected())
                  count++;
               tf20.setText(count+" ");
                if(count>5)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 5 invigilations");
             count=0;
               }     
           if(e.getSource()==b16)
               {
                if(m15.isSelected())
                  count++; 
                if(m16.isSelected())
                  count++;
                if(m17.isSelected())
                  count++;
                if(m18.isSelected())
                  count++;
                if(m19.isSelected())
                  count++;
                if(m20.isSelected())
                  count++; 
                if(m21.isSelected())
                  count++;
                if(m22.isSelected())
                  count++;
                if(m23.isSelected())
                  count++;
                if(m24.isSelected())
                  count++;
                if(m25.isSelected())
                  count++;
                if(m26.isSelected())
                  count++;
                if(m27.isSelected())
                  count++;
                if(m28.isSelected())
                  count++;

               tf21.setText(count+" ");
                if(count>5)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 5 invigilations");
             count=0;
               }   
           if(e.getSource()==b17)
               {
                if(tu1.isSelected())
                  count++; 
                if(tu2.isSelected())
                  count++;
                if(tu3.isSelected())
                  count++;
                if(tu4.isSelected())
                  count++;
                if(tu5.isSelected())
                  count++;
                if(tu6.isSelected())
                  count++; 
                if(tu7.isSelected())
                  count++;
                if(tu8.isSelected())
                  count++;
                if(tu9.isSelected())
                  count++;
                if(tu10.isSelected())
                  count++;
                if(tu11.isSelected())
                  count++;
                if(tu12.isSelected())
                  count++;
                if(tu13.isSelected())
                  count++;
                if(tu14.isSelected())
                  count++;
               tf22.setText(count+" ");
                if(count>5)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 5 invigilations");
             count=0;
               }     
           if(e.getSource()==b18)
               {
                if(tu15.isSelected())
                  count++; 
                if(tu16.isSelected())
                  count++;
                if(tu17.isSelected())
                  count++;
                if(tu18.isSelected())
                  count++;
                if(tu19.isSelected())
                  count++;
                if(tu20.isSelected())
                  count++; 
                if(tu21.isSelected())
                  count++;
                if(tu22.isSelected())
                  count++;
                if(tu23.isSelected())
                  count++;
                if(tu24.isSelected())
                  count++;
                if(tu25.isSelected())
                  count++;
                if(tu26.isSelected())
                  count++;
                if(tu27.isSelected())
                  count++;
                if(tu28.isSelected())
                  count++;        

               tf23.setText(count+" ");
                if(count>5)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 5 invigilations");
             count=0;
               }   
           if(e.getSource()==b19)
               {
                if(we1.isSelected())
                  count++; 
                if(we2.isSelected())
                  count++;
                if(we3.isSelected())
                  count++;
                if(we4.isSelected())
                  count++;
                if(we5.isSelected())
                  count++;
                if(we6.isSelected())
                  count++; 
                if(we7.isSelected())
                  count++;
                if(we8.isSelected())
                  count++;
                if(we9.isSelected())
                  count++;
                if(we10.isSelected())
                  count++;
                if(we11.isSelected())
                  count++;
                if(we12.isSelected())
                  count++;
                if(we13.isSelected())
                  count++;
                if(we14.isSelected())
                  count++;
               tf24.setText(count+" ");
                if(count>5)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 5 invigilations");
             count=0;
               }   
           if(e.getSource()==b20)
               {
                if(we15.isSelected())
                  count++; 
                if(we16.isSelected())
                  count++;
                if(we17.isSelected())
                  count++;
                if(we18.isSelected())
                  count++;
                if(we19.isSelected())
                  count++;
                if(we20.isSelected())
                  count++; 
                if(we21.isSelected())
                  count++;
                if(we22.isSelected())
                  count++;
                if(we23.isSelected())
                  count++;
                if(we24.isSelected())
                  count++;
                if(we25.isSelected())
                  count++;
                if(we26.isSelected())
                  count++;
                if(we27.isSelected())
                  count++;
                if(we28.isSelected())
                  count++;
               tf25.setText(count+" ");
                if(count>5)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 5 invigilations");
             count=0;
               }   
           if(e.getSource()==b21)
               {
                if(th1.isSelected())
                  count++; 
                if(th2.isSelected())
                  count++;
                if(th3.isSelected())
                  count++;
                if(th4.isSelected())
                  count++;
                if(th5.isSelected())
                  count++;
               if(th6.isSelected())
                  count++; 
                if(th7.isSelected())
                  count++;
                if(th8.isSelected())
                  count++;
                if(th9.isSelected())
                  count++;
                if(th10.isSelected())
                  count++;
                if(th11.isSelected())
                  count++;
                if(th12.isSelected())
                  count++;
                if(th13.isSelected())
                  count++;
                if(th14.isSelected())
                  count++;
               tf26.setText(count+" ");
                if(count>5)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 5 invigilations");
             count=0;
               }   
           if(e.getSource()==b22)
               {
                if(th15.isSelected())
                  count++; 
                if(th16.isSelected())
                  count++;
                if(th17.isSelected())
                  count++;
                if(th18.isSelected())
                  count++;
                if(th19.isSelected())
                  count++;
                if(th20.isSelected())
                  count++; 
                if(th21.isSelected())
                  count++;
                if(th22.isSelected())
                  count++;
                if(th23.isSelected())
                  count++;
                if(th24.isSelected())
                  count++;
                if(th25.isSelected())
                  count++;
                if(th26.isSelected())
                  count++;
                if(th27.isSelected())
                  count++;
                if(th28.isSelected())
                  count++;
               tf27.setText(count+" ");
                if(count>5)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 5 invigilations");
             count=0;
               }   
           if(e.getSource()==b23)
               {
                if(fr1.isSelected())
                  count++; 
                if(fr2.isSelected())
                  count++;
                if(fr3.isSelected())
                  count++;
                if(fr4.isSelected())
                  count++;
                if(fr5.isSelected())
                  count++;
                if(fr6.isSelected())
                  count++; 
                if(fr7.isSelected())
                  count++;
                if(fr8.isSelected())
                  count++;
                if(fr9.isSelected())
                  count++;
                if(fr10.isSelected())
                  count++;
                if(fr11.isSelected())
                  count++;
                if(fr12.isSelected())
                  count++;
                if(fr13.isSelected())
                  count++;
                if(fr14.isSelected())
                  count++;
               tf28.setText(count+" ");
                if(count>5)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 5 invigilations");
             count=0;
               }   
           if(e.getSource()==b24)
               {
                if(fr15.isSelected())
                  count++; 
                if(fr16.isSelected())
                  count++;
                if(fr17.isSelected())
                  count++;
                if(fr18.isSelected())
                  count++;
                if(fr19.isSelected())
                  count++;
                if(fr20.isSelected())
                  count++; 
                if(fr21.isSelected())
                  count++;
                if(fr22.isSelected())
                  count++;
                if(fr23.isSelected())
                  count++;
                if(fr24.isSelected())
                  count++;
                if(fr25.isSelected())
                  count++;
                if(fr26.isSelected())
                  count++;
                if(fr27.isSelected())
                  count++;
                if(fr28.isSelected())
                  count++;
               tf29.setText(count+" ");
                if(count>5)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 5 invigilations");
             count=0;
               }   
           if(e.getSource()==b25)
               {
                if(sa1.isSelected())
                  count++; 
                if(sa2.isSelected())
                  count++;
                if(sa3.isSelected())
                  count++;
                if(sa4.isSelected())
                  count++;
                if(sa5.isSelected())
                  count++;
                if(sa6.isSelected())
                  count++; 
                if(sa7.isSelected())
                  count++;
                if(sa8.isSelected())
                  count++;
                if(sa9.isSelected())
                  count++;
                if(sa10.isSelected())
                  count++;
                if(sa11.isSelected())
                  count++;
                if(sa12.isSelected())
                  count++;
                if(sa13.isSelected())
                  count++;
                if(sa14.isSelected())
                  count++;
               tf30.setText(count+" ");
                if(count>5)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 5 invigilations");
             count=0;
         }
           if(e.getSource()==b26)
               {
                if(sa15.isSelected())
                  count++; 
                if(sa16.isSelected())
                  count++;
                if(sa17.isSelected())
                  count++;
                if(sa18.isSelected())
                  count++;
                if(sa19.isSelected())
                  count++;
                if(sa20.isSelected())
                  count++; 
                if(sa21.isSelected())
                  count++;
                if(sa22.isSelected())
                  count++;
                if(sa23.isSelected())
                  count++;
                if(sa24.isSelected())
                  count++;
                if(sa25.isSelected())
                  count++;
                if(sa26.isSelected())
                  count++;
                if(sa27.isSelected())
                  count++;
                if(sa28.isSelected())
                  count++;
               tf31.setText(count+" ");
                if(count>5)
                      JOptionPane.showMessageDialog(null,"Cannot assign more than 5 invigilations");
             count=0;
               }         
                                                                               
          
         }
}   

 
 }



class Page3 extends JFrame
{
  
       JPanel PPage3 = new JPanel(null);
       Container c = getContentPane();
       Font f=new Font("Times",Font.BOLD,27);
       JLabel g=new JLabel("FINAL LIST OF INVIGILATORS");
       JLabel g1=new JLabel("THANK YOU !!");

        TextField tmm1=new TextField(20);
        TextField mm1=new TextField(20);
        TextField mm2=new TextField(20);
        TextField mm3=new TextField(20);
        TextField mm4=new TextField(20);
        TextField mm5=new TextField(20);
        TextField mm6=new TextField(20);
        TextField mm7=new TextField(20);
        TextField mm8=new TextField(20);
        TextField mm9=new TextField(20);
        TextField mm10=new TextField(20);
        TextField mm11=new TextField(20);
        TextField mm12=new TextField(20);
        TextField mm13=new TextField(20);
        TextField mm14=new TextField(20);

        TextField tmm2=new TextField(20);
        TextField mm15=new TextField(20);
        TextField mm16=new TextField(20);
        TextField mm17=new TextField(20);
        TextField mm18=new TextField(20);
        TextField mm19=new TextField(20);
        TextField mm20=new TextField(20);
        TextField mm21=new TextField(20);
        TextField mm22=new TextField(20);
        TextField mm23=new TextField(20);
        TextField mm24=new TextField(20);
        TextField mm25=new TextField(20);
        TextField mm26=new TextField(20);
        TextField mm27=new TextField(20);
        TextField mm28=new TextField(20);

        TextField tttu1=new TextField(20);
        TextField ttu1=new TextField(20);
        TextField ttu2=new TextField(20);
        TextField ttu3=new TextField(20);
        TextField ttu4=new TextField(20);
        TextField ttu5=new TextField(20);
        TextField ttu6=new TextField(20);
        TextField ttu7=new TextField(20);
        TextField ttu8=new TextField(20);
        TextField ttu9=new TextField(20);
        TextField ttu10=new TextField(20);
        TextField ttu11=new TextField(20);
        TextField ttu12=new TextField(20);
        TextField ttu13=new TextField(20);
        TextField ttu14=new TextField(20);


        TextField tttu2=new TextField(20);
        TextField ttu15=new TextField(20);
        TextField ttu16=new TextField(20);
        TextField ttu17=new TextField(20);
        TextField ttu18=new TextField(20);
        TextField ttu19=new TextField(20);
        TextField ttu20=new TextField(20);
        TextField ttu21=new TextField(20);
        TextField ttu22=new TextField(20);
        TextField ttu23=new TextField(20);
        TextField ttu24=new TextField(20);
        TextField ttu25=new TextField(20);
        TextField ttu26=new TextField(20);
        TextField ttu27=new TextField(20);
        TextField ttu28=new TextField(20);

        TextField twwe1=new TextField(20);
        TextField wwe1=new TextField(20);
        TextField wwe2=new TextField(20);
        TextField wwe3=new TextField(20);
        TextField wwe4=new TextField(20);
        TextField wwe5=new TextField(20);
        TextField wwe6=new TextField(20);
        TextField wwe7=new TextField(20);
        TextField wwe8=new TextField(20);
        TextField wwe9=new TextField(20);
        TextField wwe10=new TextField(20);
        TextField wwe11=new TextField(20);
        TextField wwe12=new TextField(20);
        TextField wwe13=new TextField(20);
        TextField wwe14=new TextField(20);

        TextField twwe2=new TextField(20);
        TextField wwe15=new TextField(20);
        TextField wwe16=new TextField(20);
        TextField wwe17=new TextField(20);
        TextField wwe18=new TextField(20);
        TextField wwe19=new TextField(20);
        TextField wwe20=new TextField(20);
        TextField wwe21=new TextField(20);
        TextField wwe22=new TextField(20);
        TextField wwe23=new TextField(20);
        TextField wwe24=new TextField(20);
        TextField wwe25=new TextField(20);
        TextField wwe26=new TextField(20);
        TextField wwe27=new TextField(20);
        TextField wwe28=new TextField(20);

        TextField ttth1=new TextField(20);
        TextField tth1=new TextField(20);
        TextField tth2=new TextField(20);
        TextField tth3=new TextField(20);
        TextField tth4=new TextField(20);
        TextField tth5=new TextField(20);
        TextField tth6=new TextField(20);
        TextField tth7=new TextField(20);
        TextField tth8=new TextField(20);
        TextField tth9=new TextField(20);
        TextField tth10=new TextField(20);
        TextField tth11=new TextField(20);
        TextField tth12=new TextField(20);
        TextField tth13=new TextField(20);
        TextField tth14=new TextField(20);


        TextField ttth2=new TextField(20);
        TextField tth15=new TextField(20);
        TextField tth16=new TextField(20);
        TextField tth17=new TextField(20);
        TextField tth18=new TextField(20);
        TextField tth19=new TextField(20);
        TextField tth20=new TextField(20);
        TextField tth21=new TextField(20);
        TextField tth22=new TextField(20);
        TextField tth23=new TextField(20);
        TextField tth24=new TextField(20);
        TextField tth25=new TextField(20);
        TextField tth26=new TextField(20);
        TextField tth27=new TextField(20);
        TextField tth28=new TextField(20);

        TextField tffr1=new TextField(20);
        TextField ffr1=new TextField(20);
        TextField ffr2=new TextField(20);
        TextField ffr3=new TextField(20);
        TextField ffr4=new TextField(20);
        TextField ffr5=new TextField(20);
        TextField ffr6=new TextField(20);
        TextField ffr7=new TextField(20);
        TextField ffr8=new TextField(20);
        TextField ffr9=new TextField(20);
        TextField ffr10=new TextField(20);
        TextField ffr11=new TextField(20);
        TextField ffr12=new TextField(20);
        TextField ffr13=new TextField(20);
        TextField ffr14=new TextField(20);

        TextField tffr2=new TextField(20);
        TextField ffr15=new TextField(20);
        TextField ffr16=new TextField(20);
        TextField ffr17=new TextField(20);
        TextField ffr18=new TextField(20);
        TextField ffr19=new TextField(20);
        TextField ffr20=new TextField(20);
        TextField ffr21=new TextField(20);
        TextField ffr22=new TextField(20);
        TextField ffr23=new TextField(20);
        TextField ffr24=new TextField(20);
        TextField ffr25=new TextField(20);
        TextField ffr26=new TextField(20);
        TextField ffr27=new TextField(20);
        TextField ffr28=new TextField(20);

        TextField tssa1=new TextField(20);
        TextField ssa1=new TextField(20);
        TextField ssa2=new TextField(20);
        TextField ssa3=new TextField(20);
        TextField ssa4=new TextField(20);
        TextField ssa5=new TextField(20);
        TextField ssa6=new TextField(20);
        TextField ssa7=new TextField(20);
        TextField ssa8=new TextField(20);
        TextField ssa9=new TextField(20);
        TextField ssa10=new TextField(20);
        TextField ssa11=new TextField(20);
        TextField ssa12=new TextField(20);
        TextField ssa13=new TextField(20);
        TextField ssa14=new TextField(20);

        TextField tssa2=new TextField(20);
        TextField ssa15=new TextField(20);
        TextField ssa16=new TextField(20);
        TextField ssa17=new TextField(20);
        TextField ssa18=new TextField(20);
        TextField ssa19=new TextField(20);
        TextField ssa20=new TextField(20);
        TextField ssa21=new TextField(20);
        TextField ssa22=new TextField(20);
        TextField ssa23=new TextField(20);
        TextField ssa24=new TextField(20);
        TextField ssa25=new TextField(20);
        TextField ssa26=new TextField(20);
        TextField ssa27=new TextField(20);
        TextField ssa28=new TextField(20);



     public Page3(JCheckBox a1,JCheckBox a2,JCheckBox a3,JCheckBox a4,JCheckBox a5,JCheckBox a6,JCheckBox a7,JCheckBox a8,JCheckBox a9,JCheckBox a10,JCheckBox a11,JCheckBox a12,TextField tf1,TextField tf2,TextField tf3,TextField tf4,TextField tf5,TextField tf6,TextField tf7,TextField tf8,TextField tf9,TextField tf10,TextField tf11,TextField tf12,TextField tf13,TextField tf14,JCheckBox m1,JCheckBox m2,JCheckBox m3,JCheckBox m4,JCheckBox m5,JCheckBox m6,JCheckBox m7,JCheckBox m8,JCheckBox m9,JCheckBox m10,JCheckBox m11,JCheckBox m12,JCheckBox m13,JCheckBox m14,JCheckBox m15,JCheckBox m16,JCheckBox m17,JCheckBox m18,JCheckBox m19,JCheckBox m20,JCheckBox m21,JCheckBox m22,JCheckBox m23,JCheckBox m24,JCheckBox m25,JCheckBox m26,JCheckBox m27,JCheckBox m28,JCheckBox tu1,JCheckBox tu2,JCheckBox tu3,JCheckBox tu4,JCheckBox tu5,JCheckBox tu6,JCheckBox tu7,JCheckBox tu8,JCheckBox tu9,JCheckBox tu10,JCheckBox tu11,JCheckBox tu12,JCheckBox tu13,JCheckBox tu14,JCheckBox tu15,JCheckBox tu16,JCheckBox tu17,JCheckBox tu18,JCheckBox tu19,JCheckBox tu20,JCheckBox tu21,JCheckBox tu22,JCheckBox tu23,JCheckBox tu24,JCheckBox tu25,JCheckBox tu26,JCheckBox tu27,JCheckBox tu28,JCheckBox we1,JCheckBox we2,JCheckBox we3,JCheckBox we4,JCheckBox we5,JCheckBox we6,JCheckBox we7,JCheckBox we8,JCheckBox we9,JCheckBox we10,JCheckBox we11,JCheckBox we12,JCheckBox we13,JCheckBox we14,JCheckBox we15,JCheckBox we16,JCheckBox we17,JCheckBox we18,JCheckBox we19,JCheckBox we20,JCheckBox we21,JCheckBox we22,JCheckBox we23,JCheckBox we24,JCheckBox we25,JCheckBox we26,JCheckBox we27,JCheckBox we28,JCheckBox th1,JCheckBox th2,JCheckBox th3,JCheckBox th4,JCheckBox th5,JCheckBox th6,JCheckBox th7,JCheckBox th8,JCheckBox th9,JCheckBox th10,JCheckBox th11,JCheckBox th12,JCheckBox th13,JCheckBox th14,JCheckBox th15,JCheckBox th16,JCheckBox th17,JCheckBox th18,JCheckBox th19,JCheckBox th20,JCheckBox th21,JCheckBox th22,JCheckBox th23,JCheckBox th24,JCheckBox th25,JCheckBox th26,JCheckBox th27,JCheckBox th28,JCheckBox fr1,JCheckBox fr2,JCheckBox fr3,JCheckBox fr4,JCheckBox fr5,JCheckBox fr6,JCheckBox fr7,JCheckBox fr8,JCheckBox fr9,JCheckBox fr10,JCheckBox fr11,JCheckBox fr12,JCheckBox fr13,JCheckBox fr14,JCheckBox fr15,JCheckBox fr16,JCheckBox fr17,JCheckBox fr18,JCheckBox fr19,JCheckBox fr20,JCheckBox fr21,JCheckBox fr22,JCheckBox fr23,JCheckBox fr24,JCheckBox fr25,JCheckBox fr26,JCheckBox fr27,JCheckBox fr28,JCheckBox sa1,JCheckBox sa2,JCheckBox sa3,JCheckBox sa4,JCheckBox sa5,JCheckBox sa6,JCheckBox sa7,JCheckBox sa8,JCheckBox sa9,JCheckBox sa10,JCheckBox sa11,JCheckBox sa12,JCheckBox sa13,JCheckBox sa14,JCheckBox sa15,JCheckBox sa16,JCheckBox sa17,JCheckBox sa18,JCheckBox sa19,JCheckBox sa20,JCheckBox sa21,JCheckBox sa22,JCheckBox sa23,JCheckBox sa24,JCheckBox sa25,JCheckBox sa26,JCheckBox sa27,JCheckBox sa28)
     {
      super("Final List");
      setPreferredSize(new Dimension(2000,2000));
       
      g.setBounds(430,20,400,50);
      g.setFont(f);
      g1.setBounds(540,610,400,50);
      g1.setFont(f);

     PPage3.add(g);
     PPage3.add(g1);
 
     PPage3.add(tmm1);
     PPage3.add(mm1);
     PPage3.add(mm2);
     PPage3.add(mm3);
     PPage3.add(mm4);
     PPage3.add(mm5);
     PPage3.add(mm6);
     PPage3.add(mm7);
     PPage3.add(mm8);
     PPage3.add(mm9);
     PPage3.add(mm10);
     PPage3.add(mm11);
     PPage3.add(mm12);
     PPage3.add(mm13);
     PPage3.add(mm14);


     PPage3.add(tmm2);
     PPage3.add(mm15);
     PPage3.add(mm16);
     PPage3.add(mm17);
     PPage3.add(mm18);
     PPage3.add(mm19);
     PPage3.add(mm20);
     PPage3.add(mm21);
     PPage3.add(mm22);
     PPage3.add(mm23);
     PPage3.add(mm24);
     PPage3.add(mm25);
     PPage3.add(mm26);
     PPage3.add(mm27);
     PPage3.add(mm28);

     PPage3.add(tttu1);
     PPage3.add(ttu1);
     PPage3.add(ttu2);
     PPage3.add(ttu3);
     PPage3.add(ttu4);
     PPage3.add(ttu5);
     PPage3.add(ttu6);
     PPage3.add(ttu7);
     PPage3.add(ttu8);
     PPage3.add(ttu9);
     PPage3.add(ttu10);
     PPage3.add(ttu11);
     PPage3.add(ttu12);
     PPage3.add(ttu13);
     PPage3.add(ttu14);

     PPage3.add(tttu2);
     PPage3.add(ttu15);
     PPage3.add(ttu16);
     PPage3.add(ttu17);
     PPage3.add(ttu18);
     PPage3.add(ttu19);
     PPage3.add(ttu20);
     PPage3.add(ttu21);
     PPage3.add(ttu22);
     PPage3.add(ttu23);
     PPage3.add(ttu24);
     PPage3.add(ttu25);
     PPage3.add(ttu26);
     PPage3.add(ttu27);
     PPage3.add(ttu28);

     PPage3.add(twwe1);
     PPage3.add(wwe1);
     PPage3.add(wwe2);
     PPage3.add(wwe3);
     PPage3.add(wwe4);
     PPage3.add(wwe5);
     PPage3.add(wwe6);
     PPage3.add(wwe7);
     PPage3.add(wwe8);
     PPage3.add(wwe9);
     PPage3.add(wwe10);
     PPage3.add(wwe11);
     PPage3.add(wwe12);
     PPage3.add(wwe13);
     PPage3.add(wwe14);

     PPage3.add(twwe2);
     PPage3.add(wwe15);
     PPage3.add(wwe16);
     PPage3.add(wwe17);
     PPage3.add(wwe18);
     PPage3.add(wwe19);
     PPage3.add(wwe20);
     PPage3.add(wwe21);
     PPage3.add(wwe22);
     PPage3.add(wwe23);
     PPage3.add(wwe24);
     PPage3.add(wwe25);
     PPage3.add(wwe26);
     PPage3.add(wwe27);
     PPage3.add(wwe28);

     PPage3.add(ttth1);
     PPage3.add(tth1);
     PPage3.add(tth2);
     PPage3.add(tth3);
     PPage3.add(tth4);
     PPage3.add(tth5);
     PPage3.add(tth6);
     PPage3.add(tth7);
     PPage3.add(tth8);
     PPage3.add(tth9);
     PPage3.add(tth10);
     PPage3.add(tth11);
     PPage3.add(tth12);
     PPage3.add(tth13);
     PPage3.add(tth14);

     PPage3.add(ttth2);
     PPage3.add(tth15);
     PPage3.add(tth16);
     PPage3.add(tth17);
     PPage3.add(tth18);
     PPage3.add(tth19);
     PPage3.add(tth20);
     PPage3.add(tth21);
     PPage3.add(tth22);
     PPage3.add(tth23);
     PPage3.add(tth24);
     PPage3.add(tth25);
     PPage3.add(tth26);
     PPage3.add(tth27);
     PPage3.add(tth28);

     PPage3.add(tffr1);
     PPage3.add(ffr1);
     PPage3.add(ffr2);
     PPage3.add(ffr3);
     PPage3.add(ffr4);
     PPage3.add(ffr5);
     PPage3.add(ffr6);
     PPage3.add(ffr7);
     PPage3.add(ffr8);
     PPage3.add(ffr9);
     PPage3.add(ffr10);
     PPage3.add(ffr11);
     PPage3.add(ffr12);
     PPage3.add(ffr13);
     PPage3.add(ffr14);


     PPage3.add(tffr2);
     PPage3.add(ffr15);
     PPage3.add(ffr16);
     PPage3.add(ffr17);
     PPage3.add(ffr18);
     PPage3.add(ffr19);
     PPage3.add(ffr20);
     PPage3.add(ffr21);
     PPage3.add(ffr22);
     PPage3.add(ffr23);
     PPage3.add(ffr24);
     PPage3.add(ffr25);
     PPage3.add(ffr26);
     PPage3.add(ffr27);
     PPage3.add(ffr28);

     PPage3.add(tssa1);
     PPage3.add(ssa1);
     PPage3.add(ssa2);
     PPage3.add(ssa3);
     PPage3.add(ssa4);
     PPage3.add(ssa5);
     PPage3.add(ssa6);
     PPage3.add(ssa7);
     PPage3.add(ssa8);
     PPage3.add(ssa9);
     PPage3.add(ssa10);
     PPage3.add(ssa11);
     PPage3.add(ssa12);
     PPage3.add(ssa13);
     PPage3.add(ssa14);

     PPage3.add(tssa2);
     PPage3.add(ssa15);
     PPage3.add(ssa16);
     PPage3.add(ssa17);
     PPage3.add(ssa18);
     PPage3.add(ssa19);
     PPage3.add(ssa20);
     PPage3.add(ssa21);
     PPage3.add(ssa22);
     PPage3.add(ssa23);
     PPage3.add(ssa24);
     PPage3.add(ssa25);
     PPage3.add(ssa26);
     PPage3.add(ssa27);
     PPage3.add(ssa28);


     view(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17,m18,m19,m20,m21,m22,m23,m24,m25,m26,m27,m28,tu1,tu2,tu3,tu4,tu5,tu6,tu7,tu8,tu9,tu10,tu11,tu12,tu13,tu14,tu15,tu16,tu17,tu18,tu19,tu20,tu21,tu22,tu23,tu24,tu25,tu26,tu27,tu28,we1,we2,we3,we4,we5,we6,we7,we8,we9,we10,we11,we12,we13,we14,we15,we16,we17,we18,we19,we20,we21,we22,we23,we24,we25,we26,we27,we28,th1,th2,th3,th4,th5,th6,th7,th8,th9,th10,th11,th12,th13,th14,th15,th16,th17,th18,th19,th20,th21,th22,th23,th24,th25,th26,th27,th28,fr1,fr2,fr3,fr4,fr5,fr6,fr7,fr8,fr9,fr10,fr11,fr12,fr13,fr14,fr15,fr16,fr17,fr18,fr19,fr20,fr21,fr22,fr23,fr24,fr25,fr26,fr27,fr28,sa1,sa2,sa3,sa4,sa5,sa6,sa7,sa8,sa9,sa10,sa11,sa12,sa13,sa14,sa15,sa16,sa17,sa18,sa19,sa20,sa21,sa22,sa23,sa24,sa25,sa26,sa27,sa28);
     c.add(PPage3);
     pack();
     setVisible(true);
     }
void view(JCheckBox a1,JCheckBox a2,JCheckBox a3,JCheckBox a4,JCheckBox a5,JCheckBox a6,JCheckBox a7,JCheckBox a8,JCheckBox a9,JCheckBox a10,JCheckBox a11,JCheckBox a12,TextField tf1,TextField tf2,TextField tf3,TextField tf4,TextField tf5,TextField tf6,TextField tf7,TextField tf8,TextField tf9,TextField tf10,TextField tf11,TextField tf12,TextField tf13,TextField tf14,JCheckBox m1,JCheckBox m2,JCheckBox m3,JCheckBox m4,JCheckBox m5,JCheckBox m6,JCheckBox m7,JCheckBox m8,JCheckBox m9,JCheckBox m10,JCheckBox m11,JCheckBox m12,JCheckBox m13,JCheckBox m14,JCheckBox m15,JCheckBox m16,JCheckBox m17,JCheckBox m18,JCheckBox m19,JCheckBox m20,JCheckBox m21,JCheckBox m22,JCheckBox m23,JCheckBox m24,JCheckBox m25,JCheckBox m26,JCheckBox m27,JCheckBox m28,JCheckBox tu1,JCheckBox tu2,JCheckBox tu3,JCheckBox tu4,JCheckBox tu5,JCheckBox tu6,JCheckBox tu7,JCheckBox tu8,JCheckBox tu9,JCheckBox tu10,JCheckBox tu11,JCheckBox tu12,JCheckBox tu13,JCheckBox tu14,JCheckBox tu15,JCheckBox tu16,JCheckBox tu17,JCheckBox tu18,JCheckBox tu19,JCheckBox tu20,JCheckBox tu21,JCheckBox tu22,JCheckBox tu23,JCheckBox tu24,JCheckBox tu25,JCheckBox tu26,JCheckBox tu27,JCheckBox tu28,JCheckBox we1,JCheckBox we2,JCheckBox we3,JCheckBox we4,JCheckBox we5,JCheckBox we6,JCheckBox we7,JCheckBox we8,JCheckBox we9,JCheckBox we10,JCheckBox we11,JCheckBox we12,JCheckBox we13,JCheckBox we14,JCheckBox we15,JCheckBox we16,JCheckBox we17,JCheckBox we18,JCheckBox we19,JCheckBox we20,JCheckBox we21,JCheckBox we22,JCheckBox we23,JCheckBox we24,JCheckBox we25,JCheckBox we26,JCheckBox we27,JCheckBox we28,JCheckBox th1,JCheckBox th2,JCheckBox th3,JCheckBox th4,JCheckBox th5,JCheckBox th6,JCheckBox th7,JCheckBox th8,JCheckBox th9,JCheckBox th10,JCheckBox th11,JCheckBox th12,JCheckBox th13,JCheckBox th14,JCheckBox th15,JCheckBox th16,JCheckBox th17,JCheckBox th18,JCheckBox th19,JCheckBox th20,JCheckBox th21,JCheckBox th22,JCheckBox th23,JCheckBox th24,JCheckBox th25,JCheckBox th26,JCheckBox th27,JCheckBox th28,JCheckBox fr1,JCheckBox fr2,JCheckBox fr3,JCheckBox fr4,JCheckBox fr5,JCheckBox fr6,JCheckBox fr7,JCheckBox fr8,JCheckBox fr9,JCheckBox fr10,JCheckBox fr11,JCheckBox fr12,JCheckBox fr13,JCheckBox fr14,JCheckBox fr15,JCheckBox fr16,JCheckBox fr17,JCheckBox fr18,JCheckBox fr19,JCheckBox fr20,JCheckBox fr21,JCheckBox fr22,JCheckBox fr23,JCheckBox fr24,JCheckBox fr25,JCheckBox fr26,JCheckBox fr27,JCheckBox fr28,JCheckBox sa1,JCheckBox sa2,JCheckBox sa3,JCheckBox sa4,JCheckBox sa5,JCheckBox sa6,JCheckBox sa7,JCheckBox sa8,JCheckBox sa9,JCheckBox sa10,JCheckBox sa11,JCheckBox sa12,JCheckBox sa13,JCheckBox sa14,JCheckBox sa15,JCheckBox sa16,JCheckBox sa17,JCheckBox sa18,JCheckBox sa19,JCheckBox sa20,JCheckBox sa21,JCheckBox sa22,JCheckBox sa23,JCheckBox sa24,JCheckBox sa25,JCheckBox sa26,JCheckBox sa27,JCheckBox sa28)
{
  String d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14="";
  d1=tf1.getText();
  d2=tf2.getText();
  d3=tf3.getText();
  d4=tf4.getText();
  d5=tf5.getText();
  d6=tf6.getText();
  d7=tf7.getText();
  d8=tf8.getText();
  d9=tf9.getText();
  d10=tf10.getText();
  d11=tf11.getText();
  d12=tf12.getText();
  d13=tf13.getText();
  d14=tf14.getText();
  if(a1.isSelected()==true && a7.isSelected()==false)
     {
      
      tmm1.setBounds(30,100,80,20);
      mm1.setBounds(30,150,80,20);
      mm2.setBounds(30,180,80,20);
      mm3.setBounds(30,210,80,20);
      mm4.setBounds(30,240,80,20);
      mm5.setBounds(30,270,80,20);  
      mm6.setBounds(30,300,80,20);
      mm7.setBounds(30,330,80,20);
      mm8.setBounds(30,360,80,20);
      mm9.setBounds(30,390,80,20);
      mm10.setBounds(30,420,80,20);
      mm11.setBounds(30,450,80,20);
      mm12.setBounds(30,480,80,20);
      mm13.setBounds(30,510,80,20);
      mm14.setBounds(30,540,80,20);
  
      tmm1.setText("Monday FN");
      if(m1.isSelected())
             mm1.setText(d1);
      if(m2.isSelected())
             mm2.setText(d2);
      if(m3.isSelected())
             mm3.setText(d3);
      if(m4.isSelected())
             mm4.setText(d4);
      if(m5.isSelected())
             mm5.setText(d5);
      if(m6.isSelected())
             mm6.setText(d6);
      if(m7.isSelected())
             mm7.setText(d7);
      if(m8.isSelected())
             mm8.setText(d8);
      if(m9.isSelected())
             mm9.setText(d9);
      if(m10.isSelected())
             mm10.setText(d10);
      if(m11.isSelected())
             mm11.setText(d11);
      if(m12.isSelected())
             mm12.setText(d12);
      if(m13.isSelected())
             mm13.setText(d13);
      if(m14.isSelected())
             mm14.setText(d14);
      setVisible(true);
      }
  else if(a1.isSelected()==false && a7.isSelected()==true)
     {
      
      tmm2.setBounds(130,100,80,20);
      mm15.setBounds(130,150,80,20);
      mm16.setBounds(130,180,80,20);
      mm17.setBounds(130,210,80,20);
      mm18.setBounds(130,240,80,20);
      mm19.setBounds(130,270,80,20);  
      mm20.setBounds(130,300,80,20);
      mm21.setBounds(130,330,80,20);
      mm22.setBounds(130,360,80,20);
      mm23.setBounds(130,390,80,20);
      mm24.setBounds(130,420,80,20);
      mm25.setBounds(130,450,80,20);
      mm26.setBounds(130,480,80,20);
      mm27.setBounds(130,510,80,20);
      mm28.setBounds(130,540,80,20);    
      if(m15.isSelected())
             mm15.setText(d1);
      if(m16.isSelected())
             mm16.setText(d2);
      if(m17.isSelected())
             mm17.setText(d3);
      if(m18.isSelected())
             mm18.setText(d4);
      if(m19.isSelected())
             mm19.setText(d5);
      if(m20.isSelected())
             mm20.setText(d6);
      if(m21.isSelected())
             mm21.setText(d7);
      if(m22.isSelected())
             mm22.setText(d8);
      if(m23.isSelected())
             mm23.setText(d9);
      if(m24.isSelected())
             mm24.setText(d10);
      if(m25.isSelected())
             mm25.setText(d11);
      if(m26.isSelected())
             mm26.setText(d12);
      if(m27.isSelected())
             mm27.setText(d13);
      if(m28.isSelected())
             mm28.setText(d14);
      tmm2.setText("Monday AN");
      setVisible(true);
      }
  else if(a1.isSelected()==true && a7.isSelected()==true)
      {
      tmm1.setBounds(30,100,80,20);
      mm1.setBounds(30,150,80,20);
      mm2.setBounds(30,180,80,20);
      mm3.setBounds(30,210,80,20);
      mm4.setBounds(30,240,80,20);
      mm5.setBounds(30,270,80,20);  
      mm6.setBounds(30,300,80,20);
      mm7.setBounds(30,330,80,20);
      mm8.setBounds(30,360,80,20);
      mm9.setBounds(30,390,80,20);
      mm10.setBounds(30,420,80,20);
      mm11.setBounds(30,450,80,20);
      mm12.setBounds(30,480,80,20);
      mm13.setBounds(30,510,80,20);
      mm14.setBounds(30,540,80,20);
  
      tmm1.setText("Monday FN");
      if(m1.isSelected())
             mm1.setText(d1);
      if(m2.isSelected())
             mm2.setText(d2);
      if(m3.isSelected())
             mm3.setText(d3);
      if(m4.isSelected())
             mm4.setText(d4);
      if(m5.isSelected())
             mm5.setText(d5);
      if(m6.isSelected())
             mm6.setText(d6);
      if(m7.isSelected())
             mm7.setText(d7);
      if(m8.isSelected())
             mm8.setText(d8);
      if(m9.isSelected())
             mm9.setText(d9);
      if(m10.isSelected())
             mm10.setText(d10);
      if(m11.isSelected())
             mm11.setText(d11);
      if(m12.isSelected())
             mm12.setText(d12);
      if(m13.isSelected())
             mm13.setText(d13);
      if(m14.isSelected())
             mm14.setText(d14);
      tmm2.setBounds(130,100,80,20);
      mm15.setBounds(130,150,80,20);
      mm16.setBounds(130,180,80,20);
      mm17.setBounds(130,210,80,20);
      mm18.setBounds(130,240,80,20);
      mm19.setBounds(130,270,80,20);  
      mm20.setBounds(130,300,80,20);
      mm21.setBounds(130,330,80,20);
      mm22.setBounds(130,360,80,20);
      mm23.setBounds(130,390,80,20);
      mm24.setBounds(130,420,80,20);
      mm25.setBounds(130,450,80,20);
      mm26.setBounds(130,480,80,20);
      mm27.setBounds(130,510,80,20);
      mm28.setBounds(130,540,80,20);    
      if(m15.isSelected())
             mm15.setText(d1);
      if(m16.isSelected())
             mm16.setText(d2);
      if(m17.isSelected())
             mm17.setText(d3);
      if(m18.isSelected())
             mm18.setText(d4);
      if(m19.isSelected())
             mm19.setText(d5);
      if(m20.isSelected())
             mm20.setText(d6);
      if(m21.isSelected())
             mm21.setText(d7);
      if(m22.isSelected())
             mm22.setText(d8);
      if(m23.isSelected())
             mm23.setText(d9);
      if(m24.isSelected())
             mm24.setText(d10);
      if(m25.isSelected())
             mm25.setText(d11);
      if(m26.isSelected())
             mm26.setText(d12);
      if(m27.isSelected())
             mm27.setText(d13);
      if(m28.isSelected())
             mm28.setText(d14);
      tmm2.setText("Monday AN");
      
      setVisible(true);
      }
  else if(a1.isSelected()==false && a7.isSelected()==false)
{}
if(a2.isSelected()==true && a8.isSelected()==false)
     {
      
      tttu1.setBounds(230,100,80,20);
      ttu1.setBounds(230,150,80,20);
      ttu2.setBounds(230,180,80,20);
      ttu3.setBounds(230,210,80,20);
      ttu4.setBounds(230,240,80,20);
      ttu5.setBounds(230,270,80,20); 
      ttu6.setBounds(230,300,80,20);
      ttu7.setBounds(230,330,80,20);
      ttu8.setBounds(230,360,80,20);
      ttu9.setBounds(230,390,80,20);
      ttu10.setBounds(230,420,80,20); 
      ttu11.setBounds(230,450,80,20);
      ttu12.setBounds(230,480,80,20);
      ttu13.setBounds(230,510,80,20);
      ttu14.setBounds(230,540,80,20); 
      tttu1.setText("Tuesday FN");
      if(tu1.isSelected())
             ttu1.setText(d1);
      if(tu2.isSelected())
             ttu2.setText(d2);
      if(tu3.isSelected())
             ttu3.setText(d3);
      if(tu4.isSelected())
             ttu4.setText(d4);
      if(tu5.isSelected())
             ttu5.setText(d5);
      if(tu6.isSelected())
             ttu6.setText(d6);
      if(tu7.isSelected())
             ttu7.setText(d7);
      if(tu8.isSelected())
             ttu8.setText(d8);
      if(tu9.isSelected())
             ttu9.setText(d9);
      if(tu10.isSelected())
             ttu10.setText(d10);
      if(tu11.isSelected())
             ttu11.setText(d11);
      if(tu12.isSelected())
             ttu12.setText(d12);
      if(tu13.isSelected())
             ttu13.setText(d13);
      if(tu14.isSelected())
             ttu14.setText(d14);
      setVisible(true);
      }
  else if(a2.isSelected()==false && a8.isSelected()==true)
     {
      
      tttu2.setBounds(330,100,80,20);
      ttu15.setBounds(330,150,80,20);
      ttu16.setBounds(330,180,80,20);
      ttu17.setBounds(330,210,80,20);
      ttu18.setBounds(330,240,80,20);
      ttu19.setBounds(330,270,80,20);  
      ttu20.setBounds(330,300,80,20);
      ttu21.setBounds(330,330,80,20);
      ttu22.setBounds(330,360,80,20);
      ttu23.setBounds(330,390,80,20);
      ttu24.setBounds(330,420,80,20);  
      ttu25.setBounds(330,450,80,20);
      ttu26.setBounds(330,480,80,20);
      ttu27.setBounds(330,510,80,20);
      ttu28.setBounds(330,540,80,20);  
      if(tu15.isSelected())
             ttu15.setText(d1);
      if(tu16.isSelected())
             ttu16.setText(d2);
      if(tu17.isSelected())
             ttu17.setText(d3);
      if(tu18.isSelected())
             ttu18.setText(d4);
      if(tu19.isSelected())
             ttu19.setText(d5);
      if(tu20.isSelected())
             ttu20.setText(d6);
      if(tu21.isSelected())
             ttu21.setText(d7);
      if(tu22.isSelected())
             ttu22.setText(d8);
      if(tu23.isSelected())
             ttu23.setText(d9);
      if(tu24.isSelected())
             ttu24.setText(d10);
      if(tu25.isSelected())
             ttu25.setText(d11);
      if(tu26.isSelected())
             ttu26.setText(d12);
      if(tu27.isSelected())
             ttu27.setText(d13);
      if(tu28.isSelected())
             ttu28.setText(d14);
      tttu2.setText("Tuesday AN");
      setVisible(true);
      }
  else if(a2.isSelected()==true && a8.isSelected()==true)
      {
      tttu1.setBounds(230,100,80,20);
      ttu1.setBounds(230,150,80,20);
      ttu2.setBounds(230,180,80,20);
      ttu3.setBounds(230,210,80,20);
      ttu4.setBounds(230,240,80,20);
      ttu5.setBounds(230,270,80,20); 
      ttu6.setBounds(230,300,80,20);
      ttu7.setBounds(230,330,80,20);
      ttu8.setBounds(230,360,80,20);
      ttu9.setBounds(230,390,80,20);
      ttu10.setBounds(230,420,80,20); 
      ttu11.setBounds(230,450,80,20);
      ttu12.setBounds(230,480,80,20);
      ttu13.setBounds(230,510,80,20);
      ttu14.setBounds(230,540,80,20); 
      tttu1.setText("Tuesday FN");
      if(tu1.isSelected())
             ttu1.setText(d1);
      if(tu2.isSelected())
             ttu2.setText(d2);
      if(tu3.isSelected())
             ttu3.setText(d3);
      if(tu4.isSelected())
             ttu4.setText(d4);
      if(tu5.isSelected())
             ttu5.setText(d5);
      if(tu6.isSelected())
             ttu6.setText(d6);
      if(tu7.isSelected())
             ttu7.setText(d7);
      if(tu8.isSelected())
             ttu8.setText(d8);
      if(tu9.isSelected())
             ttu9.setText(d9);
      if(tu10.isSelected())
             ttu10.setText(d10);
      if(tu11.isSelected())
             ttu11.setText(d11);
      if(tu12.isSelected())
             ttu12.setText(d12);
      if(tu13.isSelected())
             ttu13.setText(d13);
      if(tu14.isSelected())
             ttu14.setText(d14);

      tttu2.setBounds(330,100,80,20);
      ttu15.setBounds(330,150,80,20);
      ttu16.setBounds(330,180,80,20);
      ttu17.setBounds(330,210,80,20);
      ttu18.setBounds(330,240,80,20);
      ttu19.setBounds(330,270,80,20);  
      ttu20.setBounds(330,300,80,20);
      ttu21.setBounds(330,330,80,20);
      ttu22.setBounds(330,360,80,20);
      ttu23.setBounds(330,390,80,20);
      ttu24.setBounds(330,420,80,20);  
      ttu25.setBounds(330,450,80,20);
      ttu26.setBounds(330,480,80,20);
      ttu27.setBounds(330,510,80,20);
      ttu28.setBounds(330,540,80,20);  
      if(tu15.isSelected())
             ttu15.setText(d1);
      if(tu16.isSelected())
             ttu16.setText(d2);
      if(tu17.isSelected())
             ttu17.setText(d3);
      if(tu18.isSelected())
             ttu18.setText(d4);
      if(tu19.isSelected())
             ttu19.setText(d5);
      if(tu20.isSelected())
             ttu20.setText(d6);
      if(tu21.isSelected())
             ttu21.setText(d7);
      if(tu22.isSelected())
             ttu22.setText(d8);
      if(tu23.isSelected())
             ttu23.setText(d9);
      if(tu24.isSelected())
             ttu24.setText(d10);
      if(tu25.isSelected())
             ttu25.setText(d11);
      if(tu26.isSelected())
             ttu26.setText(d12);
      if(tu27.isSelected())
             ttu27.setText(d13);
      if(tu28.isSelected())
             ttu28.setText(d14);
      tttu2.setText("Tuesday AN");
      setVisible(true);
      }
  else if(a2.isSelected()==false && a8.isSelected()==false)
{}
if(a3.isSelected()==true && a9.isSelected()==false)
     {
      
      twwe1.setBounds(430,100,100,20);
      wwe1.setBounds(430,150,100,20);
      wwe2.setBounds(430,180,100,20);
      wwe3.setBounds(430,210,100,20);
      wwe4.setBounds(430,240,100,20);
      wwe5.setBounds(430,270,100,20);  
      wwe6.setBounds(430,300,100,20);
      wwe7.setBounds(430,330,100,20);
      wwe8.setBounds(430,360,100,20);
      wwe9.setBounds(430,390,100,20);
      wwe10.setBounds(430,420,100,20);
      wwe11.setBounds(430,450,100,20);
      wwe12.setBounds(430,480,100,20);
      wwe13.setBounds(430,510,100,20);
      wwe14.setBounds(430,540,100,20);  
      twwe1.setText("Wednesday FN");
      if(we1.isSelected())
             wwe1.setText(d1);
      if(we2.isSelected())
             wwe2.setText(d2);
      if(we3.isSelected())
             wwe3.setText(d3);
      if(we4.isSelected())
             wwe4.setText(d4);
      if(we5.isSelected())
             wwe5.setText(d5);
      if(we6.isSelected())
             wwe6.setText(d6);
      if(we7.isSelected())
             wwe7.setText(d7);
      if(we8.isSelected())
             wwe8.setText(d8);
      if(we9.isSelected())
             wwe9.setText(d9);
      if(we10.isSelected())
             wwe10.setText(d10);
      if(we11.isSelected())
             wwe11.setText(d11);
      if(we12.isSelected())
             wwe12.setText(d12);
      if(we13.isSelected())
             wwe13.setText(d13);
      if(we14.isSelected())
             wwe14.setText(d14);
      setVisible(true);
      }
  else if(a3.isSelected()==false && a9.isSelected()==true)
     {
      
      twwe2.setBounds(550,100,100,20);
      wwe15.setBounds(550,150,100,20);
      wwe16.setBounds(550,180,100,20);
      wwe17.setBounds(550,210,100,20);
      wwe18.setBounds(550,240,100,20);
      wwe19.setBounds(550,270,100,20);  
      wwe20.setBounds(550,300,100,20);
      wwe21.setBounds(550,330,100,20);
      wwe22.setBounds(550,360,100,20);
      wwe23.setBounds(550,390,100,20);
      wwe24.setBounds(550,420,100,20); 
      wwe25.setBounds(550,450,100,20);
      wwe26.setBounds(550,480,100,20);
      wwe27.setBounds(550,510,100,20);
      wwe28.setBounds(550,540,100,20);   
      if(we15.isSelected())
             wwe15.setText(d1);
      if(we16.isSelected())
             wwe16.setText(d2);
      if(we17.isSelected())
             wwe17.setText(d3);
      if(we18.isSelected())
             wwe18.setText(d4);
      if(we19.isSelected())
             wwe19.setText(d5);
      if(we20.isSelected())
             wwe20.setText(d6);
      if(we21.isSelected())
             wwe21.setText(d7);
      if(we22.isSelected())
             wwe22.setText(d8);
      if(we23.isSelected())
             wwe23.setText(d9);
      if(we24.isSelected())
             wwe24.setText(d10);
      if(we25.isSelected())
             wwe25.setText(d11);
      if(we26.isSelected())
             wwe26.setText(d12);
      if(we27.isSelected())
             wwe27.setText(d13);
      if(we28.isSelected())
             wwe28.setText(d14);
      twwe2.setText("Wednesday AN");
      setVisible(true);
      }
  else if(a3.isSelected()==true && a9.isSelected()==true)
      {
      twwe1.setBounds(430,100,100,20);
      wwe1.setBounds(430,150,100,20);
      wwe2.setBounds(430,180,100,20);
      wwe3.setBounds(430,210,100,20);
      wwe4.setBounds(430,240,100,20);
      wwe5.setBounds(430,270,100,20);  
      wwe6.setBounds(430,300,100,20);
      wwe7.setBounds(430,330,100,20);
      wwe8.setBounds(430,360,100,20);
      wwe9.setBounds(430,390,100,20);
      wwe10.setBounds(430,420,100,20);
      wwe11.setBounds(430,450,100,20);
      wwe12.setBounds(430,480,100,20);
      wwe13.setBounds(430,510,100,20);
      wwe14.setBounds(430,540,100,20);  
      twwe1.setText("Wednesday FN");
      if(we1.isSelected())
             wwe1.setText(d1);
      if(we2.isSelected())
             wwe2.setText(d2);
      if(we3.isSelected())
             wwe3.setText(d3);
      if(we4.isSelected())
             wwe4.setText(d4);
      if(we5.isSelected())
             wwe5.setText(d5);
      if(we6.isSelected())
             wwe6.setText(d6);
      if(we7.isSelected())
             wwe7.setText(d7);
      if(we8.isSelected())
             wwe8.setText(d8);
      if(we9.isSelected())
             wwe9.setText(d9);
      if(we10.isSelected())
             wwe10.setText(d10);
      if(we11.isSelected())
             wwe11.setText(d11);
      if(we12.isSelected())
             wwe12.setText(d12);
      if(we13.isSelected())
             wwe13.setText(d13);
      if(we14.isSelected())
             wwe14.setText(d14);

      twwe2.setBounds(550,100,100,20);
      wwe15.setBounds(550,150,100,20);
      wwe16.setBounds(550,180,100,20);
      wwe17.setBounds(550,210,100,20);
      wwe18.setBounds(550,240,100,20);
      wwe19.setBounds(550,270,100,20);  
      wwe20.setBounds(550,300,100,20);
      wwe21.setBounds(550,330,100,20);
      wwe22.setBounds(550,360,100,20);
      wwe23.setBounds(550,390,100,20);
      wwe24.setBounds(550,420,100,20); 
      wwe25.setBounds(550,450,100,20);
      wwe26.setBounds(550,480,100,20);
      wwe27.setBounds(550,510,100,20);
      wwe28.setBounds(550,540,100,20);   
      if(we15.isSelected())
             wwe15.setText(d1);
      if(we16.isSelected())
             wwe16.setText(d2);
      if(we17.isSelected())
             wwe17.setText(d3);
      if(we18.isSelected())
             wwe18.setText(d4);
      if(we19.isSelected())
             wwe19.setText(d5);
      if(we20.isSelected())
             wwe20.setText(d6);
      if(we21.isSelected())
             wwe21.setText(d7);
      if(we22.isSelected())
             wwe22.setText(d8);
      if(we23.isSelected())
             wwe23.setText(d9);
      if(we24.isSelected())
             wwe24.setText(d10);
      if(we25.isSelected())
             wwe25.setText(d11);
      if(we26.isSelected())
             wwe26.setText(d12);
      if(we27.isSelected())
             wwe27.setText(d13);
      if(we28.isSelected())
             wwe28.setText(d14);
      twwe2.setText("Wednesday AN");
      
      setVisible(true);
      }
  else if(a3.isSelected()==false && a9.isSelected()==false)
{}

 
 if(a4.isSelected()==true && a10.isSelected()==false)
     {
      
      ttth1.setBounds(670,100,80,20);
      tth1.setBounds(670,150,80,20);
      tth2.setBounds(670,180,80,20);
      tth3.setBounds(670,210,80,20);
      tth4.setBounds(670,240,80,20);
      tth5.setBounds(670,270,80,20);  
      tth6.setBounds(670,300,80,20);
      tth7.setBounds(670,330,80,20);
      tth8.setBounds(670,360,80,20);
      tth9.setBounds(670,390,80,20);
      tth10.setBounds(670,420,80,20);  
      tth11.setBounds(670,450,80,20);
      tth12.setBounds(670,480,80,20);
      tth13.setBounds(670,510,80,20);
      tth14.setBounds(670,540,80,20); 
      ttth1.setText("Thursday FN");
      if(th1.isSelected())
             tth1.setText(d1);
      if(th2.isSelected())
             tth2.setText(d2);
      if(th3.isSelected())
             tth3.setText(d3);
      if(th4.isSelected())
             tth4.setText(d4);
      if(th5.isSelected())
             tth5.setText(d5);
      if(th6.isSelected())
             tth6.setText(d6);
      if(th7.isSelected())
             tth7.setText(d7);
      if(th8.isSelected())
             tth8.setText(d8);
      if(th9.isSelected())
             tth9.setText(d9);
      if(th10.isSelected())
             tth10.setText(d10);
      if(th11.isSelected())
             tth11.setText(d11);
      if(th12.isSelected())
             tth12.setText(d12);
      if(th13.isSelected())
             tth13.setText(d13);
      if(th14.isSelected())
             tth14.setText(d14);
      setVisible(true);
      }
  else if(a4.isSelected()==false && a10.isSelected()==true)
     {
      
      ttth2.setBounds(770,100,80,20);
      tth15.setBounds(770,150,80,20);
      tth16.setBounds(770,180,80,20);
      tth17.setBounds(770,210,80,20);
      tth18.setBounds(770,240,80,20);
      tth19.setBounds(770,270,80,20);  
      tth20.setBounds(770,300,80,20);
      tth21.setBounds(770,330,80,20);
      tth22.setBounds(770,360,80,20);
      tth23.setBounds(770,390,80,20);
      tth24.setBounds(770,420,80,20);
      tth25.setBounds(770,450,80,20);
      tth26.setBounds(770,480,80,20);
      tth27.setBounds(770,510,80,20);
      tth28.setBounds(770,540,80,20);    
      if(th15.isSelected())
             tth15.setText(d1);
      if(th16.isSelected())
             tth16.setText(d2);
      if(th17.isSelected())
             tth17.setText(d3);
      if(th18.isSelected())
             tth18.setText(d4);
      if(th19.isSelected())
             tth19.setText(d5);
      if(th20.isSelected())
             tth20.setText(d6);
      if(th21.isSelected())
             tth21.setText(d7);
      if(th22.isSelected())
             tth22.setText(d8);
      if(th23.isSelected())
             tth23.setText(d9);
      if(th24.isSelected())
             tth24.setText(d10);
      if(th25.isSelected())
             tth25.setText(d11);
      if(th26.isSelected())
             tth26.setText(d12);
      if(th27.isSelected())
             tth27.setText(d13);
      if(th28.isSelected())
             tth28.setText(d14);
      ttth2.setText("Thursday AN");
      setVisible(true);
      }
  else if(a4.isSelected()==true && a10.isSelected()==true)
      {
      ttth1.setBounds(670,100,80,20);
      tth1.setBounds(670,150,80,20);
      tth2.setBounds(670,180,80,20);
      tth3.setBounds(670,210,80,20);
      tth4.setBounds(670,240,80,20);
      tth5.setBounds(670,270,80,20);  
      tth6.setBounds(670,300,80,20);
      tth7.setBounds(670,330,80,20);
      tth8.setBounds(670,360,80,20);
      tth9.setBounds(670,390,80,20);
      tth10.setBounds(670,420,80,20);  
      tth11.setBounds(670,450,80,20);
      tth12.setBounds(670,480,80,20);
      tth13.setBounds(670,510,80,20);
      tth14.setBounds(670,540,80,20); 
      ttth1.setText("Thursday FN");
      if(th1.isSelected())
             tth1.setText(d1);
      if(th2.isSelected())
             tth2.setText(d2);
      if(th3.isSelected())
             tth3.setText(d3);
      if(th4.isSelected())
             tth4.setText(d4);
      if(th5.isSelected())
             tth5.setText(d5);
      if(th6.isSelected())
             tth6.setText(d6);
      if(th7.isSelected())
             tth7.setText(d7);
      if(th8.isSelected())
             tth8.setText(d8);
      if(th9.isSelected())
             tth9.setText(d9);
      if(th10.isSelected())
             tth10.setText(d10);
      if(th11.isSelected())
             tth11.setText(d11);
      if(th12.isSelected())
             tth12.setText(d12);
      if(th13.isSelected())
             tth13.setText(d13);
      if(th14.isSelected())
             tth14.setText(d14);

      ttth2.setBounds(770,100,80,20);
      tth15.setBounds(770,150,80,20);
      tth16.setBounds(770,180,80,20);
      tth17.setBounds(770,210,80,20);
      tth18.setBounds(770,240,80,20);
      tth19.setBounds(770,270,80,20);  
      tth20.setBounds(770,300,80,20);
      tth21.setBounds(770,330,80,20);
      tth22.setBounds(770,360,80,20);
      tth23.setBounds(770,390,80,20);
      tth24.setBounds(770,420,80,20);
      tth25.setBounds(770,450,80,20);
      tth26.setBounds(770,480,80,20);
      tth27.setBounds(770,510,80,20);
      tth28.setBounds(770,540,80,20);    
      if(th15.isSelected())
             tth15.setText(d1);
      if(th16.isSelected())
             tth16.setText(d2);
      if(th17.isSelected())
             tth17.setText(d3);
      if(th18.isSelected())
             tth18.setText(d4);
      if(th19.isSelected())
             tth19.setText(d5);
      if(th20.isSelected())
             tth20.setText(d6);
      if(th21.isSelected())
             tth21.setText(d7);
      if(th22.isSelected())
             tth22.setText(d8);
      if(th23.isSelected())
             tth23.setText(d9);
      if(th24.isSelected())
             tth24.setText(d10);
      if(th25.isSelected())
             tth25.setText(d11);
      if(th26.isSelected())
             tth26.setText(d12);
      if(th27.isSelected())
             tth27.setText(d13);
      if(th28.isSelected())
             tth28.setText(d14);
      ttth2.setText("Thursday AN");
      setVisible(true);
      }
  else if(a4.isSelected()==false && a10.isSelected()==false)
{} 
if(a5.isSelected()==true && a11.isSelected()==false)
     {
      
      tffr1.setBounds(870,100,80,20);
      ffr1.setBounds(870,150,80,20);
      ffr2.setBounds(870,180,80,20);
      ffr3.setBounds(870,210,80,20);
      ffr4.setBounds(870,240,80,20);
      ffr5.setBounds(870,270,80,20); 
      ffr6.setBounds(870,300,80,20);
      ffr7.setBounds(870,330,80,20);
      ffr8.setBounds(870,360,80,20);
      ffr9.setBounds(870,390,80,20);
      ffr10.setBounds(870,420,80,20);
      ffr11.setBounds(870,450,80,20);
      ffr12.setBounds(870,480,80,20);
      ffr13.setBounds(870,510,80,20);
      ffr14.setBounds(870,540,80,20); 
      tffr1.setText("Friday FN");
      if(fr1.isSelected())
             ffr1.setText(d1);
      if(fr2.isSelected())
             ffr2.setText(d2);
      if(fr3.isSelected())
             ffr3.setText(d3);
      if(fr4.isSelected())
             ffr4.setText(d4);
      if(fr5.isSelected())
             ffr5.setText(d5);
      if(fr6.isSelected())
             ffr6.setText(d6);
      if(fr7.isSelected())
             ffr7.setText(d7);
      if(fr8.isSelected())
             ffr8.setText(d8);
      if(fr9.isSelected())
             ffr9.setText(d9);
      if(fr10.isSelected())
             ffr10.setText(d10);
      if(fr11.isSelected())
             ffr11.setText(d11);
      if(fr12.isSelected())
             ffr12.setText(d12);
      if(fr13.isSelected())
             ffr13.setText(d13);
      if(fr14.isSelected())
             ffr14.setText(d14);
      setVisible(true);
      }
  else if(a5.isSelected()==false && a11.isSelected()==true)
     {
      
      tffr2.setBounds(970,100,80,20);
      ffr15.setBounds(970,150,80,20);
      ffr16.setBounds(970,180,80,20);
      ffr17.setBounds(970,210,80,20);
      ffr18.setBounds(970,240,80,20);
      ffr19.setBounds(970,270,80,20); 
      ffr20.setBounds(970,300,80,20);
      ffr21.setBounds(970,330,80,20);
      ffr22.setBounds(970,360,80,20);
      ffr23.setBounds(970,390,80,20);
      ffr24.setBounds(970,420,80,20); 
      ffr25.setBounds(970,450,80,20);
      ffr26.setBounds(970,480,80,20);
      ffr27.setBounds(970,510,80,20);
      ffr28.setBounds(970,540,80,20);
      if(fr15.isSelected())
             ffr15.setText(d1);
      if(fr16.isSelected())
             ffr16.setText(d2);
      if(fr17.isSelected())
             ffr17.setText(d3);
      if(fr18.isSelected())
             ffr18.setText(d4);
      if(fr19.isSelected())
             ffr19.setText(d5);
      if(fr20.isSelected())
             ffr20.setText(d6);
      if(fr21.isSelected())
             ffr21.setText(d7);
      if(fr22.isSelected())
             ffr22.setText(d8);
      if(fr23.isSelected())
             ffr23.setText(d9);
      if(fr24.isSelected())
             ffr24.setText(d10);
      if(fr25.isSelected())
             ffr25.setText(d11);
      if(fr26.isSelected())
             ffr26.setText(d12);
      if(fr27.isSelected())
             ffr27.setText(d13);
      if(fr28.isSelected())
             ffr28.setText(d14);
      tffr2.setText("Friday AN");
      setVisible(true);
      }
  else if(a5.isSelected()==true && a11.isSelected()==true)
      {
      tffr1.setBounds(870,100,80,20);
      ffr1.setBounds(870,150,80,20);
      ffr2.setBounds(870,180,80,20);
      ffr3.setBounds(870,210,80,20);
      ffr4.setBounds(870,240,80,20);
      ffr5.setBounds(870,270,80,20); 
      ffr6.setBounds(870,300,80,20);
      ffr7.setBounds(870,330,80,20);
      ffr8.setBounds(870,360,80,20);
      ffr9.setBounds(870,390,80,20);
      ffr10.setBounds(870,420,80,20);
      ffr11.setBounds(870,450,80,20);
      ffr12.setBounds(870,480,80,20);
      ffr13.setBounds(870,510,80,20);
      ffr14.setBounds(870,540,80,20); 
      tffr1.setText("Friday FN");
      if(fr1.isSelected())
             ffr1.setText(d1);
      if(fr2.isSelected())
             ffr2.setText(d2);
      if(fr3.isSelected())
             ffr3.setText(d3);
      if(fr4.isSelected())
             ffr4.setText(d4);
      if(fr5.isSelected())
             ffr5.setText(d5);
      if(fr6.isSelected())
             ffr6.setText(d6);
      if(fr7.isSelected())
             ffr7.setText(d7);
      if(fr8.isSelected())
             ffr8.setText(d8);
      if(fr9.isSelected())
             ffr9.setText(d9);
      if(fr10.isSelected())
             ffr10.setText(d10);
      if(fr11.isSelected())
             ffr11.setText(d11);
      if(fr12.isSelected())
             ffr12.setText(d12);
      if(fr13.isSelected())
             ffr13.setText(d13);
      if(fr14.isSelected())
             ffr14.setText(d14);

      tffr2.setBounds(970,100,80,20);
      ffr15.setBounds(970,150,80,20);
      ffr16.setBounds(970,180,80,20);
      ffr17.setBounds(970,210,80,20);
      ffr18.setBounds(970,240,80,20);
      ffr19.setBounds(970,270,80,20); 
      ffr20.setBounds(970,300,80,20);
      ffr21.setBounds(970,330,80,20);
      ffr22.setBounds(970,360,80,20);
      ffr23.setBounds(970,390,80,20);
      ffr24.setBounds(970,420,80,20); 
      ffr25.setBounds(970,450,80,20);
      ffr26.setBounds(970,480,80,20);
      ffr27.setBounds(970,510,80,20);
      ffr28.setBounds(970,540,80,20);
      if(fr15.isSelected())
             ffr15.setText(d1);
      if(fr16.isSelected())
             ffr16.setText(d2);
      if(fr17.isSelected())
             ffr17.setText(d3);
      if(fr18.isSelected())
             ffr18.setText(d4);
      if(fr19.isSelected())
             ffr19.setText(d5);
      if(fr20.isSelected())
             ffr20.setText(d6);
      if(fr21.isSelected())
             ffr21.setText(d7);
      if(fr22.isSelected())
             ffr22.setText(d8);
      if(fr23.isSelected())
             ffr23.setText(d9);
      if(fr24.isSelected())
             ffr24.setText(d10);
      if(fr25.isSelected())
             ffr25.setText(d11);
      if(fr26.isSelected())
             ffr26.setText(d12);
      if(fr27.isSelected())
             ffr27.setText(d13);
      if(fr28.isSelected())
             ffr28.setText(d14);
      tffr2.setText("Friday AN");
      
      setVisible(true);
      }
  else if(a5.isSelected()==false && a11.isSelected()==false)
{}
if(a6.isSelected()==true && a12.isSelected()==false)
     {
      
      tssa1.setBounds(1070,100,80,20);
      ssa1.setBounds(1070,150,80,20);
      ssa2.setBounds(1070,180,80,20);
      ssa3.setBounds(1070,210,80,20);
      ssa4.setBounds(1070,240,80,20);
      ssa5.setBounds(1070,270,80,20); 
      ssa6.setBounds(1070,300,80,20);
      ssa7.setBounds(1070,330,80,20);
      ssa8.setBounds(1070,360,80,20);
      ssa9.setBounds(1070,390,80,20);
      ssa10.setBounds(1070,420,80,20); 
      ssa11.setBounds(1070,450,80,20);
      ssa12.setBounds(1070,480,80,20);
      ssa13.setBounds(1070,510,80,20);
      ssa14.setBounds(1070,540,80,20); 
      tssa1.setText("Saturday FN");
      if(sa1.isSelected())
             ssa1.setText(d1);
      if(sa2.isSelected())
             ssa2.setText(d2);
      if(sa3.isSelected())
             ssa3.setText(d3);
      if(sa4.isSelected())
             ssa4.setText(d4);
      if(sa5.isSelected())
             ssa5.setText(d5);
      if(sa6.isSelected())
             ssa6.setText(d6);
      if(sa7.isSelected())
             ssa7.setText(d7);
      if(sa8.isSelected())
             ssa8.setText(d8);
      if(sa9.isSelected())
             ssa9.setText(d9);
      if(sa10.isSelected())
             ssa10.setText(d10);
      if(sa11.isSelected())
             ssa11.setText(d11);
      if(sa12.isSelected())
             ssa12.setText(d12);
      if(sa13.isSelected())
             ssa13.setText(d13);
      if(sa14.isSelected())
             ssa14.setText(d14);
      setVisible(true);
      }
  else if(a6.isSelected()==false && a12.isSelected()==true)
     {
      
      tssa2.setBounds(1170,100,80,20);
      ssa15.setBounds(1170,150,80,20);
      ssa16.setBounds(1170,180,80,20);
      ssa17.setBounds(1170,210,80,20);
      ssa18.setBounds(1170,240,80,20);
      ssa19.setBounds(1170,270,80,20);  
      ssa20.setBounds(1170,300,80,20);
      ssa21.setBounds(1170,330,80,20);
      ssa22.setBounds(1170,360,80,20);
      ssa23.setBounds(1170,390,80,20);
      ssa24.setBounds(1170,420,80,20);  
      ssa25.setBounds(1170,450,80,20);
      ssa26.setBounds(1170,480,80,20);
      ssa27.setBounds(1170,510,80,20);
      ssa28.setBounds(1170,540,80,20);  
      if(sa15.isSelected())
             ssa15.setText(d1);
      if(sa16.isSelected())
             ssa16.setText(d2);
      if(sa17.isSelected())
             ssa17.setText(d3);
      if(sa18.isSelected())
             ssa18.setText(d4);
      if(sa19.isSelected())
             ssa19.setText(d5);
      if(sa20.isSelected())
             ssa20.setText(d6);
      if(sa21.isSelected())
             ssa21.setText(d7);
      if(sa22.isSelected())
             ssa22.setText(d8);
      if(sa23.isSelected())
             ssa23.setText(d9);
      if(sa24.isSelected())
             ssa24.setText(d10);
      if(sa25.isSelected())
             ssa25.setText(d11);
      if(sa26.isSelected())
             ssa26.setText(d12);
      if(sa27.isSelected())
             ssa27.setText(d13);
      if(sa28.isSelected())
             ssa28.setText(d14);
      tssa2.setText("Saturday AN");
      setVisible(true);
      }
  else if(a6.isSelected()==true && a12.isSelected()==true)
      {
      tssa1.setBounds(1070,100,80,20);
      ssa1.setBounds(1070,150,80,20);
      ssa2.setBounds(1070,180,80,20);
      ssa3.setBounds(1070,210,80,20);
      ssa4.setBounds(1070,240,80,20);
      ssa5.setBounds(1070,270,80,20); 
      ssa6.setBounds(1070,300,80,20);
      ssa7.setBounds(1070,330,80,20);
      ssa8.setBounds(1070,360,80,20);
      ssa9.setBounds(1070,390,80,20);
      ssa10.setBounds(1070,420,80,20); 
      ssa11.setBounds(1070,450,80,20);
      ssa12.setBounds(1070,480,80,20);
      ssa13.setBounds(1070,510,80,20);
      ssa14.setBounds(1070,540,80,20); 
      tssa1.setText("Saturday FN");
      if(sa1.isSelected())
             ssa1.setText(d1);
      if(sa2.isSelected())
             ssa2.setText(d2);
      if(sa3.isSelected())
             ssa3.setText(d3);
      if(sa4.isSelected())
             ssa4.setText(d4);
      if(sa5.isSelected())
             ssa5.setText(d5);
      if(sa6.isSelected())
             ssa6.setText(d6);
      if(sa7.isSelected())
             ssa7.setText(d7);
      if(sa8.isSelected())
             ssa8.setText(d8);
      if(sa9.isSelected())
             ssa9.setText(d9);
      if(sa10.isSelected())
             ssa10.setText(d10);
      if(sa11.isSelected())
             ssa11.setText(d11);
      if(sa12.isSelected())
             ssa12.setText(d12);
      if(sa13.isSelected())
             ssa13.setText(d13);
      if(sa14.isSelected())
             ssa14.setText(d14);

      tssa2.setBounds(1170,100,80,20);
      ssa15.setBounds(1170,150,80,20);
      ssa16.setBounds(1170,180,80,20);
      ssa17.setBounds(1170,210,80,20);
      ssa18.setBounds(1170,240,80,20);
      ssa19.setBounds(1170,270,80,20);  
      ssa20.setBounds(1170,300,80,20);
      ssa21.setBounds(1170,330,80,20);
      ssa22.setBounds(1170,360,80,20);
      ssa23.setBounds(1170,390,80,20);
      ssa24.setBounds(1170,420,80,20);  
      ssa25.setBounds(1170,450,80,20);
      ssa26.setBounds(1170,480,80,20);
      ssa27.setBounds(1170,510,80,20);
      ssa28.setBounds(1170,540,80,20);  
      if(sa15.isSelected())
             ssa15.setText(d1);
      if(sa16.isSelected())
             ssa16.setText(d2);
      if(sa17.isSelected())
             ssa17.setText(d3);
      if(sa18.isSelected())
             ssa18.setText(d4);
      if(sa19.isSelected())
             ssa19.setText(d5);
      if(sa20.isSelected())
             ssa20.setText(d6);
      if(sa21.isSelected())
             ssa21.setText(d7);
      if(sa22.isSelected())
             ssa22.setText(d8);
      if(sa23.isSelected())
             ssa23.setText(d9);
      if(sa24.isSelected())
             ssa24.setText(d10);
      if(sa25.isSelected())
             ssa25.setText(d11);
      if(sa26.isSelected())
             ssa26.setText(d12);
      if(sa27.isSelected())
             ssa27.setText(d13);
      if(sa28.isSelected())
             ssa28.setText(d14);
      tssa2.setText("Saturday AN");
      
      setVisible(true);
      }
  else if(a6.isSelected()==false && a12.isSelected()==false)
{}

      }
}

