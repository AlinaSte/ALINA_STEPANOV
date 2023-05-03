package org.example.homework_nr_9;

import java.sql.SQLOutput;

public class Manager extends Employee implements AttenTraining,AttenInterview{
    Integer teamSize;

    public Manager(String name, String surname, Integer teamSize) {
        super(name, surname);
        this.teamSize = teamSize;
    }

    public Integer getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(Integer teamSize) {
        this.teamSize = teamSize;
    }


    @Override
    public void interview() {
        System.out.println(super.name+" can attend interview");
    }

    @Override
    public String toString() {
        return "Manager{" + "name='" + name + '\'' + ", surname='" + surname +'\''+ ", teamSize=" + teamSize + ' ' + '}';
    }

    @Override
    public void training() {
        System.out.println(super.name+ " "+ super.surname+" can attend training");
    }
}

