package Module2;

public class Student {
    String name;
    String course;
    int rollNo;
    Room room;

    Student(String name,String  course,int rollNo,Room room){
        this.name = name;
        this.course = course;
        this.rollNo = rollNo;
        this.room = room;
    }

    @Override
    public String toString(){
        return "Student: " + this.name + " (" + this.rollNo + ") " + course + "\n" + room.getDetails();
    }
}
