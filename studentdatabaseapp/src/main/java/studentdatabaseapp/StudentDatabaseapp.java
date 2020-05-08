package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseapp {

	public static void main(String[] args) {
		
		
		System.out.println("How many students do you want to enroll?");
		Scanner in = new Scanner(System.in);
		int newStudent = in.nextInt();
		
		Student[] students = new Student[newStudent];
		
		for(int i=0; i < newStudent; i++) {
			students[i] = new Student();
			students[i].enrolled();
			students[i].payTuition();
			students[i].showInfo();
			
			System.out.println(students[i].showInfo());
//			System.out.println("Counting students: " + students[i].showInfo());
			System.out.println("Counting students: " + students[0].showInfo());
		}
		
	}

}
 