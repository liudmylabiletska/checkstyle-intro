package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

public class HelloWorld {
    private String message;
    private int year;
    private int age;
    private int size;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println(cat.toString());

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.initializeVariables();
        helloWorld.sayHello("Hello there!");
        System.out.println(helloWorld.getEvenNumbersFromOneToTen());
    }

    private void initializeVariables() {
        message = "Hello, friends!";
        System.out.println(message);
        year = LocalDate.now().getYear();
        System.out.println("It's the year " + year);
        age = 25;
        System.out.println("I am " + age + " years old");
        size = 42;
        System.out.println("Shoe size is " + size);
    }

    private void sayHello(String greeting) {
        System.out.println("Hello, Mate! I am happy to see you! "
                + "This class looks weird! Your task is to fix the checkstyle in this file. "
                + "Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message.");
        System.out.println(greeting);
    }

    private String getEvenNumbersFromOneToTen() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result.append(i).append(" ");
            }
        }
        return result.toString();
    }
}
