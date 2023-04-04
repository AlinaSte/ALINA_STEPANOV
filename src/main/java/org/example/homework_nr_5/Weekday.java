package org.example.homework_nr_5;

public enum Weekday {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;
      private  String  weekday;
     Weekday() {
            this.weekday = weekday;
        }
        public boolean isWeekDay(){
            if(weekday!="SUNDAY" || weekday!="SATURDAY"){
                return true;}
            else { return false;}
        }
        public boolean isHoliday(){
            if(weekday=="SUNDAY" || weekday=="SATURDAY"){
                return true;}
            else { return false;}
        }
    }

