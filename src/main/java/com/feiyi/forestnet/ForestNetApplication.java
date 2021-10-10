package com.feiyi.forestnet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@SpringBootApplication
@RestController
@EnableWebSocket
public class ForestNetApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForestNetApplication.class, args);
    }


    @Bean
    public ServerEndpointExporter serverEndpoint() {
        return new ServerEndpointExporter();
    }


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return "ss";
    }


}
