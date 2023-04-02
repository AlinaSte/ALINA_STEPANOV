package org.example.homework_nr_4_1;
import java.sql.SQLOutput;
import java.util.Scanner;
public class test {
        public static void main(String [] args){


            Clock c1 = new Clock(14462);
            System.out.println("setClocks c1 "+ c1);
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a hours for c2: ");
            int newH = input.nextInt();
            System.out.print("Enter a minutes for c2: ");
            int newM = input.nextInt();
            System.out.print("Enter a seconds for c2: ");
            int newS = input.nextInt();
            Clock c2 = new Clock(newH,newM,newS);
            System.out.println("Entered time for c2 is : "+ c2);

            Clock c3= new Clock ();
            System.out.println("No data entered in c3: " + c3);

            c1.tick();
            c1.tick();
            System.out.println("double tick for c1 : "+ c1);
            c3.tickDown();
            System.out.println("tick down for c3 : "+ c3);
       }
}
