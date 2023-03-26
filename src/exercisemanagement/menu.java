package exercisemanagement;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		int num=0;
		Scanner input = new Scanner(System.in);
		
		
	
		while(num !=6) {
		System.out.println("1. Add Student");
		System.out.println("2. Delet Student");
		System.out.println("3. Edit Student");
		System.out.println("4. View Student ");
		System.out.println("5. Show a menu");
		System.out.println("6. Exit");
		num = input.nextInt();
		switch(num) {
		case 1:
			System.out.print("Student Id :");
			int studentId = input.nextInt();
			System.out.print("Student name :");
			String studentName = input.next();
			System.out.print("Student address :");
			int studentAddress = input.nextInt();
			System.out.print("Student phonenumber :");
			int studentPhonenumber = input.nextInt();
			
			break;
		case 2:
		case 3:
		case 4:
			System.out.print("Student Id :");
			int studentId2 = input.nextInt();
			
		}

	}
	}
}
