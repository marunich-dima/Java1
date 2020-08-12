package lesson1.maraphon;

import lesson1.maraphon.competitors.*;
import lesson1.maraphon.obstacles.*;


public class Start {
    public static void main(String[] args) {

        Competitor[] competitors = { new Human("Bob"),
        new Cat("Murzik"),
        new Dog("Tuzik"),
        new Cat("Barsik")};

        Obstacle[] obstacles = {new Cross(100),
        new Water(10),
        new Wall(2)};

        for (Competitor c: competitors) {
            for (Obstacle o: obstacles) {
                o.doIt(c);
                if (!c.isDistance()) {
                    break;
                }
            }
        }

        for (Competitor c: competitors) {
            c.info();
        }

        System.out.println(" i do super project ");

    }
}
