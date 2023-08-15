package com.HotelResS.TheCodeFellaz.Controllers;

import com.HotelResS.TheCodeFellaz.HotelModel.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @GetMapping("/register")
    public String showForm(Model model){
        Customer customer = new Customer();
        model.addAttribute("customer", customer);


        return "Hotel";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute Customer customer, Model model){
        System.out.println(customer);
        model.addAttribute("customer", customer);
        return "Hotel";
    }
}
/*




    @PostMapping("/display-input")
    public String displayData(@ModelAttribute("room") Room room, Model model){
      //Process the input data here
       model.addAttribute("room", room);

        return "displayed_data"; //Thymeleaf template to display the data
    }
    @Controller //Meta-Data annotations
public class HotelController {
    //Meta-Data annotion below, Request Mapping from root AKA -->TheCodeFellazApplication --> main
    @RequestMapping("/")
    public String getHotel(){
        //return the Hotel.html file,
        return "Hotel";
    }
}

*/
