package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tina", "Michael");

        List<String> filteredNames = names.stream().filter(name -> name.startsWith("M")).collect(Collectors.toList());
        System.out.println(filteredNames);

        List<Integer> nameLengths = names.stream().map(String::length).collect(Collectors.toList());
        System.out.println(nameLengths);

        List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNames);
    }
}

