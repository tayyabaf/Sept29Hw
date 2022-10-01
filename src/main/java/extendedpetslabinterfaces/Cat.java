package extendedpetslabinterfaces;

public class Cat extends Pet {
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    public void makeNoise() {
        System.out.println(getName() + " says meow meow");
    }
}