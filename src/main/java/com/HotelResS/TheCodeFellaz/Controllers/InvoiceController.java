package com.HotelResS.TheCodeFellaz.Controllers;

import org.springframework.stereotype.Controller;


public class InvoiceController {
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
}
