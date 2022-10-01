package extendedpetslabinterfaces;

public class Dog extends Pet {
    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    public void makeNoise() {
        System.out.println(getName()+ " says woof woof");
    }
}