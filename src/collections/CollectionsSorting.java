package collections;
/**
 * Reference: https://www.geeksforgeeks.org/comparator-interface-java/
 * https://www.baeldung.com/java-8-comparator-comparing 
 * @author modid
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	int rollno;
	String name;
	int age;
	
	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getRollNo() {
		return rollno;
	}
	
	@Override
	public String toString() {
		return "Student ID: "+rollno+" Student name: "+name+ " Student age: "+age;
	}
}


class SortByRoll implements Comparator<Student> {
	public int compare(Student a, Student b) {
		return a.rollno - b.rollno;
	}
}

class SortByName implements Comparator<Student> {
	public int compare(Student a, Student b) {
		return a.name.compareTo(b.name);
	}
}

class CustomSortingComparator implements Comparator<Student> {
	public int compare(Student a, Student b) {
		// First compare by student age and then by id
		int res = a.age - b.age;
		if(res!=0) {
			return res;
		} else {
			return a.rollno-b.rollno;
		}
	}
}

public class CollectionsSorting {
	
	public static void displayStudents(ArrayList<Student> students) {
		for(Student student: students) {
			System.out.println(student);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "aaa", 25));
		students.add(new Student(3, "bbb", 21));
		students.add(new Student(7, "fff", 23));
		students.add(new Student(4, "ccc", 21));
		students.add(new Student(2, "ddd", 22));
		
		System.out.println("\n Sorting students by Roll no");
		Collections.sort(students, new SortByRoll());
		displayStudents(students);

		System.out.println("\n Sorting students by Name");
		Collections.sort(students, new SortByName());
		displayStudents(students);
		
		System.out.println("\n Sorting students by age and ID");
		Collections.sort(students, new CustomSortingComparator());
		displayStudents(students);
		
		// Instead of implementing compare method for comparing by age and ID, we can use thenComparing method of the Comparator class
		System.out.println("\n Sorting students by age and ID using thenComparing");
		Collections.sort(students, Comparator.comparing(Student::getAge).thenComparing(Student::getRollNo));
		displayStudents(students);
		
//		Comparator.comparing static function accepts a sort key Function and returns a Comparator for the type which contains the sort key:
		System.out.println("\n Sorting by name using Comparator.comparing");
		Collections.sort(students, Comparator.comparing(Student::getName));
		System.out.println("students: ");
		displayStudents(students);
		
		System.out.println("\n Sorting by name in the descending order");
		Collections.sort(students, Comparator.comparing(Student::getName, (s1, s2) -> {
			return s2.compareTo(s1);
		}
		));
		displayStudents(students);
	}

}
