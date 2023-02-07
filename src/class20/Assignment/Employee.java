package class20.Assignment;
public class Employee {
    String name;
    int id;
    String department;
    Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }
    void print() {
        System.out.println("Employee name " + name + " id " + id
               + " department " + department);
    }
}
class FullTime extends Employee {
    String benefits;
    FullTime(String name, int id, String department, String benefits) {
        super(name, id, department);
        this.benefits = benefits;
    }
    void display(){

        System.out.println("Full-Time employee will get benefits "+benefits);
        }
    }

class PartTime extends Employee{
    String incentive;
    PartTime(String name, int id, String department, String incentive){
        super(name, id , department);
        this.incentive=incentive;
    }

    void show(){
        System.out.println();
        System.out.println("Part-Time employee once get a month strength without sick day will get incentive "
                +incentive);
    }
}