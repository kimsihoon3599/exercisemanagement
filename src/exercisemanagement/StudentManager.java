package exercisemanagement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import student.ElementarySchoolStudent;
import student.HighSchoolStudent;
import student.Student;
import student.StudentInput;
import student.StudentKind;
import student.UniversityStudent;

public class StudentManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2787816053498607507L;

	ArrayList<StudentInput> students = new ArrayList<StudentInput>();
	
	transient Scanner input;
	
	StudentManager(Scanner input){
		this.input=input;
	}
	public void addStudent() {
		int kind=0;
		StudentInput studentInput;
		while(kind<1 || kind >3) {
			try {
	    
		System.out.println("1 for University :");
		System.out.println("2 for High School :");
		System.out.println("3 for Elementary School :");
		System.out.print("Select num 1 and 2, or 3 for Student Kind:");
		kind = input.nextInt();
		if(kind==1) {
			studentInput = new UniversityStudent(StudentKind.University);
			studentInput.getUserInput(input);
			students.add(studentInput);
			break;
		}
		else if(kind==2) {
			studentInput = new HighSchoolStudent(StudentKind.HighSchool);
			studentInput.getUserInput(input);
			students.add(studentInput);
			break;
		}
		else if(kind==3) {
			studentInput = new ElementarySchoolStudent(StudentKind.ElementarySchool);
			studentInput.getUserInput(input);
			students.add(studentInput);
			break;
		}
		else {
			System.out.print("Select num for  Student Kind beteen 1 and 2 :");
		}
			
		}
		catch(InputMismatchException e) {
			System.out.println("Please put an integer between 1 and 5!");
			if(input.hasNext()) {
				input.next();
			}
			kind= -1;
		}
		
		}
	}
	public void deletStudent() {
	
		System.out.print("Student ID :");
		int studentId = input.nextInt();
		int index =findIndex(studentId);
		removefromStudents( index,  studentId);
		}
		public int findIndex(int studentId) {
			int index = -1;
			for(int i=0; i<students.size(); i++) {
				if(students.get(i).getId() == studentId) {
					index = i;
					break;
				}
		}
		return index;
		}
		
	public int removefromStudents(int index, int studentId) {
		if (index >= 0) {
			students.remove(index);
			System.out.println("the student " + studentId + " is deleted");
			return 1;
		}
		else {
			System.out.println("the student has been registered");
			return -1;
	}
	}
	
	public void editStudent() {
		
		System.out.print("Student ID :");
		int studentId = input.nextInt();
		for(int i=0; i<students.size(); i++) {
			StudentInput student = students.get(i);
		if(student.getId() == studentId) {
			int num=-1;
			
			
			
			
			while(num !=6) {
				showEditMenu();
			num = input.nextInt();
			switch(num) {
			case 1:
				student.setStudentID(input);
				break;
			case 2:
				student.setStudentName(input);
				break;
			case 3:
				student.setStudentEmail(input);
				break;
			case 4:
				student.setStudentPhone( input);
				break;
			case 5:
				student.setStudentExercise( input);
				break;
			default:
				continue;
			}
			}
			break;
			}
}
		}
	
	public void viewStudents() {
		

		System.out.println("# of registered students:" + students.size());
		for(int i=0; i<students.size(); i++) {
			students.get(i).printInfo();
		}
		}
	 public int size() {
		 return students.size();
	 }
	 public StudentInput get(int index) {
		 return(Student) students.get(index);
	 }
	
	public void showEditMenu() {
		System.out.println("*** Student Management System Menu ***");
		System.out.println("1. Edit Id");
		System.out.println("2. Edit name");
		System.out.println("3. Edit Email");
		System.out.println("4. Edit Phonenumber ");
		System.out.println("5. Edit exercise ");
		System.out.println("6. Exit");
		System.out.println("Select one number between 1 ~6:");
	}
}
