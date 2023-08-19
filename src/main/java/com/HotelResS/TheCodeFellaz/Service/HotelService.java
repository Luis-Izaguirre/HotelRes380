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
    public static @NotNull Reservation transformFromDTO(ReservationDTO resDTO){

        CSVReaderPrint S = new CSVReaderPrint();
        S.AddReservation(resDTO.getName(),resDTO.getEmail(),resDTO.getGuestNum(),4,1, resDTO.getCheckInDate(), "2:00PM", resDTO.getCheckOutDate(),"11:00AM", 1900.00, 0.00, "No");

        Customer customer = new Customer(resDTO.getName(),resDTO.getEmail());
        Room room = new Room();

        Reservation reservation = new Reservation(resDTO.getGuestNum(), resDTO.getCheckInDate(), resDTO.getCheckOutDate(), customer);

        return reservation;
    }




}
