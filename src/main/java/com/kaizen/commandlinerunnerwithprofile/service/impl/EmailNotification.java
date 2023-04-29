package com.kaizen.commandlinerunnerwithprofile.service.impl;

import com.kaizen.commandlinerunnerwithprofile.service.SendNotification;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class EmailNotification implements SendNotification {
    @Override
    public void sendNotification() {
        System.out.printf("Email notification");
    }
}
