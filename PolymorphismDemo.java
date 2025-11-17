class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {


        Calculator calc = new Calculator();
        System.out.println("Add 2 numbers: " + calc.add(10, 20));
        System.out.println("Add 3 numbers: " + calc.add(10, 20, 30));
        System.out.println("Add decimals: " + calc.add(5.5, 2.3));

        Animal animal;

        animal = new Dog(); 
        animal.sound();

        animal = new Cat(); 
        animal.sound(); 
    }
}
22
