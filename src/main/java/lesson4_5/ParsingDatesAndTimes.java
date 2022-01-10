package lesson4_5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/*Всегда нужно договариваться в каком виде мы работатем с датами, т.е. с их формой!!!*/
public class ParsingDatesAndTimes {
    public static void main(String[] args) {

        // Создадим форматер, через ofPattern(), где в паттерне зашито расположение
        // дней, минут, часов и т.д. по которому он будет парсить строковое представление даты
        // Этот же форматер мы можем использовать и в обратную сторону, для преобразования date_time
        // в строковое значение определенного патерна.
        // Т.е. в таком формате мы ожидаем приходящую дату:
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("MM dd yyyy");

        //Распарсим (т.е. получим объект LocalDate из String) пришедшую в строковом представлении дату:
        String strDate = "01 02 2015";
        LocalDate date = LocalDate.parse(strDate, customFormatter);
        System.out.println(date); //2015-01-02

        //преобразуем из LocalDate в String
        LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
        String format = date1.format(customFormatter);
        System.out.println(format); //01 20 2020


        LocalTime time = LocalTime.parse("11:22");
        System.out.println(time);
    }
}
