package lesson4_5.periods;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/*Задача давать раз в месяц (или какое то другое количество раз) бегемоту новую игрушку.*/
public class ZooWithPeriods {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2020, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2020, Month.MAY, 31);
        Period period = Period.ofMonths(1);
//        performAnimalEnrichment(start, end, period);

        //Также можем создавать разные периоду, как в классе PeriodsInJava,
        // и использовать их в методе performAnimalEnrichment

        //или так:
        Period everyTwoWeek = Period.ofWeeks(2);
//        performAnimalEnrichment(start, end, everyTwoWeek);

        //или так:
        performAnimalEnrichment(start, end, PeriodsInJava.EVERY_TWO_WEEK);

    }

    /* Метод выдающий игрушку строго раз в месяц. Если нужно изменить это, например, 2
     * раза в месяц, то легко это сделаем с помощью периода.
     * Этот месяц более гибче, чем ZooWithoutPeriods#performAnimalEnrichment
     * */
    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("дать новую игрушку: " + upTo + " (" + upTo.getDayOfWeek() + ")");
            upTo = upTo.plus(period);
        }
    }
}
