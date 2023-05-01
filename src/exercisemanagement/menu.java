package exercisemanagement;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StudentManager studentManager = new StudentManager(input);
		int num=-1;
		
		
		
	
		while(num !=6) {
		System.out.println("1. Add Student");
		System.out.println("2. Delet Student");
		System.out.println("3. Edit Student");
		System.out.println("4. View Student ");
		System.out.println("5. Exit");
		num = input.nextInt();
		if(num==1) {
			studentManager.addStudent();
		}
		else if (num ==2) {
			studentManager.deletStudent();
		}
		else if (num ==3) {
			studentManager.editStudent();
		}
		else if (num ==4) {
			studentManager.viewStudents();
	}
		else {
			continue;
		}
		}
		}
	
	


//		switch(num) {
//		case 1:
//			System.out.print("Student Id :");
//			int studentId = input.nextInt();
//			System.out.print("Student name :");
//			String studentName = input.next();
//			System.out.print("Student address :");
//			int studentAddress = input.nextInt();
//			System.out.print("Student phonenumber :");
//			int studentPhonenumber = input.nextInt();
//			
//			break;
//		case 2:
//		case 3:
//		case 4:
//			System.out.print("Student Id :");
//			int studentId2 = input.nextInt();
//			
//		}

	}
	

