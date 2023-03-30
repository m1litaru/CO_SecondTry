package main;

import java.math.BigInteger;
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

    public BigInteger getGigiProperties() {
        return BigInteger.valueOf(2000);
    }

    String secondString;

    public MainClass(String secondString) {
        this.secondString = secondString;
    }
}
