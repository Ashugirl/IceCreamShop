package be.intecbrussel.eatables;

public class Cone implements Eatable {
    private Flavor[] balls;


    public Cone() {

    }

    public Cone(Flavor[] balls) {
        this.balls = balls;


    }


    public Flavor[] getBalls() {

        return balls;
    }

    public void setBalls(Flavor[] balls) {
        this.balls = balls;
    }



    public void eat() {
        System.out.println("Eating a cone with ");
        for (Flavor f : balls) {
            System.out.println(f);

            }
        System.out.println();
        }

        public enum Flavor {
            STRAWBERRY,
            BANANA,
            CHOCOLATE,
            VANILLA,
            LEMON,
            STRACIATELLA,
            MOKKA,
            PISTACHE;
        }
}



