package class16.Assignments;

public class Task1 {
    /*
    ) Create a method that will accept an array as parameters and
     will return a sum of all elements from that array. Method should be visibly
      only within same package and accessible by the creating an instance of the class.
     */
    int sumArray(int[] array){
        int sum=0;
        for(int arr:array){
            sum+=arr;

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] num={23,17,5,13,7};
        Task1 ts=new Task1();
        System.out.println(ts.sumArray(num));

        Task2 ts1=new Task2();

    }
}
