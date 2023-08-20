package com.HotelResS.TheCodeFellaz.Controllers;

import com.HotelResS.TheCodeFellaz.CSVBASE.customer;
import com.HotelResS.TheCodeFellaz.HotelModel.Reservation;
import com.HotelResS.TheCodeFellaz.HotelModel.Room;
import com.HotelResS.TheCodeFellaz.Service.RoomService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.HotelResS.TheCodeFellaz.Service.HotelService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
public class RoomsController {

    @Autowired
    private RoomService roomService;

    @RequestMapping(value="/rooms", method= RequestMethod.GET)
    public String showRooms( Model model){
        ArrayList roomlist = roomService.addRoom();

        Room roomVal = new Room();
        model.addAttribute("roomlist", roomlist);
        model.addAttribute("roomVal", roomVal);

        return "rooms";
    }




    @RequestMapping(value="/rooms", method= RequestMethod.POST)
    public String reserveARoom(@ModelAttribute Room roomNum, Model model){

        Reservation resPrint = new Reservation();
        String saveRes = resPrint.toString();

        String [] splitStr = saveRes.split(",", 4);

        customer cus = new customer();

        //String Name, String Contact, int Guests, String CheckInDate, String CheckOutDate, int RoomNum

        cus.CreateReservation(splitStr[0], splitStr[1], Integer.parseInt(splitStr[2]) , splitStr[3], splitStr[4], roomNum.getRoomNum() );

        return "rooms";
    }


}
