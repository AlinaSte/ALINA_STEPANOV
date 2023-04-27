package org.example.homework_nr_9;

public class MeetingRoom {
    public void MeetingRoom() {
    }

    public void meetingRoomTraining(Employee[] array) {
      for(int i = 0; i!=array.length;i++)
    {
        if (array[i] instanceof AttenTraining) {
            System.out.println(array[i] + " can attend training");
        }
    }
}
    public void meetingRoomInterview(Employee[] array) {
        for(int i = 0; i!=array.length;i++)
        {
            if (array[i] instanceof AttenInterview) {
                System.out.println(array[i]  + " can attend interview");
            }
        }
    }


}
