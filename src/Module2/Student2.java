package Module2;

public class Student2{
    String name;
    Course enrolledCourse;

    Student2(String name,Course course){
        this.name = name;
        this.enrolledCourse = course;}

    @Override
    public  String  toString(){
        return "Student : " + this.name + " " + enrolledCourse.toString();
    }
}
