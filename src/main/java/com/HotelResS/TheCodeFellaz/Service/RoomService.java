package com.HotelResS.TheCodeFellaz.Service;

import com.HotelResS.TheCodeFellaz.CSVBASE.CSVDateMatcher;
import com.HotelResS.TheCodeFellaz.CSVBASE.DateRangeGenerator;
import com.HotelResS.TheCodeFellaz.HotelModel.Hotel;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RoomService {


    public ArrayList<String> addRoom(){

        DateRangeGenerator J = new DateRangeGenerator();

        ArrayList<String> S = J.PotentialDates(Hotel.getInstance().getCheckInDate() , Hotel.getInstance().getCheckOutDate());

        CSVDateMatcher G = new CSVDateMatcher();
        ArrayList<String> P = G.UnoccupiedRooms(S);

        return P;
    }
}
/**
 *
 *
 *
 *
 *         String[] splitStr = reservation.toString().split(",", 4);
 *
 *
 *
 *
 *
 *
 *
 * */
