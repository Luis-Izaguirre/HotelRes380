package com.HotelResS.TheCodeFellaz.Service;

import com.HotelResS.TheCodeFellaz.CSVBASE.CSVReaderPrint;
import com.HotelResS.TheCodeFellaz.HotelFunc.Reservation;
import com.HotelResS.TheCodeFellaz.HotelFunc.ReservationDTO;
import com.HotelResS.TheCodeFellaz.HotelModel.Customer;
import com.HotelResS.TheCodeFellaz.HotelModel.Room;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

@Service
public class HotelService {
    //Used to add to CSVBASE and potentially use the reservation class.
    public void transformFromDTO(Reservation res){

        CSVReaderPrint S = new CSVReaderPrint();
        String checkin = res.getCheckInDate();
        String checkout = res.getCheckInDate();

        S.AddReservation(res.getCustomer().getName(), res.getCustomer().getEmail(), res.getGuestNum(), 1, 1 , res.getCheckInDate(),  "1", res.getCheckOutDate(),"1", 5.0, 5.0, "Available");
    }




}
