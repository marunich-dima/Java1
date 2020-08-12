package lesson1.inner;

public class Outer {

    private int x;
    private static int z = 7;

    public Outer(int x) {
        this.x = x;
    }

    class Inner {
        int y;

        public Inner(int y) {
            this.y = y;
        }

        public void printParam(){
            System.out.println(x);
            System.out.println(y);
        }
    }

    static class  InnerStaticClass {
        public static void printP() {
            System.out.println(z);
        }
    }


}
