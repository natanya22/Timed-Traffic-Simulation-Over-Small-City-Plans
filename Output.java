

import javax.swing.JScrollPane;
import javax.swing.*;


import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.awt.Graphics;



class Output{

    HashMap<Integer,ArrayList<Street>> finalLight = new HashMap<Integer,ArrayList<Street>>();     //pathsvstime
    HashMap<Street,ArrayList<Integer>> streetsvstime = new  HashMap<Street,ArrayList<Integer>>(); 
     ArrayList<IntersectionSchedule> intersectionSchedules1 = new ArrayList<IntersectionSchedule>();

     Output()
     {

     }
   
    Output(  HashMap<Integer,ArrayList<Street>> finalLight , HashMap<Street,ArrayList<Integer>> streetsvstime,ArrayList<IntersectionSchedule> intersectionSchedules1){
        this.finalLight = finalLight;
        this.streetsvstime=streetsvstime;
        this.intersectionSchedules1=intersectionSchedules1;       //parameterized constructor
    }

    void output(){
       // Download download = new Download(finalLight,streetsvstime,intersectionSchedules1);
        //download.f1();
    }
    
}


 class Download extends JFrame{
            
    HashMap<Integer,ArrayList<Street>> finalLight = new HashMap<Integer,ArrayList<Street>>();   //pathsvstime
    HashMap<Street,ArrayList<Integer>> streetsvstime= new HashMap<Street,ArrayList<Integer>>();
    ArrayList<IntersectionSchedule> intersectionSchedules1 = new ArrayList<IntersectionSchedule>();
    JPanel panel1;
    public String str;

  // public JScrollPane textfield2;

   public JTextArea textfield;
   

           /* void f1(){
                new Download(finalLight, streetsvstime,intersectionSchedules1);
            }*/
            public JButton button1;

            void downloadbut( HashMap<Integer,ArrayList<Street>> finalLight , HashMap<Street,ArrayList<Integer>> streetsvstime,ArrayList<IntersectionSchedule> intersectionSchedules1)
            {
                button1.addActionListener(e-> {

                    this.finalLight= finalLight;
                    this.streetsvstime = streetsvstime;
                    this.intersectionSchedules1= intersectionSchedules1;

                    File f = new File("file1.txt");
                    try{
                        PrintWriter printWriter = new PrintWriter(f);
                   // printWriter.print(finalLight);

                   printWriter.println("STREETS VS TIME\n\n");
                   printWriter.println("1 for Green and 0 for Red \n\n");
                   
               
                   for(Street key1:streetsvstime.keySet())
                   {
                       printWriter.print(key1.StreetId+" - "+streetsvstime.get(key1)+"\n");
                   }
               
                   printWriter.println("\n\n");
               
                  printWriter.println("CAR-PATH VS TIME\n");


                   for(int key : finalLight.keySet())
{

    printWriter.print("CAR "+key+" :-\n\n");
    for(int z=0;z<finalLight.get(key).size();z++)
 { 
     
     printWriter.print(z+" - "+finalLight.get(key).get(z).StreetId+"   "); 
    

    }

 printWriter.println("\n\n");

}
                    printWriter.close();
        
                    }
                    catch(FileNotFoundException ex){
                        System.out.println("file not found");
                    }


                });

                
               textfield.setText("Open file1.txt for Output and press Download ");
               


            }

            String inp()
            {
                return str;
            }
            
            Download()
            {
                this.setSize(500,300);      //size of frame
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
                this.setTitle("Traffic Signalling");  //title
                        
                
                        
                panel1 = new JPanel();  // creating a panel
                
                final ImageIcon imageIcon = new ImageIcon("squid.png");  // image

                textfield= new JTextArea(20,40){    //input preview screen 

                java.awt.Image image = imageIcon.getImage();

      java.awt.Image grayImage = GrayFilter.createDisabledImage(image);
      {
        setOpaque(false);
      }

     public void paint(Graphics g) {
        g.drawImage(grayImage, 0, 0, this);
        super.paint(g);
      } 


                };

                textfield.setBounds(5, 5, 280, 50);   // setting size of text area
                panel1.add(textfield);    // adding the text area to the panel 


            //Forming 3 buttons for each test case 

                JButton tc1= new JButton("Test Case 1");
           JButton tc2= new JButton("Test Case 2");
           JButton tc3= new JButton("Test Case 3");

          
          

           panel1.add(tc1);
           panel1.add(tc2);
           panel1.add(tc3);
         
      

           tc1.addActionListener(e -> {            //lambda expression for handling button action

          Path fileName = Path.of("file.txt");     // Test Case 1 file loaded
         
   
           try {
          
               String actual = Files.readString(fileName);   // all the content of the text file is copied in this string actual
               textfield.setText("Input File Preview - Test Case 1 \n\n\n"+ actual);

          
           } catch (IOException e1) {
               // TODO Auto-generated catch block
               e1.printStackTrace();
           }

           
          str=fileName.toString();    //str stores file.txt
          inp();
          

           });


           tc2.addActionListener(e -> {

            Path fileName = Path.of("file2.txt");
         
     
             try {
               // textfield2 = new JScrollPane();
                 String actual = Files.readString(fileName);
                 textfield.setText("Input File Preview - Test Case 2\n\n\n"+ actual);
                JLabel l2 = new JLabel(actual);
             
             } catch (IOException e2) {
                 // TODO Auto-generated catch block
                 e2.printStackTrace();
             }

            
            str=fileName.toString();
            inp();

           });

           tc3.addActionListener(e -> {

            Path fileName = Path.of("file3.txt");
         
     
             try {
             
                 String actual = Files.readString(fileName);
                 textfield.setText("Input File Preview Test Case 3\n\n\n"+ actual);
            
             } catch (IOException e2) {
                 // TODO Auto-generated catch block
                 e2.printStackTrace();
             }

             str=fileName.toString();
             inp();

           });

           



          

           button1= new JButton ("Download");
      
            panel1.add(button1);
       
      
          
            this.add(panel1);
            this.setVisible(true);

        }  
}
                
        