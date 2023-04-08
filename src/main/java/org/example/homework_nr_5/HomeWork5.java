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
        DECEMBER
    }


public class HomeWork5 {

            public static void main(String[] args) {
                for (Month month : Month.values()) {
                    System.out.println(month);
                }
                System.out.println(Weekday.MONDAY + " is Holiday "+Weekday.MONDAY.isHoliday());
                System.out.println(Weekday.SATURDAY +" is Holiday "+Weekday.SATURDAY.isHoliday());
                System.out.println(Weekday.WEDNESDAY+" is Holiday "+Weekday.WEDNESDAY.isHoliday());
                System.out.println("======Parse======");
//“true” -> boolean
//“120" -> byte
//“32000” -> short
//“147895632" -> int
//“987654321987654321” -> long
//“4444.5d” -> double
//“2354.56f” -> float
                String str_bl = "true";
                String str_byt = "120";
                String str_sht = "32000";
                String str_int = "147895632";
                String str_lng = "987654321987654321";
                String str_dbl = "4444.5d";
                String str_flt = "2354.56f";
                boolean bul = Boolean.parseBoolean(str_bl);
                System.out.println(bul);
                byte b = Byte.parseByte(str_byt);
                System.out.println(b);
                short s = Short.parseShort(str_sht);
                System.out.println(s);
                int i = Integer.parseInt(str_int);
                System.out.println(i);
                long l = Long.parseLong(str_lng);
                System.out.println(l);
                double d = Double.parseDouble(str_dbl);
                System.out.println(d);
                float f = Float.parseFloat(str_flt);
                System.out.println(f);
            }
    }



