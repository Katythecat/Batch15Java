package class11.Assignments;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iphone=new Phone();
        iphone.name="iPhone";
        iphone.version="iPhone 14 Pro Max";
        iphone.color="Deep Purple";
        iphone.system="Smart Phone";
        iphone.price=1199;
        iphone.weight="172 grams";

        iphone.camera();
        iphone.alarm();
        iphone.internet();

        Phone googlePixel=new Phone();
        googlePixel.name="Pixel";
        googlePixel.version="Pixel Pro 7";
        googlePixel.color="Snow";
        googlePixel.system="Android";
        googlePixel.price=849;
        googlePixel.weight="212 grams";

        googlePixel.camera();
        googlePixel.alarm();
        googlePixel.internet();

        Phone galaxy=new Phone();
        galaxy.name="Samsung";
        galaxy.version="Galaxy Z Fold 4";
        galaxy.color="Burgundy";
        galaxy.system="Android";
        galaxy.price=1049;
        galaxy.weight="263 grams";

        galaxy.camera();
        galaxy.fold();
        galaxy.internet();




    }
}
