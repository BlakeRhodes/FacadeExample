package com.facadeDesignPattern.washCycles;

import com.facadeDesignPattern.enums.LoadSize;
import com.facadeDesignPattern.enums.Temperature;

public class NormalWashCycle extends WashCycle{
    private Temperature temperature;
    private LoadSize loadSize;

    public NormalWashCycle(Temperature temperature, LoadSize loadSize){
        this.temperature = temperature;
        this.loadSize = loadSize;
    }

    @Override
    public String setWaterTemperature() {
        if(temperature == Temperature.HIGH){
            return "Setting temperature to 100C";
        } else if (temperature == Temperature.MEDIUM){
            return "Setting temperature to 90C";
        }
        return "Setting temperature to 86C";
    }

    public String setWaterLevel() {
        if(loadSize == LoadSize.LARGE){
            return "Setting water level to 50 gallons";
        } else if (loadSize == LoadSize.MEDIUM){
            return "Setting water level to 40 gallons";
        }
        return "Setting water level to 30 gallons";
    }

    @Override
    public String setAgitationLevel() {
        return "Setting Agitation Level to medium";
    }

    @Override
    public String setAgitationTime() {
        if(loadSize == LoadSize.LARGE){
            return "Setting Agitation time to 15 minutes";
        } else if (loadSize == LoadSize.MEDIUM){
            return "Setting Agitation time to 20 minutes";
        }
        return "Setting Agitation time to 21 minutes";
    }

    @Override
    public String beginRinse() {
        return "Beginning long rinse";
    }
}
