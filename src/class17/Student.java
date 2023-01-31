package class17;

public class Student {
    String stuName;
    int stuAge;
    double stuWeight;
    int stuId;

    Student(String stuName, int stuAge, double stuWeight, int stuId){
        this.stuName=stuName;
        this.stuAge=stuAge;
        this.stuWeight=stuWeight;
        this.stuId=stuId;
    }
    void display(){
        System.out.println("Name "+stuName+" Age "+stuAge+" Weight "+stuWeight
        +" ID "+stuId);
    }
}
