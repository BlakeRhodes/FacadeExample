package com.facadeDesignPattern.washCycles;

import com.facadeDesignPattern.enums.LoadSize;
import com.facadeDesignPattern.enums.Temperature;

public class HeavyWashCycle extends WashCycle{
    private Temperature temperature;
    private LoadSize loadSize;

    public HeavyWashCycle(Temperature temperature, LoadSize loadSize){
        this.temperature = temperature;
        this.loadSize = loadSize;
    }

    @Override
    public String setWaterTemperature() {
        if(temperature == Temperature.HIGH){
            return "Setting temperature to 150C";
        } else if (temperature == Temperature.MEDIUM){
            return "Setting temperature to 145C";
        }
        return "Setting temperature to 140C";
    }

    public String setWaterLevel() {
        if(loadSize == LoadSize.LARGE){
            return "Setting water level to 60 gallons";
        } else if (loadSize == LoadSize.MEDIUM){
            return "Setting water level to 50 gallons";
        }
        return "Setting water level to 45 gallons";
    }

    @Override
    public String setAgitationLevel() {
        return "Setting Agitation Level to way to high";
    }

    @Override
    public String setAgitationTime() {
        if(loadSize == LoadSize.LARGE){
            return "Setting Agitation time to 20 minutes";
        } else if (loadSize == LoadSize.MEDIUM){
            return "Setting Agitation time to 25 minutes";
        }
        return "Setting Agitation time to 30 minutes";
    }

    @Override
    public String beginRinse() {
        return "Beginning Rinse\nBeginning second rinse";
    }
}
