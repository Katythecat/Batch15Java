package class9;

public class ArrayDemo {
    public static void main(String[] args) {
        String name="Leo";
        String name1="Nala";

        String[] names={"Leo","Nala","Lari","Jany","Holy"};
        System.out.println(name1);
        System.out.println(names[1]);
        //System.out.println(names[500]); error bc there is no name on index number 500
        //System.out.println(names[-5]); error index can't be negative

        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    }
}
