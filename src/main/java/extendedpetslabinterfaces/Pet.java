package extendedpetslabinterfaces;

import java.util.Scanner;

public class Pet implements Comparable<Pet>{
    //properties
    private String name;


    //scanner thing
    Scanner input = new Scanner(System.in);

//contructors

    public Pet() {
        setName();
    }

    public Pet(String name){
        this.name = name;
    }

// setters & getters

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.println("Enter name");
        name = input.nextLine();
    }

    public void setName(String name){
        this.name = name;
    }


    //methods

    public void makeNoise(){
        System.out.println(name + " is making noise");
    }


    @Override
    public int compareTo(Pet o) {
        return this.name.compareTo(o.name);
    }
}