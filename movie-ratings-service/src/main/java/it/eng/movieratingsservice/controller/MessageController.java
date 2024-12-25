package it.eng.movieratingsservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
@RefreshScope //The /actuator/busrefresh endpoint clears the RefreshScope cache and rebinds @ConfigurationProperties
public class MessageController {

    @Value("${spring.boot.message}")
    private String message;

    @GetMapping
    public String printMessage(){
        return this.message;
    }
}
