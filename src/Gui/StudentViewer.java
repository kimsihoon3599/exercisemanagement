package Gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import exercisemanagement.StudentManager;
import student.StudentInput;

public class StudentViewer extends JPanel {
	WindowFrame f;
	StudentManager studentManager;

		public StudentViewer(WindowFrame f, StudentManager studentManager) {
			this.f=f;
			this.studentManager =studentManager;
			
			System.out.println("***"+ studentManager.size()+"***");

			DefaultTableModel model = new DefaultTableModel();
			model.addColumn("Id");
			model.addColumn("Name");
			model.addColumn("Email");
			model.addColumn("Contact Info");
			
			for(int i=0; i<studentManager.size(); i++) {
				Vector row =new Vector();
				StudentInput si = studentManager.get(i);
				row.add(si.getId());
				row.add(si.getName());
				row.add(si.getEmail());
				row.add(si.getPhone());
				model.addRow(row);
			}
		
		    JTable table = new JTable(model);
		    JScrollPane sp = new JScrollPane(table);
		    
		    this.add(sp);		
	
			
			}
	}

