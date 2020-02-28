package com.facadeDesignPattern.washCycleFactory;

import com.facadeDesignPattern.enums.LoadSize;
import com.facadeDesignPattern.enums.Temperature;
import com.facadeDesignPattern.enums.WashCycleType;
import com.facadeDesignPattern.washCycles.GentleWashCycle;
import com.facadeDesignPattern.washCycles.HeavyWashCycle;
import com.facadeDesignPattern.washCycles.NormalWashCycle;
import com.facadeDesignPattern.washCycles.WashCycle;

public class WashCycleFactory {
    public static WashCycle createWashCycle(WashCycleType type, Temperature temperature, LoadSize loadSize){
        switch(type) {
            case GENTLE:
                return new GentleWashCycle(temperature, loadSize);
            case HEAVY:
                return new HeavyWashCycle(temperature, loadSize);
            default:
                return new NormalWashCycle(temperature, loadSize);
        }
    }
}
