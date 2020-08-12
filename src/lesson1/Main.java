package lesson1;

public class Main {

    public static void main(String[] args) {

        Transport[] transports = {
                new Motocycle(),
                new Tractor(),
                new Motocycle()
        };

        for (Transport t: transports) {
            t.go();
            if(t instanceof Motocycle) {
                ((Motocycle) t).jump();
            }
        }


        Motocycle motocycle = new Motocycle();
//        Motocycle motocycle1 = new Motocycle("zxc");
//        Motocycle.model = "qweasd";
//        motocycle.info();
//        motocycle1.info();

        Transport tr = (Transport) motocycle;

        Transport t = new Tractor();
        System.out.println(t instanceof Motocycle);



        //cast
        int x = 123;
        byte b = (byte) x;



    }
}
