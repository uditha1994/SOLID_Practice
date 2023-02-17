/* Dependency Inversion Principle 
 * 
 * The Dependency Inversion principle states that our classes should 
 * depend upon interfaces or abstract classes instead of concrete classes 
 * and functions.
 * 
*/

interface DBConnection {
    void connect();
}

class MySQLConnection implements DBConnection {

    @Override
    public void connect() {

    }

}

class PostgreConnection implements DBConnection {

    @Override
    public void connect() {

    }

}

class MyApp {
    private final DBConnection connection;

    public MyApp(DBConnection connection) {
        this.connection = connection;
    }

    public void connect() {
        connection.connect();
    }
}

public class DependencyInversion {
    public static void main(String[] args) {
        new MyApp(new MySQLConnection()).connect();
        new MyApp(new PostgreConnection()).connect();
    }
}
