package class10;

public class ForEachLoopDemo3 {
    public static void main(String[] args) {

        int[] arr={10,13,20,25,45,50};
        // we can't update the elements in for each loop bc we don't have
        //access to the index

        for(int x:arr){
            if(x%2!=0){
              x=0;//java doesn't know which index we want to update
            }
        }

    }
}
