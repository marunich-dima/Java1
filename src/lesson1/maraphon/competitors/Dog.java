package lesson1.maraphon.competitors;

public class Dog extends Animal {

    public Dog(String name, int maxRunDistance, int maxSwimDistance, int maxJumpHeight) {
        super("Dog", name, maxRunDistance, maxSwimDistance, maxJumpHeight);
    }

    public Dog(String name) {
        this(name, 700, 20, 4);
    }
}
