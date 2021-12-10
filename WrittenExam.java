package isprojekt;

import java.util.ArrayList;

public class WrittenExam {

	private String examID, date, time, location;
	private final int maxPoints = 100; // inte private när final?
	private Course course;
	
	public String getExamID() {
		return examID;
	}
	public void setExamID(String examID) {
		this.examID = examID;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public int getMaxPoints() {
		return maxPoints;
	}

	
	
}
