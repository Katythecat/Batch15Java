package class14;

public class ArrayAddMachine {
    public static void main(String[] args) {
        int[] array={10,20,30,40,};
        addArrayElementsMachine(array);
        int[] array2={2,56,4,65,1};
        addArrayElementsMachine(array2);
        int[] array3={12,4,3,12,55};
        addArrayElementsMachine(array3);
    }


    static void addArrayElementsMachine(int [] arr){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        System.out.println(sum);
    }
}
