package class29;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        /*Dog d1=new Dog("Nala","Caligo",3);
        ArrayList<Dog>dogs=new ArrayList<>();
        dogs.add(d1);*/

        ArrayList<Dog>dogs=new ArrayList<>();
        dogs.add(new Dog("Nala","dog",1));
        dogs.add(new Dog("Nal","dog",10));
        dogs.add(new Dog("ala","dog",2));
        dogs.add(new Dog("la","dog",12));

        for(Dog d:dogs){
            d.printDogName();
        }
    }
}
