package dev.mvc.spring.Controller.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component("/s02/controller")
public class SecondResolvingViewController implements Controller {
    private static final Logger logger = LoggerFactory.getLogger(SecondResolvingViewController.class);

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mnv = new ModelAndView();
        mnv.setViewName("home");

        mnv.addObject("serverTime", "formattedDate");

        return mnv;
    }
}
