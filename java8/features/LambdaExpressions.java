package io.java8.features;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambdaExpressions {

	public static void main(String[] args) {
		
		Frame frame=new Frame("ActionListener Before Java8");
		Button b=new Button("click here");
       b.setBounds(50,100,80,50);
       
       //METHOD IMPLEMENTATION--REGULAR METHOD IMPLEMENTATION
       b.addActionListener(new ActionListener() {
    	 
		public void actionPerformed(ActionEvent e) {
			System.out.println("hello world");
			
		}
       });
       frame.add(b);
       frame.setSize(200,200);
       frame.setLayout(null);
       frame.setVisible(true);
       
       //LAMBDA REPRENSTATION
      /* 
       b.addActionListener(expression -> System.out.println("Hi My name is Lambda"));
       frame.add(b);
       frame.setSize(200,200);
       frame.setLayout(null);
       frame.setVisible(true);
       */
	}

}
