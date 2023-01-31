package class17.Assignments;

public class Task1 {
    /*
    Write a java class that will have a constructor:
     one with parameters and second without
     any parameters. Create a separate Test class
     where you will execute both of the
      constructors 1 by 1.
     */

    String petName;
    int petAge;
    double petWeight;

    Task1(String Name, int Age, double Weight){
        petName=Name;
        petAge=Age;
        petWeight=Weight;

    }

    Task1 (){
        petName="Nala";
        petAge=3;
        petWeight=7;
    }

    void display(){
        System.out.println("Name "+petName+" age "+petAge+" weight "+petWeight);
    }
}


