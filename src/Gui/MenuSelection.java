package Gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listener.ButtonAddListener;
import listener.ButtonViewListener;

public class MenuSelection extends JPanel{
	
	WindowFrame f;
	
	public MenuSelection(WindowFrame f) {
		this.f=f;
		this.setLayout(new BorderLayout());
		
		JPanel p1 =new JPanel();
		JPanel p2 =new JPanel();
		JLabel l=new JLabel("Menu Selection");
		
		JButton b1=new JButton("Add Student");
		JButton b2=new JButton("view Student");
		JButton b3=new JButton("Edit Student");
		JButton b4=new JButton("Delete Student");
		JButton b5=new JButton("Exit Program");
		
		b1.addActionListener(new ButtonAddListener(f));
		b2.addActionListener(new ButtonViewListener(f));
		
		p1.add(l);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		
		this.add(p1, BorderLayout.NORTH);
		this.add(p2, BorderLayout.CENTER);
		
		
		
		
		
		
		
		
	}

}
