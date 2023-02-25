package class26;

interface HasExoskeleton {
    abstract int getNumberOfSections();

}

abstract class Insect implements HasExoskeleton {

    abstract int getNumberOfLegs();

}

public class Beetle extends Insect {

    // dont forget when ever we are implemented from interface
    //we have to implement the method from interface too
    //in this case even we are extend from abstract class
    //but this class has implemented from interface
    @Override
    public int getNumberOfSections() {
        return 0;
    }

    int getNumberOfLegs() { return 6; }


}
