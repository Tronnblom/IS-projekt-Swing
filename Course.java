package isprojekt;
import java.util.ArrayList;

public class Course {
	private String courseCode,name;
	private int credits;
	private ArrayList <WrittenExam> ExamList = new ArrayList<WrittenExam>();
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public ArrayList<WrittenExam> getExamList() {
		return ExamList;
	}
	public void setExamList(ArrayList<WrittenExam> examList) {
		ExamList = examList;
	}
	
	
}
