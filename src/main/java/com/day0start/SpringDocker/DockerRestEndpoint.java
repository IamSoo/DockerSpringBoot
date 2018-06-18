package com.day0start.SpringDocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerRestEndpoint {

    @RequestMapping("/rest/docker/hellp")
    public String hello(){
        return "Hey Welcome to Rest Deployed on Docker";
    }
}
