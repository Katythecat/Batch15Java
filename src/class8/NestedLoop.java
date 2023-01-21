package class8;

public class NestedLoop {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){ //outer for loop
            for(int j=0;j<5;j++){// inner for loop
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
//if we print i it will be executed   0 0 0 0 0
                                //    1 1 1 1 1
                                 //   2 2 2 2 2

//if we print j                       0 1 2 3 4
                                 //   0 1 2 3 4
                                //    0 1 2 3 4