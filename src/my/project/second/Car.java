package my.project.second;

public class Car {
    double carPrice;
    String color;

   Car(double carPrice, String color){
        this.carPrice=carPrice;
        this.color=color;
    }
    public double calculateSalePrice(){
        return carPrice;
    }
}

class Sedan extends Car{
    double length;
    Sedan(double carPrice,String color, double length){
        super(carPrice, color);
        this.length=length;
    }
    public double calculateSalePrice(){
        if(length>20){
            return carPrice*0.95;
        }else{
            return carPrice*0.9;
        }
    }
}

class Truck extends Car {
    double weight;
    Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight=weight;
    }
    public double calculateSalePrice() {
        if(weight>2000){
            return carPrice*0.9;
        }else{
            return carPrice*0.8;
        }

    }

    public static void main(String[] args) {
        Sedan sedan=new Sedan(25000,"Black",19);
        System.out.println("Sedan price "+sedan.calculateSalePrice());

        Truck truck=new Truck(45000,"White",1900);
        System.out.println("Truck price "+truck.calculateSalePrice());
    }
}