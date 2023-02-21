package class28.Assignment;

abstract public class Insurance {
    public String insuranceName;

    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }

    public abstract void getQuote();
    public abstract void cancelInsurance();
}
class Car extends Insurance{
    String carModel;
    Car(String insuranceName,String carModel){
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    public void getQuote() {
        System.out.println("Please enter your car model to get quote");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("You can cancel car insurance anytime");
    }
}

class Pet extends Insurance{
    String petType;
    Pet(String insuranceName,String petType){
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    public void getQuote() {
        System.out.println("Please enter your pet type to get quote");
    }
    @Override
    public void cancelInsurance() {
        System.out.println("You can cancel pet insurance anytime");
    }
}

class Health extends Insurance{

    Health(String insuranceName){
        super(insuranceName);
    }

    @Override
    public void getQuote() {
        System.out.println("Please enter you age to get quote");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("You can cancel health insurance anytime");
    }
}
