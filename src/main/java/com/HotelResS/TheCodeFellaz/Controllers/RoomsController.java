package com.HotelResS.TheCodeFellaz.Controllers;

import com.HotelResS.TheCodeFellaz.CSVBASE.RoomDatabase;
import com.HotelResS.TheCodeFellaz.HotelModel.Room;
import com.HotelResS.TheCodeFellaz.Service.RoomService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class RoomsController {

    @Autowired
    private RoomService roomService;

    @RequestMapping(value="/rooms", method= RequestMethod.GET)
    public String showRooms(@NotNull Model model){
        List<Room> roomlist = roomService.addRoom();
        model.addAttribute("roomlist", roomlist);
        return "rooms";
    }

    /*
    @RequestMapping(value="/rooms.html")
    public String reserveARoom(@RequestParam("roomSelection") int roomSelection, Model model ){
        Room reserve =
    }
    */

}
