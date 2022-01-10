package lesson4_5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

/*С датами в Java есть проблемы, и давно!!! Особенно при создании в старом стиле: Date, Calendar, GregorianCalendar.
 * Лучше для создания использовать: LocalDate, LocalTime, LocalDateTime.
 * Даты, как и String - имутабельны!!! Т.е. при изменении Даты создается в памяти новая Дата а не изменяется старая.
 * Старая шде то останентся в памяти. Поэтому нельзя забывать переприсваивать ссылку на Дату!!!
 * */
public class DatesAndTimesCreatingAndAction {
    public static void main(String[] args) {

        ///////////////////////////////////////////////////////////////
        //-= Создание =-
        //Дата и Время с 8 Java

        //LocalDate - храним только дату (время в ней не храним!!!)
        //LocalTime - храним только время (дату в ней не храним!!!)
        //LocalDateTime - храним и время и дату

        //У LocalDate, LocalTime и LocalDateTime конструктор ПРИВАТНЫЙ, поэтому создавать дату и время через
        //new мы не может, а создаем только через специальные методы LocalDate.of(), LocalDate.now() и т.д.!!!

        //Создание текущей даты, времени, даты и времени:
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        //Задаем какую то определенную дату:
        //public static LocalDate of(int year, Month month, int dayOfMonth)
        //public static LocalDate of(int year, int month, int dayOfMonth)

        LocalDate date1 = LocalDate.of(2020, Month.DECEMBER, 12);
        LocalDate date2 = LocalDate.of(2020, 12, 12);
        System.out.println(date1 + "\t" + date2);


        //Создаем какое то определенное время:
        //public static LocalTime of(int hour, int minute, int second, int nanoOfSecond)

        LocalTime time1 = LocalTime.of(6, 15);
        LocalTime time2 = LocalTime.of(6, 15, 30);
        LocalTime time3 = LocalTime.of(6, 15, 30, 500);

        System.out.println(time1 + "\t" + time2 + "\t" + time3);

        //Создаем какое то составное дата+время
        LocalDateTime dateTime1 = LocalDateTime.of(2020, Month.DECEMBER, 20, 6, 15);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        System.out.println(dateTime1);
        System.out.println(dateTime2);

        ///////////////////////////////////////////////////////////////
        //Даты, как и String - имутабельны!!!
        //Не забудь переприсвоит ссылку!!!
        //-= Работа с датами и временем =-

        //forward in time
        LocalDate date = LocalDate.of(2020, Month.DECEMBER, 12);
        System.out.println(date);
        date = date.plusDays(3);
        System.out.println(date);
        date = date.plusWeeks(1);
        System.out.println(date);
        date = date.plusMonths(4);
        System.out.println(date);
        date = date.plusYears(5);
        System.out.println(date);

        //back in time
        LocalDate dateB = LocalDate.of(2020, Month.DECEMBER, 12);
        LocalTime timeB = LocalTime.of(5, 45);
        LocalDateTime dateTimeB = LocalDateTime.of(dateB, timeB);
        System.out.println(dateTimeB);
        dateTimeB = dateTimeB.minusHours(10);
        System.out.println(dateTimeB);
        dateTimeB = dateTimeB.minusDays(3);
        System.out.println(dateTimeB);
        dateTimeB = dateTimeB.minusMonths(2);
        System.out.println(dateTimeB);

        //chaining
        LocalDate localDate = LocalDate.of(2020, Month.DECEMBER, 12);
        LocalTime localTime = LocalTime.of(16, 52);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime)
                .minusDays(2)
                .minusHours(5)
                .minusMinutes(10)
                .minusSeconds(45);
        System.out.println(localDateTime);

        //trap (ловушка)
        //НЕ УЧЛИ Иммутабельность LocalDate и потеряли дату:
        LocalDate localDateTrap = LocalDate.of(2020, Month.DECEMBER, 12);
        localDateTrap.plusDays(10);
        System.out.println(localDateTrap);

    }

    //old style: + day
    public Date addDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, 1);
        return cal.getTime();
    }

    //new: + day
    public LocalDate addDay(LocalDate date){
        return date.plusDays(1);
    }

    //old style: - day
    public Date subtractDay(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, -1);
        return cal.getTime();
    }

    //new: - day
    public LocalDate subtractDay(LocalDate date){
        return date.minusDays(1);
    }
}
