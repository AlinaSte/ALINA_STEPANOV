package org.example.homework_nr_4;

public class HomeWork4 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 6, 7, 3, 7, 8, 9};
        for (int index = 0; index != array.length; index++) {
            System.out.println(array[index]);
        }

        int[] SecondArray = new int[]{2, 4, 5, 6, 7, 8, 23, 5, 63, 86, 33};
        int[][] DoubleaArray = new int[][]{
                {3, 5, 7, 8, 9, 10, 22},
                {12, 4, 5, 7, 9, 10, 11},
        };
//summa i srednee znacenie odnomernogo massiva
        int sum = 0;
        for (int i = 0; i != SecondArray.length; i++) {
            sum = sum + SecondArray[i];
        }
        System.out.println("summa cisel odnomernogo massiva = " + sum);
        System.out.println("srednee znacenie = " + sum / SecondArray.length);
//kolicestvo cyotnih i necyotnih cisel dvumernogo massiva
        int countOdd = 0;
        int countEvently = 0;
        for (int j = 0; j != DoubleaArray.length; j++) {
            for (int k = 0; k != DoubleaArray[j].length; k++) {
                if (DoubleaArray[j][k] % 2 == 0)
                    countEvently++;
                if ( DoubleaArray[j][k] % 2 != 0)
                    countOdd++;
            }
        }
        System.out.println("kol-vo cyotnih cisel v dvumernom massive = " + countEvently);
        System.out.println("kol-vo necyotnih cisel v dvumernom massive = " + countOdd);
// bonusnoe zadanie
    String [] CollegName = new String[]{"Alex", "Victor","Pavel", "Vyaceslav"};
    String [] CopyName = new String[CollegName.length];
    for(int n = 0; n != CollegName.length; n++ ) {
            CopyName[n] = CollegName[n];
        System.out.print(CopyName[n]+ " ");
        }
    }
}
