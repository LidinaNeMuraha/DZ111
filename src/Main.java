public class Main {
    public void main(String[] args) {
        Autor autor1 = new Autor("Федор", "Достаевский");
        System.out.println("Имя автора " + autor1.getFirstName());
        System.out.println("Фамилия автора " + autor1.getLastName());

        Book book1 = new  Book ("Преступление и наказание", autor1,1865);
        System.out.println("Название книги " + book1.getTitle());
        System.out.println("Год выпуска книги " + book1.getYear());

        Autor autor2 = new Autor("Лев", "Толстой");
        System.out.println("Имя автора " + autor2.getFirstName());
        System.out.println("Фамилия автора " + autor2.getLastName());

        Book book2 = new  Book ("Война и мир", autor2,1864);
        System.out.println("Название книги " + book2.getTitle());
        System.out.println("Год выпуска книги " + book2.getYear());

        book2.setYear(1863);
        System.out.println(book2.getYear());



    }
}