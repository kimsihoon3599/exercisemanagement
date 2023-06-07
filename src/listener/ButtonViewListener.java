package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Gui.StudentViewer;
import Gui.WindowFrame;

public class ButtonViewListener implements ActionListener {
	WindowFrame f;

	public ButtonViewListener(WindowFrame f) {
		this.f=f;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b= (JButton)e.getSource();
		StudentViewer viewer =f.getStudentviewer();
		f.setupPanel(viewer);

	}

}
