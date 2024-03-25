public class Book {
    private static String title;
    private static int year;

    public Book createBook(String title, int year){
        Book book = new Book();

        Book.title = title;
        Book.year = year;

        return book;
    }

    public Book() {
        this.title = title;
        this.year = year;

    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
