package lesson1.inter;

public class Dog implements Runnable{

    @Override
    public void run(int x) {
        System.out.println("Dog run!");
    }
}
