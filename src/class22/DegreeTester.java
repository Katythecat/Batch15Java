package class22;

public class DegreeTester {
    public static void main(String[] args) {
        Degree degree=new Degree();
        degree.getPrerequisite();

        Bachelors b=new Bachelors();
        b.getPrerequisite();

        Masters master=new Masters();
        master.getPrerequisite();
    }
}
