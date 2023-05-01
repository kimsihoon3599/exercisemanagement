package student;

import java.util.Scanner;

public class HighSchoolStudent extends Student {
	
	public void getUserInput(Scanner input){
		System.out.print("Student ID :");
		int id = input.nextInt();
		this.setId(id);
	
		System.out.print("Student name :");
		String name = input.next();
		this.setName(name);
		
		char answer ='x';
		while(answer != 'y' && answer!= 'Y'&& answer!= 'n'&& answer!= 'N')
		{
		System.out.print("Do you have Email address?(Y/N)");
		answer = input.next().charAt(0);
		if(answer == 'y' || answer =='y') {
			System.out.print("Email address");
			String email = input.next();
			this.setEmail(email);
			break;
		}
		else if (answer == 'n' || answer =='Y') {
			this.setEmail("");
			break;
		}
		else {
			
		}
		}
		System.out.print("Phone number :");
		String phone = input.next();
		this.setPhone(phone);
		
		System.out.print("Exercise :");
		String exercise = input.next();
		this.setExercise(exercise);
	}

}