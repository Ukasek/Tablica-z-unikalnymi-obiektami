import java.util.Scanner;

public class TypeTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Person[] persons = new Person[3];

        System.out.println("Wprowadz imię użytkownika: ");
        String name1 = scanner.nextLine();
        System.out.println("Wprowadz rok urodzenia użytkownika: ");
        int yearOfBirth1 = scanner.nextInt();
        persons[0] = new Person(name1, yearOfBirth1);
        scanner.nextLine();

        System.out.println("Wprowadz imię użytkownika: ");
        String name2 = scanner.nextLine();
        System.out.println("Wprowadz rok urodzenia użytkownika: ");
        int yearOfBirth2 = scanner.nextInt();
        persons[1] = new Person(name2, yearOfBirth2);
        scanner.nextLine();
        if (persons[1].equals(persons[0])) {
            System.out.println("Wprowadzono te same dane!");
            System.out.println("Wprowadz imię użytkownika: ");
            String name = scanner.nextLine();
            System.out.println("Wprowadz rok urodzenia użytkownika: ");
            int yearOfBirth = scanner.nextInt();
            persons[1] = new Person(name, yearOfBirth);
            scanner.nextLine();
        }
        System.out.println("Wprowadz imię użytkownika: ");
        String name3 = scanner.nextLine();
        System.out.println("Wprowadz rok urodzenia użytkownika: ");
        int yearOfBirth3 = scanner.nextInt();
        persons[2] = new Person(name3, yearOfBirth3);
        if (persons[2].equals(persons[1]) || persons[2].equals(persons[0])) {
            System.out.println("Wprowadzono jednakowe dane!");
            scanner.nextLine();
            System.out.println("Wprowadz imię użytkownika: ");
            String name = scanner.nextLine();
            System.out.println("Wprowadz rok urodzenia użytkownika: ");
            int yearOfBirth = scanner.nextInt();
            persons[2] = new Person(name, yearOfBirth);
            scanner.nextLine();
        }
        scanner.close();
        for (int i = 0; i < 3; i++)
            System.out.println(persons[i].printInfo());

    }
}

