package lesson2.labs.prob4;

import java.util.*;

import lesson2.labs.prob4.TranscriptEntry;

public class Section {
	
	String courseName;
	int sectionNumber;
	List<TranscriptEntry> gradeSheet;

	Section(String courseName, int sectionNumber) {
		this.courseName = courseName;
		this.sectionNumber = sectionNumber;
		this.gradeSheet = new ArrayList<TranscriptEntry>();
	}
	
	public List<String> getGrades() {
		ArrayList<String> grades = new ArrayList<String>(); 
		for(TranscriptEntry gradeSheet: this.gradeSheet) {
			grades.add(gradeSheet.grade);
		}
		return grades;
	}

	public String getName() {
		return this.courseName;
	}
}
