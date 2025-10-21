import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        boolean running = true;

        while(running){
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume new line

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2: viewStudent(); break;
                case 3 : updateStudent(); break;
                case 4: deleteStudent(); break;
                case 5: running = false; System.out.println("Exiting System "); break;
                default: System.out.println("Sorry! Invalid Choice ");
                    break;
            }
        }
    }

    //addStudent Method
    private static void addStudent(){
      System.out.println("Please Enter Student ID: ");
      int id = sc.nextInt();
      sc.nextLine();

      System.out.println("Please Enter Student Name: ");
      String name = sc.nextLine();

      System.out.println("Please Enter Marks: ");
      double marks = sc.nextDouble();

      students.add(new Student(id, name, marks));
      System.out.println("Hey! Student added successfully!");
    }

    //viewStudent()
    private static void viewStudent(){
     if(students.isEmpty()){
        System.out.println("Sorry! No Student Found! ");
        return;
     }
     System.out.println("\nStudent Records: ");
     for(Student s : students){
        System.out.println(s);
     }
    }

    //updateStu
    private static void updateStudent(){
        System.out.println("Please Enter Student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        Student found = null;
        for(Student s : students){
            if(s.getId() == id){
                found = s;
                break;
            }
        }

        if(found != null){
            System.out.println("Please Enter new name: ");
            String name = sc.nextLine();
            System.out.println("Please Enter new marks: ");
            double marks = sc.nextDouble();

            found.setName(name);
            found.setMarks(marks);
            System.out.println("Student updated successfully");
        }
        else{
            System.out.println("Student with ID " + id + "not found!");
        }
    }

    //deleteStu
    private static void deleteStudent(){
        System.out.println("Enter Student ID to delete: ");
        int id = sc.nextInt();

        boolean removed = students.removeIf(s ->s.getId() == id);
        if(removed){
            System.out.println("Student deleted successfully! ");
        }
        else{
            System.out.println("Student with ID " + id + "not Found!");
        }
    }
    
}
