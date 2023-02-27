package class28.Assignment;

import java.util.ArrayList;
import java.util.Iterator;
public class InsuranceTester {
    public static void main(String[] args) {

        ArrayList<Insurance> insurance=new ArrayList<>();
        insurance.add(new Car("Progressive","Toyota"));
        insurance.add(new Pet("Progressive","Cat"));
        insurance.add(new Health("Progressive"));

        for(int i=0;i<insurance.size();i++){
           Insurance ins=insurance.get(i);
           ins.getQuote();
           ins.cancelInsurance();
        }

        for(Insurance ins:insurance){
            ins.getQuote();
            ins.cancelInsurance();
        }

        Iterator<Insurance> iterator= insurance.iterator();
        while(iterator.hasNext()){
            Insurance ins=iterator.next();
            ins.getQuote();
            ins.cancelInsurance();
        }
    }
}

