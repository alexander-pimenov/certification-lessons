package lesson4_5;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DatesOldStyle {
    public static void main(String[] args) {

        //создание дат по новому стилю проще и более читабельно

        //old
        Date date1 = new Date();

        //Но бывали путаницы, т.к. есть еще Date для работы с БД
//        java.sql.Date sqlDate = new java.sql.Date(123123123123L);

        //new
        LocalDate date2 = LocalDate.now();


        //old
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, Calendar.DECEMBER, 12); //задали дату
        Date calendarTime = calendar.getTime(); //получили дату
        System.out.println(calendarTime);

        //или еще вариант с Григорианским календарем
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2020, Calendar.DECEMBER, 12);
        Date gregorianCalendarTime = gregorianCalendar.getTime();
        System.out.println(gregorianCalendarTime);

        //new
        LocalDate localDate = LocalDate.of(2020, Month.DECEMBER, 12);
        System.out.println(localDate);


    }

    //old style + day
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
