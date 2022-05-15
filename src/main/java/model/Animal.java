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


    public boolean equals(Animal a) {
        for(int i=0; i<a.name.length(); i++){
           if(this.name.charAt(i) != a.name.charAt(i)) {
               return false;
           }
        }
        return true;
    }

}
