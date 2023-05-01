package org.example.homework_nr_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee manager1 = new Manager("Oleg", "Ivanov", 15);
        Employee manager2 = new Manager("Anatolii", "Stepanov", 25);
        Employee programmer1 = new Programmer("Alina", "Stepanov", "Java");
        Employee programmer2 = new Programmer("Vasile", "Papanov", "C#");

        Employee[] array = new Employee[]{
                manager1,
                manager2,
                programmer1,
                programmer2
        };
        List<AttenTraining> al= new ArrayList<>();
        MeetingRoom MR1= new MeetingRoom((ArrayList<AttenTraining>)al);
        MR1.verifyEmployee(array);

//        MR1.verifyEmployee(array,(e)->{
//            return e instanceof AttenTraining;
//        } );
//        MR1.meetingRoomTraining(array);
//        System.out.println("------------");
//        MR1.meetingRoomInterview(array);
}
}