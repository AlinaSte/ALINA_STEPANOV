package org.example.homework_nr_9;

import java.util.ArrayList;
import java.util.List;

public class MeetingRoom {
    List<AttenTraining> inputlist;
    public MeetingRoom(ArrayList<AttenTraining> train) {
        inputlist = train;
    }

    public void verifyEmployee(){
        for (AttenTraining element:
             inputlist) {
            element.training();
        }
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
