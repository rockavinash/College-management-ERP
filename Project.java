 import java.awt.*;
import java.awt.event.ActionEvent; //for action of button
import java.awt.event.ActionListener; //for checking window status
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent; //for events
import java.awt.event.WindowListener;

public class Project
{
Frame f;	
Label ml,rl1,rl2,rl3,rl4,rl5,h1,h2,h3,h4,h5,h6,h7,h8,cl1,cl2,cl3,cl4,cl5,cl6,cl7,cl8;
TextField rt1,rt2,rt3,rt4,rt5,ht,ct1,ct2,ct3,ct4;
TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31,t32,t33,t34,t35;
TextField t36,t37,t38,t39,t40,t41,t42,t43,t44,t45,t46,t47,t48,t49,t50,t51,t52,t53,t54,t55,t56,t57,t58,t59,t60,t61,t62,t63,t64,t65,t66,t67,t68,t69,t70;
Button rb1,rb2,hb,h9,h10,db,cb,cb1,sb,cb2;	
public Project()
{
//FRAME	
f=new Frame();
f.setBackground(Color.LIGHT_GRAY);     
//HEADING
ml= new Label("UNITED COLLEGE OF ENGINEERING AND RESEARCH");
ml.setFont(new Font("Heveticl",Font.BOLD,35));
ml.setBounds(1,40,990,70);
ml.setBackground(Color.BLUE);
ml.setForeground(Color.WHITE);
ml.setAlignment(Label.CENTER);

//NEW DETAILS
rl1= new Label("Name:");
rl1.setFont(new Font("Heveticl",Font.BOLD,12));
rl1.setBounds(30,120,70,25);
rt1=new TextField();
rt1.setBounds(115,120,90,30);
rl2= new Label("College ID:");
rl2.setFont(new Font("Heveticl",Font.BOLD,12));
rl2.setBounds(30,155,70,25);
rt2=new TextField();
rt2.setBounds(115,155,90,30);
rl3= new Label("Branch:");
rl3.setFont(new Font("Heveticl",Font.BOLD,12));
rl3.setBounds(30,190,70,25);
rt3=new TextField();
rt3.setBounds(115,190,90,30);
rl4= new Label("University no:");
rl4.setFont(new Font("Heveticl",Font.BOLD,12));
rl4.setBounds(30,225,85,25);
rt4=new TextField();
rt4.setBounds(115,225,90,30);
rl5= new Label("College name:");
rl5.setFont(new Font("Heveticl",Font.BOLD,12));
rl5.setBounds(30,260,85,25);
rt5=new TextField();
rt5.setBounds(115,260,90,30);
rb1=new Button("Add"); //button
rb1.setBounds(40,310,50,36);
rb2=new Button("Reset"); //button
rb2.setBounds(130,310,50,36);

//NOTICE
hb=new Button("Notice Highlights"); //button
hb.setBounds(35,360,170,36);
ht=new TextField();
ht.setBounds(35,400,170,130);
ht.setBackground(Color.CYAN);

//LIBRARY DUES
cl1= new Label("Check Library Dues");    //library
cl1.setFont(new Font("Heveticl",Font.BOLD,12));
cl1.setBounds(350,385,120,25);
cl1.setBackground(Color.BLUE);
cl1.setForeground(Color.WHITE);
cl2= new Label("College ID:");
cl2.setFont(new Font("Heveticl",Font.BOLD,12));
cl2.setBounds(320,420,100,25);
ct1=new TextField();
ct1.setBounds(420,420,90,30);
cl3= new Label("Collage name:");
cl3.setFont(new Font("Heveticl",Font.BOLD,12));
cl3.setBounds(320,455,100,25);
ct2=new TextField();
ct2.setBounds(420,455,90,30);
sb=new Button("Show");
sb.setBounds(320,495,50,36);
cl4= new Label("");
cl4.setFont(new Font("Heveticl",Font.BOLD,12));
cl4.setBounds(375,495,155,25);
cl4.setBackground(Color.LIGHT_GRAY);
cl4.setForeground(Color.YELLOW);

//FEE STATUS
cl5= new Label("Check Fees Status");
cl5.setFont(new Font("Heveticl",Font.BOLD,12));
cl5.setBounds(725,385,120,25);
cl5.setBackground(Color.BLUE);
cl5.setForeground(Color.WHITE);
cl6= new Label("Student name:");
cl6.setFont(new Font("Heveticl",Font.BOLD,12));
cl6.setBounds(695,420,100,25);
ct3=new TextField();
ct3.setBounds(795,420,90,30);
cl7= new Label("Collage ID:");
cl7.setFont(new Font("Heveticl",Font.BOLD,12));
cl7.setBounds(695,455,100,25);
ct4=new TextField();
ct4.setBounds(795,455,90,30);
cb2=new Button("Check");
cb2.setBounds(690,495,50,36);
cl8= new Label("");
cl8.setFont(new Font("Heveticl",Font.BOLD,12));
cl8.setBounds(745,495,180,25);
cl8.setBackground(Color.LIGHT_GRAY);
cl8.setForeground(Color.YELLOW);

//DETAILS
h1= new Label("S.No");						 //S.No.
h1.setFont(new Font("Heveticl",Font.BOLD,12));
h1.setBounds(217,120,40,25);
h1.setBackground(Color.RED);
h1.setForeground(Color.WHITE);
t1= new TextField("    1.");
t1.setFont(new Font("Heveticl",Font.BOLD,12));
t1.setBounds(217,148,40,25);
t2= new TextField("    2.");
t2.setFont(new Font("Heveticl",Font.BOLD,12));
t2.setBounds(217,176,40,25);
t3= new TextField("    3.");
t3.setFont(new Font("Heveticl",Font.BOLD,12));
t3.setBounds(217,204,40,25);
t4= new TextField("    4.");
t4.setFont(new Font("Heveticl",Font.BOLD,12));
t4.setBounds(217,232,40,25);
t5= new TextField("    5.");
t5.setFont(new Font("Heveticl",Font.BOLD,12));
t5.setBounds(217,260,40,25);
t6= new TextField("    6.");
t6.setFont(new Font("Heveticl",Font.BOLD,12));
t6.setBounds(217,288,40,25);
t7= new TextField("    7.");
t7.setFont(new Font("Heveticl",Font.BOLD,12));
t7.setBounds(217,316,40,25);
h2= new Label("Student name"); 				//Student name
h2.setAlignment(Label.CENTER);
h2.setFont(new Font("Heveticl",Font.BOLD,12));
h2.setBounds(259,120,100,25);
h2.setBackground(Color.RED);
h2.setForeground(Color.WHITE);
t8= new TextField();
t8.setFont(new Font("Heveticl",Font.BOLD,12));
t8.setBounds(259,148,100,25);
t9= new TextField();
t9.setFont(new Font("Heveticl",Font.BOLD,12));
t9.setBounds(259,176,100,25);
t10= new TextField();
t10.setFont(new Font("Heveticl",Font.BOLD,12));
t10.setBounds(259,204,100,25);
t11= new TextField();
t11.setFont(new Font("Heveticl",Font.BOLD,12));
t11.setBounds(259,232,100,25);
t12= new TextField();
t12.setFont(new Font("Heveticl",Font.BOLD,12));
t12.setBounds(259,260,100,25);
t13= new TextField();
t13.setFont(new Font("Heveticl",Font.BOLD,12));
t13.setBounds(259,288,100,25);
t14= new TextField();
t14.setFont(new Font("Heveticl",Font.BOLD,12));
t14.setBounds(259,316,100,25);
h3= new Label("College ID"); 				//College ID
h3.setAlignment(Label.CENTER);
h3.setFont(new Font("Heveticl",Font.BOLD,12)); 
h3.setBounds(362,120,75,25);
h3.setBackground(Color.RED);
h3.setForeground(Color.WHITE);
t15= new TextField();
t15.setFont(new Font("Heveticl",Font.BOLD,12));
t15.setBounds(362,148,75,25);
t16= new TextField();
t16.setFont(new Font("Heveticl",Font.BOLD,12));
t16.setBounds(362,176,75,25);
t17= new TextField();
t17.setFont(new Font("Heveticl",Font.BOLD,12));
t17.setBounds(362,204,75,25);
t18= new TextField();
t18.setFont(new Font("Heveticl",Font.BOLD,12));
t18.setBounds(362,232,75,25);
t19= new TextField();
t19.setFont(new Font("Heveticl",Font.BOLD,12));
t19.setBounds(362,260,75,25);
t20= new TextField();
t20.setFont(new Font("Heveticl",Font.BOLD,12));
t20.setBounds(362,288,75,25);
t21= new TextField();
t21.setFont(new Font("Heveticl",Font.BOLD,12));
t21.setBounds(362,316,75,25);
h4= new Label("Branch");					 //Branch
h4.setAlignment(Label.CENTER);
h4.setFont(new Font("Heveticl",Font.BOLD,12));
h4.setBounds(440,120,50,25);
h4.setBackground(Color.RED);
h4.setForeground(Color.WHITE);
t22= new TextField();
t22.setFont(new Font("Heveticl",Font.BOLD,12));
t22.setBounds(440,148,50,25);
t23= new TextField();
t23.setFont(new Font("Heveticl",Font.BOLD,12));
t23.setBounds(440,176,50,25);
t24= new TextField();
t24.setFont(new Font("Heveticl",Font.BOLD,12));
t24.setBounds(440,204,50,25);
t25= new TextField();
t25.setFont(new Font("Heveticl",Font.BOLD,12));
t25.setBounds(440,232,50,25);
t26= new TextField();
t26.setFont(new Font("Heveticl",Font.BOLD,12));
t26.setBounds(440,260,50,25);
t27= new TextField();
t27.setFont(new Font("Heveticl",Font.BOLD,12));
t27.setBounds(440,288,50,25);
t28= new TextField();
t28.setFont(new Font("Heveticl",Font.BOLD,12));
t28.setBounds(440,316,50,25);
h5= new Label("University roll no."); 		//Uni no.
h5.setFont(new Font("Heveticl",Font.BOLD,12));
h5.setBounds(493,120,100,25);
h5.setBackground(Color.RED);
h5.setForeground(Color.WHITE);
t29= new TextField();
t29.setFont(new Font("Heveticl",Font.BOLD,12));
t29.setBounds(493,148,100,25);
t30= new TextField();
t30.setFont(new Font("Heveticl",Font.BOLD,12));
t30.setBounds(493,176,100,25);
t31= new TextField();
t31.setFont(new Font("Heveticl",Font.BOLD,12));
t31.setBounds(493,204,100,25);
t32= new TextField();
t32.setFont(new Font("Heveticl",Font.BOLD,12));
t32.setBounds(493,232,100,25);
t33= new TextField();
t33.setFont(new Font("Heveticl",Font.BOLD,12));
t33.setBounds(493,260,100,25);
t34= new TextField();
t34.setFont(new Font("Heveticl",Font.BOLD,12));
t34.setBounds(493,288,100,25);
t35=new TextField();
t35.setFont(new Font("Heveticl",Font.BOLD,12));
t35.setBounds(493,316,100,25);
h6= new Label("College name"); 				//Clg name
h6.setFont(new Font("Heveticl",Font.BOLD,12));
h6.setBounds(596,120,80,25);
h6.setBackground(Color.RED);
h6.setForeground(Color.WHITE);
t36= new TextField();
t36.setFont(new Font("Heveticl",Font.BOLD,12));
t36.setBounds(596,148,80,25);
t37= new TextField();
t37.setFont(new Font("Heveticl",Font.BOLD,12));
t37.setBounds(596,176,80,25);
t38= new TextField();
t38.setFont(new Font("Heveticl",Font.BOLD,12));
t38.setBounds(596,204,80,25);
t39= new TextField();
t39.setFont(new Font("Heveticl",Font.BOLD,12));
t39.setBounds(596,232,80,25);
t40= new TextField();
t40.setFont(new Font("Heveticl",Font.BOLD,12));
t40.setBounds(596,260,80,25);
t41= new TextField();
t41.setFont(new Font("Heveticl",Font.BOLD,12));
t41.setBounds(596,288,80,25);
t42= new TextField();
t42.setFont(new Font("Heveticl",Font.BOLD,12));
t42.setBounds(596,316,80,25);
h7= new Label("Sem I marks"); 				//Sem I
h7.setFont(new Font("Heveticl",Font.BOLD,12));
h7.setBounds(679,120,80,25);
h7.setBackground(Color.RED);
h7.setForeground(Color.WHITE);
t43= new TextField();
t43.setFont(new Font("Heveticl",Font.BOLD,12));
t43.setBounds(679,148,80,25);
t44= new TextField();
t44.setFont(new Font("Heveticl",Font.BOLD,12));
t44.setBounds(679,176,80,25);
t45= new TextField();
t45.setFont(new Font("Heveticl",Font.BOLD,12));
t45.setBounds(679,204,80,25);
t46= new TextField();
t46.setFont(new Font("Heveticl",Font.BOLD,12));
t46.setBounds(679,232,80,25);
t47= new TextField();
t47.setFont(new Font("Heveticl",Font.BOLD,12));
t47.setBounds(679,260,80,25);
t48= new TextField();
t48.setFont(new Font("Heveticl",Font.BOLD,12));
t48.setBounds(679,288,80,25);
t49= new TextField();
t49.setFont(new Font("Heveticl",Font.BOLD,12));
t49.setBounds(679,316,80,25);
h8= new Label("Sem II marks"); 				//Sem II
h8.setFont(new Font("Heveticl",Font.BOLD,12));
h8.setBounds(762,120,80,25);
h8.setBackground(Color.RED);
h8.setForeground(Color.WHITE);
t50= new TextField();
t50.setFont(new Font("Heveticl",Font.BOLD,12));
t50.setBounds(762,148,80,25);
t51= new TextField();
t51.setFont(new Font("Heveticl",Font.BOLD,12));
t51.setBounds(762,176,80,25);
t52= new TextField();
t52.setFont(new Font("Heveticl",Font.BOLD,12));
t52.setBounds(762,204,80,25);
t53= new TextField();
t53.setFont(new Font("Heveticl",Font.BOLD,12));
t53.setBounds(762,232,80,25);
t54= new TextField();
t54.setFont(new Font("Heveticl",Font.BOLD,12));
t54.setBounds(762,260,80,25);
t55= new TextField();
t55.setFont(new Font("Heveticl",Font.BOLD,12));
t55.setBounds(762,288,80,25);
t56= new TextField();
t56.setFont(new Font("Heveticl",Font.BOLD,12));
t56.setBounds(762,316,80,25);
h9= new Button("Total");				 	//total button
h9.setFont(new Font("Heveticl",Font.BOLD,12));
h9.setBounds(846,120,57,25);
h9.setBackground(Color.RED);
h9.setForeground(Color.WHITE);
t57= new TextField();
t57.setFont(new Font("Heveticl",Font.BOLD,12));
t57.setBounds(846,148,57,25);
t58= new TextField();
t58.setFont(new Font("Heveticl",Font.BOLD,12));
t58.setBounds(846,176,57,25);
t59= new TextField();
t59.setFont(new Font("Heveticl",Font.BOLD,12));
t59.setBounds(846,204,57,25);
t60= new TextField();
t60.setFont(new Font("Heveticl",Font.BOLD,12));
t60.setBounds(846,232,57,25);
t61= new TextField();
t61.setFont(new Font("Heveticl",Font.BOLD,12));
t61.setBounds(846,260,57,25);
t62= new TextField();
t62.setFont(new Font("Heveticl",Font.BOLD,12));
t62.setBounds(846,288,57,25);
t63= new TextField();
t63.setFont(new Font("Heveticl",Font.BOLD,12));
t63.setBounds(846,316,57,25);
h10= new Button("Average"); 				//avg. button
h10.setFont(new Font("Heveticl",Font.BOLD,12));
h10.setBounds(906,120,68,25);
h10.setBackground(Color.RED);
h10.setForeground(Color.WHITE);
t64= new TextField();
t64.setFont(new Font("Heveticl",Font.BOLD,12));
t64.setBounds(906,148,68,25);
t65= new TextField();
t65.setFont(new Font("Heveticl",Font.BOLD,12));
t65.setBounds(906,176,68,25);
t66= new TextField();
t66.setFont(new Font("Heveticl",Font.BOLD,12));
t66.setBounds(906,204,68,25);
t67= new TextField();
t67.setFont(new Font("Heveticl",Font.BOLD,12));
t67.setBounds(906,232,68,25);
t68= new TextField();
t68.setFont(new Font("Heveticl",Font.BOLD,12));
t68.setBounds(906,260,68,25);
t69= new TextField();
t69.setFont(new Font("Heveticl",Font.BOLD,12));
t69.setBounds(906,288,68,25);
t70= new TextField();
t70.setFont(new Font("Heveticl",Font.BOLD,12));
t70.setBounds(906,316,68,25);

//Details button
db=new Button("Details");
db.setFont(new Font("Heveticl",Font.BOLD,12));
db.setBounds(380,345,60,33);
db.setBackground(Color.BLACK);
db.setForeground(Color.WHITE);

//Clear button
cb=new Button("Clear");
cb.setFont(new Font("Heveticl",Font.BOLD,12));
cb.setBounds(560,345,60,33);
cb.setBackground(Color.BLACK);
cb.setForeground(Color.WHITE);

//Clear_all button
cb1=new Button("Clear all");
cb1.setFont(new Font("Heveticl",Font.BOLD,12));
cb1.setBounds(760,345,60,33);
cb1.setBackground(Color.BLACK);
cb1.setForeground(Color.WHITE);

//add right
f.add(ml);
f.add(rl1); f.add(rt1); f.add(rl2); f.add(rt2); f.add(rl3); f.add(rt3); f.add(rl4); f.add(rt4); f.add(rl5); f.add(rt5);
f.add(rb1); f.add(rb2);
//add notice
f.add(hb); f.add(ht);
//add details
f.add(h1); f.add(h2); f.add(h3); f.add(h4); f.add(h5); f.add(h6); f.add(h7); f.add(h8); f.add(h9); f.add(h10);
f.add(t1); f.add(t2); f.add(t3); f.add(t4); f.add(t5); f.add(t6); f.add(t7);
f.add(t8); f.add(t9); f.add(t10); f.add(t11); f.add(t12); f.add(t13); f.add(t14);
f.add(t15); f.add(t16); f.add(t17); f.add(t18); f.add(t19); f.add(t20); f.add(t21);
f.add(t22); f.add(t23); f.add(t24); f.add(t25); f.add(t26); f.add(t27); f.add(t28);
f.add(t29); f.add(t30); f.add(t31); f.add(t32); f.add(t33); f.add(t34); f.add(t35);
f.add(t36); f.add(t37); f.add(t38); f.add(t39); f.add(t40); f.add(t41); f.add(t42);
f.add(t43); f.add(t44); f.add(t45); f.add(t46); f.add(t47); f.add(t48); f.add(t49);
f.add(t50); f.add(t51); f.add(t52); f.add(t53); f.add(t54); f.add(t55); f.add(t56);
f.add(t57); f.add(t58); f.add(t59); f.add(t60); f.add(t61); f.add(t62); f.add(t63);
f.add(t64); f.add(t65); f.add(t66); f.add(t67); f.add(t68); f.add(t69); f.add(t70);
// add below details
f.add(db); f.add(cb); f.add(cb1);
//add library
f.add(cl1); f.add(cl2); f.add(ct1); f.add(cl3); f.add(ct2); f.add(sb); f.add(cl4);
//add fee
f.add(cl5); f.add(cl6); f.add(ct3); f.add(cl7); f.add(ct4); f.add(cb2); f.add(cl8);
 
f.setSize(1000,800);
f.setLayout(null);
f.setVisible(true);
        
       f.addWindowListener( new WindowAdapter()
                {
                    public void windowClosing(WindowEvent e){
                    f.dispose();
                }
                }); //  *for closing window 
       //reset button
       rb2.addActionListener(new ActionListener(){    //used for changing cour by button click
          public void actionPerformed(ActionEvent e){
         rt1.setText(" ");
         rt2.setText(" "); rt3.setText(" "); rt4.setText(" "); rt5.setText(" ");
            

          }  
            });
       
       //Clear all button
       cb1.addActionListener(new ActionListener(){    //used for changing cour by button click
          public void actionPerformed(ActionEvent e){ 
              
          t8.setText(" "); t9.setText(" "); t10.setText(" ");  
        t11.setText(" "); t12.setText(" ");  t13.setText(" "); t14.setText(" "); t15.setText(" "); t16.setText(" "); t17.setText(" "); t18.setText(" ");  t19.setText(" "); t20.setText(" ");     
        t21.setText(" "); t22.setText(" ");  t23.setText(" "); t24.setText(" "); t25.setText(" "); t26.setText(" "); t27.setText(" "); t28.setText(" ");  t29.setText(" "); t30.setText(" ");     
        t31.setText(" "); t32.setText(" ");  t33.setText(" "); t34.setText(" "); t35.setText(" "); t36.setText(" "); t37.setText(" "); t38.setText(" ");  t39.setText(" "); t40.setText(" ");     
        t41.setText(" "); t42.setText(" ");  t43.setText(" "); t44.setText(" "); t45.setText(" "); t46.setText(" "); t47.setText(" "); t48.setText(" ");  t49.setText(" "); t50.setText(" ");     
        t51.setText(" "); t52.setText(" ");  t53.setText(" "); t54.setText(" "); t55.setText(" "); t56.setText(" "); t57.setText(" "); t58.setText(" ");  t59.setText(" "); t60.setText(" ");     
        t61.setText(" "); t62.setText(" "); t63.setText(" "); t64.setText(" "); t65.setText(" "); t66.setText(" "); t67.setText(" "); t68.setText(" ");  t69.setText(" "); t70.setText(" ");         
                      }  
            });
       //detail button
       db.addActionListener(new ActionListener(){    //used for changing cour by button click
          public void actionPerformed(ActionEvent e){
        
              //nemes 
              t8.setText("Avinash tiwari");  t9.setText("Arshu hamid ");  t10.setText("Himanshu sharma");  
        t11.setText("Amit mishra"); t12.setText("Abishek dubey");  
         //id colege
        t15.setText("61210006"); t16.setText("61210007"); t17.setText("61210008"); t18.setText("61210009");  t19.setText("612100010"); 
     //branch
        t22.setText("CS");  t23.setText("CS"); t24.setText("CS"); t25.setText("CS"); t26.setText("CS"); 
        
//University roll no

 
t29.setText("2100342"); t30.setText("210343");  t31.setText("210344"); t32.setText("210345");  t33.setText("210346");  

//college name
t36.setText("UCER"); t37.setText("UCER"); t38.setText("UCER");  t39.setText("UCER"); t40.setText("UCER");               }  
            });
       
      //show button for library due
       sb.addActionListener(new ActionListener(){    //used for changing cour by button click
          public void actionPerformed(ActionEvent e){
         ct1.setText(" ");
         ct2.setText(" "); 
          cl4.setText("no due found");

          }
       });
       //show button for fee status
cb2.addActionListener(new ActionListener(){    //used for changing cour by button click
          public void actionPerformed(ActionEvent e){
         ct3.setText(" ");
         ct4.setText(" "); 
            cl8.setText("your fee is paid");
          }
          });
//totol button
h9.addActionListener(new ActionListener(){    //used for changing cour by button click
          public void actionPerformed(ActionEvent e){
              Float a= Float.parseFloat(t43.getText());
            Float b= Float.parseFloat(t50.getText());
           t57.setText(String.valueOf(a+b));
          Float c= Float.parseFloat(t44.getText());
            Float d= Float.parseFloat(t51.getText());
           t58.setText(String.valueOf(c+d));
           
            Float z= Float.parseFloat(t45.getText());
            float f= Float.parseFloat(t52.getText());
           t59.setText(String.valueOf(z+f));
            float g= Float.parseFloat(t46.getText());
            float h= Float.parseFloat(t53.getText());
           t60.setText(String.valueOf((g+h)/2));
           
            float i= Float.parseFloat(t47.getText());
            float j= Float.parseFloat(t54.getText());
           t61.setText(String.valueOf((i+j)/2));
           
            float k= Float.parseFloat(t48.getText());
            float l= Float.parseFloat(t55.getText());
           t62.setText(String.valueOf((k+l)/2));
           
            float m= Float.parseFloat(t49.getText());
            float n= Float.parseFloat(t56.getText());
           t63.setText(String.valueOf((m+n)/2));
          
          }
          }); 
//totol button
h10.addActionListener(new ActionListener(){    //used for changing cour by button click
          public void actionPerformed(ActionEvent e){
              float a= Float.parseFloat(t43.getText());
            float b= Float.parseFloat(t50.getText());
           t64.setText(String.valueOf((a+b)/2));
          
            float c= Float.parseFloat(t44.getText());
            float d= Float.parseFloat(t51.getText());
           t65.setText(String.valueOf((c+d)/2));
           
            float z= Float.parseFloat(t45.getText());
            float f= Float.parseFloat(t52.getText());
           t66.setText(String.valueOf((z+f)/2));
            float g= Float.parseFloat(t46.getText());
            float h= Float.parseFloat(t53.getText());
           t67.setText(String.valueOf((g+h)/2));
           
            float i= Float.parseFloat(t47.getText());
            float j= Float.parseFloat(t54.getText());
           t68.setText(String.valueOf((i+j)/2));
           
            float k= Float.parseFloat(t48.getText());
            float l= Float.parseFloat(t55.getText());
           t69.setText(String.valueOf((k+l)/2));
           
            float m= Float.parseFloat(t49.getText());
            float n= Float.parseFloat(t56.getText());
           t70.setText(String.valueOf((m+n)/2)); }
          }); 


    }
    public static void main(String[] args) {
        new Project();
              }   
}