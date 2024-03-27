// Interface with a default method
interface Animal {
    // Abstract method
    void sound();

    // Default method
    default void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Class implementing the interface
class Dog implements Animal {
    // Implementing abstract method
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Interfacedefault {
    public static void main(String[] args) {
        Dog dog = new Dog();

        // Calling abstract method
        dog.sound();

        // Calling default method
        dog.sleep();
    }
}
