package org.example.homework_nr_9;

import java.util.ArrayList;

public class MeetingRoom {
    public MeetingRoom(ArrayList<AttenTraining> train) {
    }

    public static String verifyEmployee(Employee[] array){
        for (Employee element:
             array) {
            if( element instanceof AttenTraining ){
                System.out.println(element.toString());
            }
        }
        return null;
    }
//    public void meetingRoomTraining(Employee[] array) {
//      for(int i = 0; i!=array.length;i++)
//    {
//        if (array[i] instanceof AttenTraining) {
//            System.out.println(array[i] + " can attend training");
//        }
//    }
//}
//    public void meetingRoomInterview(Employee[] array) {
//        for(int i = 0; i!=array.length;i++)
//        {
//            if (array[i] instanceof AttenInterview) {
//                System.out.println(array[i]  + " can attend interview");
//            }
//        }
//    }


}
