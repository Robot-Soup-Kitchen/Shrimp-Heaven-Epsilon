package com.example.catnmouse;

public class Cat {
    Mouse target;
    double lat;
    double lon;
    public Cat(Mouse target, double lat, double lon) {
        this.target = target;
        this.lat = lat;
        this.lon = lon;
    }

    public void setTarget(Mouse target) {
        this.target = target;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public Mouse getTarget() {
        return target;
    }
}
