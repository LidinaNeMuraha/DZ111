public class Main {
    public static void main(String[] args) {
        Autor autor1 = Autor.createAutor("Федор", "Достаевский");
        System.out.println("Имя автора " + autor1.getFirstName());
        System.out.println("Фамилия автора " + autor1.getLastName());

        Book book1 = Book.createBook("Преступление и наказание", 1865);
        System.out.println("Название книги " + book1.getTitle());
        System.out.println("Год выпуска книги " + book1.getYear());

        Autor autor2 = Autor.createAutor("Лев", "Толстой");
        System.out.println("Имя автора " + autor2.getFirstName());
        System.out.println("Фамилия автора " + autor2.getLastName());

        Book book2 = Book.createBook("Война и мир", 1864);
        System.out.println("Название книги " + book2.getTitle());
        System.out.println("Год выпуска книги " + book2.getYear());

        book2.setYear(1863);
        System.out.println(book2.getYear());



    }
}