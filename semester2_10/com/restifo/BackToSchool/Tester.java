package com.restifo.BackToSchool;
import static java.lang.System.out;
public class Tester {

	public static void main(String[] args)
	{
		Person bob = new Person("Coach Bob", 27, "M");
		out.println(bob);

		Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
		out.println(lynne);

		Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
		out.println(mrJava);

		CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
		out.println(ima);
	}
}
