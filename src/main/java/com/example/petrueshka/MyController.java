package com.example.petrueshka;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


// comment
@Controller
public class MyController {

    @GetMapping(path="/")
    public String index() {
        return "index";
    }

}
