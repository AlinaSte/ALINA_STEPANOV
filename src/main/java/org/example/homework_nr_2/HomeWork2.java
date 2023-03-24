package org.example.homework_nr_2;

public class HomeWork2 {
    public static void main(String[] args) {
// punkt 4
        int n = 3;
        switch (n) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("wrong month nr");
        }
//punkt 5
        int number = 0;
        for (int num = 100; num <= 1000; num += 5)
        {
            System.out.println(number + num);
        }
//punkt 5.1 ( bolee vernaya versiya zadaniya)
        System.out.println("vtoroy variant:");
        for (int k = 100; k <= 1000; k++)
        {
            if (k % 5 == 0)
            {
                System.out.println(k);
            }
        }
//punkt 6
        double a = 0;
        System.out.print("Sum of ");
        for (int o = 1, p = 3; o <= 97 && p <= 99; o += 2, p += 2)
        {
            System.out.print(o);
            System.out.print("/" + p + " + ");
        }
        for (double c = 1, d = 3; c <= 97 && d <= 99; c += 2, d += 2)
        {
            a = a + c / d;
        }
        System.out.println(" will be ");
        System.out.println(a);
//punkt 7
        char star = '*';
        for (int z = 0; z <= 9; z++)
        {
            for (int y = 1; y <= z; y++)
            {
                System.out.print(star);
            }
            System.out.println(star);
        }
    }
}


