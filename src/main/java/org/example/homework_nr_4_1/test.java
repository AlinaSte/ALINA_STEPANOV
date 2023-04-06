package org.example.homework_nr_4_1;
import java.sql.SQLOutput;
import java.util.Scanner;
public class test {

        public static void main(String [] args){
            //Clock 1
            Scanner input = new Scanner(System.in);
            System.out.print("Enter seconds for c1: ");
            int H = input.nextInt();
            Clock c1 = new Clock(H);
            System.out.println("setClocks c1 "+ c1);
            for (int i=1; i<=10; i++) {
                c1.tick();
                System.out.println("tick"+ i +" "+ c1);}
            //Clock 2
            System.out.print("Enter a hours for c2: ");
            int newH = input.nextInt();
            System.out.print("Enter a minutes for c2: ");
            int newM = input.nextInt();
            System.out.print("Enter a seconds for c2: ");
            int newS = input.nextInt();
            Clock c2 = new Clock(newH,newM,newS);
            System.out.println("Entered time for c2 is : "+ c2);
            for (int j=1; j<=10; j++) {
                c2.tick();
                System.out.println("tick"+ j +" "+ c2);}
            c1.toString();
            System.out.println("c1 is  " + c1);
            c2.toString();
            System.out.println("c2 is  " + c2);
            c2.addClock(c1);  // c1 added to c2
            System.out.println("sum of c1 and c2 " + c2);
//            Clock c3= new Clock ();
//            System.out.println("No data entered in c3: " + c3);

//            System.out.println("tick down for c3 : "+ c3);
       }
}
