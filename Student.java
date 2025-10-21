public class Student{
    private int id;
    private String name;
    private double marks;

    //constructor
    public Student(int id, String name, double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    //getter -  setter
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getIdMarks(){
        return marks;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setMarks(double marks){
        this.marks = marks;
    }

    @Override
    public String toString(){
        return "ID: " + id + " , Name: " + name + ", Marks: " +marks ;
    }
}
