package com.edwincloud.demospring.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @GetMapping("/test")
    public String ReturnRponse(){
        return "Success: v1.0.0";
    }

}
