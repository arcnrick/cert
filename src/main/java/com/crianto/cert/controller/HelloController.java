package com.crianto.cert.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome() {
        System.out.println("*** welcome ***");
        return "Welcome Brow";
    }

    @RequestMapping(value = "/hello-people/{people}", method = RequestMethod.GET)
    public String helloPeople(@PathVariable("people") String people) {
        System.out.println("*** hello-people ***");
        return "Hello " + people;
    }

    @RequestMapping(value = "/hello-param", method = RequestMethod.GET)
    public String helloParam(@RequestParam("param") String param) {
        System.out.println("*** hello-param ***");
        return "Hello " + param;
    }

}
