import java.util.Objects;

public class Person {
    String name;
    int yearOfBirth;

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getYearOfBirth() {

        return yearOfBirth;
    }

    public void setId(int yearOfBirth) {

        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return yearOfBirth == person.yearOfBirth &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, yearOfBirth);
    }

    String printInfo() {

        return "Imię: " + name + ", rok urodzenia: " + yearOfBirth;
    }
}
