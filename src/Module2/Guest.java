package Module2;

public class Guest {
    String name;
    int age;
    String idProof;

    Guest(String name,int age,String idProof){
        this.name = name;
        this.age = age;
        this.idProof = idProof;
    }

    String getDetails(){
        return this.name + "," + this.age + "," + this.idProof;
    }
}
