package class24;

public abstract class Phone {
    /*
    create a phone class lets create abstract methods like displayPictures
    unlockPhone, sendText, 2 child classes
    Iphone Samsung Google and provide specific implementation
    lets writhe code to achieve runtime polymorphism
     */

    abstract void displayPicture();
    abstract void unlockPhone();
    abstract void sendText();
}

class IPhone extends Phone{

    @Override
    void displayPicture() {
        System.out.println("Iphone can display picture");

    }

    @Override
    void unlockPhone() {
        System.out.println("Unlock by using face ID");

    }

    @Override
    void sendText() {
        System.out.println("Lets use the imessage to send the text");

    }
}

class Samsung extends Phone{
    @Override
    void displayPicture() {
        System.out.println("Samsung picture is good");
    }

    @Override
    void unlockPhone() {
        System.out.println("Using fingerPrint sensor or camera");

    }

    @Override
    void sendText() {
        System.out.println("Message app to send the message");

    }
}

class Google extends Phone {
    @Override
    void displayPicture() {
        System.out.println("Google show good picture");
    }

    @Override
    void unlockPhone() {
        System.out.println("Google unlock phone");

    }

    @Override
    void sendText() {

    }

    public static void main(String[] args) {
        Phone[] phones = {new IPhone(), new Samsung(), new Google()};
        for (Phone p : phones) {
            p.displayPicture();
            p.unlockPhone();
            p.sendText();
        }
    }
}