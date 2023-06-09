package student;

import java.io.Serializable;
import java.util.Scanner;

import exceptions.EmailFormatException;

public abstract class Student implements StudentInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7647989844265756632L;
	protected StudentKind kind = StudentKind.University;
	public StudentKind getKind() {
		return kind;
	}
	public void setKind(StudentKind kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) throws EmailFormatException  {
		if(!email.contains("@") && !email.equals("")) {
			throw new EmailFormatException();
		}
		
			this.email = email;
		}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getExercise() {
		return exercise;
	}
	public void setExercise(String exercise) {
		this.exercise = exercise;
	}
	
	public abstract void printInfo(); 
	
	public void setStudentID( Scanner input) {
		System.out.print("Student ID:");
		int id = input.nextInt();
		this.setId(id);
	}
	public void setStudentName(Scanner input) {
		System.out.print("Student Name:");
		String name = input.next();
		this.setName(name);
	}
	public void setStudentEmail(Scanner input) {
		String email ="";
		while (!email.contains("@")){
			System.out.print("Email address:");
			email = input.next();
			try {
				this.setEmail(email);
				}catch(EmailFormatException e) {
					System.out.println("Incorrect Email Formar. put the e-mail address contains @");
					
				}
		}
	}
	public void setStudentPhone( Scanner input) {
		System.out.print("Student Phone:");
		String phone = input.next();
		this.setPhone(phone);
	}
	public void setStudentExercise( Scanner input) {
		System.out.print("Student Exercise:");
		String exercise = input.next();
		this.setExercise(exercise);
	}
	
	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case University:
			skind ="Univ";
			break;
		case HighSchool:
			skind ="High";
			break;
		case MiddleSchool:
			skind ="Middle";
			break;
		case ElementarySchool:
			skind ="Elementary";
			break;
			default:
		}
		return skind;
	}
	



	
	protected String name;
	protected int id;
	protected String email;
	protected String phone;
	protected String exercise;
	
	public Student() {
		
	}
public Student(StudentKind kind) {
		this.kind=kind;
	}
public Student(String name, int id) {
		
		this.name=name;
		this.id=id;
		
}
	
	public Student(String name, int id,String email, String phone, String exercise) {
		
		this.name=name;
		this.id=id;
		this.email=email;
		this.phone=phone;
		this.exercise=exercise;
		
	}
	
	

}
