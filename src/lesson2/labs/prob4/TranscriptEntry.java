package lesson2.labs.prob4;

class TranscriptEntry {
	
	Student student;
	Section section;
	String grade;
	
	TranscriptEntry(Student stundent, Section section, String grade){
		this.student = stundent;
		this.section = section;
		this.grade = grade;
	}
	
	
	public String toString() {
		return "Student: " + student.name + "\n"
				+ "Course name: " + section.courseName + "\n"
				+ "Section number: " + section.sectionNumber + "\n"
				+ "Grade: " + grade + "\n";
	}
}
