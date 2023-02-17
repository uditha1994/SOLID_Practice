/*Open-Closed Principle
 * 
 * Class should be open for extention but
 * closed for modifications.
 * 
 * This means that a class should be extendable without modifying the class itself.
 */

class Cake {
    private String color;
    private String design;
}

class ChocalateCake extends Cake {
    private String flavour;
}

class StrawberryCake extends Cake {
    private String flavour;
    private boolean isVanilla;
}

public class OpenClosed {
    public static void main(String[] args) {

    }
}

/*
 * We should be able to add new functionality without touching the
 * existing code for the class. This is because whenever we modify
 * the existing code, we are taking the risk of creating potential bugs.
 * So we should avoid touching the tested and reliable production code
 * if possible.
 */