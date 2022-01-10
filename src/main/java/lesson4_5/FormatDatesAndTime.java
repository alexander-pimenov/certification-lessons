package lesson4_5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/* Форматируем даты. Получаем их строковые представления.
 *
 * При использовании DateTimeFormatter мы можем использовать метод format()
 * и для объекта LocalDate,LocalTime,LocalDateTime и для объекта DateTimeFormatter:
 * objLocalDate.format(objDateTimeFormatter) или
 * objDateTimeFormatter.format(objLocalDate)
 * будем получать один и тот же результат.
 * */
public class FormatDatesAndTime {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2020, Month.APRIL, 20);
        LocalTime time = LocalTime.of(11, 12, 31);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getDayOfYear());

//        DateTimeFormatter
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE)); //2020-04-20
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME)); //11:12:31
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); //2020-04-20T11:12:31

        System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE)); //20200420
        System.out.println(dateTime.format(DateTimeFormatter.ISO_ORDINAL_DATE)); //2020-111


        //-= ofLocalizedDate (SHORT) - короткая запись ДАТЫ =-
        //Создаем DateTimeFormatter
        DateTimeFormatter shortFormatDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        //используем полученный DateTimeFormatter для форматирования данных
        String strFormatDate1 = shortFormatDate.format(dateTime);
        System.out.println(strFormatDate1);
        String strFormatDate2 = shortFormatDate.format(date);
        System.out.println(strFormatDate2);
        //ВНИМАНИЕ для LocalTime это нельзя использовать!!! Т.к. он не содержит Date.
//        System.out.println(shortDateTime.format(time)); // !!! ОШИБКА

        //МОЖНО ИСПОЛЬЗОВАТЬ И ТАК:
        //Ниже получим тоже самое но записав всё немного по другому:
        String strFormatDate3 = date.format(shortFormatDate);
        System.out.println(strFormatDate3);
        String strFormatDate4 = dateTime.format(shortFormatDate);
        System.out.println(strFormatDate4);
//        System.out.println(time.format(shortDateTime)); // !!! ОШИБКА


        // -= ofLocalizedDateTime (SHORT and MEDIUM) - короткая и средняя запись ДАТЫ и ВРЕМЕНИ =-
        //Создадим форматеры:
        DateTimeFormatter mediumFormatDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter shortFormatDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(dateTime.format(mediumFormatDateTime));
        System.out.println(mediumFormatDateTime.format(dateTime));
        System.out.println(dateTime.format(shortFormatDateTime));
        System.out.println(shortFormatDateTime.format(dateTime));


        // -= Пишем свой собственный форматер с помощью метода DateTimeFormatter.ofPattern() =-
        // MMMM - месяц
        // dd - день
        // yyyy - год
        // hh - час
        // : - если хотим вывести разделитель - двоеточие
        // mm - минуты
        //
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime);
        System.out.println(dateTime.format(customFormatter));

        // ???
        DateTimeFormatter customFormatter2 = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(customFormatter2.format(time));
        //System.out.println(customFormatter2.format(date)); //!!! ОШИБКА - т.к. ДАТА не содржит ВРЕМЕНИ
        System.out.println(customFormatter2.format(dateTime));


        //[] - не печатаются. Они больше как выделители.
        DateTimeFormatter customFormatter3 = DateTimeFormatter.ofPattern("месяц и день такой - [MMMM dd], сейчас год - [yyyy], а время такое [hh:mm]");
        System.out.println(dateTime.format(customFormatter3));
    }
}
