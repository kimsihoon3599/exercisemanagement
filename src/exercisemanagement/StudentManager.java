package exercisemanagement;

import java.util.ArrayList;
import java.util.Scanner;

import student.HighSchoolStudent;
import student.Student;

public class StudentManager {
	ArrayList<Student> students = new ArrayList<Student>();
	
	Scanner input;
	
	StudentManager(Scanner input){
		this.input=input;
	}
	public void addStudent() {
		int kind=0;
		Student student;
		while(kind!=1 && kind!=2) {
		System.out.print("1 for University :");
		System.out.print("2 for High School :");
		System.out.print("Select num for  Student Kind beteen 1 and 2 :");
		kind = input.nextInt();
		if(kind==1) {
			student = new Student();
			student.getUserInput(input);
			students.add(student);
			break;
		}
		else if(kind==2) {
			student = new HighSchoolStudent();
			student.getUserInput(input);
			students.add(student);
			break;
		}
		else {
			System.out.print("Select num for  Student Kind beteen 1 and 2 :");
		}
			
		}
		
		
		
	}
	public void deletStudent() {
	
		System.out.print("Student ID :");
		int studentId = input.nextInt();
		int index = -1;
		for(int i=0; i<students.size(); i++) {
			if(students.get(i).getId() == studentId) {
				index = i;
				break;
		}
		}
		if (index >= 0) {
			students.remove(index);
			System.out.println("the student " + studentId + " is deleted");
		}
		else {
			System.out.println("the student has been registered");
			return;
		}
		
		
		}
	
	public void editStudent() {
		
		System.out.print("Student ID :");
		int studentId = input.nextInt();
		for(int i=0; i<students.size(); i++) {
			Student student = students.get(i);
		if(student.getId() == studentId) {
			int num=-1;
			
			
			
			
			while(num !=6) {
			System.out.println("1. Edit Id");
			System.out.println("2. Edit name");
			System.out.println("3. Edit Email");
			System.out.println("4. Edit Phonenumber ");
			System.out.println("5. Edit exercise ");
			System.out.println("6. Exit");
			num = input.nextInt();
			if(num==1) {
				System.out.print("Student Id:");
				int id = input.nextInt();
				student.setId(id);
			}
			else if (num ==2) {
				System.out.print("Student name:");
				String name = input.next();
				student.setName(name);
			}
			else if (num ==3) {
				System.out.print("Email address:");
				String email = input.next();
				student.setEmail(email);
			}
			else if (num ==4) {
				System.out.print("Phone number:");
				String phone = input.next();
				student.setPhone(phone);
		}
			else if (num ==5) {
				System.out.print("exercise :");
				String exercise = input.next();
				student.setExercise(exercise);
			}
			else {
				continue;
			}
			}
			break;
			}
}
		}
	
	public void viewStudents() {
		
//		System.out.print("Student ID :");
//		int studentId = input.nextInt();
		System.out.println("# of registered students:" + students.size());
		for(int i=0; i<students.size(); i++) {
			students.get(i).printInfo();
		}
		
		
		
		
	}
}
