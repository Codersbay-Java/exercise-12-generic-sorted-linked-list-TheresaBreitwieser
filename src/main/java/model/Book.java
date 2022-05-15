package model;

public class Book implements Comparable<Book>{
    private char bookIndex;
    private String title;

    public Book(char bookIndex, String title) {
        this.bookIndex = bookIndex;
        this.title = title;
    }

    public char getBookIndex() {
        return bookIndex;
    }

    public void setBookIndex(char bookIndex) {
        this.bookIndex = bookIndex;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "BookIndex: " + bookIndex;
    }

    @Override
    public int compareTo(Book b) {
       return Character.compare(this.bookIndex, b.bookIndex);
    }


    public boolean equals(Book b) {
        return this.bookIndex == b.bookIndex;
    }
}
