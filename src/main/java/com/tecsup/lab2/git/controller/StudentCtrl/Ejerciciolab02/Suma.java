package com.tecsup.lab2.git.controller.StudentCtrl.Ejerciciolab02;



import javax.swing.JOptionPane;

public class Suma {

	
	public static void main (String args []){
	
	
	
		
		String a1, b1;	
		int num1, num2, sum;
		a1=JOptionPane.showInputDialog("introduce el #1");
		b1=JOptionPane.showInputDialog("introduce el #2");
		
		num1=Integer.parseInt(a1);
		
		num2=Integer.parseInt(b1);
		sum=num1+num2;
		
		JOptionPane.showMessageDialog(null,"La sumade\t"+num1+"+"+num2+"="+ sum);
		

	}

}