package HotelControllers;
import HotelModel.*;
 import java.util.*;

public class Reservation {
    private static Scanner scan;
    private int id;
    private int roomNumber;
    private Date arrivalDate;
    private Date departureDate;

    private String guestName;

    private boolean isActive;

    public Reservation(int id, int roomNumber, Date arrivalDate, Date departureDate, String guestName){
        this.id = id;
        this.roomNumber  = roomNumber;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.guestName = guestName;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    //Utility Methods

    public static Reservation createReservation(int id, int roomNumber, Date arrivalDate, Date departureDate, String guestName){
        //Create a new Reservation
        return new Reservation(id, roomNumber, arrivalDate, departureDate, guestName);
    }

    public void modifyReservation(int roomNumber, Date arrivalDate, Date depertureDate, String guestName){
       this.roomNumber = roomNumber;
       this.arrivalDate = arrivalDate;
       this.departureDate = depertureDate;
       this.guestName = guestName;
    }

    public boolean getActive(){
        return isActive;
    }

    public void setActive(boolean isActive){
        this.isActive = isActive;
    }


    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", roomNumber=" + roomNumber +
                ", arrivalDate=" + arrivalDate +
                ", departureDate=" + departureDate +
                ", guestName='" + guestName + '\'' +
                '}';
    }
}