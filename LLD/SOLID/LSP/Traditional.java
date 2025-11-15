package SOLID.LSP;

//Traditional (Wrong) LSP Violation
//Parent class assumes all birds can fly.
//
//But Penguin cannot fly → breaks behavior.

class Bird {
    public void fly() {
        System.out.println("Bird is flying...");
    }
}

class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow flying...");
    }
}

// Penguin cannot fly

class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly!");
    }
}

//This violates LSP.

public class Traditional {

    public static void main(String[] args){

        Bird b = new Penguin();
        Bird c = new Sparrow();
        c.fly();// then right no problem but such subclass who is not flying then how user should know. which breaks liskov substitution principle.
        b.fly();  // Boom — Exception!
    }

}
