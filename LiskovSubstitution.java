/* Liskov Substitution Principle
 * 
 * The Liskov Substitution Principle states that subclasses should be 
 * substitutable for their base classes.
 * 
 * This means that, given that class B is a subclass of class A, 
 * we should be able to pass an object of class B to any method that 
 * expects an object of class A and the method should not give any weird 
 * output in that case.
 * 
 * This is the expected behavior, because when we use inheritance 
 * we assume that the child class inherits everything that the superclass has. 
 * The child class extends the behavior but never narrows it down.
 */

class Cake {
    private String color;
    private String design;

    public void bake() {
        System.out.println("Back the cake 350C in 30min");
    }
}

class ChocalateCake extends Cake {
    private String flavour;

    @Override
    public void bake() {
        System.out.println("Back the cake 300C in 40min");
    }
}

class StrawberryCake extends Cake {
    private String flavour;
    private boolean isVanilla;

    @Override
    public void bake() {
        System.out.println("Back the cake 350C in 2 0min");
    }
}

class CakeBaker {
    public void cakeBake(Cake cake) {
        cake.bake();
    }
}

class ChocolateCakeBaker {
    public void cakeBake(ChocalateCake chocake) {
        chocake.bake();
    }
}3

public class LiskovSubstitution {
    public static void main(String[] args) {

    }
}
