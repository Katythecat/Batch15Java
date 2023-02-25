package class29;

import java.util.ArrayList;
import java.util.Iterator;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer>even=new ArrayList<>();
        for (int i = 2; i < 500; i+=2) {
            even.add(i);
                }
        even.removeIf(e -> e%5==0);
            System.out.println(even);
            }
            
        }


