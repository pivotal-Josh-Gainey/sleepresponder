package com.sleeperresponder.demo;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;


@Controller
public class MyController {

    @RequestMapping(method = RequestMethod.GET, value = "/connect_with_sleep", produces = "application/json")
    public ResponseEntity<String> sleep(@RequestParam(name = "sleep_time") long sleepTimeInMillis){
        try {
            Thread.sleep(sleepTimeInMillis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

}
