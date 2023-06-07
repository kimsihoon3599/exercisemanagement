package Gui;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import exercisemanagement.StudentManager;

public class WindowFrame extends JFrame{
	StudentManager studentManager;
	MenuSelection menuselection;
	StudentAdder studentadder;
	StudentViewer studentviewer;
	

	public WindowFrame(StudentManager studentManager) {
		this.studentManager = studentManager;
		menuselection =new MenuSelection(this);
		studentadder = new StudentAdder(this);
		studentviewer = new StudentViewer(this, this.studentManager);
		
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.setupPanel(menuselection);
		
		
		this.setVisible(true);
	}
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	public MenuSelection getMenuselection() {
		return menuselection;
	}
	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}
	public StudentAdder getStudentadder() {
		return studentadder;
	}
	public void setStudentadder(StudentAdder studentadder) {
		this.studentadder = studentadder;
	}
	public StudentViewer getStudentviewer() {
		return studentviewer;
	}
	public void setStudentviewer(StudentViewer studentviewer) {
		this.studentviewer = studentviewer;
	}
	
	
	

}
