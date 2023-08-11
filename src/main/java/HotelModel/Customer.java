package HotelModel;

import java.util.Date;
public class Customer {
    private String idCustomer;
    private String name;
    private String email;
    private String phone;

    private Date checkInDate;
    private Date checkOutDate;

    Customer(String idCustomer, String name, String email, String phone, Date checkIN, Date checkOut){
        this.idCustomer = idCustomer;
        this.name = name;
        this.email = email;
        this.phone = phone;
        checkInDate = checkIN;
        checkOutDate = checkOut;
    }


    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static Customer createCustomer(String idCustomer, String name, String email, String phone, Date checkIN, Date checkOut){
        //Create a new Customer
        return new Customer(idCustomer, name, email, phone, checkIN, checkOut);
    }

    public void modifyCustomer(String idCustomer, String name, String email, String phone, Date checkIN, Date checkOut){
        this.idCustomer = idCustomer;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.checkInDate = checkIN;
        this.checkOutDate = checkOut;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer='" + idCustomer + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                '}';
    }
}
