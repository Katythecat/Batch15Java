package class16;

public class Task7 {
    /*
    Create a method that will accept an array as parameters and will return a sum of all
     elements from that array. Method should be visibly only within same package
      and accessible by the creating an instance of the class

      return type = int
      name=sumArrayElements
      parameters=int[] arr
      access modifier = default
     */

    int sumArrayElements(int[] array){
        int sum=0;
        for(int num:array){
           sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr={10,20,30};
        Task7 ts=new Task7();
        System.out.println(ts.sumArrayElements(arr));


    }
}
