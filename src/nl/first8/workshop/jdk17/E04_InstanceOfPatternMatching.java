package nl.first8.workshop.jdk17;

public class E04_InstanceOfPatternMatching {

    private class Dog {
        void woof() {
            System.out.println("woof!");
        }
    }

    private class Cat {
        void meow() {
            System.out.println("meeeow!!");
        }
    }

    // TODO: can you make this easier with Java 14's enhanced instanceof?
    private void makeSound(Object animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.meow();
        } else if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.woof();
        }
    }

    private void makeSounds() {
        makeSound(new Dog());
        makeSound(new Cat());
    }

    public static void main(String[] args) {
        new E04_InstanceOfPatternMatching().makeSounds();
    }
}
