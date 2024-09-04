package dev.mvc.spring.Controller;

import dev.mvc.spring.model.TimeTraveler;
import dev.mvc.spring.service.TimeTravelerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/time")
public class TimeTravelerController {

    private TimeTravelerService timeTravelerService;

    @Autowired
    public TimeTravelerController(TimeTravelerService timeTravelerService) {
        this.timeTravelerService = timeTravelerService;
    }


    @GetMapping("/list")
    public void getTimeTraveler(Model model) {
        model.addAttribute("timeTravelerList",timeTravelerService.findAll());
    }
    @GetMapping( "/register")
    public String showRegisterForm() {
//        ModelAndView maw = new ModelAndView();
//        maw.setViewName("timeTravelerRegisterForm");
        return "timeTravelerRegisterForm";
    }
    @PostMapping("/register")
    public String register(TimeTraveler timeTraveler) {

        System.out.println(timeTraveler.toString());
        timeTravelerService.add(timeTraveler);
        //        ModelAndView maw = new ModelAndView();
//        maw.setViewName("redirect:/");
        return "redirect:/";
    }


}
