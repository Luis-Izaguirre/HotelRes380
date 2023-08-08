package com.HotelResS.TheCodeFellaz;

//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

}
