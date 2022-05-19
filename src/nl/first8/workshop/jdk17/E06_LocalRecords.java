package nl.first8.workshop.jdk17;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class E06_LocalRecords {

    record Person(String name, LocalDate birthdate) {}

    public List<Person> sortPeopleByAge(List<Person> people) {
        // TODO can we also make this much shorter using Records, but only make the record visible in this method?
        class PersonWithAge {
            private final Person person;
            private final long ageDays;

            public PersonWithAge(Person person, long ageDays) {
                this.person = person;
                this.ageDays = ageDays;
            }

            public Person getPerson() {
                return person;
            }

            public long getAgeDays() {
                return ageDays;
            }

        }
        return people.stream()
                .map(person -> new PersonWithAge(person, computeAgeInDays(person)))
                .sorted(Comparator.comparing(PersonWithAge::getAgeDays))
                .map(PersonWithAge::getPerson)
                .collect(Collectors.toList());
    }

    private long computeAgeInDays(Person person) {
        LocalDate today = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        return ChronoUnit.DAYS.between(person.birthdate, today);
    }

    private void printPersonsOrderedByAge(List<Person> persons) {
        List<Person> sortedList = sortPeopleByAge(persons);
        sortedList.forEach(person -> System.out.println(person.name + ", " + person.birthdate));
    }

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Bram", LocalDate.of(1963, 4, 11)),
                new Person("Koen", LocalDate.of(1903, 1, 4)),
                new Person("Tim", LocalDate.of(2009, 7, 11)));

        new E06_LocalRecords().printPersonsOrderedByAge(persons);
    }

}
