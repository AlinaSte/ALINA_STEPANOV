package org.example.homework_nr_6;

import sun.util.calendar.CalendarDate;

public class Date {
    int day;
    int month;
    int year;
    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        if(day>0 && day <32)
        this.day = day;
        else{
            this.day = 1;
            System.out.println(day + " is not existing day, changed to 1");
        }
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        if(month>0 && month <13)
        this.month = month;
        else {
            this.month = 1;
            System.out.println(month + " is not existing month, changed to 1 ");
        }
    }
    public int getYear() {
        return year;

    }
    public void setYear(int year) {
        if (year > 0 && year < 2024)
            this.year = year;
        else {
            this.year=1;
            System.out.println("entered year "+year + " is not belong to our era )");
        }
    }
        public String displayDate () {
            String data = "" + this.day + "/" + this.month + "/" + this.year;
            return data;
        }
}
