package be.intecbrussel.eatables;

public class Magnum implements Eatable{

    private MagnumType type;

    public Magnum(){

    }
    public Magnum(MagnumType type) {
        this.type = type;
    }

    @Override
    public void eat() {
        System.out.println("Eating a " + type + " Magnum.");
    }

    public MagnumType getType() {
        return type;
    }

    public enum MagnumType {
        MILKCHOCOLATE,
        WHITECHOCOLATE,
        BLACKCHOCOLATE,
        ALPINENUTS,
        ROMANTICSTRAWBERRIES
    }

}
