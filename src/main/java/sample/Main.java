package sample;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static final List<LocalDate> UNSORTEDLIST = Stream.of(
                    "2005-07-01", "2005-01-02", "2005-01-01", "2005-05-03")
            .map(LocalDate::parse)
            .collect(Collectors.toList());

    public static void main(String[] args) {
        DateSorter dateSorter = new DateSorter();
        System.out.println(dateSorter.sortDates(UNSORTEDLIST));
    }
}