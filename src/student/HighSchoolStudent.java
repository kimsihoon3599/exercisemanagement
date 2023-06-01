package student;

import java.util.Scanner;


public class HighSchoolStudent extends TeenageStudent {
	public HighSchoolStudent(StudentKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input){
		setStudentID(input);
		setStudentName(input);
		setStudentEmailwithYN(input);
		setStudentPhone(input);
		setStudentExercise(input);
	}

	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " name: "+ name +" "+ "id: "+id+" "+ "email: " +email +" "+ "phone:" +phone +" "+"exercise: "+ exercise);
	}
	

}
