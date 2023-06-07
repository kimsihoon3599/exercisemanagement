package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Gui.StudentAdder;
import Gui.WindowFrame;

public class ButtonAddListener implements ActionListener {
	WindowFrame f;

	public ButtonAddListener(WindowFrame f) {
		this.f=f;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b= (JButton)e.getSource();
		StudentAdder adder =f.getStudentadder();
		f.setupPanel(adder);

	}

}
