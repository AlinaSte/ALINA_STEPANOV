package org.example.homework_nr_5;

    enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER;
    }


public class HomeWork5 {

            public static void main(String[] args){
                for(Month month : Month.values()){
                    System.out.println(month);
                }
            System.out.println(Weekday.MONDAY.isHoliday());

            }
    }



