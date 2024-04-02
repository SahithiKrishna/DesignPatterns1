package com.example.demo.Adapter;

//A real life example for this pattern is that a mobile needs a 3V charging while the indian or US sockets provide 120/240 VI  order to overcome this we use an adapter
public class Volt {
    private int volts;

    public int getVolts() {
        return volts;
    }

    public Volt(int volts){
        this.volts = volts;
    }

    public void setVolts(int volt){
        this.volts = volt;
    }

    public String toString(){
        return "Volt for this class: "+this.volts;
    }
}
