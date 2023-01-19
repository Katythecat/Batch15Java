package class11.Assignments;

public class Phone {
    /*
    1) Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung
     with specific  attributes and behaviors.
     */
    String name;
    String version;
    String color;
    String system;
    int price;
    String weight;

    void camera(){
        System.out.println("Take picture and recording the video");
    }
    void alarm(){
        System.out.println("Set an alarm");
    }
    void internet(){
        System.out.println("This phone can access internet");
    }
    void fold(){
        System.out.println("Samsung Z has a big screen and can fold");
    }

}
