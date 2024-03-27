import java.util.function.Consumer;
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello, my name is " + name);
    }
}
public class Reference {
    public static void main(String[] args) {
        // Create an instance of Person
        Person person = new Person("PHANINDRA");

        // Reference to the instance method greet
        Consumer<Person> greetFunction = Person::greet;

        // Apply the function to greet the person
        greetFunction.accept(person);
    }
}