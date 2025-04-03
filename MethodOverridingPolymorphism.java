public class MethodOverridingPolymorphism {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.eat();

        // Animal animal = new Animal();
        // animal.eat();
    }    
}

class Animal {
    void eat() {
        System.out.println("Omnivorous...");
    }
}

class Parrot extends Animal{
    void eat() {
        System.out.println("Vagetarian..");
    }
}
// function overriding = base class and child class have SAME FUNCTION NAME and SAME PARAMETERS (works at runtime)