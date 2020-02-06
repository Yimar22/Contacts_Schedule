package model;

public class Contact {
	private String name;
	private String lastName;
	private int age;
	private String email;
	private int phoneNumber;
	private String birthDate;
	private String photoPath;
	
	public Contact(String name, String lastName, int age, String email, int phoneNumber, String birthDate, String photoPath) {
		this.setName(name);
		this.setLastName(lastName);
		this.setAge(age);
		this.setEmail(email);
		this.setPhoneNumber(phoneNumber);
		this.setBirthDate(birthDate);
		this.setPhotoPath(photoPath);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	
	
}
