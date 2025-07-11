package core.basesyntax.model;

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

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.initializeVariables();
        helloWorld.sayHello("Hello there!");
        System.out.println(helloWorld.getEvenNumbersFromOneToTen());
    }

    private String getEvenNumbersFromOneToTen() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result += i + " ";
            }
        }
        return result;
    }

    private void sayHello(String greeting) {
        System.out.println("Hello, friend! I'm glad to see you! This class looks strange! "
                + "Your task is to fix the Checkstyle issues in this file. "
                + "Your goal is to run 'mvn clean package' and get the message 'BUILD SUCCESS'");
        System.out.println(greeting);
    }

    private void initializeVariables() {
        message = "Hello, comrades!";
        System.out.println(message);
        year = LocalDate.now().getYear();
        System.out.println("It's the year " + year);
        age = 25;
        System.out.println("I am " + age + " years old");
        size = 42;
        System.out.println("Shoe size is " + size);
    }
}
