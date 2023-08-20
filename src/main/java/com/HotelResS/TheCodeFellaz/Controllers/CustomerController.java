package com.HotelResS.TheCodeFellaz.Controllers;
import com.HotelResS.TheCodeFellaz.HotelModel.Hotel;
import com.HotelResS.TheCodeFellaz.HotelModel.Reservation;
import com.HotelResS.TheCodeFellaz.Service.HotelService;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CustomerController {


    //Request access to the hotel webpage
    @RequestMapping(value="/Hotel", method= RequestMethod.GET)
    public String showForm(@NotNull Model model){
        //Object that holds information for both reservation and customer
        Reservation resDto = new Reservation();
        //MVC Design, So we are passing are object as a model from controller to the view = website to make it dynamic and
        // receive data by injection.
        model.addAttribute("resDto", resDto);
        return "Hotel";
    }
    //Requesting mapping to the view so that we can send a response or data to the webpage.
    @RequestMapping(value="/Hotel", method=RequestMethod.POST)
    public String submitForm(@ModelAttribute Reservation resDto,  @org.jetbrains.annotations.NotNull Model model){
        //System.out.println(resDto)
        //Object to save data to reservation,
        //Hotel hotel = new Hotel();
        Hotel.getInstance().setGuest(resDto.getGuestNum());
        Hotel.getInstance().setCheckInOutStatus(resDto.getCheckInDate());
        Hotel.getInstance().setCheckOutDate(resDto.getCheckOutDate());
        Hotel.getInstance().setName(resDto.getCustomer().getName());
        Hotel.getInstance().setContact(resDto.getCustomer().getEmail());

        return "display-input";
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