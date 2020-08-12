package lesson1.maraphon.competitors;

public interface Competitor {
    void run(int dist);
    void swim(int dist);
    void jump(int height);
    boolean isDistance();
    void info();
}
