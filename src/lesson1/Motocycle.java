package lesson1;

public class Motocycle extends Transport {
    static String model;

    public Motocycle() {

    }


    public Motocycle(int power) {
        super(power);
    }

    @Override
    void go() {
        System.out.println("Мотоцикл едет");
    }

    public void info() {
        System.out.println(model);
    }

    public void jump(){
        System.out.println("Мотоцкл прыгает");
    }

}
