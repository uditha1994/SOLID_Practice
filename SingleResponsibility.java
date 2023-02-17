//Single Responsibility
/* A class / module should do onething and therefore it should
 * have only a single reason to change
 * 
 * Only one potential change (database logic, logging logic, etc.) 
 * in the software’s specification should be able to affect the specification 
 * of the class.
 * 
 * This means that if a class is a data container, like a Book class or 
 * a Student class, and it has some fields regarding that entity, it should 
 * change only when we change the data model
 */

class Cake {

    private String color;
    private String design;

}

class CakeWriter {

    public void writingWithEnglish(Cake cake, String text) {

    }

    public void writingWithSinhala(Cake cake, String text) {

    }

}

class CakeShapeMaker {

    public void makeWithCircle(Cake cake) {

    }

    public void makeWithRectangle(Cake cake) {

    }

}

public class SingleResponsibility {
    public static void main(String[] args) {

    }
}