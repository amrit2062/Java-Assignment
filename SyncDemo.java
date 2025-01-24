// Base class
class Animal {
    public void speak() {
        System.out.println("Animal is making a sound");
    }
}

// Derived class: Dog
class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog barks");
    }
}

// Derived class: Cat
class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Cat meows");
    }
}

// Generic class demonstrating polymorphism
class AnimalShelter<T extends Animal> {
    private T animal;

    public AnimalShelter(T animal) {
        this.animal = animal;
    }

    public void makeAnimalSpeak() {
        animal.speak();
    }
}

public class PolymorphismThroughGenerics {
    public static void main(String[] args) {
        // Creating instances of specific animals
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Using the generic class for different types of animals
        AnimalShelter<Dog> dogShelter = new AnimalShelter<>(dog);
        AnimalShelter<Cat> catShelter = new AnimalShelter<>(cat);

        // Polymorphism in action
        dogShelter.makeAnimalSpeak(); // Output: Dog barks
        catShelter.makeAnimalSpeak(); // Output: Cat meows
    }
}
