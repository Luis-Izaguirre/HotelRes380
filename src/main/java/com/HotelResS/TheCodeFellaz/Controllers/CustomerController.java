package com.HotelResS.TheCodeFellaz.Controllers;

import com.HotelResS.TheCodeFellaz.CSVReaderPrint;
import com.HotelResS.TheCodeFellaz.HotelFunc.Reservation;
import com.HotelResS.TheCodeFellaz.HotelFunc.ReservationDTO;
import com.HotelResS.TheCodeFellaz.HotelModel.Customer;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerController {


    @GetMapping("/")
    public String showForm(@NotNull Model model){
        ReservationDTO resDto = new ReservationDTO();
        model.addAttribute("resDto", resDto);
        return "Hotel";
    }


    @PostMapping("/register")
    public String submitForm(@ModelAttribute ReservationDTO resDto, @org.jetbrains.annotations.NotNull Model model){
        System.out.println(resDto);
        Reservation resSave = transformFromDTO(resDto);
        model.addAttribute("resDto", resDto);
        return "display-input";
    }

    /*
    @GetMapping("/test")
    public String viewReservation( @ModelAttribute , Model model){

    }
    */



    private @NotNull Reservation transformFromDTO(ReservationDTO resDTO){

        CSVReaderPrint S = new CSVReaderPrint();
        S.AddReservation(resDTO.getName(),resDTO.getEmail(),resDTO.getGuestNum(),4,1, resDTO.getCheckInDate(), "2:00PM", resDTO.getCheckOutDate(),"11:00AM", 1900.00, 0.00, "No");

        Customer customer = new Customer(resDTO.getName(),resDTO.getEmail());
        Reservation reservation = new Reservation(resDTO.getGuestNum(), resDTO.getCheckInDate(), resDTO.getCheckOutDate(), customer);

        return reservation;
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
