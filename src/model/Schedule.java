package model;

import java.util.ArrayList;

public class Schedule {

	private ArrayList<Contact> contacts;
	private ArrayList<Course> courses;
	
	public ArrayList<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(ArrayList<Contact> contacts) {
		this.contacts = contacts;
	}
	public ArrayList<Course> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
}
