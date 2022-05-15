package application;

import list.SortedLinkedList;
import model.Animal;
import model.Book;
import model.Person;

public class Main {
    public static void main(String[] args) {
        SortedLinkedList<Animal> listAnimal = new SortedLinkedList<>();
        SortedLinkedList<Person> listPerson = new SortedLinkedList<>();
        SortedLinkedList<Book> listBook = new SortedLinkedList<>();


        listPerson.insert(new Person(45));
        listPerson.insert(new Person(7));
        listPerson.insert(new Person(15));
        listPerson.insert(new Person(7));
        listPerson.insert(new Person(16));
        listPerson.insert(new Person(67));
        System.out.println(listPerson);
        System.out.println(listPerson.size());
        listPerson.delete(0);
        System.out.println(listPerson);
        System.out.println(listPerson.size());
        System.out.println(listPerson.get(1));
        System.out.println(listPerson.get(0));

        listAnimal.insert(new Animal("Dog"));
        listAnimal.insert(new Animal("Snake"));
        listAnimal.insert(new Animal("Cat"));
        listAnimal.insert(new Animal("Horse"));
        System.out.println(listAnimal);
        System.out.println(listAnimal.size());
        listAnimal.delete(1);
        System.out.println(listAnimal);
        System.out.println(listAnimal.size());
        System.out.println(listAnimal.get(0));


        listBook.insert(new Book('h', "HarryPotter"));
        listBook.insert(new Book('a', "Alpen"));
        listBook.insert(new Book('i', "It"));
        listBook.insert(new Book('z', "Zebras"));
        System.out.println(listBook);
        System.out.println(listBook.size());
        //listBook.delete(4);
        listBook.delete(3);
        System.out.println(listBook);
        System.out.println(listBook.size());
        System.out.println(listBook.get(1));
        System.out.println(listBook.get(0));





    }
}

