package edu.mum.productcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class homePage {

    @GetMapping({"/","/homePage"})
    public String homPage(){
        return "homePage";
    }
}
