package com.guntur.expert;

import org.springframework.aot.hint.annotation.Reflective;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api")
public class ExpertController {
    
    @GetMapping("/contacts")
    public String experts()
    {
        return "i am expert in spring boot";
    }
    
}
