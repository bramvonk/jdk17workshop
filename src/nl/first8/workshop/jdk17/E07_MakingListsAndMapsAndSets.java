package nl.first8.workshop.jdk17;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E07_MakingListsAndMapsAndSets {

    private void list() {
        // TODO this is not really long, but using Arrays to make a List... we can do better with Java 9!
        List<String> strings = Arrays.asList("Hello", "world");

        strings.forEach(System.out::println);
    }

    private void set() {
        // TODO this too could be much shorter in Java 9 :)
        Set<String> strings = new HashSet<>(Arrays.asList("Hello", "world"));

        strings.forEach(System.out::println);
    }

    private void map() {
        // TODO can you make use of Map.of or Map.ofEntries to make this less... Java 8-ey?
        Map<String, Integer> map = Stream.of(
                        new AbstractMap.SimpleEntry<>("idea", 1),
                        new AbstractMap.SimpleEntry<>("mobile", 2))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        map.forEach((s, i) -> System.out.println(s + " belongs to " + i));
    }

    public static void main(String[] args) {
        E07_MakingListsAndMapsAndSets instance = new E07_MakingListsAndMapsAndSets();
        System.out.println("List example:");
        instance.list();
        System.out.println();

        System.out.println("Map example:");
        instance.map();
        System.out.println();

        System.out.println("Set example:");
        instance.set();
        System.out.println();
    }


}
