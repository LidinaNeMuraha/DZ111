public class Main {
    public static void main(String[] args) {

            Autor author = new Autor("Федор", "Достаевский");
            Book book = new Book("Преступление и наказание", author, 1865);

        Autor author2 = new Autor("Лев", "Толстой");
        Book book2 = new Book("Война и мир", author2, 1873);

        System.out.println(author.toString());
        System.out.println(book.toString());
        System.out.println(author2.toString());
        System.out.println(book2.toString());





    }
}