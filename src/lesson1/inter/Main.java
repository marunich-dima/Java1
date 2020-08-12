package lesson1.inter;

public class Main {
    public static void main(String[] args) {
//        Jumpable cat1 = new Cat("Barsik");
//        Cat cat2 = new Cat("Mursik");
//        ((Cat) cat1).meow();
//
//        Jumpable[] jumpables = {
//                new Cat("Mursik"),
//                new Cat("Barsik"),
//                new Kenguru()
//        };
//
//        for( Jumpable j: jumpables) {
//            j.jump();
//        }
//
//        Runnable[] runnables = {
//                new Cat("Murzik"),
//                new Dog()
//        };
//
//        for( Runnable r: runnables) {
//           r.run();
//        }
//
//        SuperJumpable cat3 = new Cat("Kisun");
//        cat3.superJump(4);
//        ((Cat) cat3).meow();
//        cat3.superRunJump();

        Jumpable jumpable1 = () -> {
            System.out.println("Jump.....");
        };

        Jumpable cat1 = new Cat("Barsik");
        methodJumpExample(cat1);
        methodJumpExample(jumpable1);

        //как сейчас можно через лямбду, заменяя анонимные классы
        methodJumpExample(() -> {
            System.out.println("jump...!!!");
        });

        //как было раньше
        methodJumpExample(new Jumpable() {
            @Override
            public void jump() {
                System.out.println("jjj");
            }
        });

        methodRunExample((x)-> {
            System.out.println(x*x);
        },7);

    }

    static void methodJumpExample(Jumpable jumpable) {
        jumpable.jump();
    }
    static void methodRunExample(Runnable r, int x) {
        r.run(x);
    }
}
