package lesson1.maraphon.competitors;

public class Cat extends Animal {

    public Cat(String name, int maxRunDistance, int maxSwimDistance, int maxJumpHeight) {
        super("Cat", name, maxRunDistance, maxSwimDistance, maxJumpHeight);
    }

    public Cat(String name) {
        this(name, 100, 0, 10);
    }
}
