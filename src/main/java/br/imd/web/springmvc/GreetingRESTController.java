package br.imd.web.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRESTController {

    @Autowired
    private Greetings greeting;

    @GetMapping("/greetingrest")
    public String greeting (@RequestParam(name="name", required=false, defaultValue="World") String name){
        return String.format("Hello, %s", greeting.greetingSelector(name));
    }
}
