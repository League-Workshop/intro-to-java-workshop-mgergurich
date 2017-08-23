package day3;

import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	  String name = JOptionPane.showInputDialog("What is your name");
	  String phonenumber = JOptionPane.showInputDialog("What is your phonenumber");
	JOptionPane.showMessageDialog(null,"Hi"+name+".Your phonenumber is"+ phonenumber);
}
}
