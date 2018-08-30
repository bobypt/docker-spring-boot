package org.bpt.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/greet")
    public String greet() {
        return "hello spring boot docker demo";
    }
}