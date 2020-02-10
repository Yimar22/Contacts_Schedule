package model;

public class Course {

	private String name;
	private int credits; 
	private String teacherName;
	private int NRC;
	private int studentsAmount;
	
	
	public Course(String name, int credits, String teacherName, int nRC, int studentsAmount) {
		this.name = name;
		this.credits = credits;
		this.teacherName = teacherName;
		NRC = nRC;
		this.studentsAmount = 0;
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
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getNRC() {
		return NRC;
	}
	public void setNRC(int nRC) {
		NRC = nRC;
	}
	public int getStudentsAmount() {
		return studentsAmount;
	}
	public void setStudentsAmount(int studentsAmount) {
		this.studentsAmount = studentsAmount;
	}

	
	
}
