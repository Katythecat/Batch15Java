package class16;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {
        SyntaxEmployee st=new SyntaxEmployee();
        st.empID="001";
        st.empSal=75000;



        SyntaxEmployee st1=new SyntaxEmployee();
        st1.empID="002";
        st1.empSal=100000;

        System.out.println("Employee ID "+st.empID);
        System.out.println("Employee salary "+st.empSal);
        System.out.println(st.ceoName);


        System.out.println("Employee ID "+st1.empID);
        System.out.println("Employee salary "+st1.empSal);
        System.out.println(st.ceoName);

    }
}
