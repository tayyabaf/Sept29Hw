package extendedpetslabinterfaces;

public class Bunny extends Pet {
    public Bunny() {
    }

    public Bunny(String name) {
        super(name);
    }

    public void makeNoise() {
        System.out.println( getName() + " is hissing");
    }
}