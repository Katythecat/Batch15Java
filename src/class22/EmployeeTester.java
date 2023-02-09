package class22;

public class EmployeeTester {
    public static void main(String[] args) {
        Manager mnr=new Manager();
        mnr.printSalary();
        OfficeBoy ob=new OfficeBoy();
        ob.printSalary();
        Developer dp=new Developer();
        dp.printSalary();
        QA qa=new QA();
        qa.printSalary();
    }
}
