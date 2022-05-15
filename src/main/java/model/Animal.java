package model;


public class Animal implements Comparable<Animal> {
   private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal: " +name;
    }



    @Override
    public int compareTo(Animal a) {
            return this.name.compareTo(a.name);

    }

}
