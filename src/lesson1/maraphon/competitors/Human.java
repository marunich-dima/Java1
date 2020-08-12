package lesson1.maraphon.competitors;

public class Human implements Competitor {

    String name;

    int maxRunDistance;
    int maxSwimDistance;
    int maxJumpHeight;

    boolean active;

    public Human( String name, int maxRunDistance, int maxSwimDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.active = true;
    }

    public Human(String name) {
        this(name, 2000, 100, 5);
    }

    @Override
    public void run(int dist) {
        if(dist <= maxRunDistance) {
            System.out.println(name + " справился с бегом");
        }   else {
            System.out.println(name + " провалил бег");
            active = false;
        }
    }

    @Override
    public void swim(int dist) {
        if(dist <= maxSwimDistance) {
            System.out.println(name + " справился с плаванием");
            System.out.println(name + " недоплыл");
        }   else {
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if(height <= maxJumpHeight) {
            System.out.println(name + " справился с прыжком");
        }   else {
            System.out.println( name + " недопрыгнул");
            active = false;
        }
    }

    @Override
    public boolean isDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(name + " " + active);
    }

}
