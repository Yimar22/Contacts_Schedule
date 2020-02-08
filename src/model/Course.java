package model;

public class Course {

	private String name;
	private int credits; 
	private String teacherName;
	private int NRC;
	
	
	public Course(String name, int credits, String teacherName, int nRC) {
		this.name = name;
		this.credits = credits;
		this.teacherName = teacherName;
		NRC = nRC;
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
	
	
}
