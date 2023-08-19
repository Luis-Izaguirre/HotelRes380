package com.HotelResS.TheCodeFellaz.Controllers;

import com.HotelResS.TheCodeFellaz.HotelModel.Payment;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PaymentController {

    @GetMapping("/payment")
    public String getPaymentInfo(Model model){

         Payment payment = new Payment();

         model.addAttribute("payment", payment);
        return "payment";
    }
    @RequestMapping(value="/payment", method= RequestMethod.POST)
    public String sendInvoice(@ModelAttribute Payment payment, Model model){
        return "payment";
    }

    //Posting to backend so that it can check credentials of username and password


    /*
    *
    *
    *
    * public class HotelService {
    //Used to add to CSVBASE and potentially use the reservation class.
    public void transformFromDTO(Reservation res){

        CSVReaderPrint S = new CSVReaderPrint();
        String checkin = res.getCheckInDate();
        String checkout = res.getCheckInDate();

        S.AddReservation(res.getCustomer().getName(), res.getCustomer().getEmail(), res.getGuestNum(), 1, 1 , res.getCheckInDate(),  "1", res.getCheckOutDate(),"1", 5.0, 5.0, "Available");
    }
    *
    *
    *
    *
    *
    *
    * */

}
