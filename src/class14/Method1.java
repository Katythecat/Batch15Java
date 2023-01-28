package class14;

public class Method1 {
    public static void main(String[] args) {
        int[] arr={3,56,11,67,687,1};
        int sum=0;
        for( int x:arr){
            sum+=x;
        }
        System.out.println(sum);
        int[] arr2={23,54,1,67,78,2};
        int sum2=0;
        for(int y:arr2){
            sum2+=y;
        }
        System.out.println(sum2);
    }
}
