package Module3;

public class Student {
    String name;
    int age;

    public void registerStudent(String name, int age) throws InvalidAgeException{
        if (age <17){
            throw new InvalidAgeException();
        }
        else{
            this.name = name;
            this.age = age;
            System.out.println("Registration Successful");
        }
    }

}
