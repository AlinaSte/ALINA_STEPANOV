package org.example.homework_nr_9;

public class Programmer extends Employee implements AttenTraining{
    String programmLanguage;

    public Programmer(String name, String surname, String programmLanguage) {
        super(name, surname);
        this.programmLanguage = programmLanguage;
    }

    public String getProgrammLanguage() {
        return programmLanguage;
    }

    public void setProgrammLanguage(String programmLanguage) {
        this.programmLanguage = programmLanguage;
    }

    @Override
    public void training() {

    }

    @Override
    public String toString() {
        return "Programmer{" + "name='" + name + '\'' + ", surname='" + surname + '\''  + ", programmLanguage='" + programmLanguage + '\'' +'}';
    }
}
