package com.HotelResS.TheCodeFellaz.Controllers;

import com.HotelResS.TheCodeFellaz.CSVBASE.StoreReservation;
import com.HotelResS.TheCodeFellaz.HotelModel.Hotel;
import com.HotelResS.TheCodeFellaz.HotelModel.Room;
import com.HotelResS.TheCodeFellaz.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;


@Controller
public class RoomsController {

    @Autowired
    private RoomService roomService;

    @RequestMapping(value="/rooms", method= RequestMethod.GET)
    public String showRooms( Model model){
        ArrayList roomlist = roomService.addRoom();

        int roomVal = 0;

        model.addAttribute("roomlist", roomlist);
        model.addAttribute("roomVal", roomVal);

        return "rooms";
    }




    @RequestMapping(value="/rooms", method= RequestMethod.POST)
    public String reserveARoom(@ModelAttribute Room roomNum, Model model){



        StoreReservation store = new StoreReservation();
        store.CreateReservation(Hotel.getInstance().getName(), Hotel.getInstance().getContact(), Hotel.getInstance().getGuest(), Hotel.getInstance().getCheckInDate() , Hotel.getInstance().getCheckOutDate(), 1);

        return "rooms";
    }


}
