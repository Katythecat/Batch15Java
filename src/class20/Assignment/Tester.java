package class20.Assignment;

public class Tester extends FullTime {
    String bonus;
    Tester(String name, int id, String department, String benefits, String bonus){
        super(name, id, department, benefits);
        this.bonus=bonus;
    }

    void getBonus(){
        System.out.println("Everybody in this company will get a bonus no matter how long have they been working");
    }
    public static void main(String[] args) {

        Employee emp=new Employee("Nala",555,"HR");
        emp.print();

        FullTime ft=new FullTime("Leo",123,"Engineer","3 weeks off");
        ft.print();
        ft.display();


        PartTime pt=new PartTime("John",234,"Driver","get extra 200 dollars");
        pt.print();
        pt.show();


        Tester test=new Tester("Milad",333,"Accountant","2 weeks off","qualify bonus") ;
        test.print();
        test.display();
        test.getBonus();





    }
}
