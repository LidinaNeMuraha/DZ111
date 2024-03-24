public class Autor {
    private static String firstName;
    private static String lastName;

    public static Autor createAutor(String firstName, String lastName) {
        Autor autor = new Autor();

        Autor.firstName = firstName;
        Autor.lastName = lastName;

        return autor;
    }

    public Autor() {
        this.firstName = firstName;
        this.lastName = lastName;

    }


    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
