import java.util.Optional;

public class Optionalclass {
    public static void main(String[] args) {
        String name = "John";
        Optional<String> optionalName = Optional.ofNullable(name);
        
        // Check if value is present
        if (optionalName.isPresent()) {
            System.out.println("Name is present: " + optionalName.get());
        } else {
            System.out.println("Name is absent");
        }
        
        // Modify value if present
        optionalName.ifPresent(n -> System.out.println("Modified Name: " + n.toUpperCase()));
        
        // Get value or default if absent
        String defaultName = optionalName.orElse("Default");
        System.out.println("Value or default: " + defaultName);
    }
}
