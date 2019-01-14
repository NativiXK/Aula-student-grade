package application;

import java.util.Locale;
import java.util.Scanner;

import classroom.Student;

public class Program {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		System.out.print("Insert the student name: ");
		student.name = sc.nextLine();
		System.out.print("Insert the #1 grade: ");
		student.nota1 = sc.nextDouble();
		System.out.print("Insert the #2 grade: ");
		student.nota2 = sc.nextDouble();
		System.out.print("Insert the #3 grade: ");
		student.nota3 = sc.nextDouble();
		System.out.println();
		
		System.out.println( student.name.toUpperCase() + " THIS IS YOUR RESULT.");
		System.out.println("FINAL GRADE = " + student.FinalGrade());
		System.out.println("SITUATION = " + student.State());
		
		sc.close();
	}

}
