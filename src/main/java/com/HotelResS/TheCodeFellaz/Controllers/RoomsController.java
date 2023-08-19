package com.HotelResS.TheCodeFellaz.Controllers;

import com.HotelResS.TheCodeFellaz.HotelModel.Room;
import com.HotelResS.TheCodeFellaz.Service.RoomService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class RoomsController {

    @Autowired
    private RoomService roomService;

    @RequestMapping(value="/rooms", method= RequestMethod.GET)
    public String showRooms(@ModelAttribute Room room, @NotNull Model model){
        List<Room> roomlist = roomService.addRoom();



        for(Room roomCheck: roomlist){
            if(room.isAvailability())
            {
                model.addAttribute("roomlist", roomlist);
                return "payment-page";
            }
        }

        model.addAttribute("invalidCredentials", true);
        return "rooms";
    }


    @RequestMapping(value="/payment-page", method = RequestMethod.POST)
    public String reserveARoom(){

        return "payment-page";
    }


}
