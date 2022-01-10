package lesson4_5.periods;

import java.time.LocalDate;
import java.time.Month;

/*Задача давать раз в месяц бегемоту новую игрушку*/
public class ZooWithoutPeriods {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2020, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2020, Month.MAY, 31);
        performAnimalEnrichment(start, end);
    }

    /* Метод выдающий игрушку строго раз в месяц. если нужно изменить это, например, 2
     * раза в месяц, то это не получится, нужно будет писать другой месяц. а мы хотим преиспользовать этом метод,
     * поэтому он будет изменен в классе ZooWithPeriods#performAnimalEnrichment*/
    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("дать новую игрушку: " + upTo);
            upTo = upTo.plusMonths(1); //здесь захардкодили строго 1 месяц
        }
    }
}
