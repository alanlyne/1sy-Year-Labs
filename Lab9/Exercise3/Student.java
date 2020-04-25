
public class Student {
    private String name;
    private String course;
    private int studentID;
    public static int counter = 1001;

    public Student(){
        this.name = "";
        this.course = "";
        this.studentID = counter++;
    }

    public Student(String name, String course){
        this.name = name;
        this.course = course;
        this.studentID = counter++;
    }

    public String getName(){
        return this.name;
    }

    public String getCourse(){
        return this.course;
    }

    public int getstudentID(){
        return this.studentID;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public void showStudent(){
        System.out.println("*****Student DETAILS*****");
        System.out.println("NAME: " + getName());
        System.out.println("Course: " + getCourse());
        System.out.println("Student ID: " + getstudentID());
    }

}