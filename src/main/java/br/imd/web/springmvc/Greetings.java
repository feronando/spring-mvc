package br.imd.web.springmvc;

import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class Greetings {

    public String greetingSelector(String name){
        return name == null ? "World" : name;
    }
}
