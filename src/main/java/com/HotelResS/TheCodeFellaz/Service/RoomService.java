package com.HotelResS.TheCodeFellaz.Service;

import com.HotelResS.TheCodeFellaz.CSVBASE.CSVDateMatcher;
import com.HotelResS.TheCodeFellaz.CSVBASE.DateRangeGenerator;
import com.HotelResS.TheCodeFellaz.CSVBASE.customer;
import com.HotelResS.TheCodeFellaz.HotelModel.Reservation;
import com.HotelResS.TheCodeFellaz.HotelModel.Room;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RoomService {


    public ArrayList<String> addRoom(){

        Reservation reservation = new Reservation();

        String[] splitStr = reservation.toString().split(",", 4);

        DateRangeGenerator J = new DateRangeGenerator();

        ArrayList<String> S = J.PotentialDates( splitStr[3], splitStr[4]);

        CSVDateMatcher G = new CSVDateMatcher();
        ArrayList<String> P = G.UnoccupiedRooms(S);

        return P;
    }
}
