package lesson2.labs.prob4.extpackage;
import java.util.*;

import lesson2.labs.prob4.Section;
import lesson2.labs.prob4.Student;
import lesson2.labs.prob4.StudentSectionFactory;
import lesson2.labs.prob4.Transcript;


/** Shows how the design in this package of classes
 *  allows you to navigate in the way that the class
 *  diagram suggests
 */
public class Main {
	
	List<Student> students = new ArrayList<Student>();
	
	Student bob = this.createStudent("Bob");
	Student tim = this.createStudent("Tim");
	Student allen = this.createStudent("Allen");
	
	Section bio1 = this.createSection("Biology", 1);
	Section bio2 = this.createSection("Mathematics", 2);
	Section math = this.createSection("Science", 3);
	
	private Student createStudent(String name) {
		Student student = new Student(name);
		students.add(student);
		return student;
	}
	
	private Section createSection(String courseName, int sectionNumber) {
		Section section = new Section(courseName, sectionNumber);
		return section;
		
	}
	
	
	public static void main(String[] args) { 
		Main m = new Main();
		m.readDataFromDb();
		
		System.out.println(m.getTranscript(m.bob));
		System.out.println(m.getCourseNames(m.bob));
		System.out.println("Grades for math section: " + m.math.getName() + ": " + m.getGrades(m.math) + "\n ");
		System.out.println("Students who got A's: " + m.getStudentsWith("A"));
		
	}


	private Transcript getTranscript(Student s) {
		return s.getTranscript();
	}
	
	private String getCourseNames(Student s) {
		return s.getTranscript().getCourses();
	}
	
	
	private List<String> getGrades(Section s) {
		return s.getGrades();
	}
	
	
	private List<String> getStudentsWith(String grade) {
		List<String> studentNames = new ArrayList<>();
		for(Student s : students) {
			if (s.getHadGrade(grade) == true) {
				studentNames.add(s.getName());
			}
		}
		return studentNames;
	}
	
	
	private void readDataFromDb() {
		
		StudentSectionFactory.newTranscriptEntry(bob, bio1, "A");
		StudentSectionFactory.newTranscriptEntry(bob, math, "B");
		StudentSectionFactory.newTranscriptEntry(tim, bio1, "B-");
		StudentSectionFactory.newTranscriptEntry(tim, math, "A+");
		StudentSectionFactory.newTranscriptEntry(allen, bio1, "C");
		StudentSectionFactory.newTranscriptEntry(allen, math, "A");
		
	}

}
