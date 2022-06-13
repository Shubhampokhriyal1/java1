import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
class B extends JFrame implements ActionListener{
JTextField tf1,tf2,tf3;
JButton b1;
JCheckBox bx1,bx2,bx3,bx4,bx5; 
JLabel l1,l2;
B(){
l1=new JLabel("Welcom");
l1.setBounds(100,50,300,20);


bx1=new JCheckBox("Tea : 10 Rs");
bx1.setBounds(100,150,150,30);
bx2=new JCheckBox("Coffe : 20 Rs");
bx2.setBounds(100,200,150,30);
bx3=new JCheckBox("Pizza : 100 Rs");
bx3.setBounds(100,250,150,30);
bx4=new JCheckBox("Butter Chiken : 180 Rs");
bx4.setBounds(100,300,150,30);
bx5=new JCheckBox("Noodles : 50 Rs");
bx5.setBounds(100,350,150,30);


l2=new JLabel("Total Bill");
l2.setBounds(100,400,150,20);

b1 =new JButton ("Order");
b1.setBounds(100,450,80,30);
b1.addActionListener(this);

tf1=new JTextField(30);
tf1.setBounds(100,500,150,30);

setLayout(null);
add(l1);
add(bx1);
add(bx2);
add(bx3);
add(bx4);
add(bx5);
add(b1);
add(l2);
add(tf1);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e){
	int amt=0;
	if(bx1.isSelected()){
		amt+=10;
	}
	if(bx2.isSelected()){
		amt+=20;
	}
	if(bx3.isSelected()){
		amt+=100;
	}
	if(bx4.isSelected()){
		amt+=180;
	}
	if(bx5.isSelected()){
		amt+=50;
	}
	tf1.setText(Integer.toString(amt)+" Rs");
}
}
class gui{
	public static void main(String args[]){
		B d=new B();
		d.setSize(300,400);
		d.setVisible(true);
	}
}
