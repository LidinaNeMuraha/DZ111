import java.util.Objects;

public class Autor {
    private String firstName;
    private String lastName;

    public Autor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor author = (Autor) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
    }


    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
