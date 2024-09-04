package dev.mvc.spring.Controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SecondController {


    @RequestMapping(value = "/s02",method = RequestMethod.GET)
    public String index() {
        System.out.println("cl");
        return "index";
    }

}
