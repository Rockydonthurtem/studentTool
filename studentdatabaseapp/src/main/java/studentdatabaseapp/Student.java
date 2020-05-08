package studentdatabaseapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String lastYear;
	private int gradeYear;
	private String studentId;
	private String courses;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1001;
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student graduation year: ");
		this.gradeYear = in.nextInt();
		
		setStudentId();
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);

		
	}
	
	private String setStudentId() {
//		GradeLevel + Id
		id++;
		this.studentId = gradeYear + "" + id;
		
		return studentId;
	}
	
	public void enrolled() {
		do {
			System.out.println("Enter course to enroll (Q to quit).");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses =  "\n " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				break;
			}
		}while(1!=0);

	}
	
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	public void payTuition() {
		viewBalance();
		Scanner pay = new Scanner(System.in);
		System.out.println("Who much are you paying?\n");
		int cost = pay.nextInt();
		tuitionBalance = tuitionBalance - cost;
		System.out.println("Thank you for your payment of $" + cost);
		viewBalance();
	}
	
	public String showInfo() {
		return "Name " + firstName + " " + lastName +
		"\nGrad level: " + gradeYear +
		"\nStudent ID: " + studentId + 
		"\nCourses Enrolled: " + courses +
		"\nBalance: $" + tuitionBalance;
				
	}
	
//	public void howMany(String stud) {
//		
//		for(int i=0; i < stud.length(); i++) {
//			
//		}
//	}
	
}
