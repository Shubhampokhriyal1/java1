import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
class B extends JFrame implements ActionListener{
JTextField tf1,tf2,tf3;
JButton b1;
JLabel l1,l2;
B(){
l1=new JLabel ("NUM 1");
l2=new JLabel ("NUM 2");
b1 =new JButton ("ADD");
tf1 =new JTextField(20);
tf3 =new JTextField(20);
tf2=new JTextField(20);
b1.addActionListener(this);
setLayout(new FlowLayout());
add(l1);
add(tf1);
add(l2);
add(tf2);
add(b1);
add(tf3);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e){
int n1=Integer.parseInt(tf1.getText().trim())+Integer.parseInt(tf2.getText().trim());
tf3.setText(Integer.toString(n1));
}
}
class gui{
	public static void main(String args[]){
		B d=new B();
		d.setSize(300,400);
		d.setVisible(true);
	}
}
