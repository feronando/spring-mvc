package br.imd.web.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingMVCController {

    @Autowired
    private Greetings greeting;

    @GetMapping("/greetingmvc")
    public String greeting (@RequestParam(name="name", required=false, defaultValue="World") String name, Model model){
        model.addAttribute("name", greeting.greetingSelector(name));
        return "greeting";
    }
}
