package com.example.kaseyclark.inclassassignment09_kaseyc;

/**
 * Created by kaseyclark on 4/7/18.
 */

public class Cow {
    private boolean hasSpots;
    private int age;
    private String name;

    public Cow(boolean hasSpots, int age, String name) {
        this.hasSpots = hasSpots;
        this.age = age;
        this.name = name;

    }

    public boolean isHasSpots() {
        return hasSpots;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setHasSpots(boolean hasSpots) {
        this.hasSpots = hasSpots;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
