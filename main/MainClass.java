package main;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class MainClass {

    int age;
    float y;
    String Gigi;

    Boolean isStudent;

    Date dateOfBirth;

    Date dateOfHirement;

    public void showAgeOfGigi() {
        System.out.println(Gigi + " " + age);
    }

    public int getDays() {
        return Math.toIntExact(TimeUnit.DAYS.convert(Math.abs(dateOfHirement.getTime() - dateOfBirth.getTime()), TimeUnit.MILLISECONDS));
    }

    String secondString;

    public MainClass(String secondString) {
        this.secondString = secondString;
    }
}
