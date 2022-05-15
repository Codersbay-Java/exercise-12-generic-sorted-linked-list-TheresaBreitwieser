package model;

public class Person implements Comparable<Person>{
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Age: " + age;
    }

    @Override
    public int compareTo(Person p) {
        return Integer.compare(this.age, p.age);
    }
}
