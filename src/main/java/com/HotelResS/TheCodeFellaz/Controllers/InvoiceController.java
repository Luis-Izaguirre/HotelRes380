package com.HotelResS.TheCodeFellaz.Controllers;

import com.HotelResS.TheCodeFellaz.HotelModel.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class InvoiceController {

    @RequestMapping(value="/Invoice", method= RequestMethod.POST)
    public String getInvoice(Model model){

        Customer customer = new Customer("Billy", "Bob");

        Room room = new Room(1,"Double", 50, 2, true);
        Payment payment = new Payment("value", "00/00/0000", "00/00/0000", "876", "80" );
        //FIX ME
        Reservation reservation = new Reservation(1 , "00/00/0000", "00/00/0000",customer);


        Invoice customerInvoice = new Invoice("value", "value", "value", true, room, payment, reservation );

        model.addAttribute("customerInvoice", customerInvoice);
        return "Invoice";
    }
}

    /*
    *
    *     @RequestMapping(value="/login", method=RequestMethod.GET)
    public String getLoginForm(){
        //return html page login.html
        return "login";
    }


    //Posting to backend so that it can check credentials of username and password
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String login(@ModelAttribute(name="loginForm") LoginForm loginForm, Model model){

        String username = loginForm.getUsername();
        String password = loginForm.getPassword();

        //Condition check if the User Input matches the required credentials
        if("admin".equals(username) && "admin".equals(password)){
            //If username && password is correct, we are returning home page
            return "home";
        }
        //Else username or password is wrong and display message to screen
        model.addAttribute("invalidCredentials", true);
        return "login";
    }
    *
    *
    * */