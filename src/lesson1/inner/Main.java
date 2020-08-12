package lesson1.inner;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer(5);
        Outer.Inner inner = outer.new Inner(8);

        inner.printParam();

        Outer.InnerStaticClass.printP();
    }

    public void someThink() {
        class SomeClass{
            int x;
            int y;

            public SomeClass(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public void printSum() {
                System.out.println(x + y);
            }
        }

        for (int i = 0; i < 5; i++) {
            new SomeClass(i,i*i).printSum();
        }
    }
}
