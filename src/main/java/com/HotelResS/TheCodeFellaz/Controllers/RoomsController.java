package com.HotelResS.TheCodeFellaz.Controllers;

import com.HotelResS.TheCodeFellaz.CSVBASE.FileReaderPrint;
import com.HotelResS.TheCodeFellaz.CSVBASE.StoreReservation;
import com.HotelResS.TheCodeFellaz.HotelModel.Reservation;
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


    Reservation RoomController(Reservation rdt0){
        return rdt0;
    }

    @Autowired
    private RoomService roomService;

    @RequestMapping(value="/rooms", method= RequestMethod.GET)
    public String showRooms( Model model){
        ArrayList roomlist = roomService.addRoom();

        Room roomNum = new Room();

        model.addAttribute("roomlist", roomlist);
        model.addAttribute("roomVal", roomNum);

        return "rooms";
    }



    @RequestMapping(value="/rooms", method= RequestMethod.POST)
    public String reserveARoom(@ModelAttribute Room roomNum, Model model){


        FileReaderPrint Read = new FileReaderPrint();
        String resVal = Read.getFileInfo("random.txt");

        String[] resValSplit = resVal.split(",", 4);

        StoreReservation store = new StoreReservation();
        int value1 = Integer.parseInt(resValSplit[2]);
        int value2 = Integer.parseInt(resValSplit[5]);

        store.CreateReservation(resValSplit[0],resValSplit[1], value1, resValSplit[3], resValSplit[4], value2);

        return "rooms";
    }


}
