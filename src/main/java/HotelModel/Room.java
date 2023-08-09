package HotelModel;

public class Room {
    int roomNumber;
    int floorNumber;
    int occupancy;

    String roomReservedType;

    public Room(int roomNumber, int floorNumber, int occupancy) {
        this.roomNumber = roomNumber;
        this.floorNumber = floorNumber;
        this.occupancy = occupancy;
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }

    public String getRoomReservedType() {
        return roomReservedType;
    }

    public void setRoomReservedType(String roomReservedType) {
        this.roomReservedType = roomReservedType;
    }

}
