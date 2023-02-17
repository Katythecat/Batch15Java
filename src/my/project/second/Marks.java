package my.project.second;

abstract public class Marks {

    abstract double getPercentage();
}
class A extends Marks {
    double subject1, subject2, subject3;
    A(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    @Override
    double getPercentage() {
        return (subject1+subject2+subject3)/3;
    }
}
class B extends Marks {
    double subject1, subject2, subject3, subject4;
    B(double subject1, double subject2, double subject3, double subject4){
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }
    @Override
    double getPercentage() {
        return (subject1+subject2+subject3+subject4)/4;
    }
    public static void main(String[] args) {
        A a=new A(75,80,93);
        System.out.println("An average of mark for student A "+a.getPercentage());

        B b=new B(85,69,80,79);
        System.out.println("An average of mark for student b "+b.getPercentage());

    }
    }