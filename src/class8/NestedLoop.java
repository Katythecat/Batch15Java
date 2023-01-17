package class8;

public class NestedLoop {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){ //outer for loop
            for(int j=0;j<5;j++){// inner for loop
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
