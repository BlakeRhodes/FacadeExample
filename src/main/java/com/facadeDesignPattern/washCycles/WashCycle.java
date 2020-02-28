package com.facadeDesignPattern.washCycles;

public abstract class WashCycle {

    public abstract String setWaterTemperature();
    public abstract String setWaterLevel();
    public abstract String setAgitationLevel();
    public abstract String setAgitationTime();
    public abstract String beginRinse();

    public String createLog(){
        return "<div>" + setWaterLevel() +"</div>" +
            "<div>" +setWaterTemperature() +"</div>" +
            "<div>" +setAgitationLevel() +"</div>" +
            "<div>" +setAgitationTime() +"</div>" +
            "<div>" +beginRinse() + "</div>";
    }
}
