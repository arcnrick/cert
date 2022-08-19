package com.crianto.cert.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello Brow";
    }

    @RequestMapping(value = "/hello-people/{people}", method = RequestMethod.GET)
    public String helloPeople(@PathVariable("people") String people) {
        return "Hello " + people;
    }

    @RequestMapping(value = "/hello-param", method = RequestMethod.GET)
    public String helloParam(@RequestParam("param") String param) {
        return "Hello " + param;
    }

}
