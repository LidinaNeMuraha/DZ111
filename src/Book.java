import java.util.Objects;

public class Book {
    private String title;

    private Autor author;
    private int year;

    public Book(String title, Autor author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString() {
        return "Title: " + title + "\nAuthor: " + author.toString() + "\nYear: " + year;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }


    public int hashCode() {
        return Objects.hash(title, author, year);
    }
}

