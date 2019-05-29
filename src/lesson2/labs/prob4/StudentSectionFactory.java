package lesson2.labs.prob4;

public class StudentSectionFactory {
	
	public static Section createSection(int secNum, String courseName) {
		if(courseName == null)
			throw new IllegalArgumentException("courseName cannot be null");
		
		return new Section(courseName, secNum);
	}
	public static Student createStudent(String id, String name) {
		if(name == null || id == null)
			throw new IllegalArgumentException("name cannot be null");
		
		return new Student(id, name);
		
	}
	
	public static void newTranscriptEntry(Student student, Section section, String grade) {
		
		if(student == null) 
			throw new IllegalArgumentException("Stundent name cannot be null");
		
		if(section == null) 
			throw new IllegalArgumentException("Section name cannot be null");
		
		
		if(grade == null) 
			throw new IllegalArgumentException("Grade name cannot be null");
		
		
		TranscriptEntry entry = new TranscriptEntry(student, section, grade);
		student.addEntry(entry);
		section.gradeSheet.add(entry);
		
	}

}
