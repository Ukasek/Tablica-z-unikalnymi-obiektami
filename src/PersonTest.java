public class PersonTest {
    public static void main(String[] args) {

        Person[] persons = new Person[3];
        personsData(persons);

        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }

    private static void personsData(Person[] personArray) {
        for (int i = 0; i < personArray.length; i++) {
            Person person = Person.createPerson();
            while (person.samePerson(personArray, person)) {
                System.out.println("Wprowadzona osoba już istnieje. " +
                        "Podaj ponownie imię oraz rok urodzenia. ");
                person = Person.createPerson();
            }
            personArray[i] = person;
        }
    }
}

