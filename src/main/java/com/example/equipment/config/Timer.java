package com.example.equipment.config;

import com.example.equipment.entity.SerialPort;
import com.example.equipment.service.SeralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class Timer {
    @Autowired
    SeralService service ;
    @Scheduled(fixedDelay = 100000)
    public void checked() {
        service.checked();
        service.AutoOut();
    }
    @Scheduled(fixedDelay = 600000)
    public void AutoCollection(){

    }
}
