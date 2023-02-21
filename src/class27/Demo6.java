package class27;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {
        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);

        System.out.println(booleans.get(0));
        System.out.println(booleans.get(4));
        System.out.println(booleans.size());// to see how element are there


        for(int i=0;i<booleans.size();i++){
            System.out.println(booleans.get(i));
        }

        int i=0;
        while(i<booleans.size()){
            System.out.println(booleans.get(i));
            i++;
        }

    }
}
