package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

public class Schedule {

	Hashtable<String,Contact> contacts ;
	Hashtable<String,Course> courses ;



	public Schedule() {
		contacts = new Hashtable<String,Contact>();
		courses = new Hashtable<String,Course>();;
	}

	public void loadContacts() {
		BufferedReader br;

		try {

			br = new BufferedReader(new FileReader("documents\\data\\MOCK_DATA.csv"));
			br.readLine();
			String line = br.readLine();
			while (line!=null) {

				String [] fields = line.split(";");
				Contact newContact = null;

				newContact = new Contact(fields[0], fields[1], Integer.parseInt(fields[2]),
						fields[3], fields[4], fields[5], null);

				contacts.put(newContact.getName(), newContact);
				line = br.readLine();
			}

		} catch (FileNotFoundException e) {

			System.out.println("FileNotFoundException");

		}catch (IOException e) {

			System.out.println("IOException");

		}
	}
	

	public void loadCourses() {
		BufferedReader br;

		try {
			
			br = new BufferedReader(new FileReader("documents\\data\\courses.csv"));
			br.readLine();
			String line = br.readLine();
			
			System.out.println(line);
			while (line!=null) {

				String [] fields = line.split(";");
				Course newCourse = null;
			
				newCourse = new Course(fields[0], Integer.parseInt(fields[1]),
						fields[2], Integer.parseInt(fields[3]));

				courses.put(newCourse.getName(), newCourse);
				line = br.readLine();
			}

		} catch (FileNotFoundException e) {

			System.out.println("FileNotFoundException");

		}catch (IOException e) {

			System.out.println("IOException");

		}
	}
	
	public Hashtable<String, Contact> getContacts() {
		return contacts;
	}

	public void setContacts(Hashtable<String, Contact> contacts) {
		this.contacts = contacts;
	}

	public Hashtable<String, Course> getCourses() {
		return courses;
	}

	public void setCourses(Hashtable<String, Course> courses) {
		this.courses = courses;
	}

	

	
}
