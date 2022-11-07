package com.example.streams;

import java.util.*;
import java.util.stream.Collectors;

/**
 * These coding kata on the Stream API can all be completed with a single return line.
 */
public class GentlyDownTheStream {

    protected List<String> fruits;
    protected List<String> veggies;
    protected List<Integer> integerValues;

    public GentlyDownTheStream() {
        fruits = Arrays.asList("Apple", "Orange", "Banana", "Pear", "Peach", "Tomato");
        veggies = Arrays.asList("Corn", "Potato", "Carrot", "Pea", "Tomato");
        integerValues = new Random().ints(0, 1001)
                                    .boxed()
                                    .limit(1000)
                                    .collect(Collectors.toList());
    }

    // TODO - return a list of sorted fruits based on the fruits list
    public List<String> sortedFruits() {
        return fruits.stream()
                     .sorted()
                     .collect(Collectors.toList());
    }

    // TODO - return a list of sorted fruits with all fruits filtered out that start with "A"
    public List<String> sortedFruitsException() {
        List<String> expected = stream.fruits.stream()
                .filter(x -> !x.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());
        List<String> actual = stream.sortedFruitsException();

        assertThat(actual.equals(expected)).isTrue();
    }


    // TODO - return a list with the first 2 elements of a sorted list of fruits
    public List<String> sortedFruitsFirstTwo() {
        List<String> expected = stream.fruits.stream()
                .sorted()
                .limit(2)
                .collect(Collectors.toList());
        List<String> actual = stream.sortedFruitsFirstTwo();

        assertThat(actual.equals(expected)).isTrue();
    }


}

    // TODO - return a comma separated String of sorted fruits
    public String commaSeparatedListOfFruits() {


            String expected = stream.fruits.stream()
                    .sorted()
                    .collect(Collectors.joining(", "));
            String actual = stream.commaSeparatedListOfFruits();

            assertThat(actual.equals(expected)).isTrue();

    }

    // TODO - return a list of veggies that are sorted in reverse (descending) order
    public List<String> reverseSortedVeggies() {
        List<String> expected = stream.veggies.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        List<String> actual = stream.reverseSortedVeggies();

        assertThat(actual.equals(expected)).isTrue();
    }

    // TODO - return a list of veggies that are sorted in reverse order, and all in upper case
    public List<String> reverseSortedVeggiesInUpperCase() {
        List<String> expected = stream.veggies.stream()
                .sorted(Comparator.reverseOrder())
                .map(v -> v.toUpperCase(Locale.ROOT))
                .collect(Collectors.toList());
        List<String> actual = stream.reverseSortedVeggiesInUpperCase();

        assertThat(actual.equals(expected)).isTrue();
    }

    // TODO - return a list of the top 10 values in the list of random integers
    public List<Integer> topTen() {
        List<Integer> expected = stream.integerValues.stream()
                .sorted(Comparator.reverseOrder())
                .limit(10)
                .collect(Collectors.toList());
        List<Integer> actual = stream.topTen();

        assertThat(actual.equals(expected)).isTrue();
    }

    // TODO - return a list of the top 10 unique values in the list of random integers
    public List<Integer> topTenUnique() {
        List<Integer> expected = stream.integerValues.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .limit(10)
                .collect(Collectors.toList());
        List<Integer> actual = stream.topTenUnique();

        assertThat(actual.equals(expected)).isTrue();
    }

    // TODO - return a list of the top 10 unique values in the list of random integers that are odd
    public List<Integer> topTenUniqueOdd() {

        List<Integer> expected = stream.integerValues.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .filter(x -> x % 2 != 0)
                .limit(10)
                .collect(Collectors.toList());
        List<Integer> actual = stream.topTenUniqueOdd();

        assertThat(actual.equals(expected)).isTrue();
    }

    // TODO - return a single value that represents the average of all of your random numbers
    public Double average() {

        Double expected = stream.integerValues.stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble();
        Double actual = stream.average();

        assertThat(actual.equals(expected)).isTrue();
    }
}
