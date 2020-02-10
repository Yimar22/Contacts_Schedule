package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;

public class Schedule {

	Hashtable<String,Contact> contacts ;
	Hashtable<String,Course> courses ;



	public Schedule() {
		contacts = new Hashtable<String,Contact>();
		courses = new Hashtable<String,Course>();;
	}
	
	
	public boolean deleteContact(String name) {

		boolean deleted = false;

		if (contacts.containsKey(name)) {
			contacts.remove(name);
			deleted = true;
		}

		return deleted;
	}
	
	public Course moreStudentsAmount() {

		System.out.println(courses.values());
		List<Course> list = new ArrayList<Course>(courses.values());

		Collections.sort(list, new Comparator<Course>() {

			@Override
			public int compare(Course o1, Course o2) {

				if (o1.getStudentsAmount() > o2.getStudentsAmount()) {

					return 1;

				}else if (o1.getStudentsAmount() < o2.getStudentsAmount()) {

					return -1;

				}else {

					return 0;
				}
			}
		});
		return list.get(0);
	}
	
	public Course lessStudentsAmount() {

		List<Course> list = new ArrayList<Course>(courses.values());

		Collections.sort(list, new Comparator<Course>() {

			@Override
			public int compare(Course o1, Course o2) {

				if (o1.getStudentsAmount() > o2.getStudentsAmount()) {

					return 1;

				}else if (o1.getStudentsAmount() < o2.getStudentsAmount()) {

					return -1;

				}else {

					return 0;
				}
			}
		});
		return list.get(list.size()-1);
	}

	public void loadContacts() {
		BufferedReader br;

		try {

			br = new BufferedReader(new FileReader("documents\\data\\Estudiantes.csv"));
			br.readLine();
			String line = br.readLine();
			while (line!=null) {

				String [] fields = line.split(";");
				Contact newContact = null;

				newContact = new Contact(fields[0], fields[1], Integer.parseInt(fields[2]),
						fields[3], fields[4], fields[5], fields[6]);

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
			
			br = new BufferedReader(new FileReader("documents\\data\\ccoursess.csv"));
			br.readLine();
			String line = br.readLine();
			
		//	System.out.println(line);
			while (line!=null) {

				String [] fields = line.split(";");
				Course newCourse = null;
			
				newCourse = new Course(fields[0], Integer.parseInt(fields[1]),
						fields[2], Integer.parseInt(fields[3]), Integer.parseInt(fields[4]));
				courses.put(newCourse.getNRC()+"", newCourse);
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
