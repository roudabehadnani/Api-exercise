package org.example;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

    //1.Create a LocalDate of the current day and print it out
        System.out.println("Exercise1:");
        LocalDate today = LocalDate.now();
        System.out.println(today);

    //2.Create a LocalDate of the current day and print it out in the following pattern using DateTimeFormatter: Torsdag 29 mars.
        System.out.println("Exercise2:");
        LocalDate currentDay = LocalDate.now();
        String day = currentDay.format(DateTimeFormatter.ofPattern("eeee dd MMM."));
        System.out.println(day);

    //3.Create a LocalDate of last Monday. Then print out the entire week in a loop using standard ISO format.
        System.out.println("Exercise3:");
        LocalDate lastMonday = LocalDate.of(2022,06,27);
         for (int i = 0; i< 7; i++) {
            String weekIsoFormat = lastMonday.plusDays(i).format(DateTimeFormatter.ISO_DATE);
            System.out.println(weekIsoFormat);
        }

    //4.Create a LocalDate object from a String by using the .parse() method.
        System.out.println("Exercise4:");
        LocalDate myBirthday = LocalDate.parse("1989-05-01");
        System.out.println(myBirthday);

    //5.The date time api provides enums for time units such as day and month. Create a LocalDate of 1945-05-08 and extract the day of week for that date.
        System.out.println("Exercise5:");
        LocalDate dayOfWeek = LocalDate.parse("1945-05-08");
        DayOfWeek theDay = dayOfWeek.getDayOfWeek();
        System.out.println(theDay);

    //6.Create a LocalDate of current date plus 10 years and minus 10 months. From that date extract the month and print it out.
        System.out.println("Exercise6:");
        LocalDate todayDate = LocalDate.now();
        LocalDate futureDate = todayDate.plusYears(10).minusMonths(10);
        Month month = futureDate.getMonth();
        System.out.println(month);

    //7.Using the LocalDate from exercise 6 and your birthdate, create a Period between your birthdate and the date from exercise 5. Print out the elapsed years, months and days.
        System.out.println("Exercise7:");
        LocalDate myBirthDate = LocalDate.of(1989,05,01);
        LocalDate exactDay = LocalDate.parse("1945-05-08");
        Period periodBetween = Period.between(exactDay,myBirthDate);
        int years = periodBetween.getYears();
        int months =periodBetween.getMonths();
        int days = periodBetween.getDays();
        System.out.println("Years:" + years + " " + "Months:" + months + " " + "Days:" + days);

    //8.Create a period of 4 years, 7 months and 29 days. Then create a LocalDate of current date and add the period you created to the current date
        System.out.println("Exercise8:");
        LocalDate dateOfToday = LocalDate.now();
        Period period = Period.of(4,7,29) ;
        LocalDate afterPeriod = dateOfToday.plus(period);
        System.out.println(afterPeriod);

    //9.Create a LocalTime object of the current time.
        System.out.println("Exercise9:");
        LocalTime now = LocalTime.now();
        System.out.println(now);

    //10.Extract the nanoseconds of a LocalTime object of current time. Print out the nanoseconds.
        System.out.println("Exercise10:");
        LocalTime justNow = LocalTime.now();
        int nanoSecond = justNow.getNano();
        System.out.println(nanoSecond);

    //11.Create a LocalTime object from a String using the .parse() method.
        System.out.println("Exercise11:");
        LocalTime startClass = LocalTime.parse("09:00");
        int hour = startClass.getHour();
        int minute = startClass.getMinute();
        System.out.println("Hours:" + hour + " Minutes:" + minute);

    //12.Using DateTimeFormatter format LocalTime from current time and print it out as following pattern: 10:32:53
        System.out.println("Exercise12:");
        LocalDateTime timeNow = LocalDateTime.now();
        String time = timeNow.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
        System.out.println(time);


    //13.Create a LocalDateTime with the date and time components as: date: 2018-04-05, time: 10.00.
        System.out.println("Exercise13:");
        LocalDateTime dateTime = LocalDateTime.of(2018,4,5,10,0) ;
        String IsoDateTime = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm"));
        System.out.println(IsoDateTime);

    //14.Using DateTimeFormatter format the LocalDateTime object from exercise 11 to a String that should look tile this: torsdag 5 april 10:00
        System.out.println("Exercise14:");
        LocalDateTime startClass11 = LocalDateTime.parse("2022-07-02T09:00");
        String dateTimeFormat = startClass11.format(DateTimeFormatter.ofPattern("eeee dd MMM hh:mm"));
        System.out.println(dateTimeFormat);

    //15.Create a LocalDateTime object by combining LocalDate object and LocalTime object.
        System.out.println("Exercise15:");
        LocalTime getTimeNow = LocalTime.now();
        LocalDate getDateNow = LocalDate.now();
        LocalDateTime combineTimeDate = LocalDateTime.of(getDateNow,getTimeNow);
        System.out.println("LocalDateTime created by combining LocalDate and LocalTime: " + combineTimeDate);

    //16.Create a LocalDateTime object. Then get the LocalDate and LocalTime components into separate objects of respective types from the LocalDateTime object.
        System.out.println("Exercise16:");
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalTime timeGet = currentDateTime.toLocalTime();
        LocalDate dateGet = currentDateTime.toLocalDate();
        System.out.println("Current Date is:" + dateGet + " Current Time is:" + timeGet);

    }
}