package Module2;

public class Course {
    String courseName;
    String duration;

    Course(String courseName, String duration){
        this.courseName = courseName;
        this.duration = duration;
    }

    @Override
    public  String toString(){
        return "Course: " + this.courseName + "(" + duration+")";
    }
}

