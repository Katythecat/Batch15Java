package class17.Assignments;

public class PetShop {
    String animalType;
    int price;
    String gender;
    String color;

    private PetShop(String type, int pPrice) {
        animalType = type;
        price = pPrice;

    }

    PetShop(String pColor,String type, int pPrice, String pGender) {
        animalType = type;
        price = pPrice;
        gender = pGender;
        color = pColor;

    }

    protected PetShop(int pPrice, String pGender, String pColor) {
        price = pPrice;
        gender = pGender;
        color = pColor;
    }

    public PetShop(String type, int pPrice,String pColor) {
        animalType = type;
        price = pPrice;
        color = pColor;
    }

    public void display(){
        System.out.println(animalType+" "+price+" "+color+" "+gender);

    }

    public static void main(String[] args) {
        PetShop pt=new PetShop("Dog",250);
        PetShop p1=new PetShop("White","Dog",150,"Male");
        PetShop p2=new PetShop(100,"Female","Orange");
        PetShop p3=new PetShop("Fish",10,"Orange");
        pt.display();
        p1.display();
        p2.display();
        p3.display();
    }


}
