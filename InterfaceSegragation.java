/* Interface Segragation Priciple
 * 
 * Segregation means keeping things separated, and the Interface Segregation 
 * Principle is about separating the interfaces.
 * 
 *  The principle states that many client-specific interfaces are better 
 * than one general-purpose interface. Clients should not be forced to implement 
 * a function they do no need.
 */

// interface CakeDesigner{
//     void decorateCake();
//     void cutPieces(int size);
//     void wrapCake();
// }

//In this Case Cake Designer must override all methods in CakeDesigner

// class Amal implements CakeDesigner{
//     @Override
//     public void decorateCake() {

//     }

//     @Override
//     public void cutPieces(int size) {

//     }

//     @Override
//     public void wrapCake() {

//     }
// }

interface CakeDecorator {
    void decorateCake();
}

interface CakePiecer {
    void cutPieces(int size);
}

interface CakeWraper {
    void wrapCake();
}

class Amal implements CakeDecorator, CakeWraper {
    @Override
    public void wrapCake() {

    }

    @Override
    public void decorateCake() {

    }
}

class Kamal implements CakeDecorator, CakePiecer, CakeWraper {
    @Override
    public void wrapCake() {

    }

    @Override
    public void cutPieces(int size) {

    }

    @Override
    public void decorateCake() {

    }
}

public class InterfaceSegragation {
    public static void main(String[] args) {

    }
}
