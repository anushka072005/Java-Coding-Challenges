public class Hierarchical {
    public static void main(String[] args) {
        Dog pet = new Dog();
        pet.breathe();
        pet.eat();
        pet.sleep();

        pet.color = "yellow";
        System.out.println(pet.color);
        // pet.walk();   // error

        Mammal mammal = new Mammal();
        // mammal.sleep(); error
        mammal.eat();
        mammal.walk();

        // pet.walk();

    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("Eats....");
    }
    void breathe() {
        System.out.println("Breathe....");
    }
}

// Child class inherits Animal class Properties
class Mammal extends Animal {
    void walk() {
        System.out.println("Walks...");
    }
}

// Child class inherits Animal class Properties
class Dog extends Animal {
    void sleep() {
        System.out.println("Sleeping...");
    }
}
