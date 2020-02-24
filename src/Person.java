import java.util.Objects;
import java.util.Scanner;

public class Person {
    String name;
    int yearOfBirth;

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public static Person createPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String name = scanner.nextLine();
        System.out.println("Podaj rok urodzenia ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();
        return new Person(name, yearOfBirth);
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

    boolean samePerson(Person[] personType, Person person) {
        boolean samePerson = false;
        for (Person uniquePerson : personType) {
            if (person.equals(uniquePerson)) {
                samePerson = true;
                break;
            }
        }
        return samePerson;
    }

    @Override
    public String toString() {
        return "Imię: " + name + ", Rok urodzenia: " + yearOfBirth;
    }
}
