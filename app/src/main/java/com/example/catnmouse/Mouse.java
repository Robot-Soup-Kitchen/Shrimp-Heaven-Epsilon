package com.example.catnmouse;

public class Mouse {
    Cat chaser;
    double lat;
    double lon;
    public Mouse(Cat chaser, double lat, double lon) {
        this.chaser = chaser;
        this.lat = lat;
        this.lon = lon;
    }

    public Cat getChaser() {
        return chaser;
    }

    public void setChaser(Cat chaser) {
        this.chaser = chaser;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
