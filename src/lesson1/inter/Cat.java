package lesson1.inter;

public class Cat implements SuperJumpable, Runnable {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println("Cat " + name + " jump!");
    }

    @Override
    public void run(int x) { System.out.println("Cat " + name + " run!"); }

    public void meow() {
        System.out.println(name + " meow!!");
    }

    @Override
    public void superJump(int h) {
        System.out.println("Cat " + name + " super jump" + h + " meter");
    }

    @Override
    public void superRunJump() {
        System.out.println("Cat " + name + " super run jump");
    }
}
