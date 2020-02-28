package com.facadeDesignPattern.controllers;

import com.facadeDesignPattern.enums.LoadSize;
import com.facadeDesignPattern.enums.Temperature;
import com.facadeDesignPattern.enums.WashCycleType;
import com.facadeDesignPattern.washCycleFactory.WashCycleFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class WashingMachineController {

    @GetMapping("wash/{loadSize}/{temperature}/{washCycle}")
    public String BeginWashCycle(
        @PathVariable LoadSize loadSize,
        @PathVariable Temperature temperature,
        @PathVariable WashCycleType washCycle
    ) {
        return WashCycleFactory.createWashCycle(washCycle, temperature, loadSize).createLog();
    }
}
