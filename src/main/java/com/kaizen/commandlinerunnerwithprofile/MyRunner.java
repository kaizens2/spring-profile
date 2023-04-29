package com.kaizen.commandlinerunnerwithprofile;

import com.kaizen.commandlinerunnerwithprofile.service.SendNotification;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Data
@ConfigurationProperties(prefix = "my.app")
public class MyRunner implements CommandLineRunner {

     private String name;

     @Autowired
     private SendNotification notification;

    @Override
    public void run(String... args) throws Exception {
        System.out.printf("name : " + name);
        System.out.printf(Arrays.asList(args).toString());
        notification.sendNotification();
    }
}
