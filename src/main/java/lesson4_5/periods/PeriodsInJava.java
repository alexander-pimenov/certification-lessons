package lesson4_5.periods;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

/*Рассмотрим такую сущность, как Период в Java!!!*/
public class PeriodsInJava {

    public static final Period EVERY_TWO_WEEK =Period.ofWeeks(2);


    public static void main(String[] args) {

        //-= Создание периода: =-
        Period annually = Period.ofYears(1);
        Period quarterly = Period.ofMonths(3);
        Period everyThreeWeeks = Period.ofWeeks(3);
        Period everyOtherDay = Period.ofDays(2);
        Period everyTwoWeek = Period.ofWeeks(2);
        //сложный составной период - 1 год и + 1 неделя:
        Period everyYearAndWeek = Period.of(1, 0, 7);

        //trap
        //Есть пару ловушек:
        //С периодами не получится использовать цепочки, как с датами
        Period wrong = Period.ofYears(1).ofWeeks(3);

        //распишем нагляднее:
        Period wrong2 = Period.ofYears(1);
        wrong2 = Period.ofWeeks(3);

        //из этого видно, что ссылка не будет ссылаться на составной период (1 год + 3 недели)
        //а будет переприсвоина только на 3 недели!!!

        //Сложный составной период нужно создавать через Period.of(1, 0, 7);

        //trap2
        LocalDate date = LocalDate.of(2020, Month.JANUARY,1);
        LocalTime time = LocalTime.of(6,15);
        LocalDateTime dateTime = LocalDateTime.of(date,time);
        Period period = Period.ofMonths(1);
        System.out.println(date.plus(period));
        System.out.println(dateTime.plus(period));
        //System.out.println(time.plus(period));// !!! нельзя в time впихнуть месяц //Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Months



    }
}
