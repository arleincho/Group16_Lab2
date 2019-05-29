package lesson2.labs.prob4;

import java.util.*;


public class Student {
	
	String name;
	String id;
	List<TranscriptEntry> grades;
	
	Student(String id, String name) {
		this.id = id;
		this.name = name;
		this.grades = new ArrayList<TranscriptEntry>();
	}
	
	public Transcript getTranscript() {
		return new Transcript(grades, this);	
	}
	
	public void addEntry(TranscriptEntry entry) {
		this.grades.add(entry);
	}
	
	public boolean getHadGrade(String grade) {
		
		for(TranscriptEntry te : this.grades) {
			if(te.grade.equals(grade)) {
				return true;
			}
		}
		return false;
	}
	
	public String getName() {
		return this.name;
	}
	
}
