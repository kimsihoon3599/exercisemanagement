package student;

import java.util.Scanner;

import exceptions.EmailFormatException;

public interface StudentInput {
	
	public int getId();
	
	public void setId(int id);
	
	public String getName();
	
	public void setName(String name);
	
	public String getEmail();
	
	public void setEmail(String email) throws EmailFormatException;
	
	public String getPhone();
	
	public void setPhone(String phone);
	
	public void setExercise(String exercise);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();

	public void setStudentID( Scanner input);
	
	public void setStudentName(Scanner input);
	
	public void setStudentEmail(Scanner input);
	
	public void setStudentPhone(Scanner input);
	
	public void setStudentExercise(Scanner input);
	
	
	
	
	
}
