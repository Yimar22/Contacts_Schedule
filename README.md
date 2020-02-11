# Contacts_Schedule

An agenda for university students, where you can add users, with necessary information about each one, in addition to seeing the subjects that each student has, you can also see a summary where you will find more enrolled subject and average credits enrolled per student
It's important to know that each folder that contains this project is for useful functions of the program, so each content is:
- src: has all the java classes and the fxml archives that allows to run the program, inside of it, you can find:
	- 'model'which has the classes:
		- 'Contact' that describes and has all the parameters that defines an student for the agenda
		- 'Course' this class works to create a new course and introduce all its data
		- 'Schedule' it has all the collections of contacts and courses
	- 'ui' that refires to the user interface and contains all the controller classes and the fxml archives, which are:
		- 'AddContactController'
		- 'ContactController'
		- 'coursesController'
		- 'Main'
		- 'SummaryController'
		- addContact.fxml
		- contact.fxml
		- courses.fxml
		- summary.fxml
- documents: this folder contains all the important documentation of the project, and it allows that the user can learn how the process was, through the engineering method. Also, it contains the data required for the program to work right.
	- 'data' folder has the data bases, where resides the information of the contacts and courses.
	- 'documentation' it contains:
		- Classes diagram
		- Engineering method
		- Functional requirements
	- 'images' folder that has all the photos and avatars of the students
	- 'video' has the demo presented for the program
	
FOR RUNNING PURPOSE: 
You have to know that it's necessary for the program to work, that you enter through the src folder at first, next you have to select 'ui' folder and then, by clicking the class 'Main', as you are inside of it, you can go to the top part
in the IDE Eclipse and select the option "Run Main".

![img](http://imgfz.com/i/cePyHID.png)