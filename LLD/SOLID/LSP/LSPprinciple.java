package SOLID.LSP;

//Liskov Substitution Principle (LSP)

//Child classes should be replaceable by their parent class without breaking behavior.


//Correct LSP Approach
//Create proper hierarchy based on real behavior.

class Birds{
    public void eat() {
        System.out.println("Bird is eating");
    }
}

class FlyingBird extends Birds {
    public void fly() {
        System.out.println("This bird can fly");
    }
}

class NonFlyingBird extends Birds {
    // No fly() method → no violation
}

class Sparrows extends FlyingBird {
    @Override
    public void fly() {
        System.out.println("Sparrow flying...");
    }
}

class Penguins extends NonFlyingBird {
    public void swim() {
        System.out.println("Penguin swimming...");
    }
}





public class LSPprinciple {
    public static void main(String[] args) {

        FlyingBird sparrow = new Sparrows();
        sparrow.fly();  // Works

        NonFlyingBird penguin = new Penguins();
        // penguin.fly(); q Not allowed — correct!
    }
}

//No behavior is broken.

//Why LSP Matters

//        Prevents runtime crashes

//        Avoids wrong inheritance

//        Makes code predictable

//        Perfect for large-scale systems