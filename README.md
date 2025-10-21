# Student Management System

A simple **Java console-based CRUD system** for managing student records. This project helps practice object-oriented programming, collections, loops, and encapsulation in Java.

---

## Features

- Add new student records with ID, name, and marks
- View all existing student records
- Update student information by ID
- Delete student records by ID
- Uses **ArrayList** to manage student objects
- Handles user input and basic validations

---

## How to Run

1. Open terminal or command prompt in the project folder.
2. Compile the Java files:

```bash
javac Student.java StudentManagementSystem.java
Run the main program:
java -cp . StudentManagementSystem
Follow the on-screen menu to manage student records.

Sample Output

===== Student Management System =====
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter your choice: 1
Enter Student ID: 101
Enter Student Name: Poonam
Enter Marks: 95
Student added successfully!

Enter your choice: 2
Student Records:
ID: 101, Name: Poonam, Marks: 95.0

Future Enhancements
Add search functionality by name or ID
Sort students by marks or name
Save/load data to a file
Create a GUI version using Swing or JavaFX

Author
Poonam Taxak
Java Backend Developer
GitHub: https://github.com/poonam04-taxak
