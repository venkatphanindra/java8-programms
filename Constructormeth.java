import java.util.function.Supplier;
class HelloWorld {
    private String message;

    public HelloWorld(String message) {
        this.message = message;
    }

    public void display() {
        System.out.println(message);
    }
}

public class Constructormeth {
    public static void main(String[] args) {
        // Reference to the constructor of HelloWorld
        Supplier<HelloWorld> helloWorldConstructor = () -> new HelloWorld("Hello, World!");

        // Using the constructor reference to create a new instance of HelloWorld
        HelloWorld helloWorld = helloWorldConstructor.get();

        // Calling the display method to print the message
        helloWorld.display();
    }
}